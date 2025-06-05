import java.io.FileWriter;

public class FilaDataAppend {
    public static void main(String[] args) {
        String data = "This data is appended...";
        try {
            FileWriter output = new FileWriter("data1.txt", true);
            output.write(data);
            System.out.println("Data appended successfully");
            output.close();
        } catch (Exception e) {
            System.out.println("File append error...");
        }

    }
    
}
