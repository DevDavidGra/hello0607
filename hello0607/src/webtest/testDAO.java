package webtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testDAO {
	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	
	private static testDAO dao = new testDAO();

	public static testDAO getInstance() {
		return dao;
	}

	private Connection init() throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String user = "hr";
		String password = "a1234";

		return DriverManager.getConnection(url, user, password);
	}

	private void exit() throws SQLException {
		if (conn != null) {
			conn.close();
		}
		if (stmt != null) {
			conn.close();
		}
		if (rs != null) {
			conn.close();
		}
		if (pstmt != null) {
			conn.close();
		}

	}
	
	//기본 접속 객체 유형 ..
}
