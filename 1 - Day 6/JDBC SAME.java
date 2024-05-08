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
    
    void insert(int EID,String ENAME,int ESALARY){
        try{
           pt = con.prepareStatement("insert into office(EID,ENAME,ESALARY) values(?,?,?)");
           pt.setInt(1,EID);
           pt.setString(2,ENAME);
           pt.setInt(3,ESALARY);
           pt.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void displayAll(){
        try{
            pt = con.prepareStatement("select *from office");
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getInt(3));
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
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.connect();
        int count = Integer.parseInt(sc.nextLine());
        
        for(int i=1; i<=count; i++){
            int EID = Integer.parseInt(sc.nextLine());
            String ENAME = sc.nextLine();
            int ESALARY = Integer.parseInt(sc.nextLine());
            m.insert(EID,ENAME,ESALARY);
        }
        m.displayAll();
        m.exit();
        
    }
    
}

(2) import java.util.*;
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
    
    void insert(int EID,String ENAME,int ESALARY){
        try{
           pt = con.prepareStatement("insert into office(EID,ENAME,ESALARY) values(?,?,?)");
           pt.setInt(1,EID);
           pt.setString(2,ENAME);
           pt.setInt(3,ESALARY);
           pt.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void displayAll(){
        try{
            pt = con.prepareStatement("select *from department where department_name like 'J%'");
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
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        
        Main m = new Main();
        m.connect();
        m.displayAll();
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
    
    void insert(int EID,String ENAME,int ESALARY){
        try{
           pt = con.prepareStatement("insert into office(EID,ENAME,ESALARY) values(?,?,?)");
           pt.setInt(1,EID);
           pt.setString(2,ENAME);
           pt.setInt(3,ESALARY);
           pt.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void displayAll(){
        try{
            pt = con.prepareStatement("select *from office where ESALARY between 10000 and 50000");
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getInt(3));
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
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.connect();
        int count = Integer.parseInt(sc.nextLine());
        
        for(int i=1; i<=count; i++){
            int EID = Integer.parseInt(sc.nextLine());
            String ENAME = sc.nextLine();
            int ESALARY = Integer.parseInt(sc.nextLine());
            m.insert(EID,ENAME,ESALARY);
        }
        m.displayAll();
        m.exit();
        
    }
    
}

