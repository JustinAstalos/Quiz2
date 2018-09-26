import java.util.Scanner;
import java.lang.Math;

public class ThriceTurn
{  
    
  public static void main ( String[] args )  
  {
    int die1 = 0;
    int die2 = 1;
    int die3 = 2;
    int rollCount = 0;
    int tally = 0;
    int value = 0;
    int placeholder = 0;

    //round1
    while (die1 != die2 && die2 != die3)
    {
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);
        die3 = (int)(Math.random()*6+1);
        placeholder = die1;
        rollCount++;
    }
    value = die1 + die2 + die3;
    if(rollCount % 3 == 0)
    {
        tally -= value;
    }
    else
    {
        tally += value;
    }
    System.out.println("Triplet's Worth: "+die1+"   Tally: "+ tally);

    //round2
    for(int i = 0; i < die1; i++)
    {
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);
        die3 = (int)(Math.random()*6+1);
        rollCount++;
        value = die1 * die2 * die3;
        tally += value;
        System.out.println("Value: "+value+"   Tally: "+ tally);
    }
    System.out.println("Tally: "+ tally);

    //round3
    int retire = 0;
    Scanner scan = new Scanner( System.in );
    System.out.println("Enter 0 to Retire, or 1 to roll:");
    retire = scan.nextInt();
        
    if (retire == 1)
    {
        rollCount = 0;
        while (die1 != die2 && die2 != die3)
        {
            die1 = (int)(Math.random()*6+1);
            die2 = (int)(Math.random()*6+1);
            die3 = (int)(Math.random()*6+1);
            rollCount++;
        }
        if (die1==placeholder)
        {
            tally = tally*3;
        }
        else
        {
            tally = die1;
        }
        for (int i = 0; i < rollCount; i++)
        {
            tally += Math.pow(3,i);
        }
        System.out.println("RollCount: "+rollCount);
        System.out.println("Triplets Value: "+die1);
        System.out.println("Final Tally: "+tally);
    }
    else
    {
        System.out.println("Final Tally: "+ tally);
    }

  }
}