(1) import java.util.*;
import java.sql.*;

class Main{
    
    Connection con;
    PreparedStatement pt;
    ResultSet Rs;
    
    void connect(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
        System.out.println("Database connected successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void average(){
        try{
            pt = con.prepareStatement("select avg(physics) from student where student_Name like 'A%'");
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void exit(){
        try{
            con.close();
            System.out.println("Connection closed successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        
        Main m = new Main();
        m.connect();
        m.average();
        m.exit();
        
    }
    
}


(2) import java.sql.*;
import java.util.*;

class Main{
    
    Connection con;
    PreparedStatement pt;
    ResultSet Rs;
    
    
    void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            System.out.println("Database connected successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void filterAndDisplay(){
        try{
            pt = con.prepareStatement("select name from employee where name like '%s' or name like '%n'");
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getString(1));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void exit(){
        try{
            con.close();
            System.out.println("Connection closed successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        
        Main m = new Main();
        m.connect();
        m.filterAndDisplay();
        m.exit();
        
    }
    
}


(3) import java.util.*;
import java.sql.*;

class Main{
    
    Connection con;
    PreparedStatement pt;
    ResultSet Rs;
    
    void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            System.out.println("Database connected successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void filterAndDisplay(String input){
        try{
            pt = con.prepareStatement("select Id,name from student where department=?");
            pt.setString(1,input);
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1)+" "+Rs.getString(2));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void exit(){
        try{
            con.close();
            System.out.println("Connection closed successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        String input = sc.nextLine();
        m.connect();
        m.filterAndDisplay(input);
        m.exit();
        
    }
    
}

