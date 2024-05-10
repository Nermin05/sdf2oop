public class Generics<T> {
    private int index;
    private T[] books;

    public Generics(int index) {
        this.index = index;
        this.books = (T[]) new Object[index];
    }

    public void add(T book) {
        books[index - 1] = book;
        System.out.println(books[index - 1]);
        index++;
    }

    public T get(int index) {
        return books[index];
    }
}
