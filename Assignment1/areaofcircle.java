import java.util.Scanner;  

public class area {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter radius: ");  
        int rad = scanner.nextInt();   
        
        int area = (22/7*(rad*rad));  
 
        System.out.println("Area:"+area);  
    
        scanner.close();  
    }  
}
