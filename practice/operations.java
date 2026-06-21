public class operations{
    public static void main(String[] args) {
        int a = 15 ;
        int b = 4  ;
        int sum = a + b ;
        int diff = a - b ;
        int product = a * b ;
        int quotient = a / b ;
        int remainder = a % b ; // % is the modulus operator which gives the remainder of a division operation
        int increment = ++a ; // ++ is the increment operator which increases the value of a by 1
        int decrement = --b ; // -- is the decrement operator which decreases the value of b by 1
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Incremented a: " + increment);
        System.out.println("Decremented b: " + decrement);


        double x = 5.5 ;
        double y = 2.0 ;
        double division = x / y ;

        System.out.println("Division: " + division);


/* if we use increment and decrement operations on a same number  
the result will be different based on the order of operations. 
For example, if we increment a number and then decrement it, the final result will be the original number. 
However, if we decrement a number and then increment it, the final result will also be the original number. */

        int c = 10 ;
        System.out.println(++c);
        System.out.println(--c);
    }
}