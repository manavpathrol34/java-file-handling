

import java.io.FileWriter;



public class FileWrite {
    public static void main(String[] args) {
        String data = "101, Mr.Rahul, Jaipur, India";

        try {
            FileWriter output = new FileWriter("data1.txt");
            output.write(data);
            System.out.println("Data is written successfully");
            output.close();

            
        } catch (Exception e) {
            System.out.println("File Write error...");
        
            
        }
        
            
        
    }
    
}
