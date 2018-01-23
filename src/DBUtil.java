import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;






public class DBUtil {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/IntelloLabs";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   
	   public static Connection getConnection()
	   {
		   Connection conn = null;
		   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
			   }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      
			   }//end try
			   System.out.println("Goodbye!");
			return conn;
		}
	   
	public static void InsertToDB(String fname,String lastname)
	{
		Connection conn = getConnection();
		
		int i=0;
	    PreparedStatement ps;
		
		
		try {
			ps=conn.prepareStatement("insert into UserInfo values(?,?)");
			
			ps.setString(1, fname);
			ps.setString(2, lastname);
			
			ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 public static void main(String [] args) {
		 
		 InsertToDB("bony", "Karmakar");
		 
	 }
	 
}
