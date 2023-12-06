import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionService <T, U, R>{
    List<R> list = new ArrayList<>();
    public List<R> uneste(Map<T, U> map, BiFunction<T, U, R> biFunction){
        for (Map.Entry<T, U> entry: map.entrySet()){
            list.add(biFunction.apply(entry.getKey(), entry.getValue()));
        }
        return list;
    }

    @Override
    public String toString() {
        return "BiFunctionService{" +
                "list=" + list +
                '}';
    }
}
