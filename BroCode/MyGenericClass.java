package BroCode;

public class MyGenericClass<T> {
    T element;

    MyGenericClass(T element) {
        this.element = element;
    }

    public T getValue() {
        return element;
    }
}
