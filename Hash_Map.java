import java.util.HashMap;

public class Hash_Map {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Anil", "R21EH100");
        map.put("Amul", "R21EH104");
        map.put("Aditya", "R21EH109");
        map.put("Amih", "R21EH103");
        map.put("Arun", "R21EH100");
        System.out.println(map);
        map.put("Amul", "R21EH190");
        System.out.println(map);
    }

}