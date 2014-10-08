import java.util.*;

public class CowTalks {
  public static final int STARPADDING = 4;
  public static void main (String[] args) {
    Scanner console = new Scanner(System.in);

    System.out.print("What would you like Mr.Cow to say? : ");
    String text = console.nextLine();

    System.out.println();
    printMessage(text);
    System.out.println();
    printCow();
  }

  public static void printStar(int lengthWithPadding) {
    for (int i = 0; i < lengthWithPadding; i++) {
      System.out.print("*");
    }
  }
  public static void printCow() {
    System.out.println(" \\   ^__^");
    System.out.println("  \\  (oo)\\_______");
    System.out.println("     (__)\\       )\\/\\");
    System.out.println("          ||----w |");
    System.out.println("          ||     ||");
  }
  public static void printMessage(String text) {
    int length = text.length();
    int lengthWithPadding = length + STARPADDING;

    printStar(lengthWithPadding);

    System.out.println();
    System.out.println("| " + text + " |");

    printStar(lengthWithPadding);
  }
}

/*
*ID and name:V00803225 Spencer Tranter
*Program Name:CowTalks.java
*Program Description:This program takes an input using Scanner Objects and uses System.out.println statemnts
to produce outputs that look like a cow saying the given input.
*Outputs:Prints out a picture of a cow saying the given input.
*Inputs:Uses a Scanner Object to create a variable called text from the input of the user.
*/
