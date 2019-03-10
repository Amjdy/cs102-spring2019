
package topic04.generics_exercises;


public interface Stackable<T> {
    void push(T e);
    T pop();
    void print();
    boolean isEmpty();
}
