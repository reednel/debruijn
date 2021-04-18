/**
 * Program Notes:
 * - be pretty cool if it took a generic
 * - ^ shuffles in particular
 * - I use "shift" and "rotate" interchangeably
 * 
 * TODO: 
 * - Write isDeBruijn() 
 */

/**
 * De Bruijn program driver and basic tools.
 * 
 * @author reednel
 */
public class Main {

  /**
   * Driver for the DeBruijn program.
   * 
   * @param args
   */
  public static void main(String[] args) {

    final String A = "01"; // Alphabet
    int k = A.length();
    int n = 4; // Window length

    System.out.println("For an alphabet \"" + A + "\" and window of " + n + "...");
    System.out.println("De Bruijn sequences are " + lengthDBSequences(n, k) + " characters in length");
    System.out.println("There are " + numDBSequences(n, k) + " valid de Bruijn sequences\n");

    // DBGraph dbg = new DBGraph(A, n);
    // dbg.printMatrix();
	// dbg.printEulerian();
    
    // Shuffle.bigShuffleToSelf(A, n);

    // System.out.println("\nAll sequences:");
    // dbg.printEulerian();
    
    // dbg.writeEulerian(1);

    // Shuffle.allRotShuffleShiftToSelf("11101000");
    // Shuffle.allRotShuffleShiftToSelf("0111101011001000");

    
  }
  
  /**
   * Calculates simply the length of a B(k, n) sequence.
   * 
   * @param n the window length
   * @param k the alphabet length
   * @return the length of a B(k, n) sequence
   */
  public static String lengthDBSequences(int n, int k) {

    long l = (long) Math.pow(k, n);

    if (l == Long.MAX_VALUE) {
      return "over 9 pentillion";
    }

    return Long.toString(l);

  }
  
  /**
   * Calculates the number of possible De Bruijn sequences considering the given window size and
   * alphabet length. Not very meaningful for even larger single digit values of n and k, due to the
   * limited maximum integer length in Java, and the growth rate for this function.
   * 
   * @param n the window length
   * @param k the alphabet length
   * @return the number of possible sequences or roughly the largest possible value.
   */
  public static String numDBSequences(int n, int k) {

    long l = (long) (Math.pow(factorial(k), Math.pow(k, n - 1)) / Math.pow(k, n));

    if (l == Long.MAX_VALUE) {
      return "over 9 pentillion";
    }

    return Long.toString(l);

  }

  /**
   * A helper for numDBSequences(), as j.l.Math doesn't have a factorial function
   * 
   * @param k the integer to be operated on
   * @return k!, eventually
   */
  private static int factorial(int k) {

    if (k == 0)
      return 1;

    return k * factorial(k - 1);

  }

  /**
   * [NOT IMPLEMENTED]
   * Determines whether the given sequence is a valid De Bruijn, for the given window.
   * 
   * Possible implementation: generate array of all combinations for n,k. 
   * In for loop, compare substring to things in list, checking them off as you go. 
   * With binary search, should be O(nlogn).
   * ...It's not elegant, not clever, but quite comprehensible, and not too slow. 
   * 
   * @param sequence the sequence to check
   * @param n        the window size
   * @return true if the inputed sequence is a De Bruijn, false otherwise
   */
  public static boolean isDeBruijn(String sequence, int n) {
    
    return false;

  }

}
