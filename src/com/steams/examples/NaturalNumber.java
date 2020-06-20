package com.steams.examples;

public class NaturalNumber<T extends String> {

	private T n;

	public NaturalNumber(T n) {
		this.n = n;
	}

	public String isEven() {
		return n.toString();
	}

	public static void main (String[] args)
	{
		
		String sr = new String("1");
		
		NaturalNumber nn = new NaturalNumber(sr);
		
	System.out.println(nn.isEven());
		
	}
}
