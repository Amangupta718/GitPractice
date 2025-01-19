import java.util.Scanner;  

public class avg {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter a: ");  
        int a = scanner.nextInt();   
        System.out.print("Enter b: ");  
        int b = scanner.nextInt(); 
        System.out.print("Enter c: ");  
        int c = scanner.nextInt();
        int ans = (a+b+c)/3;
 
        System.out.println("average : "+ans);  
    
        scanner.close();  
    }  
}
