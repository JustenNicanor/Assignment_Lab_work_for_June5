import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a message: ");

        String str = scan.nextLine(), reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("The word " + str + " is a Palindrome.");
        }

        else {
            System.out.println("The word " + str + " is not a Palindrome.");
        }
  
    }

}

