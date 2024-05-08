(1) import java.util.*;

class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
        int ab = a/b;
        System.out.println(ab);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}


(2) import java.util.*;

class Main{
     
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
            if(a==0){
                throw new ArithmeticException();
            }else if(a>7){
                throw new IllegalArgumentException();
            }else{
                System.out.println(a);
            }
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException caught - / by zero");
        } catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught - Number should not be greater than 7");
        }
    }
}

(3)  import java.util.*;

class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            System.out.println(a);
        } catch (InputMismatchException e){
            System.out.println(e);
        }
        
    }
}
