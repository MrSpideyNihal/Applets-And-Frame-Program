import java.sql.*;
import java.text.DateFormat;

public class prestatement{

    public static void main(String[] args) {
        java.util.Date currentDate = new java.util.Date();
         try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","mrspidey");
            // Statement st = con.createStatement();
            String query = "INSERT INTO employee (employee_id, first_name, last_name, department_id, hire_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,1);
            pst.setString(2,"Raj");
            pst.setString(3,"Rodge");
            pst.setInt(4,12);
            pst.setDate(5,new java.sql.Date(currentDate.getTime()));
            pst.executeUpdate();

            con.close();

         } catch (Exception e) {
            // TODO: handle exception
             System.err.println(e);
         }

    }
}