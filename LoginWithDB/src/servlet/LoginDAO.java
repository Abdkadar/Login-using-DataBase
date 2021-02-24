package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
  String url="jdbc:mysql://localhost/coda2";
  String username="root";
  String password="root";
  String driver="com.mysql.cj.jdbc.Driver";
 
  public void loadDriver(String driver) {
	  try {
	  Class.forName(driver);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  }
  
  
  public Connection getConnection() {
	Connection con=null;
	try {
	con=DriverManager.getConnection(url,username,password);
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con; 
 }
  
  public boolean validate(LoginDTO dto) {
	 loadDriver(driver);
	 Connection con=getConnection();
	 boolean status=false;
	 String sql="select *from login where username=? and password=?";
	 PreparedStatement ps;
	try {
	 ps=con.prepareStatement(sql);
	ps.setString(1,dto.getUsername());
	ps.setString(2, dto.getPassword());;
	 
	 
	 ResultSet rs=ps.executeQuery();
	status=rs.next();  
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
  }
}
