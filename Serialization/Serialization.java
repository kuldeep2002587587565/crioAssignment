import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        try {
            // Create a User object
            User user = new User("Robert J Oppenheimer", 25, "oppie@example.com");

            FileOutputStream fos =new FileOutputStream("obj.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(user);
            oos.close();
            fos.close();
            System.out.println("Object state is transfered to file obj .");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
