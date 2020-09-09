package Chapter9.doCode;

public interface Sort {

    void ascending(int[] arr);
    void descending(int[] arr);

    default void description() {
        
    }
}
