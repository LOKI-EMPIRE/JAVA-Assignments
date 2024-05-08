(1) import java.util.*;

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrL = new ArrayList<>(N);
        int a;
        
        for(int i=1;i<=N;i++){
            a = Integer.parseInt(sc.nextLine());
            arrL.add(a);
        }
        
        int srch = Integer.parseInt(sc.nextLine());
        if(arrL.contains(srch)){
            System.out.printf("Found at position: %d",arrL.indexOf(srch)).println();
            Collections.sort(arrL);
            System.out.println(arrL);
        }else{
            System.out.printf("Not found, added at position: %d", arrL.size() ).println();
            arrL.add(srch);
            Collections.sort(arrL);
            System.out.println(arrL);
        }
    }
}

(2) // You are using Java
import java.util.*;
import java.lang.*;
import java.io.*;

// Write your code here, create classes
class Student{
    private int rollno;
    private String name;
    private String address;
    private int rank;
    
    Student(int rollno,String name,String address,int rank){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.rank = rank;
    }
    
    public int getRollNo(){
       return this.rollno = rollno;
    }
    
    public String getName(){
        return this.name = name;
    }
    
    public int getRank(){
        return this.rank = rank;
    }
    
    public String toString(){
        return this.rollno + " " + this.name + " " + this.address + " " + this.rank;
    }
    
}

class Sortbyroll implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.getRollNo() - b.getRollNo();
    }
}

class Sortbyname implements Comparator<Student>{
    public int compare(Student a,Student b){
        return a.getName().compareTo(b.getName());
    }
}

class SortbyRank implements Comparator<Student>{
    private boolean asc;
    
    public SortbyRank(boolean asc){
        this.asc = asc;
    }
    
    public int compare(Student a, Student b){
        if(this.asc){
            return a.getRank() - b.getRank();
        }else{
            return b.getRank() - a.getRank();
        }
    }
}

class Main
{
	public static void main (String[] args)
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		
		Scanner s = new Scanner(System.in);
		
		String Welcome = "Student Interactive Console : \n1) Add User\n2) Sort Student List by Roll no\n3) Sort Student List by Name"
		                + "\n4) sort Students by Rank\n5) Exit from System\n";
		int choice = 0;
		
		do {
		    
		    System.out.println(Welcome);
		    System.out.println("Enter your choice : ");
		    choice = s.nextInt();
		    
		    
		    switch(choice) {
		        case 1 : 
		            s.nextLine();
		            System.out.println("Enter the rollno, name, address and rank (separated by comma) ");
		            String[] temp = s.nextLine().split(",");
		            Student stu = new Student(Integer.parseInt(temp[0]), temp[1], temp[2], Integer.parseInt(temp[3]));
		            ar.add(stu);
		            break;
		        case 2 : 
		            s.nextLine();
		            Collections.sort(ar, new Sortbyroll());
		            System.out.println("\nStudents List sorted by rollno");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i).toString());
		            break;
		        case 3:
		            s.nextLine();
		            Collections.sort(ar, new Sortbyname());
		            System.out.println("\nStudents List sorted by rollno");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i).toString());
		            break;
		        case 4:
		            s.nextLine();
		            System.out.println("Sort by ascending or descending ( asc / des) ");
		            boolean asc = s.nextLine().equalsIgnoreCase("asc") ? true : false;
		            
		            Collections.sort(ar, new SortbyRank(asc));
		            System.out.println("\nStudents List sorted by Rank");
		            for (int i=0; i<ar.size(); i++)
		            	System.out.println(ar.get(i).toString());
		            break;
		        case 5 : 
		            System.out.println("Exiting ....");
		            System.exit(0);
		        default :
		            s.nextLine();
		            System.out.println("\nInvalid Input Try again !!!\n");
		            
		    }
		    
		} while (choice != 5 );

    }
}

(3) import java.util.*;

class StringComparator implements Comparator<String>{
    public int compare(String s1,String s2){
        return s1.length()-s2.length();
    }
}

class Main {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String a;
        ArrayList<String> arrL = new ArrayList<>();
        for(int i=1; i<=n; i++){
            a = sc.nextLine();
            arrL.add(a);
        }
        
        Collections.sort(arrL,new StringComparator());
        System.out.println(arrL);
    }
}

