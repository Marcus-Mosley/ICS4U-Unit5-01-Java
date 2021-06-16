import java.util.ArrayList;

/**
* This class creates a cube.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-16
*/
public class Cube {
  private static int[] permutation = new int[24];
  private static ArrayList<String> solutions = new ArrayList<String>();
  
  // Constructors
  
  /**
  * The Triangle method constructs a triangle.
  */
  public Cube(int[] inputList) {
    permutation = inputList;
  }
  
  // Methods
  
  /**
  * The solve method solves the cube.
  */
  public static Boolean solve() {
    int tmp = 0;
    
    if (solutions.size() > 15) {
      return false;
    } else if (check()) {
      return true;
    }
    
    // U Turn
    tmp = permutation[0];
    permutation[0] = permutation[4];
    permutation[4] = permutation[8];
    permutation[8] = permutation[12];
    permutation[12] = tmp;
    
    tmp = permutation[1];
    permutation[1] = permutation[5];
    permutation[5] = permutation[9];
    permutation[9] = permutation[13];
    permutation[13] = tmp;
    
    tmp = permutation[16];
    permutation[16] = permutation[18];
    permutation[18] = permutation[19];
    permutation[19] = permutation[17];
    permutation[17] = tmp;
    solutions.add("U");
    if (!solve()) {
      tmp = permutation[0];
      permutation[0] = permutation[12];
      permutation[12] = permutation[8];
      permutation[8] = permutation[4];
      permutation[4] = tmp;
    
      tmp = permutation[1];
      permutation[1] = permutation[13];
      permutation[13] = permutation[9];
      permutation[9] = permutation[5];
      permutation[5] = tmp;
    
      tmp = permutation[16];
      permutation[16] = permutation[17];
      permutation[17] = permutation[19];
      permutation[19] = permutation[18];
      permutation[18] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    // U' Turn
    tmp = permutation[0];
    permutation[0] = permutation[12];
    permutation[12] = permutation[8];
    permutation[8] = permutation[4];
    permutation[4] = tmp;
    
    tmp = permutation[1];
    permutation[1] = permutation[13];
    permutation[13] = permutation[9];
    permutation[9] = permutation[5];
    permutation[5] = tmp;
    
    tmp = permutation[16];
    permutation[16] = permutation[17];
    permutation[17] = permutation[19];
    permutation[19] = permutation[18];
    permutation[18] = tmp;
    solutions.add("U'");
    if (!solve()) {
      tmp = permutation[0];
      permutation[0] = permutation[4];
      permutation[4] = permutation[8];
      permutation[8] = permutation[12];
      permutation[12] = tmp;
    
      tmp = permutation[1];
      permutation[1] = permutation[5];
      permutation[5] = permutation[9];
      permutation[9] = permutation[13];
      permutation[13] = tmp;
    
      tmp = permutation[16];
      permutation[16] = permutation[18];
      permutation[18] = permutation[19];
      permutation[19] = permutation[17];
      permutation[17] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    
    // F Turn
    tmp = permutation[18];
    permutation[18] = permutation[15];
    permutation[15] = permutation[21];
    permutation[21] = permutation[4];
    permutation[4] = tmp;
    
    tmp = permutation[19];
    permutation[19] = permutation[13];
    permutation[13] = permutation[20];
    permutation[20] = permutation[6];
    permutation[6] = tmp;
    
    tmp = permutation[0];
    permutation[0] = permutation[2];
    permutation[2] = permutation[3];
    permutation[3] = permutation[1];
    permutation[1] = tmp;
    solutions.add("F");
    if (!solve()) {
      tmp = permutation[18];
      permutation[18] = permutation[4];
      permutation[4] = permutation[21];
      permutation[21] = permutation[15];
      permutation[15] = tmp;
    
      tmp = permutation[19];
      permutation[19] = permutation[6];
      permutation[6] = permutation[20];
      permutation[20] = permutation[13];
      permutation[13] = tmp;
    
      tmp = permutation[0];
      permutation[0] = permutation[1];
      permutation[1] = permutation[3];
      permutation[3] = permutation[2];
      permutation[2] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    // F' Turn
    tmp = permutation[18];
    permutation[18] = permutation[4];
    permutation[4] = permutation[21];
    permutation[21] = permutation[15];
    permutation[15] = tmp;
    
    tmp = permutation[19];
    permutation[19] = permutation[6];
    permutation[6] = permutation[20];
    permutation[20] = permutation[13];
    permutation[13] = tmp;
    
    tmp = permutation[0];
    permutation[0] = permutation[1];
    permutation[1] = permutation[3];
    permutation[3] = permutation[2];
    permutation[2] = tmp;
    solutions.add("F'");
    if (!solve()) {
      tmp = permutation[18];
      permutation[18] = permutation[15];
      permutation[15] = permutation[21];
      permutation[21] = permutation[4];
      permutation[4] = tmp;
    
      tmp = permutation[19];
      permutation[19] = permutation[13];
      permutation[13] = permutation[20];
      permutation[20] = permutation[6];
      permutation[6] = tmp;
    
      tmp = permutation[0];
      permutation[0] = permutation[2];
      permutation[2] = permutation[3];
      permutation[3] = permutation[1];
      permutation[1] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    // R Turn
    tmp = permutation[1];
    permutation[1] = permutation[21];
    permutation[21] = permutation[10];
    permutation[10] = permutation[17];
    permutation[17] = tmp;
    
    tmp = permutation[3];
    permutation[3] = permutation[23];
    permutation[23] = permutation[8];
    permutation[8] = permutation[19];
    permutation[19] = tmp;
    
    tmp = permutation[4];
    permutation[4] = permutation[6];
    permutation[6] = permutation[7];
    permutation[7] = permutation[5];
    permutation[5] = tmp;
    solutions.add("R");
    if (!solve()) {
      tmp = permutation[1];
      permutation[1] = permutation[17];
      permutation[17] = permutation[10];
      permutation[10] = permutation[21];
      permutation[21] = tmp;
    
      tmp = permutation[3];
      permutation[3] = permutation[19];
      permutation[19] = permutation[8];
      permutation[8] = permutation[23];
      permutation[23] = tmp;
    
      tmp = permutation[4];
      permutation[4] = permutation[5];
      permutation[5] = permutation[7];
      permutation[7] = permutation[6];
      permutation[6] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    // R' Turn
    tmp = permutation[1];
    permutation[1] = permutation[17];
    permutation[17] = permutation[10];
    permutation[10] = permutation[21];
    permutation[21] = tmp;
    
    tmp = permutation[3];
    permutation[3] = permutation[19];
    permutation[19] = permutation[8];
    permutation[8] = permutation[23];
    permutation[23] = tmp;
    
    tmp = permutation[4];
    permutation[4] = permutation[5];
    permutation[5] = permutation[7];
    permutation[7] = permutation[6];
    permutation[6] = tmp;
    solutions.add("R'");
    if (!solve()) {
      tmp = permutation[1];
      permutation[1] = permutation[21];
      permutation[21] = permutation[10];
      permutation[10] = permutation[17];
      permutation[17] = tmp;
    
      tmp = permutation[3];
      permutation[3] = permutation[23];
      permutation[23] = permutation[8];
      permutation[8] = permutation[19];
      permutation[19] = tmp;
    
      tmp = permutation[4];
      permutation[4] = permutation[6];
      permutation[6] = permutation[7];
      permutation[7] = permutation[5];
      permutation[5] = tmp;
      solutions.remove(solutions.size() - 1);
    } else {
      return true;
    }
    
    return false;
  }
  
  
  /**
  * The check method checks if the cube is solved.
  */
  public static Boolean check() {
    if (permutation[0] == permutation[1] && permutation[0] == permutation[2] 
        && permutation[0] == permutation[3] && permutation[4] == permutation[5] 
        && permutation[4] == permutation[6] && permutation[4] == permutation[7] 
        && permutation[8] == permutation[9] && permutation[8] == permutation[10] 
        && permutation[8] == permutation[11] && permutation[12] == permutation[13] 
        && permutation[12] == permutation[14] && permutation[12] == permutation[15]) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
  * The done method prints the solution.
  */
  public static void done() {
    System.out.print("\nSolved\n\n");
    for (int count = 0; count < solutions.size(); count++) {
      if (count == solutions.size() - 1) {
        System.out.print(solutions.get(count));
      } else {
        System.out.print(solutions.get(count) + ", ");
      }
    }
  }
}
