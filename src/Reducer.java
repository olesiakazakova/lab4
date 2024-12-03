import java.util.List;

public class Reducer {
    //задание 3.3 (метод)
    static <T> T reduceList(List<T> list, Function<List<T>, T> reducer) {
        if (list == null || list.isEmpty()) return null;
        return reducer.apply(list);
    }
}
