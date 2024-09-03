import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("R");
        System.out.println("Languages are" + languages);
        System.out.println("Iterator are");
        Iterator<String> itr = languages.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}