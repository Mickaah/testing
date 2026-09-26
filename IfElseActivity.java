import java.util.*;

public class IfElseActivity {

    public static void main(String[] args) {
        
        // Input a number and check if it’s positive, negative, or zero.
        
       Scanner scan = new Scanner(System.in);
       
       int num;
       
        System.out.println("Please input a number"); 
        num = scan.nextInt(); 
        
        if(num < 0){
            System.out.println("Your number is negative"); 
        } else if (num == 0) {
            System.out.println("Your number is zero"); 
        } else {
            System.out.println("Your number is positive"); 
        }
    }
}

