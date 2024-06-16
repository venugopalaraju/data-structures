package misc;

public class ExceptionMain {
    public static void main(String[] args) {
        try{
            int a =0;
            int b = 10/0;
            System.out.println(b);
        }catch (Exception e){
            System.out.println(e);
            //throw new CustomException(e.getMessage());
        }
    }
}
class CustomException extends RuntimeException{
    public CustomException(String message) {
        super();
        //System.out.println(message);
    }
}
