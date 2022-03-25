package org.javaDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Hello {
	public void test()
	{
		 Connection conn=null; 
	       PreparedStatement pst=null;
	       ResultSet rs=null;
	       
	       try {
	    	   Class.forName("oracle.jdbc.driver.OracleDriver");
	    	   conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","monali","monali");
	    	   String sql="select * from emp";
	    	   pst=conn.prepareStatement(sql);
	    	   rs=pst.executeQuery();
	    	   
	    	   while(rs.next()) 
	    	   {
	    		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)); 
	    		 //conn.close();
	    	   }
	       }
	    	   catch(Exception e) 
	    	   {
	    		 System.out.println(e); 
	    	   }
	
	}
}
