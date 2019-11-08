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
        System.out.println(ps.isPalindrome("m"));
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
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      int suffixCount = 0;
      if (text == null) {
        return -1;
      } else if (Character.isLetter(suffix)) {
        for (int i = 0; i < text.length() - 1; i++) {
          if (text.charAt(i) == suffix && text.charAt(i + 1) == ' ') {
            suffixCount++;
          }
        }
        if (text.charAt(text.length() - 1) == suffix) {
          suffixCount++;
        }
        return suffixCount;
      } else {
        return -1;
      }
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      char char1 = 'a';
      char char2 = 'a';
      char char3 = 'a';
      int triplets = 0;
      if (text.equals(null)) {
        return -1;
      } else {
        for (int i = 0; i < (text.length() - 2); i++) {
          char1 = text.charAt(i);
          char2 = text.charAt(i + 1);
          char3 = text.charAt(i + 2);
          if (char1 == char2 && char2 == char3) {
            triplets++;
          }
        }
        return triplets;
      }
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
      char char1 = 'a';
      int numInts = 0;
      if (text.equals(null)) {
        return -1;
      } else {
        for (int i = 0; i < (text.length()); i++) {
          char1 = text.charAt(i);
          if (Character.isDigit(char1) || char1 == '0') {
            numInts++;
          }
        }
        return numInts;
      }
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
      char currentChar = ' ';
      char oldChar = ' ';
      int currentLength = 0;
      int highLength = 0;
      if (text.equals(null)) {
        return -1;
      } else if (text.length() == 0) {
        return 0;
      } else {
        for (int i = 1; i < text.length(); i++) {
          oldChar = currentChar;
          currentChar = text.charAt(i);
          if (oldChar == currentChar) {
            currentLength++;
          } else {
            currentLength = 1;
          }
          if (currentLength > highLength) {
            highLength = currentLength;
          }
        }
        return highLength;
      }
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      String newStr = "";
      int bigLength = b.length();
      if (a.length() > b.length()) {
        bigLength = a.length();
      }
      if (a.equals(null) || b.equals(null)) {
        return null;
      } else {
        for (int i = 0; i < bigLength; i++) {
          if (a.length() > i) {
            newStr += String.valueOf(a.charAt(i));
          }
          if (b.length() > i) {
            newStr += String.valueOf(b.charAt(i));
          }
        }
        return newStr;
      }
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
      String backwards = "";
      boolean isPal = false;
      if (text.equals(null)) {
        return isPal;
      } else {
        for (int i = text.length() - 1; i >= 0; i--) {
          backwards += String.valueOf(text.charAt(i));
        }
        if (text.equals(backwards)) {
          isPal = true;
        }
        return isPal;
      }
    }
}
