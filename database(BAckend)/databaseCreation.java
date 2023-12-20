import java.sql.*;

public class databaseCreation{
    public static void main(String[] args)  {
        
     //create a connection
try{
     String url = "jdbc:mysql://localhost:3306/mysql,"+"root,"+"mrspidey";
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root" ,"mrspidey");

     //create a query 
     String query = "Select * from Employee";

     Statement st = conn.createStatement();
     ResultSet rs = st.executeQuery(query);
     ResultSetMetaData rsmd = rs.getMetaData();
    System.out.println(rsmd);
    if (rs.next() == true){
        System.out.println(rs.getString("first_name"));
        System.out.println(rs.getString("employee_id"));
        System.out.println(rs.getString("department_id"));
        System.out.println(rs.getString("hire_date"));
    }



     conn.close();

     System.out.println("Done!");

}

catch(Exception e){
System.err.println(e);

}
    }
}