import java.io.*;

public class Text010copfile {
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream ot=null;
        try {
            in=new FileInputStream("text.txt");
            ot=new FileOutputStream("Textt.txt",true);
            byte[] bytes=new byte[4];
            int i=0;
            while ((i=in.read(bytes))!=-1){
                ot.write(bytes,0,i);
            }
            ot.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
