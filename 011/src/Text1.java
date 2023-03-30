public class Text1 {
    public static void main(String[] args) {

        As a=new As();
        try {
            a.as();
        } catch (MyException e) {
//            MyException: as出错
//            at As.as(Text1.java:23)
//            at Text1.main(Text1.java:6)
//            e.printStackTrace();

//as出错
            String mess=e.getMessage();
            System.out.println(mess);

        }
    }
}
class MyException extends Exception{

    public MyException(){}
    public MyException(String message){
        super(message);
    }
}
class As{
    public void as() throws MyException {
        int a=1+2;
        throw new MyException("as出错");
    }
}