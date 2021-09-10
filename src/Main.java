
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // stuff
        Scanner reader = new Scanner(System.in);
        String buffer;

        // TODO: F to C conversion
        //  Ask user for temp in F. Read it in. Convert to C. Display output.
        System.out.println("Let's convert temperature!");
        System.out.print("What's the temperature in Fahrenheit? ");
            buffer = reader.nextLine();
            Float TempF = Float.parseFloat(buffer);
                Float TempC = (TempF - 32.0f) * (5/9.0f);
        System.out.println("The temperature in degrees celsius is " + TempC + "°C");

        // TODO: compute height of building
        //  Ask how far away. Ask how tall. Ask for angle of elevation.
        //  Compute height of building using Math.tan(). Display output.
        System.out.println("Let's roughly compute the height of a building.");
        System.out.print("How far (ft) are you from the building? ");
            buffer = reader.nextLine();
            Float far = Float.parseFloat(buffer);
        System.out.print("How tall are you (ft)? ");
            buffer = reader.nextLine();
            Float tall = Float.parseFloat(buffer);
        System.out.print("What is the angle of elevation? ");
            buffer = reader.nextLine();
            Float angle = Float.parseFloat(buffer);
        //calculates height of the building
                Double heightF = ((Math.tan(Math.toRadians(angle)) * far) + tall);
        System.out.println("The building is " + heightF.floatValue() + " ft tall.");
                Double heightM = heightF / 3.281;
        System.out.println("The building is " + heightM.floatValue() + " m tall.");

        // TODO: compute probability of coveted loot.
        //  Ask for drop rate as percentage. Convert to fraction (divide by 100).
        //  Ask how many runs. Compute probability w/ formula provided.
        System.out.println("Let's compute probability of dropped loot.");
        System.out.print("What is the drop rate (%) of the loot you want? ");
            buffer = reader.nextLine();
            Float droprate = Float.parseFloat(buffer);
                Float drop = droprate/100.0f;
        System.out.print("What is the number of attempts? ");
            buffer = reader.nextLine();
            Float atmp = Float.parseFloat(buffer);
        // calculates probability of loot
                Float failrate = 1 - drop;
                Double prob = 1 - (Math.pow(failrate,atmp));
        System.out.println("The probability that the loot will drop at least once is " + prob.floatValue() + ".");

    }
}
