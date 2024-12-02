import java.util.ArrayList;
import java.util.List;

public interface Test {
    //задание 3.2 (метод)
    static <T> List<T> filterList(List<T> list, Filter<T> filter) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (filter.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
