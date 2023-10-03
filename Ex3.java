import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString;
        while (true) {
            System.out.println("inserisci la tua stringa (per chiudere usa :q)");
            inputString = input.nextLine();
            if (inputString.equals(":q")) {
                System.out.println("stai uscendo dal programma");
                break;
            }
            for (int i = 0; i < inputString.length(); i++) {
                char letters = inputString.charAt(i);
                System.out.println(letters);
                if ( i < inputString.length() -1) {
                    System.out.print(", ");
            }
            }
        }
        input.close();
    }
}
