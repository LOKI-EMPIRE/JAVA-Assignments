(1) import java.util.*;

class Main{
    
    static void printMsg(String s1, String s2){
        System.out.printf("Venue Details:\nVenue Name: %s\nCity Name: %s",s1,s2).println();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String[] str = msg.split(",");
        String venueName = str[0];
        String city = str[1];
        printMsg(venueName,city);
    }
}


(2) import java.util.*;
import java.util.regex.*;

class Program{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
            String pass = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()-+=])(?!.*\\s).{8,15}$";
            Pattern p = Pattern.compile(pass);
            Matcher m = p.matcher(str);
            if(m.matches()){
                System.out.printf("%s is a valid password",str).println();
            }else{
                System.out.printf("%s is a invalid password", str).println();
            }
        
    }
}


(3) import java.util.*;

class Program{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        Set<Character> l = new HashSet<>(ch.length);
        for(char c : ch){
            l.add(c);
        }
        System.out.println(l.size());
    }
}
