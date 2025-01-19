import java.util.Scanner;  

public class per {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter length: ");  
        int l = scanner.nextInt();   
        System.out.print("Enter width: ");  
        int b = scanner.nextInt(); 
        int per = 2*(l+b); 
 
        System.out.println("perimeter: "+per);  
    
        scanner.close();  
    }  
}
