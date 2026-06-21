public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myint = 8 ;
        double mydouble = myint ; 

        System.out.println(myint);
        System.out.println(mydouble);
        // Explicit Casting (Narrowing)

        double mydouble2 = 9.78;
        int myint2 = (int)mydouble2; // ()specifies the type to convert to mainly used for narrowing conversions

        System.out.println(mydouble2);
        System.out.println(myint2);
    }
}