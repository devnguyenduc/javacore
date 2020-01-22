package company.collections.compose;

public interface ComposeNumber<T> {
    // Setter and Getter
    void set(T var);
    T get();

    // 8 basic properties in a vector of math;
    void plus(T var);
    void minus(T var);
    void multi(T var);
    void multi(int factor);
    void device(T var);
    void reversed();
    boolean isNegative();
}
