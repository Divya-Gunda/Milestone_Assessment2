import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcClass {

	public static void main(String[] args) {
		String host="localhost";
		String port="3306";
		try {
			Connection con=DriverManager.getConnection
					("jdbc:mysql://"+ host+":"+ port+"/Milestone","root","Bharathi@1612");
		System.out.println("Connection is seccessfull");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee");
		while(rs.next()) {
			System.out.println("The id is: "+rs.getString("Emp_id")+
					";	The Name is: "+rs.getString("Emp_name")+
					";	The salary is: "+rs.getString("Emp_Salary"));
		System.out.println();
		}
		} catch (SQLException e) {
			e.printStackTrace();
		} 

	}

}
