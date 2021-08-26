package Map;

import Option.ADTOption;

public class Mt_map<K, V> implements ADTMap<K, V> {


    @Override
    public ADTMap update(K k, V v) {
        assert !(this instanceof Mt_map): "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public boolean is_in_dom(K k1) {
        return false;
    }

    @Override
    public Object lookup1(Object o) {
        assert !(this instanceof Mt_map): "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public ADTOption lookup_opt(Object o) {
        assert !(this instanceof Mt_map): "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public ADTMap delete(Object o) {
        assert !(this instanceof Mt_map): "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public ADTMap union(ADTMap map) {
        return map;
    }

    @Override
    public int size() {
        return 0;

    }

    @Override
    public String toString() {
        return "emptyMap";
    }
}
