(1) import java.util.*;

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> arrL = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String str = sc.next();
            arrL.add(str);
        }
        String strSearch = sc.next();
        
        if(arrL.contains(strSearch)){
             System.out.printf("%s hall is found in the list at position %d",strSearch,arrL.indexOf(strSearch)).println();
         }else{
             System.out.printf("%s hall is not found",strSearch).println();
         }
    
    }
}

(2) import java.util.*;

class Student implements Comparable<Student>{
    private int studentRollNumber;
    private String studentName;
    private int mark1;
    private int mark2;
    private int mark3;
    private double avg;
    
    public Student(int studentRollNumber,String studentName,int mark1,int mark2,int mark3){
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.avg = (mark1+mark2+mark3)/3;
    }
    
    public String getStudentName(){
        return this.studentName;
    }
    
    public int getStudentRollNumber(){
        return this.studentRollNumber;
    }
    
    public double getAvg(){
        return this.avg;
    }
    
    public int compareTo(Student s){
        return Double.compare(this.avg,s.getAvg());
    }
    
    public String toString(){
        return String.format("%-20s%-20s%-20s",this.studentRollNumber,this.studentName,this.avg);
    }
}

class Main{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arrL = new ArrayList<>();
        Student s= null;
        for(int i=1;i<=N;i++){
            int studentRollNumber = Integer.parseInt(sc.nextLine());
            String studentName = sc.nextLine();
            int mark1 = Integer.parseInt(sc.nextLine());
            int mark2 = Integer.parseInt(sc.nextLine());
            int mark3 = Integer.parseInt(sc.nextLine());
            s = new Student(studentRollNumber,studentName,mark1,mark2,mark3);
            arrL.add(s);
        }
        
        System.out.printf("%-20s%-20s%-20s","Roll No","Name","Average").println();
        Collections.sort(arrL);
        for(Student s1:arrL){
             System.out.println(s1.toString());
        }
    }
}

(3) import java.util.*;

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrL = new ArrayList<>(len);
        
        int temp=0,a;
        for(int i=1;i<=len;i++){
            a= Integer.parseInt(sc.nextLine());
            if(a>temp){
                arrL.add(a);
                temp=a;
            }else{
                continue;
            }
        }
        
        System.out.println(arrL);
    }
}
