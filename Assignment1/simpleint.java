import java.util.Scanner;  

public class si {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter principle: ");  
        int p = scanner.nextInt();   
        System.out.print("Enter rate: ");  
        int r = scanner.nextInt(); 
        System.out.print("Enter time: ");  
        int t = scanner.nextInt(); 
        int si = p*r*t; 
 
        System.out.println("volume:"+(si/100));  
    
        scanner.close();  
    }  
}
