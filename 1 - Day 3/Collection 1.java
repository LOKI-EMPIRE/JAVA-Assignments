(1) import java.util.*;

class Main {
    
   static String iscontains(ArrayList<Integer> arrL,int srch){
       if(arrL.contains(srch)==true){
           return String.format("Number %d exists in the ArrayList",srch);
       }else{
           return String.format("Number %d not exists in the ArrayList",srch);
       }
   }
   
   static void removal(ArrayList<Integer> arrL,int rem){
       arrL.remove(Integer.valueOf(rem));
       System.out.printf("ArrayList after removing %d",rem).println();
       arrL.stream().forEach(e -> System.out.print(e+" "));
   }
   
   static void usingforloop(ArrayList<Integer> arrL){
       System.out.println("\nArrayList elements using normal for loop");
       for(int a : arrL){
          System.out.print(a+" ");
       }
   }
   
   static void usingiterator(ArrayList<Integer> arrL){
       System.out.println("\nArrayList elements using Iterator interface");
       Iterator it = arrL.iterator();
       while(it.hasNext()){
           System.out.print(it.next()+" ");
       }
   }
   
   static void usingforeach(ArrayList<Integer> arrL){
       System.out.println("\nArrayList elements using for-each loop");
       arrL.stream().forEach(e -> System.out.print(e+" "));
   }
   
   static void descendingorder(ArrayList<Integer> arrL){
       Collections.sort(arrL,Collections.reverseOrder());
       System.out.println("\nArrayList elements in descending order");
       arrL.stream().forEach(e -> System.out.print(e+" "));
   }
  public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt(),a;
        ArrayList<Integer> arrL = new ArrayList<Integer>(siz);
        for(int i=0;i<siz;i++){
            a=sc.nextInt();
            arrL.add(a);
        }
        int srch = sc.nextInt();
        int rem = sc.nextInt();
        sc.close();
        
        System.out.println(iscontains(arrL,srch));
        removal(arrL,rem);
        usingforloop(arrL);
        usingiterator(arrL);
        usingforeach(arrL);
        descendingorder(arrL);
        System.out.printf("\nNumber of elements in the ArrayList: %d",arrL.size()).println();
  }
}

(2)import java.util.*;

class Main{
    
    static void checkingKey(HashMap<Integer,Integer> h, int checKey){
        if(h.containsKey(checKey) == true){
            System.out.printf("Key %d exists in the HashMap.",checKey).println();
        }else{
            System.out.printf("Key %d does not exist in the HashMap.",checKey).println();
        }
    }
    
    static void printingValues(HashMap<Integer,Integer> h){
        System.out.println("Printing all key-value pairs using EntrySet: ");
        for(Map.Entry m : h.entrySet()){
            System.out.println("Key: " + m.getKey() + ", Value: " + m.getValue());
        }
    }
    
    static void valueForKey(HashMap<Integer,Integer> h,int rtrKey){
        if(h.containsKey(rtrKey) == true){
            System.out.printf("Value for key %d: %d",rtrKey,h.get(rtrKey)).println();
        }else{
            System.out.printf("Key %d does not exist in the HashMap.",rtrKey);
        }
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>(size);
        for(int i=1; i<=size; i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            h.put(key,value);
        }
        int checKey = sc.nextInt();
        int rtrKey = sc.nextInt();
        
        checkingKey(h,checKey);
        printingValues(h);
        valueForKey(h,rtrKey);
    }
}
  
  
(3) import java.util.*;

class Employee{
    private String employeeName;
    private int employeeId;
    private String employeeDepartment;
    
    Employee(String employeeName,int employeeId,String employeeDepartment){
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeDepartment = employeeDepartment;
    }
    
    public String getEmployeeName(){
        return this.employeeName;
    }
    public int getEmployeeId(){
        return this.employeeId;
    }
  public String getEmployeeDepartment(){
        return this.employeeDepartment;
    }
    
    public String toString(){
        return String.format("Employee [employeeName=%s, employeeId=%d, employeeDepartment=%s]",this.employeeName,this.employeeId,this.employeeDepartment);
    }`
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList arrL = new ArrayList<>();
        for(int i=1;i<=n;i++){
            String employeeName = sc.nextLine();
            int employeeId = sc.nextInt();
            sc.nextLine();
            String employeeDepartment = sc.nextLine();
            arrL.add(employeeName);
          arrL.add(employeeId);
            arrL.add(employeeDepartment);
        }
        
        System.out.println("List of All Employees");
        for(int j=0 ; j<n*3 ; j+=3){
            Employee e = new Employee((String)arrL.get(j), (Integer)arrL.get(j+1), (String)arrL.get(j+2));
            System.out.println(e.toString());
        }
        
    }
}
