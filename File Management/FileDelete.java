import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File myFile = new File("data2.txt");

        if(myFile.delete()){
            System.out.println("File deleted: "+myFile.getName()+" successfully:");

        }
        else{
            System.out.println("Failed to delete a file...");
        }
    }
    
}
