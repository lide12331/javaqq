import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Text09OutputStream {
    public static void main(String[] args) {
        OutputStream ot=null;
        try {
            ot=new FileOutputStream("text.txt",true);
            byte[] bytes={109,102,113};
            ot.write(bytes);
            ot.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (ot!=null){
                try {
                    ot.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
