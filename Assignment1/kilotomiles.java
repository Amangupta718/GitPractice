import java.util.Scanner;  

public class kilotomiles {  
    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter kilometer: ");  
        int kilome = scanner.nextInt();   
        double  miles= kilome*0.621371;
 
        System.out.println("miles : "+miles);  
    
        scanner.close();  
    }  
}
