package DatabaseConnectivity;

import java.sql.*;  
class MysqlCon{  
public static void main(String args[]){  

try{  

Class.forName("oracle.jdbc.driver.OracleDriver");  

Connection con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe","system","Sreerama#123");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from employee");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  