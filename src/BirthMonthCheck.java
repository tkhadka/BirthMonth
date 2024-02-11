/*
Pseudocode:
- Create a Scanner object to gather console input.
- Ask the user for their birth month as an integer value.
- Retrieve the birth month value from the user.
- If the birth month is between 1 and 12:
  - Print a confirmation message including the entered month.
- If the birth month is outside of 1 to 12:
  - Print an error message including the entered month.
*/

import java.util.Scanner;

public class BirthMonthCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = input.nextInt();

        if (birthMonth >= 1 && birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}
