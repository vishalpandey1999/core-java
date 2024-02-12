package Collection_FrameWork;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Facebook");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        System.out.println("Here are the top "+topCompanies.size()+ " companies in the world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondTopCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);
        System.out.println("Best Company: "+bestCompany);
        System.out.println("Second Best Company: "+secondTopCompany);
        System.out.println("Last Company In the list: "+lastCompany);

        topCompanies.set(4,"Paytm");
        System.out.println("Modified top company list:-"+topCompanies);
    }
}
