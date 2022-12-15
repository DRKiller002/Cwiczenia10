import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Zadanie1 {
    public static void main(String[]args) throws IOException {
        FileInputStream fis;
        int bajt;

        try{
            fis=new FileInputStream("F:\\plik.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nie znaleziono pliku o takiej nazwie");
            return;
        }

        try {
            do {
                bajt = fis.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != -1);
        }catch(IOException e){
            System.out.println("Błąd odczytu pliku");
            }
        finally {
            try {
                fis.close();
            }
            catch(IOException e){
                System.out.println("Błąd podczas zamykania pliku");
            }
        }
    }
}
