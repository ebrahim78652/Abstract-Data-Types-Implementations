package Option;

public class None implements ADTOption {
    //no attributes for this class
    // make empty constructor

    public None(){

    }

    @Override
    public ADTOption the() {
        assert !(this instanceof None): "Precondition not satisfied";
        throw new IllegalStateException();
    }


}
