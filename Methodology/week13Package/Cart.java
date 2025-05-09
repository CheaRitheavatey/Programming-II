package Methodology.week13Package;

// passing a type in a class <T> = introduce the type variable and can be use at any part inside the class
public class Cart <T> {
    // the type variable can be non primitive type

    // create a data field that have T type
    private T t;
    public T gett() {
        return t;
    }
    public void sett(T t) {
        this.t = t;
    }
}
