public class Crashmain {

    public static void main(String []args){
System.out.println(" Opening the shop... ");

try{
String typedPrice = "twelve thousand";
double price  =Double.parseDouble(typedPrice);


System.out.println(" Price entered " + price);
}
catch (NumberFormatException e)
{System.out.println("Sorry type real numbers you bum. I will not ask you again.");
}
System.out.println(" Shop Closed normally ");
}
    
}
