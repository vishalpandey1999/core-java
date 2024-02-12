package Collection_FrameWork;

public class LambdaExpressionInThread {
    public static void main(String[] args) {
            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Hello world One");
                }
            };

                Runnable r2 = () -> System.out.println("Hello world Two");
                r1.run();
                r2.run();
            }
        }
