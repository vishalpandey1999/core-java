package Collection_FrameWork;

interface AdditionalFunction{
    int add(int a, int b);
}

public class lambdaExpression {
    public static void main(String[] args) {
          AdditionalFunction add = (a,b) -> a+b;
          int result = add.add(5,6);
        System.out.println(result);
    }
}
