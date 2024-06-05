package Bank_Application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

	public class Main
	{
		public static Connection connection;
		public static final String Url = "jdbc:mysql://localhost:3306/Bank";
		public static final String Username = "root";
		private static final String Password = "Aryan@123";


		public static void main(String[] args) throws SQLException {
		connection = DriverManager.getConnection(Url,Username,Password);
	    Operation.create_table();
		Operation operlation = new Operation();
		operlation.bankinfo();
	}
	}
