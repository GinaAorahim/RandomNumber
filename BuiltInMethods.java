/*  Your Name: Gina Aorahim
    Assignment Name:   BuiltInMethods        
    Date:  09/29/20
    Test Data Set:
*/
public class BuiltInMethods{
    public static void main(String[] args) {
        /* 
            Calculate The volume of a Cylinder 
            Radius squared times PI times height
        */
        double radius = 3.75; // units centimeters 
        double height = 12.5; // units centimeters 

        double volume = Math.pow(radius, 2) * Math.PI * height;

        System.out.print("Volume of cylinder is ");
        System.out.print(volume + "cubic centimeters");

        /* 
            Calculate a random number between 1 and 6 
        */
        double randomNumber = Math.floor((Math.random() * 6) + 1);
        System.out.print("Random number between 1 and 6 is: " + randomNumber);

        System.exit(0);
    }
}
        
