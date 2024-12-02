import java.util.Random;
import static java.lang.System.out;

public interface PointToBox {
    //задание 2 (метод)
    static <T> void addPointToBox(Box<T> box) {
        Random rnd = new Random();
        if (box.isEmpty()) {
            Point3D point = new Point3D(rnd.nextDouble(21)-10, rnd.nextDouble(21)-10, rnd.nextDouble(21)-10);
            out.println("Создана точка: "+ point.toString());
            box.put((T) point);
        } else {
            throw new IllegalStateException("Коробка не пуста! Невозможно добавить точку.");
        }
    }
}
