import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int n = input.nextInt();

        for(int i = n; i >= 0; i--) {
            System.out.println(i);
        }
        input.close();
    }
}
