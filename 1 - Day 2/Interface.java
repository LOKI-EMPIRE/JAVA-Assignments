(1) import java.util.*;

interface Vehicle {
    void printStates();
}

class Car implements Vehicle{
    int speed;
    int gear;
    int brake;
    
    Car(int speed,int gear,int brake){
        this.speed = speed;
        this.gear = gear;
        this.brake = brake;
    }
    
    public void printStates(){
        System.out.println("Car present state:");
        System.out.printf("speed:%d gear:%d",this.speed - this.brake,this.gear).println();
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
      int gear = sc.nextInt();
        int brake = sc.nextInt();
        
        Car c = new Car(speed,gear,brake);
        c.printStates();
    }
}


(2) import java.util.*;

interface Airfare{
    double calculateAmount();
}

class AirIndia implements Airfare{
    int hours;
    double costPerHour;
    
    AirIndia(int hours,double costPerHour){
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    
    public double calculateAmount(){
        return hours*costPerHour;
    }
}

class KingFisher implements Airfare{
    int hours;
    double costPerHour;
    int serviceCharge;
    
    KingFisher(int hours,double costPerHour,int serviceCharge){
        this.hours = hours;
        this.costPerHour = costPerHour;
         this.serviceCharge = serviceCharge;
    }
    
    public double calculateAmount(){
        return hours*costPerHour+serviceCharge;
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        int hours = sc.nextInt();
        double costPerHour = sc.nextDouble();
        int serviceCharge = 0;
        if(choice == 2){
           serviceCharge = sc.nextInt();
        }
        if(choice==1){
            AirIndia a1 = new AirIndia(hours,costPerHour);
            System.out.printf("%.2f",a1.calculateAmount()).println();
        }else{
            KingFisher k1 = new KingFisher(hours,costPerHour,serviceCharge);
            System.out.printf("%.2f",k1.calculateAmount()).println();
        }
    }
}

(3) import java.util.*;

class Game{
    
    public void playGame(){
         System.out.println("Playing the game without any parameters.");
    }
    public void playGame(String playerName){
        System.out.printf("Playing the game with player name: %s",playerName);
    }
    
    public void playGame(String playerName,int level){
        System.out.printf("Playing the game with player name: %s and level: %d",playerName,level);
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        Game g = new Game();
        if(option == 2){
            String str = sc.nextLine();
            g.playGame(str);
        }else if (option == 3){
            String str = sc.nextLine();
            int level = sc.nextInt();
            g.playGame(str,level);
        } else if(option == 1){
            g.playGame();
        }else{
            System.out.println("Invalid option!");
        }
    }
