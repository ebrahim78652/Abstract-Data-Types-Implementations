package Map;

import Option.ADTOption;

public class Insert<K, V> implements ADTMap<K, V> {

    private K k;
    private V v;
    private ADTMap predecessorMap;

    public ADTMap Insert(K k, V v, ADTMap map){
        //if the key we want to add is already in the predecessor map,
        //then we will simply update it with the new value;
        if(map.is_in_dom(k)){
            return map.update(k,v);
        }
        else{
            this.k=k;
            this.v=v;
            this.predecessorMap = map;
            return this;
        }

    }


    @Override
    public ADTMap update(K k, V v) {
        assert this instanceof Insert: "Precondition not satisfied";

        if(k==this.k){
            this.v=v;
            return this;
        }
        // checking if the predecessor maps have our k
        if(predecessorMap.is_in_dom(k)){
            return Insert(this.k,this.v, predecessorMap.update(k, v));
        }
        else{
            return this;
        }
    }

    @Override
    public boolean is_in_dom(K k) {
        assert this instanceof Insert: "Precondition not satisfied";
        if(this.k==k){
            return true;
        }
        else return predecessorMap.is_in_dom(k);
    }

    @Override
   public V lookup1(K k) {
        if(this.k==k){
            return this.v;
        }
        else{
            if(predecessorMap.is_in_dom(k)){
                return (V) predecessorMap.lookup1(k);
            }
            else{
                return null;
            }
        }

    }

    @Override
    public ADTOption lookup_opt(K k) {
        return null;
    }

    @Override
    public ADTMap delete(K k) {
        if(this.k==k){
            return predecessorMap;
        }
        else{
            if(!predecessorMap.is_in_dom(k)){
                return this;
            }
            //below else will get run, when the k, exists in the predecssor map
            else{
                return Insert(this.k, this.v, predecessorMap.delete(k));
            }

        }
    }

    @Override
    public ADTMap union(ADTMap map) {
        if(map.is_in_dom(this.k)){
            return this.predecessorMap.union(map);
        }
        else{
            return Insert(this.k, this.v, this.predecessorMap.union(map));
        }
    }

    @Override
    public int size() {
        return (1+predecessorMap.size());
    }

    @Override
    public String toString() {
        return "insert("+ k+ ", " + v +", "+predecessorMap+")";
    }
}
