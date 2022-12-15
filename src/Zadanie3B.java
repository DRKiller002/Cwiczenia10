import java.io.*;

public class Zadanie3B {
        public static void main(String[] args) {

            try (FileInputStream input = new FileInputStream("F:\\plik.txt");
                 FileOutputStream output = new FileOutputStream("F:\\plik2.txt")) {

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


