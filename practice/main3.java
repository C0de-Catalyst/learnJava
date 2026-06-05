public class main3 {
    public static void main(String[] args) {

    /*identifiers can be short names like x, y, z or descriptive names like firstName, lastName   */
    
        String name = "Chambal ke Daku";
        System.out.println("Hello, " + name);

        String firstName = "John";
        String lastName = "Witler";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
//code 3
        int x =12 ;
        int y = 17;
        System.out.println(x + y);
        // when you want to print the sum of x and y along with a message, you can use concatenation
        System.out.println("the sum is" + " " + (x + y));
// if you want to print the values of x and y along with the message, you can do it like this. 
// then mathematical operation will not performed  and then the result will be concatenated with the message
        System.out.println("the sum is" + x + y);
// instead of wrinting code 3  we can also write like this
        int a = 18, b = 71, c = 45 ;
        System.out.println(a + b + c);
// we can give a common value to multiple variables in a single line like this
        int p,q,r;
        p = q = r = 10;
        System.out.println(p*q*r + p+q+r);
/* 
      final int myBankBalance =19000;
myBankBalance = 20000; // this will give an error because my =BankBalance is a final variable and its value cannot be changed once assigned.
System.out.println(myBankBalance);        */

 final int birthYear = 2007 ;
System.out.println("I was born in " + birthYear);
    }
}
