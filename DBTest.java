import java.sql.*;

public class DBTest
{
public static void main(String args[])
{
try
{
	// Load and register
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	//Establish connection
	Connection con=DriverManager.getConnection("Jdbc:Odbc:Student");
	//create the statement
	Statement st=con.createStatement();

//insert query
          String query1 = "insert into StudentInfo values (3,'yash kumawat',7,'D')";
         // String query4 = "insert into StudentInfo values (4,'aakash kumawat',10,'E')";
          st.executeUpdate(query1);
//update query
         String query2 = "UPDATE StudentInfo SET Class=8 WHERE Student_Name='Aayush Kapoor'";
        //st.executeUpdate(query2);
//delete query
         String query3 = "delete from StudentInfo where Student_Name='yash kumawat'";
        // st.executeUpdate(query3);




//execute query
	String query="SELECT * from StudentInfo";

        ResultSet rs=st.executeQuery(query);
	//execute the query.
	System.out.println("\nStudent's_ID\tStudent's_Name\tClass\t  Section");
	//process the query
	while(rs.next())
	{
         System.out.println("\n"+"\t"+rs.getString(1)+"\t"+rs.getString(2)+"\t  "+rs.getString(3)+"\t"+rs.getString(4));
	}
}catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}