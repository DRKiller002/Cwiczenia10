import java.io.*;
import java.util.Scanner;
import java.net.URL;

public class Zadanie5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj trzy pierwsze cyfry swojego numeru konta");
        String pierwszetrzynrkonta = sc.nextLine();

        URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String linijka = "";
        while ((linijka = reader.readLine()) != null) {
            if (linijka.startsWith(pierwszetrzynrkonta)) {
                String bankCode = linijka;
                String bankName = linijka;
                System.out.println("Skrócony numer banku: " + bankCode + "nazwa Banku: " + bankName + "");
                break;
            }
        }
        reader.close();
    }
}
