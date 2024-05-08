(1) import java.util.*;

class Person{
    
    private String firstName;
    private String lastName;
    
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    String display(){
       return firstName+" "+lastName;
    }
    
}

class Employee extends Person{
    
    private int employeeId;
    private String jobTitle;
    
    Employee(String firstName,String lastName,int employeeId,String jobTitle){
        super(firstName,lastName);
      this.employeeId= employeeId;
        this.jobTitle = jobTitle;
    }
    
    void display1(){
        String str = super.display();
        System.out.println("Employee details:");
        System.out.println("Name: "+ str + ", " + this.jobTitle);
        System.out.println("Employee ID: "+this.employeeId);
    }
    
}

class Main{
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String firstName= sc.nextLine();
        String lastName = sc.nextLine();
        int employeeId = sc.nextInt();
        sc.nextLine();
        String jobTitle= sc.nextLine();
        Employee p = new Employee(firstName,lastName,employeeId,jobTitle);
        p.display1();
        
    }
}


(2) import java.util.*;

class Transaction{
    private int transactionId;
    private double amount;
    
    Transaction (int transactionId,double amount){
        this.transactionId = transactionId;
        this.amount = amount;
    }
    
    String getTransactionInfo(){
        return "Transaction ID: " + this.transactionId + "\n" + "Amount: $" +this.amount;
    }
}

class PeerToPeerTransaction extends Transaction{
    private String recipient;
  PeerToPeerTransaction(int transactionId,double amount,String recipient){
        super(transactionId,amount);
        this.recipient = recipient;
    }
    
    void getTransactionInfoP(){
        System.out.println("Peer-to-Peer Transaction:");
        System.out.println(getTransactionInfo());
        System.out.println("Recipient: "+ this.recipient+"\n");
    }
}

class OnlinePurchaseTransaction extends Transaction{
    private String merchant;
    
    OnlinePurchaseTransaction(int transactionId,double amount,String merchant){
        super(transactionId,amount);
        this.merchant = merchant;
      }
    
    void getTransactionInfoO(){
        System.out.println("Online Purchase Transaction:");
        System.out.println(getTransactionInfo());
        System.out.println("Merchant: "+ this.merchant +"\n");
    }
}

class BillPaymentTransaction extends Transaction{
    private String billType;
    
    BillPaymentTransaction(int transactionId,double amount,String billType){
        super(transactionId,amount);
        this.billType = billType;
    }
    
    void getTransactionInfoB(){
       System.out.println("Bill Payment Transaction:");
      System.out.println(getTransactionInfo());
       System.out.println("Bill Type: "+ this.billType);
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int transactionId = sc.nextInt();
        double amount = sc.nextDouble();
        sc.nextLine();
        String recipient = sc.nextLine();
        String merchant = sc.nextLine();
        String billType = sc.nextLine();
        PeerToPeerTransaction p = new PeerToPeerTransaction(transactionId,amount,recipient);
        OnlinePurchaseTransaction o = new OnlinePurchaseTransaction(transactionId,amount,merchant);
        BillPaymentTransaction b = new BillPaymentTransaction(transactionId,amount,billType);
        p.getTransactionInfoP();
        o.getTransactionInfoO();
        b.getTransactionInfoB();
    }
}


(3) import java.util.*;

class Employee{
    int empId;
    float salary;
    
    Employee(int empId,float salary){
        this.empId = empId;
        this.salary = salary;
    }
}

class EmployeeLevel extends Employee{
     
    EmployeeLevel(int empId,float salary){
        super(empId,salary);
    }
    
    void findLevel(){
        if(super.salary > 100.0){
                System.out.println(super.empId+"\n"+super.salary+"\n" + "1");
        }else{
            System.out.println(super.empId+"\n"+super.salary+"\n"+ "2");
        }
    }
    
}

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        float salary = sc.nextFloat();
        EmployeeLevel e = new EmployeeLevel(empId,salary);
        e.findLevel();
    }
}
