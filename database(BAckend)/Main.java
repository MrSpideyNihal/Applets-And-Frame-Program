// import java.io.*;
import java.sql.*;

public class Main {
    public static  void main(String[] args) {
        //step 1 create a input stream
        // DataInputStream dis = new DataInputStream(System.in);

        try {
            //step 2 Create a Connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "mrspidey");
            System.out.println(connection);


            //step 3 create a statement 
           Statement st = connection.createStatement();

            // create a query
            String query = "INSERT INTO employees (employee_id, first_name, last_name, department_id, hire_date)\n" +
                    "VALUES (3, 'ABC', 'NewLastName', 1, '2023-12-20');\n";
            String query2 = "Select * from employees";

            //Step 4 4execute the query


            st.execute(query);
            st.execute(query2);


            connection.close();
            System.out.println("Habibi Yeh run Hoti!");
        }
        catch(Exception e) {
             System.out.println("Exception "+e);
        }
    }
}
