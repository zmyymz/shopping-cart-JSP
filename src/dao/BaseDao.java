package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.security.auth.x500.X500Principal;

//import com.mysql.jdbc.Statement;

public class BaseDao {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	Connection con;

	public static Connection getConnection() throws SQLException {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/shop";
			connection = DriverManager.getConnection(url,"root","password");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
