/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Your code must meet the
 * requirements set forth in this section, and must support all possible values
 * that might be passed into your methods.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();
        System.out.println(ps.isCentered("1234567", "355"));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      if (in == null) {
        return null;
      } else if (in != null && out != null && out.length() == 4) {
        String out1 = out.substring(0, 2);
        String out2 = out.substring(2, 4);
        return out1 + in +  out2;
      } else {
        return in;
      }
    }
    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      if (text == null) {
        return null;
      } else if ((text.length() > 0 && text.length() < 10) && (n > 0 && n < text.length())) {
        return text.substring(0, n) + text.substring(text.length() - n, text.length());
      } else {
        return text;
      }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      if (text.length() % 2 == 1) {
        int middleChar = text.length() / 2;
        return text.substring(middleChar - 1, middleChar + 2);
      } else {
        return text;
      }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
      if (text.length() % 2 == 1 && target.length() == 3) {
        int middleChar = text.length() / 2;
        String middleChars = text.substring(middleChar - 1, middleChar + 2);
        if (target.equals(middleChars)) {
          return true;
        } else {
          return false;
        }
      } else {
        return false;
      }
    }

    /*
    //  * Exercise 5.
    //  *
    //  * Given a string and a character, compute the number of words that end in suffix.
    //  */
    //
    // public int countMe(String text, char suffix) {
    //
    // }
    //
    // /*
    //  * Exercise 6.
    //  *
    //  * Given a string, compute the number of triplets in text.
    //  */
    //
    // public int triplets(String text) {
    //
    // }
    //
    // /*
    //  * Exercise 7.
    //  *
    //  * Given a string, compute the sum of the digits in text.
    //  */
    //
    // public long addMe(String text) {
    //
    // }
    //
    // /*
    //  * Exercise 8.
    //  *
    //  * Given a string, compute the length of the longest sequence.
    //  */
    //
    // public long sequence(String text) {
    //
    // }
    //
    // /*
    //  * Exercise 9.
    //  *
    //  * Given two strings, return a new string built by intertwining each of the
    //  * characters of a and b.
    //  */
    //
    // public String intertwine(String a, String b) {
    //
    // }
    //
    // /*
    //  * Exercise 10.
    //  *
    //  * Given a string, determine whether or not it is a palindrome.
    //  */
    //
    // public boolean isPalindrome(String text) {
    //
    // }
}
