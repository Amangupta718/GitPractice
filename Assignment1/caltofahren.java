import java.util.Scanner;  

public class conversion {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter the temp: ");  
        int cal = scanner.nextInt();    
        
        int fahren = (cal*9/5)+32;  
 
        System.out.println("converted temp:"+fahren);  
    
        scanner.close();  
    }  
}
