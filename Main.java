import java.util.Scanner;
/**
 *This program allows the user to enter numbers and finds the numbers in the array
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks user to put in numbers
    System.out.println("Please enter in 10 integers to put into the array");

    //creates a constant for the array
    final int NUM_AMOUNT = 10;

    //creates array for the nummebrs
    int numbers[] = new int[NUM_AMOUNT];

    //for loop so user can write down their numbers
    for (int i = 0; i < numbers.length; i++){
      //allows them to print in thier numbers
      numbers[i] = input.nextInt();
    }

    //asks to find number
    System.out.println("Please enter a number to find");

    //allows user to pick a number
    int searchNumber = input.nextInt();

    //for loop to go thorugh and check
    for (int i = 0; i < numbers.length; i++){
      //prints if the index is equal to search number
      if(numbers[i] == searchNumber){
        //prints what index its found at
        System.out.println(searchNumber + " is located at index " + i);
      }

    }

  }
}
