package Option;

public class Some<T> implements ADTOption<T> {

    private T t;

    public Some(T t){
        this.t=t;
    }

    @Override
    public T the() {
        return t;
    }

}
