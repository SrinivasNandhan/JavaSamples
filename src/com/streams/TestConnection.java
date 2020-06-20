package com.streams;

import java.sql.*;

class TestConnection {
	public static void main(String[] args) {
		 
        Connection conn = null;
 
        
        try {
 
          //  String dbURL = "jdbc:sqlserver://etap-devops1281.test.healthe:14331";
        	String dbURL="jdbc:sqlserver://etap-devops1281.test.healthe;databaseName=eligibility";
            String user = "developer";
            String pass = "letmein999";
            conn = DriverManager.getConnection(dbURL, user, pass);
            if (conn != null) {
            	
            	String SQL ="SELECT \r\n" + 
            			 "U.Users_ID\r\n" + 
            			",U.Users_Name   \r\n" + 
            			",U.Users_Email\r\n" + 
            			",U.Users_Phone\r\n" + 
            			",U.Users_First_Name\r\n" + 
            			",U.Users_Last_Name       \r\n" + 
            			",U.Users_Supervisor_Email\r\n" + 
            			",U.Users_Supervisor_Phone\r\n" + 
            			",U.Users_Supervisor_First_Name\r\n" + 
            			",U.Users_Supervisor_Last_Name\r\n" + 
            			",UU.Users_Email  Nurse_Email\r\n" + 
            			",UU.Users_Phone Nurse_phone\r\n" + 
            			",UU.Users_First_Name  Nurse_First_Name\r\n" + 
            			",UU.Users_Last_Name    Nurse_Last_name\r\n" + 
            			" FROM customer.Users U\r\n" + 
            			"JOIN Customer.Customer C ON U.Customer_ID  = C.Customer_ID --1\r\n" + 
            			"JOIN  customer.Users_Medical_Case_Manager  M  ON M.Users_ID =  U.Users_ID --1\r\n" + 
            			"LEFT JOIN customer.Users UU ON M.Users_Medical_Case_Manager_Users_ID =  UU.Users_ID  --1\r\n" + 
            			"WHERE C. Customer_code =  'AMCSACR'\r\n" + 
            			"AND U.Users_Name = ? \r\n" + 
            			"AND U.Users_Status_Indicator <>  'TERMINATED'";
            	// String SQL = "select * from customer.Users_Medical_Case_Manager where Users_ID='BB3FEC39-1BAA-E911-A2D5-0050568A3F58'";
            	 
            	 PreparedStatement stmt = conn.prepareStatement(SQL);
            	 stmt.setString(1, "dsolano@cityofsacramento.org");
                 ResultSet rs = stmt.executeQuery();
                 
                 while (rs.next()) {
                	 
                	 System.out.println(rs.getString("Users_ID"));
                	 System.out.println(rs.getString("Users_Name"));
                	 System.out.println(rs.getString("Users_Email"));
                	 System.out.println(rs.getString("Users_Phone"));
                	 System.out.println(rs.getString("Users_First_Name"));
                	 System.out.println(rs.getString("Users_Last_Name")); 
                	 System.out.println(rs.getString("Users_Supervisor_Email"));
                	 System.out.println(rs.getString("Users_Supervisor_Phone"));
                	 System.out.println(rs.getString("Users_Supervisor_First_Name"));
                	 System.out.println(rs.getString("Users_Supervisor_Last_Name")); 
                	 System.out.println(rs.getString("Nurse_Email"));
                     System.out.println(rs.getString("Nurse_phone"));
                     System.out.println(rs.getString("Nurse_First_Name"));
                     System.out.println(rs.getString("Nurse_Last_name"));
                 }
                 
                 
				/*
				 * DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				 * System.out.println("Driver name: " + dm.getDriverName());
				 * System.out.println("Driver version: " + dm.getDriverVersion());
				 * System.out.println("Product name: " + dm.getDatabaseProductName());
				 * System.out.println("Product version: " + dm.getDatabaseProductVersion());
				 */
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}