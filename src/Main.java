import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String cognome = scan.nextLine();
        System.out.println("Benvenuto " + nome + " " + cognome);
        scan.close();
    }
}
