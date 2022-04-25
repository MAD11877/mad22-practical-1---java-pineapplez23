import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int i = 0;
    System.out.print("Enter number of integer to be keyed in: ");
    int c = in.nextInt();
    int[] myArray = new int[c];
    for(i = 0; i < c; i++)
    {                  
      System.out.printf("enter a value: ");  
      myArray[i] = in.nextInt();          
    } 
    int maxNumber = -1;
    int maxApperance = -1;
    for(i = 0; i < myArray.length; i++)
    {
      int count = 0;
      for (int j = 0; j < myArray.length; j++)
      {
        if (myArray[i] == myArray[j])
        {
          count++;
        }

        if (count > maxApperance)
        {
          maxNumber = myArray[i];
          maxApperance = count;
        }
      }
    }
    System.out.println("The mode is: " + maxNumber);
  }
}
