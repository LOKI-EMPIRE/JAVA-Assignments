(1) import java.sql.*;
import java.util.*;

class SQLCrud{
    
    Connection con;
    PreparedStatement pt;
    ResultSet Rs;
    
    void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    void insert(int room_number,String room_type,int capacity,String availability,int price){
        try{
            pt = con.prepareStatement("insert into room (room_number,room_type,capacity,availability,price) values(?,?,?,?,?)");
            pt.setInt(1,room_number);
            pt.setString(2,room_type);
            pt.setInt(3,capacity);
            pt.setString(4,availability);
            pt.setInt(5,price);
            pt.executeUpdate();
            System.out.println("room record inserted successfully.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void update(int room_number,String room_type,int capacity,String availability,int price){
        try{
            pt = con.prepareStatement("UPDATE room SET room_type=?,capacity=?,availability=?,price=? where room_number=?");
            pt.setString(1,room_type);
            pt.setInt(2,capacity);
            pt.setString(3,availability);
            pt.setInt(4,price);
            pt.setInt(5,room_number);
            pt.executeUpdate();
            System.out.println("room record updated successfully.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void delete(int room_number){
        try{
            pt = con.prepareStatement("delete from room where room_number=?");
            pt.setInt(1,room_number);
            pt.executeUpdate();
            System.out.println("room record deleted successfully.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void displayPart(int room_number){
        try{
            pt = con.prepareStatement("select *from room where room_number=?");
            pt.setInt(1,room_number);
            Rs = pt.executeQuery();
            System.out.println("Room Details");
            while(Rs.next()){
                System.out.println("room_number: "+Rs.getInt(1)+"\nroom_type: "+Rs.getString(2)+"\ncapacity: "+Rs.getInt(3)+"\navailability: "+Rs.getString(4)+"\nprice: "+Rs.getInt(5));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void displayAll(){
        try{
            pt = con.prepareStatement("select *from room");
            Rs = pt.executeQuery();
            while(Rs.next()){
                System.out.println("room_number: "+Rs.getInt(1)+", room_type: "+Rs.getString(2)+", capacity: "+Rs.getInt(3)+", availability: "+Rs.getString(4)+", price: "+Rs.getInt(5));
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    void exit(){
        try{
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]){
        
        SQLCrud s = new SQLCrud();
        s.connect();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n==1){
            int room_number=Integer.parseInt(sc.nextLine());
            String room_type=sc.nextLine();
            int capacity=Integer.parseInt(sc.nextLine());
            String availability=sc.nextLine();
            int price=Integer.parseInt(sc.nextLine());
            s.insert(room_number,room_type,capacity,availability,price);
            s.displayAll();
        }else if(n==2){
            int room_number=Integer.parseInt(sc.nextLine());
            String room_type=sc.nextLine();
            int capacity=Integer.parseInt(sc.nextLine());
            String availability=sc.nextLine();
            int price=Integer.parseInt(sc.nextLine());
            s.update(room_number,room_type,capacity,availability,price);
            s.displayAll();
        }else if(n==3){
            int room_number=Integer.parseInt(sc.nextLine());
            s.delete(room_number);
            s.displayAll();
        }else if(n==4){
            s.displayAll();
        }else{
            int room_number=Integer.parseInt(sc.nextLine());
            s.displayPart(room_number);
        }
        
    }
    
}
