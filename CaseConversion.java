package String;

public class CaseConversion {
    public static void main(String[] args) {
        String s1 = new String("Computer");

        // Print the given String
        System.out.println(s1);

        // Convert to upper case and update s1
        s1 = s1.toUpperCase();
        System.out.println(s1);

        // Convert to lower case and update s1
        s1 = s1.toLowerCase();
        System.out.println(s1);
    }
}
