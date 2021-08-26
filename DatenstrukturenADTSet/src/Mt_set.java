public class Mt_set<T> implements Set<T> {

    //has no attributes

    //has an empty constructor
    public Mt_set(){

    }

    @Override
    public boolean is_in(T t) {
        return false;
    }

    @Override
    public Set delete(T t) {
        return new Mt_set();
    }

    @Override
    public String toString() {
        return "mt_set";
    }
}
