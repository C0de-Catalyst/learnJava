public class syntax {
    public static void main(String[]args){
        
        // String variable is use to store text,the value of the string variable must be in double quotes
        String name = "Chambal ke Daku";
        System.out.println(name);
        
        /*int variable is use to store integer numbers, 
        the value of int variable does not require to be in double quotes ,
        int stores only whole numbers without decimals*/
        int myNum = 10;
        System.out.println(myNum);
//You can also declare a variable without assigning the value, and assign the value later
        int myNum2;
        myNum2 =15;
        System.out.println(myNum2);
//You can also change the value of a variable after it has been assigned
        int myNum3 = 15;
        myNum3 = 20;
        System.out.println(myNum3);

    //final variable is a contant variable whose value cannot be changed once assigned
        final int myAge = 20;
        System.out.println(myAge);
        
    }
}
