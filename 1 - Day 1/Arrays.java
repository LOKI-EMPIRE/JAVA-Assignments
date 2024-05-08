(1) import java.util.*;

class Program{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int[] arr = new int[a];
    
    for (int b=0;b<a;b++){
        arr[b]=sc.nextInt();
    }
    sc.close();
    
    int sum=0;
    for(int i=0;i<a-1;i++){
        boolean b=true;
        for(int j=i+1;j<a;j++){
          if(arr[i]<arr[j]){
                b = false;
            }
        }
        if(b==true){
            sum=sum+arr[i];
        }
    }
    System.out.println(sum+arr[a-1]);
    }
}

(2) import java.util.*;

class Program{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = String.valueOf(a);
        ArrayList<String> strA = new ArrayList<String>();
        String str1;
        
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<=str.length();j++){
                str1 = str.substring(i,j);
                if(str1.length()>1){
                    strA.add(str1);
                }
            }
        }
        
        int count =0;
        for(String str2 : strA){
            int b = Integer.valueOf(str2);
            if(b%11 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

(3) import java.util.*;

class Program{
    
    static void sortArrayByRow(int r,int[][] arr){
        for(int k=0;k<r;k++){
            Arrays.sort(arr[k]);
            for(int z:arr[k]){
                System.out.print(z +" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sortArrayByRow(r,arr);
    }
}

(4) import java.util.*;

class Program{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(a);
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            if(b>0){
                arr.add(b);
            }
        }
        if(arr.size()%2!=0){
            System.out.println(arr.get(arr.size()/2));
        }else{
            System.out.println(arr.get(arr.size()/2 - 1));
        }
    }
}


(5) import java.util.*;

class Program{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        
        for(int i=0;i<a;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        
        int sum = 0;
        int temp=0;
        
        for(int j=0;j<a-1;j++){
            temp=arr[j];
            for(int k=j+1;k<a;k++){
              if(temp==arr[k]){
                    arr[j]=0;
                    arr[k]=0;
                }
            }
        }
        
        for(int b : arr){
            sum+=b;
        }
        
        System.out.println(sum);
    }
}


(6) import java.util.*;

class Program{
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        
        int sum=0;
        double root;
        for(int b:arr){
            root = Math.sqrt(b);
            if(root%1==0){
                sum+= (int)root;
               }
        }
        
        System.out.println(sum);
    }
}
