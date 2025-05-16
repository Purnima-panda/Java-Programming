import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try {
            File file = new File("read.txt");
           if(file.createNewFile()){
                System.out.println("File Creation Successful");
            }else{
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
