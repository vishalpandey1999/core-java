package Collection_FrameWork;
@FunctionalInterface
public interface Addon {

    int add(int x,int y);

    static void dispalay(){
        System.out.println("Display method");
    }
      default void showdata(){
        System.out.println("show data default");
    }
}
