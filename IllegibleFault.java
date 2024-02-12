package Exception_Handling;

import java.util.Scanner;

class Fault{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int divide(int a, int b) throws ArithmeticException, IllegalArgumentException {
        if(b == 0){
            throw new ArithmeticException("B mean divider can not be zero");
        }else if(b < 0){
            throw new IllegalArgumentException("This is nonlegal Argument");
        }
        return a/b;
    }

}

public class IllegibleFault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fault f1 = new Fault();
            try {
                System.out.print("Enter the first value: ");
                int a = sc.nextInt();
                System.out.print("Enter the first value: ");
                int b = sc.nextInt();
                int result = f1.divide(a,b);
                System.out.println("Answer is " + result);

            } catch (ArithmeticException e) {
                System.out.println("Exception is " + e.getMessage());
            } catch (IllegalArgumentException i) {
                System.out.println("This is Illegal  " + i.getMessage());
            }catch(Exception e1){
                System.out.println("This Exception handle by compiler");
            }
        }
    }

