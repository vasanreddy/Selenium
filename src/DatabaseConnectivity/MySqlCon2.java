package DatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlCon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try{

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Sreerama#123");
Statement stm=con.createStatement();
ResultSet rs=stm.executeQuery("select* from employee");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2)+"  "+rs.getString(3));
con.close();
}catch(Exception e){ System.out.println(e);}
	

   }
}
