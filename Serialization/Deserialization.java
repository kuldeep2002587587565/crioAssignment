import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        
        try {

            FileInputStream fis=new FileInputStream("obj.txt");

            ObjectInputStream ois =new ObjectInputStream(fis);

            User user=(User)ois.readObject();
            System.out.println(user.getAge());
            ois.close(); // Close the ObjectInputStream
            fis.close(); // Close the FileInputStream
            
        } 
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
