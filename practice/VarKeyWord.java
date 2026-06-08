public class VarKeyWord {
    public static void main(String[] args){

 /*Using var keyword to declare variables now we don't have to specify the data type of the variable, 
 the compiler will infer it based on the value assigned to it.*/ 

        var name = "John";
        var age = 16 ;
        var accountbalance = 992.48f ;
        var gender = 'M';
        var infocorrect = true ;
// the value must be given at the time of declaration when using var keyword, otherwise it will throw an error.
/* you cannot write code like this: var name; 
because the compiler will not be able to infer the data type of the variable and it will throw an error.  */     
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Account Balance = " + accountbalance);
        System.out.println("Gender = " + gender);
        System.out.println("Is the information correct? " + infocorrect);   


    }
}
