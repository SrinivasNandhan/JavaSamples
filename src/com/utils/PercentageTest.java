/**
 * 
 */
package com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author snandhanamudi
 *
 */
public class PercentageTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="40 % COPAY,23 % COPAY,5/3 % COPAY,3/3 % COPAY";
		
		String copayStr="1 % COPAY,10 % COPAY,11 % COPAY";
		
		String[] amts = copayStr.split(",\\s*");
		List<String> copays = Arrays.asList(amts);  
		List<String> fnalCopayList= new ArrayList<String>();
		
		for (String copay : copays)
		{
			String finalCopay="";
			int val1 = copay.indexOf('%');
			if (val1 > 0){			
				finalCopay=copay.substring(0,val1).trim();
				fnalCopayList.add(finalCopay);
			}
		}
		
		System.out.println(fnalCopayList.toString());
	}

	/**
	 * gets the carrier copay menu items. Should be used in conjunction with
	 * getCopayStrategyID(int copayID), this will assign the correct value in auth.
	 * @return
	 */
	
	public static List<String> getCarrierCopayMenu(List<String> menuValues){
				
		String finalValue = "";
		
		List<String> finalList = new ArrayList<>();
		
		for (String value:menuValues){
			// the value is the copay for the insured. This method 
			// needs to display for the carrier, so we need to flip 
			// the value. '40 % COPAY' should become '60', '36.06 % COPAY'
			// should become 63.94. or 100 - the copay... 
			// not valid on to the next key
			if (value == null)
				continue;
			
			int copyToLocation = 0;
			copyToLocation = value.indexOf('%');
			if (copyToLocation > 0){			
				value=value.substring(0,copyToLocation).trim();
			}
			else
			{
				// there maybe just 0 CO. there shouldn't be many of
				// these left.
				copyToLocation = value.toUpperCase().indexOf('C');
				if (copyToLocation > 0){
					//copay = copay.substring(0,copyToLocation);					
					value=value.substring(0,copyToLocation).trim();
				}
			}
			
			finalValue = getApportionFromStrategy(value);
			
			finalList.add(finalValue);
		}
		
		
		
		String temp = finalList.get(0);
		
		/* Sorting the list */
		Collections.sort(menuValues, new Comparator<String>(){
			 
            public int compare(String o1, String o2) {
            	
            	int retVal = 0;
            	
            	try
            	{
	            	String origVal1 = o1;
					String origVal2 = o2;
					
					
					
					float origValFloat1 = 0;
					float origValFloat2 = 0;
					
					if(origVal1 != null && origVal1.indexOf('/') > 0)
						origValFloat1 = getFloatValue(origVal1.trim());
					else
					if(origVal1 != null && origVal1.trim().length() > 0)
						origValFloat1 = Float.parseFloat(origVal1.trim());
					else
						origValFloat1 = 0;
					
					if(origVal2 != null && origVal2.indexOf('/') > 0)
						origValFloat2 = getFloatValue(origVal2.trim());
					else
						if(origVal2 != null && origVal2.trim().length() > 0)
							origValFloat2 = Float.parseFloat(origVal2.trim());
						else
							origValFloat2 = 0;					
					
					if (origValFloat1 > origValFloat2)
						retVal = -10;
					else 
						retVal = 10;
            	}
            	catch(NumberFormatException nfe)
            	{
            		
            	}
               return retVal;
            }
 
        });

		/* Somehow blank value is getting added at the very end */
		finalList.add(0, temp);
		finalList.remove(menuValues.size()-1);
		
		return finalList;
		
	}
	
	public static String getApportionFromStrategy(String copay){
		// first we need the copay as a number.
		
		if(copay != null)
		{
			double dbCopayValue = 0;
			int copyToLocation = 0;
			try{
				copyToLocation = copay.indexOf('%');
				if (copyToLocation > 0){
					copay = copay.substring(0,copyToLocation).trim();
				}
				// there maybe just 0 CO. there shouldn't be many of
				// these left.
				copyToLocation = copay.toUpperCase().indexOf('C');
				if (copyToLocation > 0){
					copay = copay.substring(0,copyToLocation);
				}
				// now for the tricky ones... 
				// 1/3 should be 2/3, 2/3 should be 1/3, 1/2 should be 1/2... fun
				copyToLocation = copay.toUpperCase().indexOf('/');
				if (copyToLocation > 0){
					
					String numerator = copay.substring(0,copyToLocation );
					String denominator = copay.substring(copyToLocation +1);
					// assuming they are not going to ever use 8/7 
					// subtract numerator from denominator, giving u 
					// a the new numerator... 
					String newNumerator = ""+(Integer.valueOf(denominator) - Integer.valueOf(numerator));
					copay = newNumerator + "/" + denominator;
					
				} else {
					// see if there is a decimal, yes, format to the current length, no just give the
					// number.
					int afterDecimal = 0;
					String formatString = "";
					copyToLocation = copay.indexOf('.');
					if (copyToLocation > 0){
						// dealing with a decimal
						afterDecimal = (copay.length() -1 ) - copyToLocation ;
						formatString = "%1$2." + afterDecimal + "f";
						dbCopayValue = Double.valueOf(copay.trim());	
						copay = String.format( formatString, (100 - dbCopayValue));
					} else {
						formatString = "%1$s";
						copay = String.format( formatString, (100 - Integer.valueOf(copay.trim())));
					}
						
				}
			}catch (NumberFormatException nfe){
				
			}
		}
		return copay;
	}

	public static float getFloatValue(String fractionVal)
	{
		try
		{
			String beforeSlash = fractionVal.substring(0,fractionVal.indexOf("/"));
			String afterSlash =  fractionVal.substring(fractionVal.indexOf("/")+1);		
			
			float beforeSlashFloat = Float.parseFloat(beforeSlash);
			float afterSlashFloat = Float.parseFloat(afterSlash);
			
			return (beforeSlashFloat/afterSlashFloat) * 100;
		}
		catch(NumberFormatException nfe)
		{
			return 0;
		}
	}
}
