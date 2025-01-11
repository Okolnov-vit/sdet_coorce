package Classes;

public class Container<T> {
    private T element;

    public Container(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void displayType() {
        System.out.println("Тип элемента: " + element.getClass().getName());
    }
}