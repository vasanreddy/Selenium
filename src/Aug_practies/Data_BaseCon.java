package Aug_practies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data_BaseCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
try{	
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sreerama#123");

Statement stm=con.createStatement();

ResultSet rst=stm.executeQuery("select * from Employee");

while(rst.next())
System.out.println(rst.getInt(1)+" "+rst.getString(2)+"  "+rst.getString(3));
con.close();
}catch(Exception e){System.out.println(e);
	
}
	
	}

}
