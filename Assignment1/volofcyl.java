import java.util.Scanner;  

public class volume {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter radius: ");  
        int rad = scanner.nextInt();   
        System.out.print("Enter radius: ");  
        int height = scanner.nextInt(); 
        int vol = (22/7*(rad*rad))*height;  
 
        System.out.println("volume:"+vol);  
    
        scanner.close();  
    }  
}
