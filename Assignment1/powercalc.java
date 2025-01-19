import java.util.*;  

public class per {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter a: ");  
        int a = scanner.nextInt();   
        System.out.print("Enter b: ");  
        int b = scanner.nextInt(); 
        double ans = Math.pow(a,b);
 
        System.out.println("power : "+ans);  
    
        scanner.close();  
    }  
}
