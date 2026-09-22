import java.util.Scanner ;

public class IT26102010Lab9Q3 { 
    public static int add(int a, int b) { 
        return a + b; 
    } 

    public static int multiply(int a, int b) { 
        return a * b; 
    } 

    public static int square(int num) { 
        return num * num; 
    } 

    public static void main(String[] args) { 
        int multiply1 = multiply(3, 4); 
        int multiply2 = multiply(5, 7); 
        
        int sum1 = add(multiply1, multiply2); 
        
        int result1 = square(sum1); 
        System.out.println("Result of expression i (3 * 4 + 5 * 7)^2 is: " + result1); 

        int addExpr1 = add(4, 7); 
        int addExpr2 = add(8, 3); 
        
        int square1 = square(addExpr1); 
        int square2 = square(addExpr2); 
        
        int result2 = add(square1, square2); 
        System.out.println("Result of expression ii (4 + 7)^2 + (8 + 3)^2 is: " + result2); 
    } 
}