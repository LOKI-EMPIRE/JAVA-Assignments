(1) import java.util.*;

class InvalidQuantityException extends Exception{
    public InvalidQuantityException(String msg){
        super(msg);
    }
}

class Book{
    
    String id;
    String bookTitle;
    String authorName;
    float price;
    int quantity;
    
    public Book(String id, String bookTitle, String authorName, float price, int quantity){
        this.id = id;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }
        
        int purchase(int quantity){
            return this.quantity - quantity;
        }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String bookTitle = sc.nextLine();
        String authorName = sc.nextLine();
        float price = sc.nextFloat();
        sc.nextLine();
        int quantity = sc.nextInt();
        sc.nextLine();
        int qCheck = sc.nextInt();
        
        Book b = new Book(id,bookTitle,authorName,price,quantity);
        
        try{
            if(b.purchase(qCheck)>0){
            System.out.printf("Quantity Available : %d",b.purchase(qCheck));
            } else {
                throw new InvalidQuantityException("Quantity not available");
            }
        } catch(InvalidQuantityException e) {
            System.out.println(e);
        }
        
    }
    
}

(2) import java.util.*;
import java.util.regex.*;

class DotException extends Exception{
    public DotException(String msg){
        super(msg);
    }
}

class AtTheRateException extends Exception{
    public AtTheRateException(String msg){
        super(msg);
    }
}

class DomainException extends Exception{
    public DomainException(String msg){
        super(msg);
    }
}

class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        try{
            String email = sc.nextLine();
            String sCrt = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.(in|com|net|biz)$";
            Pattern p1 = Pattern.compile(sCrt);
            Matcher m1 = p1.matcher(email);
           
            int count1=0;
            int count2=0;
            
            for(int i=0;i<email.length();i++){
                if(email.charAt(i)=='@'){
                    count1++;
                }
                if(email.charAt(i)=='.'){
                    count2++;
                }
            }
            if(m1.matches()){
                System.out.println("Valid email address");
            }else if(!count2==1){
                throw new DotException("Invalid Dot usage \nInvalid email address");
            }else if(!count3==1){
                throw new AtTheRateException("Invalid @ usage \nInvalid email address");
            }else{
                throw new DomainException("Invalid Domain \nInvalid email address");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
      
(3) import java.util.*;

class InvalidAgeForDrivingLicenseException extends Exception{
    public InvalidAgeForDrivingLicenseException(String msg){
        super(msg);
    }
}

class InvalidMarkForDrivingLicenseException extends Exception{
    public InvalidMarkForDrivingLicenseException(String msg){
        super(msg);
    }
}


class Main{
    
    private String name;
    private int userAge;
    private int mark;
    
    public Main(String name, int userAge, int mark){
        this.name = name;
        this.userAge = userAge;
        this.mark = mark;
    }
    
    public int getUserAge(){
        return this.userAge;
    }
    
    public int getMark(){
        return this.mark;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try{
           int userAge = Integer.parseInt(sc.nextLine());
           int mark = Integer.parseInt(sc.nextLine());
           Main m = new Main(name,userAge,mark);
           if(m.getMark()<=80 || m.getMark()>100){
               if(m.getMark()<0 || m.getMark()>100){
                   throw new InvalidMarkForDrivingLicenseException("Invalid mark");
               }else{
                   throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
               }
           }else if(m.getUserAge()<18){
               if(m.getUserAge()<0){
                    throw new InvalidAgeForDrivingLicenseException("Invalid age");
               }else{
                   throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
               }
           }else{
               System.out.println("Approved");
           }
        }catch(InvalidMarkForDrivingLicenseException e1){
            System.out.println(e1);
        }catch(InvalidAgeForDrivingLicenseException e2){
            System.out.println(e2);
        }
        
    }
}
