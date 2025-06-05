import java.io.FileReader;

public class FileDataRead{
    public static void main(String[] args) {
        char[] data = new char[100];
       

        try {
             FileReader input = new FileReader("data1.txt");
             input.read(data);
             System.out.println("Data received successfully from a file...");
             System.out.println(data);
             input.close();
            
        } catch (Exception e) {
            System.out.println("File read error...");
        }


    }
}