package Map;
import Option.*;

public interface ADTMap<K,V> {

    ADTMap update(K k, V v);
    boolean is_in_dom(K k);
    V lookup1(K k);
    ADTOption lookup_opt(K k);
    ADTMap delete(K k);
    ADTMap union(ADTMap map);
    int size();
}
