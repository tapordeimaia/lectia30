import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class Service <T, U> {
    public void afisare(Map<T, U> map, BiConsumer<T, U> biConsumer){
         for (Map.Entry<T, U> entry: map.entrySet()){
             biConsumer.accept(entry.getKey(), entry.getValue());
         }
    }

    public Map<T, U> filter(Map<T, U> map, BiPredicate<T, U> biPredicate){
        Map<T, U> filteredMap = new HashMap<>();
        for(Map.Entry<T, U> entry: map.entrySet()){
            if (biPredicate.test(entry.getKey(), entry.getValue())){
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }
}
