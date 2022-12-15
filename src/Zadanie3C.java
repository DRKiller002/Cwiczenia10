import java.io.*;

public class Zadanie3C {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Proszę podać nazwę pliku wejściowego i docelowego");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        try (FileInputStream input = new FileInputStream(inputFileName);
             FileOutputStream output = new FileOutputStream(outputFileName)) {

            int b = input.read();

            while (b != -1) {
                if (b == ' ') {
                    output.write('-');
                }
                else {
                    output.write(b);
                }
                b = input.read();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Brak pliku o podanej nazwie");
        }
        catch (IOException e) {
            System.out.println("Wystąpił błąd podczas przetwarzania plików");
        }
    }
}


