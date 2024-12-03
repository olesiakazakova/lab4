public class Box<T> {
    //поля
    private T obj;
    //свойства
    public T getObj() {
        return this.obj;
    }
    //конструкторы
    public Box (){
        this.obj = null;
    }

    public Box (T obj){
        this.obj = obj;
    }
    //методы
    // Метод для размещения объекта в коробке
    public void put(T obj) {
        if (this.obj != null) {
            throw new IllegalStateException("Коробка уже заполнена. Сначала извлеките объект.");
        }
        this.obj = obj;
    }
    // Метод для извлечения объекта из коробки
    public T extract() {
        T res = this.obj;
        this.obj = null;
        return res;
    }
    // Метод проверки на заполненность
    public boolean isEmpty() {
        if (this.obj == null) return true;
        return false;
    }
    public String toString() {
        if (this.obj==null) return "Коробка пуста.";
        return "В коробке находится: " + String.valueOf(this.obj);
    }
}
