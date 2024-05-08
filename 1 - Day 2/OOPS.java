(1) import java.util.*;

class Venue{
    private String name;
    private String city;
    private String address;
    private int pincode;
    
    Venue(String name,String city,String address,int pincode){
        this.name = name;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }
    
    void display(){
        System.out.println("Venue Details");
        System.out.println("Venue Name: " + this.name);
        System.out.println("City Name : " + this.city);
        System.out.println("City Address : " + this.address);
        System.out.println("City Pincode : "+ this.pincode);
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String city = sc.nextLine();
        String address = sc.nextLine();
        int pincode = sc.nextInt();
        Venue v = new Venue(name,city,address,pincode);
        v.display();
        
    }
}

(2) import java.util.*;

class Delivery{
    private long over;
    private long ball;
    private long runs;
    private String batsman;
    private String bowler;
    private String nonStriker;
    
    Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker){
        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker= nonStriker;
    }
    
    void display(){
        System.out.println("Over: "+ this.over);
        System.out.println("Ball: "+ this.ball);
        System.out.println("Runs: "+ this.runs);
        System.out.println("Batsman: "+ this.batsman);
        System.out.println("Bowler: "+ this.bowler);
        System.out.println("Non Striker: "+ this.nonStriker);
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long over = sc.nextLong();
        long ball = sc.nextLong();
        long runs = sc.nextLong();
        sc.nextLine();
        String batsman = sc.nextLine();
        String bowler = sc.nextLine();
        String nonStriker = sc.nextLine();
        
        Delivery d = new Delivery(over,ball,runs,batsman,bowler,nonStriker);
        d.display();
    }
}


(3) import java.util.*;
class Neon{
    
    private int num;
    
    Neon(int num){
        this.num = num;
    }
    
    void isNeonNumber(){
        int multiple = (int) Math.pow(this.num,2);
        int a = multiple%10;
        int b = multiple/10;
        if(b>9){
            int b1 = b%10;
            int b2 = b/10;
            b= b1+b2;
        }
        if(this.num == (a+b)){
             System.out.printf("%d is a Neon Number",this.num).println();
        }else{
            System.out.printf("%d is not a Neon Number",this.num).println();
        }
    }
}

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<=20){
        Neon ne = new Neon(num);
        ne.isNeonNumber();
        }else{
            System.out.println("Invalid");
        }
    }
}
