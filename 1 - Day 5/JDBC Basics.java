(1) import java.sql.*;
import java.util.*;

class Main{
    
    Connection con;
    PreparedStatement pt;
    
    void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            System.out.println("Database connected successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void insert(int rollno,String sname,int mark1,int mark2,int mark3){
        try{
            pt = con.prepareStatement("insert into student (rollno,sname,mark1,mark2,mark3) values(?,?,?,?,?)");
            pt.setInt(1,rollno);
            pt.setString(2,sname);
            pt.setInt(3,mark1);
            pt.setInt(4,mark2);
            pt.setInt(5,mark3);
            pt.executeUpdate();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void close(){
        try{
        con.close();
        System.out.println("Connection closed successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String args[]){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        m.connect();
        int count=0;
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            int rollno = Integer.parseInt(sc.nextLine());
            String sname = sc.nextLine();
            int mark1 = Integer.parseInt(sc.nextLine());
            int mark2 = Integer.parseInt(sc.nextLine());
            int mark3 = Integer.parseInt(sc.nextLine());
            m.insert(rollno,sname,mark1,mark2,mark3);
            count++;
        }
        
        System.out.println(count);
        m.close();
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
    
    void printsql(){
        try{
        pt = con.prepareStatement("select *from employee");
        Rs = pt.executeQuery();
        while(Rs.next()){
            System.out.println(Rs.getInt(1)+ " " + Rs.getString(2) + " " + Rs.getDouble(3));
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
        m.connect();
        m.printsql();
        m.exit();
        
    }
    
}


(3) import java.sql.*;
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
    
    void printSql(Double salaryCheck){
        try{
        pt= con.prepareStatement("select *from employee where salary>=?");
        pt.setDouble(1,salaryCheck);
        Rs = pt.executeQuery();
        if(Rs.next()){
             System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getDouble(3));
             while(Rs.next()){
               System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getDouble(3));
               }
          }else{
              System.out.println("No records found for the given salary threshold.");
          }
        } catch(Exception e){
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
        Double salaryCheck = Double.parseDouble(sc.nextLine());
        Main m = new Main();
        m.connect();
        m.printSql(salaryCheck);
        m.exit();
    }
}
