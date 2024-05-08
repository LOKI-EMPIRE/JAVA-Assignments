(1) import java.util.*;

class Hall implements Comparable<Hall>{
    
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;
    
    public Hall(String name, String contactNumber, double costPerDay, String ownerName){
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
    
    public double getCostPerDay(){
        return this.costPerDay;
    }
    
    public int compareTo(Hall h){
        return (int) (this.getCostPerDay() - h.getCostPerDay());
    }

    public String toString(){
        return this.name + " " + this.contactNumber + " " + this.costPerDay + " " + this.ownerName;
    }
}

class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        ArrayList<Hall> arrL = new ArrayList<>();
        Hall h = null;
        
        for(int i=1;i<=N;i++){
            String name = sc.nextLine();
            String contactNumber = sc.nextLine();
            double costPerDay = Double.parseDouble(sc.nextLine());
            String ownerName = sc.nextLine();
            h = new Hall(name,contactNumber,costPerDay,ownerName);
            arrL.add(h);
        }
        
        Collections.sort(arrL);
        for(Hall h1:arrL){
            System.out.println(h1.toString());
        }
        
    }
}

    
(2) import java.util.*;

class Employee implements Comparable<Employee>{
    
    private String name;
    private double score;
    
    public Employee(String name, double score){
        this.name = name;
        this.score = score;
    }
    
    public double getScore(){
        return this.score;
    }
    
    public int compareTo(Employee e){
        return Double.compare(e.getScore(),this.getScore());
    }
    
    public String toString(){
        return this.name + " " + this.score;
    }
}

class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Employee> arrL = new ArrayList<>();
        Employee e;
        
        for(int i=1;i<=n;i++){
            String[] str = sc.nextLine().split(" ");
            e = new Employee( str[0] , Double.valueOf(str[1]) );
            arrL.add(e);
        }
        
        Collections.sort(arrL);
        for (Employee e1 : arrL){
            System.out.println(e1.toString());
        }
    }
}

(3) import java.util.*;

class Movie{
    
    private String title;
    private int releaseYear;
    private double rating;
    
    public Movie(String title,int releaseYear,double rating){
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating  = rating;
    }
    
    public double getRating(){
        return this.rating;
    }
    
    public String toString(){
        return String.format("Title: %s, Release Year: %d, Rating: %.1f",this.title,this.releaseYear,this.rating);
    }
}

class MovieComparator implements Comparator<Movie> {
    
    public int compare(Movie m1, Movie m2){
        return Double.compare(m1.getRating(),m2.getRating());
    }
    
}

class Main{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> arrL = new ArrayList<>();
        Movie m;
        int N = Integer.parseInt(sc.nextLine());
        
        for(int i=1;i<=N;i++){
            String title = sc.nextLine();
            int releaseYear = Integer.parseInt(sc.nextLine());
            double rating = Double.parseDouble(sc.nextLine());
            m = new Movie(title,releaseYear,rating);
            arrL.add(m);
        }
        
        Collections.sort(arrL,new MovieComparator());
        for (Movie m1 : arrL){
            System.out.println(m1.toString());
        }
    }
}
