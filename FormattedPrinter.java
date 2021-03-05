import java.util.Scanner;

public class FormattedPrinter {

    //Method to print the formatted output.
    public static void print(String input) {
        int midIndex = (input.length() / 2) + 1;
        int textIndex = midIndex - 1;
        String textContent = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            textContent = textContent + input.charAt(textIndex);
            System.out.println(getSpaceText(i) + textContent);

            if(textIndex == input.length()-1) {
                textIndex = 0;
            } else {
                textIndex++;
            }
        }
    }

    //Method to get the required spaces before printing the letters.
    public static String getSpaceText(int length) {
        String spaceText = "";
        for (int i = 0; i < length; i++) {
            spaceText = spaceText + " ";
        }
        return spaceText;
    }

    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the input text");
        input = scanner.nextLine();

        if(input.length() % 2 == 0) {
            System.out.println("Unable to print for text with even no of length");
        } else {
            print(input);
        }

    }
}
