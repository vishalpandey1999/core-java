package MySelf;

import java.util.Scanner;

public class areaOfReactangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length ");
        Float length = sc.nextFloat();
        System.out.println("wedgth");
        Float wedgth = sc.nextFloat();
        Float area = (length*wedgth);
        System.out.println("area"+area);

    }
}
