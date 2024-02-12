package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Saktiman");
        tvShows.add("Prison break");

//        System.out.println("==Iterate using java 8 forEach and lambda== ");
//        tvShows.forEach((tvShow) -> {
//            System.out.println(tvShows);
//        });

        System.out.println("\n=== iterate using iterator==");
        Iterator<String>tvShowIterate = tvShows.iterator();
        while (tvShowIterate.hasNext()){
            String tvShow = tvShowIterate.next();
            System.out.println(tvShow);
        }
        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterate = tvShows.iterator();
        tvShowIterate.forEachRemaining(tvShow ->{
            System.out.println(tvShow);
        });

        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

    }
}
