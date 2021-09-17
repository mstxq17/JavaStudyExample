import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class C3P0 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        String path = System.getProperty("user.dir");
        System.out.println(path);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path+"/src/main/java/poc3.ser"));
        // trigger deserialization point
        in.readObject();
    }
}
