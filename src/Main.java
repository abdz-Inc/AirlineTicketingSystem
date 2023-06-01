import java.util.*;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb", "root", "");
			Statement st = con.createStatement();
			String q = "Select * from userinfo;";
			ResultSet rs = st.executeQuery(q);
			while(rs.next()) {
				System.out.println(rs.getString("uid")+" "+rs.getString("pas"));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
