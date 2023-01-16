package exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	private static final String URL = "jdbc:oracle:thin:@119.40.117.30:1521:FSKTM";
	private static final String USERNAME = "Y208256";
	private static final String PASSWORD = "208256";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	private static Connection connection = null;

	public static Connection openConnection() {
		if (connection != null)
			return connection;
		else {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
