import java.text.DecimalFormat;
import java.util.Scanner;
import java.sql.*;

public class TestDb {

 
    public static void main(String[] args) throws Exception {
       
        TestDb l = new TestDb();

       l.runOop();             
 
    }

    public void runOop(){
        System.out.println("Iniciando aplicaci�n ...");
        testDb();
        System.out.println("Terminando aplicaci�n ...");
    }

    public void testDb(){

        String server_ip    =   "10.19.0.253";
        String server_port  =   "3306";
        String database     =   "exampledb";
        String _usr         =   "root";
        String _pwd         =   "root";
        String dbcs;        

        try{  
            //Class.forName("com.mysql.jdbc.Driver");   // Innecesario en la últimas versiones
            dbcs = "jdbc:mysql://" + server_ip + ":" + server_port + "/" + database;
            Connection con=DriverManager.getConnection (dbcs,_usr,_pwd);  
            Statement stmt=con.createStatement();  
            String ssql1 = "SELECT * FROM test";
            ResultSet rs = stmt.executeQuery(ssql1); //  Objeto statement del paso anterior 
            while (rs.next()){
                    int _id = rs.getInt(1); 		// rs.getInt("id_empleado");
                    String _nombre = rs.getString(2); // rs.getString("nombre");
                // ***** Operar con los datos ****
                    System.out.println(_nombre);
            }
            con.close();    // Cerrar conexi�n
        }catch(Exception e){ 
            System.out.println(e);}  

    } // testdb


}
