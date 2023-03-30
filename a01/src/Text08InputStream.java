import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Text08InputStream {
    public static void main(String[] args) {
        InputStream in=null;
        try {
            in=new FileInputStream("text.txt");
            byte[] bytes=new byte[4];
//            int t=in.read(bytes);
//            System.out.println(t);
//            System.out.println(new String(bytes));

            int r=0;
            while ((r=in.read(bytes))!=-1){
                System.out.print(new String(bytes,0,r));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (in!=null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
