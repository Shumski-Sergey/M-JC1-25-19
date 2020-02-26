package dSankovsky.Lambda;

@FunctionalInterface
public interface Operation <T, V>{
    T getResult(T value1, T value2, V sign);

}
