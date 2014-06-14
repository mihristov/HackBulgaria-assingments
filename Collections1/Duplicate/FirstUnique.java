import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstUnique {
    public Integer getFirstDuplicate(Collection<Integer> ints){
        LinkedHashMap<Integer, Integer> counter = new LinkedHashMap<>();
        for (Integer number : ints){
            if (counter.get(number) != null){
                counter.put(number, counter.get(number) + 1);
            } else {
                counter.put(number, 1);
            }
        }
        Iterator<?> it = counter.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it.next();
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return null;
    }
}
