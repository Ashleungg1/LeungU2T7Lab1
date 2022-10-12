import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // getting user input
        System.out.print("Enter first string: ");
        String firstString = scan.nextLine();

        // "calculating" & printing information
        System.out.println("String length: " + firstString.length()); // length of first string

        String firstHalf = firstString.substring(0,(firstString.length()/2));
        String secondHalf = firstString.substring(firstString.length()/2);

        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);

        // getting second string
        System.out.print("Enter second string: ");
        String secondString = scan.nextLine();

        // comparing lengths
        if (firstString.length() > secondString.length()){
            System.out.println(firstString + " is longer");
        } else if (secondString.length() > firstString.length()){
            System.out.println(secondString + " is longer");
        } else {
            System.out.println("Both strings have the same length");
        }

        // alphabetize
        int comparison = firstString.compareTo(secondString);

        if (comparison < 0){
            System.out.println(firstString + " is first alphabetically");
        } else if (comparison > 0){
            System.out.println(secondString + " is first alphabetically");
        } else {
            System.out.println("Both strings have the exact same characters");
        }

        // indexing and seeing if str1 contains str2
        int indexSpot = firstString.indexOf(secondString);

        if (indexSpot>=0){
            System.out.println(secondString + " is found in " + firstString + " at index " + indexSpot);
        } else {
            System.out.println(secondString + " is NOT found in " + firstString);
        }




    }
}
