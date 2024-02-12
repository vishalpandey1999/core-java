package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguage = new ArrayList<>();
        programmingLanguage.add("C");
        programmingLanguage.add("C++");
        programmingLanguage.add("Java");
        programmingLanguage.add("Kotlin");
        programmingLanguage.add("Python");
        programmingLanguage.add("Perl");
        programmingLanguage.add("Ruby");

        System.out.println("Initial List: "+programmingLanguage);

//        remove the element at the index
        programmingLanguage.remove(5);
        System.out.println("After removing(5): "+programmingLanguage);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)

        boolean isRemoved = programmingLanguage.remove("Kotlin");
        System.out.println("After removing(\"Kotlin\"): "+programmingLanguage);

      List<String> scriptingLanguage = new ArrayList<>();
      scriptingLanguage.add("Python");
      scriptingLanguage.add("Ruby");
      scriptingLanguage.add("Perl");

      programmingLanguage.removeAll(scriptingLanguage);
        System.out.println("After removing Scripting language: "+programmingLanguage);

        programmingLanguage.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });
        System.out.println("After Removing all elements that start with \"C\": " + programmingLanguage);

        // Remove all elements from the ArrayList
        programmingLanguage.clear();
        System.out.println("After clear(): " + programmingLanguage);
    }
}
