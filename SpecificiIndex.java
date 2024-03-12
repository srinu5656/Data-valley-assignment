import java.util.Scanner;

public class SpecificiIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the index to replace: ");
        int indexToReplace = scanner.nextInt();

        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0);

        if (indexToReplace >= 0 && indexToReplace < originalString.length()) {
            char[] charArray = originalString.toCharArray();
            charArray[indexToReplace] = newChar;
            String modifiedString = new String(charArray);
            System.out.println("Original String: " + originalString);
            System.out.println("Modified String: " + modifiedString);
        } else {
            System.out.println("Index out of bounds.");
        }

        scanner.close();
    }
}
