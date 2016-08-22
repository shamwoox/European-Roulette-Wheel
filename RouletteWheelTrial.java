import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class RouletteWheelTrial
{
    public static void main(String[] args)
    {
        Random generator = new Random();//Random generator
        RouletteWheel myWheel = new RouletteWheel();//Creating a new instance of roulette wheel
        Scanner keyboard = new Scanner(System.in);//SCanner object
        for ( int trials = 0; trials < 3; trials++){
        System.out.print("Enter the number of spins: ");
        int spins = Integer.parseInt(keyboard.nextLine());//Asks users for number of spins
        //Fields
        int countRed = 0;
        int countBlack = 0;
        int twoSameNumbers = 0;
        int threeSameNumbers = 0;
        int countEven = 0;
        int countOdd = 0;
        int biggestEvenStreak = 1;
        int biggestOddStreak = 1;
        //Gets first spin value
        int current = generator.nextInt(37);//Generates numbers from 0-36
        //sets number in the roulettewheel class
        myWheel.setNumber(current);
        //Gets color
        String color = myWheel.getColor();
        if (color.equals("Red"))
            {
                countRed++;
            }
            else
            {
                countBlack++;
            }
        //Gets second spin value
        int next = generator.nextInt(37);
        myWheel.setNumber(next);
        color = myWheel.getColor();

        if (color.equals("Red"))
            {
                countRed++;
            }
            else
            {
                countBlack++;
            }
        int next2 = generator.nextInt(37);
        myWheel.setNumber(next2);
        color = myWheel.getColor();

        if (color.equals("Red"))
            {
                countRed++;
            }
            else
            {
                countBlack++;
            }
       
        for (int i = 3; i < spins; i++)
        {
            int value = generator.nextInt(37);
            myWheel.setNumber(value);
            color = myWheel.getColor();
            if (color.equals("Red"))
            {
                countRed++;
            }
            else
            {
                countBlack++;
            }
            //Rotates first three values
            current = next;
            next = next2;
            next2 = value;
            //checks if two consecutive numbers are the same
            if(current == next)
            {
                twoSameNumbers++;
            }
            //checks if three consecutives numbers are the same
            if((current == next) && (next == next2))
            {
                    threeSameNumbers++;
            }
            //Determines if number is even
            if(current % 2 == 0)
            {
                countEven++;//If even, then countEven increments by one
                
                if(countEven > biggestEvenStreak)
                {
                    biggestEvenStreak = countEven;
                }
                
            }
            else
            {
                countEven = 0;//If loses streak, then counter gets reset back to 0
            }
            //Checks if number is odd
             if(current % 2 != 0)
            {
                countOdd++;//If odd, then countOdd increments by one
                if(countOdd > biggestOddStreak)
                {
                    biggestOddStreak = countOdd;
                }
            }
            else
            {
                countOdd = 0;//If loses streak, then countOd gets reset back to 0;
            }
        }
        //Prints calculated values
        System.out.println("The number of times red appeared: " + countRed);
        System.out.println("The number of times black appeared: " + countBlack);
        System.out.println("The number of times a same number appeared twice in a row: " + twoSameNumbers);
        System.out.println("The number of times a same number appeared three times in a row: " + threeSameNumbers);
        System.out.println("The longest run of odd numbers: " + biggestOddStreak);
        System.out.println("The longest run of even numbers: " + biggestEvenStreak);
    
    }
}
   
    
}