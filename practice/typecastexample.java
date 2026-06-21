public class typecastexample {
    public static void main(String[] args){
        int maxvalue = 720 ;
        int obtainedvalue = 628 ;
        double percentage = (double) obtainedvalue / maxvalue * 100.0d ;

        System.out.println("Percentage of marks obtained is : " + percentage + "%");
    }
}
