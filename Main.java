import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Andrei");
        map.put("Key2", "Ion");
        map.put("Key3", "Vlad");
        Service service = new Service();
        service.afisare(map, (k, v) -> System.out.println("Key: "+ k+ " Value: "+ v));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Key1", "Andrei");
        map2.put("Key2", "Ion");
        map2.put("Key3", "Vlad");
        Service<String, String> service2 = new Service<>();
        service2.filter(map2, (k,v) -> k.contains("e") || v.contains("e"));

        BiFunctionService<String, String, String> service3 = new BiFunctionService<>();
        List<String> list = service3.uneste(map2, (k, v) -> k.concat(v));
        System.out.println(list);
    }
}