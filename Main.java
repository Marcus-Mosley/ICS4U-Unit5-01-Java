import java.util.Scanner;

/**
* The Main program collects input and uses the Cube Class.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-16
*/
public class Main {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args)throws Exception {
    String[] elements = new String[24];
    int[] permuteList = new int[24];
    Scanner input = new Scanner(System.in);
    System.out.println("The Key - G: 1, R: 2, B: 3, O: 4, W: 5, Y: 6");
    System.out.println("\nMake sure to list stickers Top-Left to Bottom-Right, Starting"
        + " on the front face, turning clockwise 4 times, and then the top and bottom face");
    
    while (true) { 
      try {
        System.out.println("\nWhat is the cube's permutation (Separated by ', ')? ");
        String permutation = input.nextLine();
        elements = permutation.split(", ");
        for (int count = 0; count < elements.length; count++) {
          permuteList[count] = Integer.parseInt(elements[count]);
        }
        break;
      } catch (Exception e) {
        System.out.println("\nNot a valid permutation! Please input a list of 24 integers"
            + " separated by ', '!");
      }
    }

    Cube twoByTwo = new Cube(permuteList);
    if (twoByTwo.solve()) {
      twoByTwo.done();
    }
  }
}
