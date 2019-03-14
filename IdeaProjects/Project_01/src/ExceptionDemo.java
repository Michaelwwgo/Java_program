/**
 * Created by GaoLei on 2019/3/14.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Sum s= new Sum();
        int a;
        try {
            a=s.sum_up(0,2);
            System.out.print(a);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }

}
class Sum{

    int sum_up(int a, int b) throws CustomException{
        if(a==0||b==0)
            throw new CustomException("加数中有零");
        else
            return a+b;
    }
}