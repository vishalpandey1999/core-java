package String;

public class IndexOf {
    public static void main(String[] args) {
//        index of corrector
        String s1 = new String("Computer");
        int s2 = s1.indexOf("m");
        System.out.println("index of : "+s2);
        s2 = s1.indexOf("m",4);
        System.out.println("index of: "+s2);
        s2 = s1.lastIndexOf("u");
        System.out.println("last index: "+s2);
        s2 = s1.lastIndexOf("m",1);
        System.out.println("check last index from 1: "+ s2);

//        check given string's index
        String str1 = new String("Computer");
        int str2 = str1.indexOf("put");
        System.out.println("index of string: "+str2);
        str2 = str1.indexOf("ute", 1);
        System.out.println("index of string from given index: "+ str2);
        str2 = str1.lastIndexOf("ute");
        System.out.println("last index: "+str2);
        str2 = str1.lastIndexOf("mpu",1);
        System.out.println("check last index from 1: "+ str2);

//        comparing string
        String str4 = new String("Computer");
        String str5 = new String("computer");
//      equality of two string
        if(str4.equals(str5)){
            System.out.println("String are equals");
        } else{
            System.out.println("String are not equals");
        }
//        in this method , focus only the string not case
        if(str4.equalsIgnoreCase(str5)){
            System.out.println("String are same but case are different");
        } else{
            System.out.println("String are not same");
        }

//        compare to
        int i = str4.compareTo(str5);
        if(i == 0)
            System.out.println("String are same");
        else if(i > 0)
            System.out.println("opposite to dictionary order");
        else
            System.out.println("Dictionary Order");

//        substring
        String str6 = new String("Vishal");
        String str7 = str6.substring(2);
        System.out.println("Begin Index: "+ str7);
        str7 = str6.substring(2,6);
        System.out.println("Begin and end index: "+str7);

    }
}
