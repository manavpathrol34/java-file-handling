import java.io.File;

public class CreateFileDemo{
    public static void main(String[] args){
        // File myFile = new File("data1.txt");
     File myFile = new File("D:/Projects'26/PODCASTER/data1.txt");//If you want to create file in an specific folder or at another

        try {
            if (myFile.createNewFile()){
            System.out.println("File created successfully");
            
        } else{
            System.out.println("File creation error");
        }
        } catch (Exception e) {
            System.out.println("File error...");
        }
    }
}