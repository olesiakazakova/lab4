public class Point3D extends Point {
    //поля
    private double z;

    //свойства
    public double getZ()
    {
        return this.z;
    };

    //конструктор
    public Point3D(double x, double y, double z) {
        super(x, y); // Вызов конструктора родительского класса ru.kazakova.geometry.Point
        this.z = z;
    }

    //метод
    @Override
    public String toString() {
        return "{" + getX() + "; " + getY() + "; " + z + "}";
    }
}