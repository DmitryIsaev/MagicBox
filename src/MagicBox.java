import java.util.Random;

public class MagicBox<T> {
    T[] objects;

    public MagicBox(int maxItems) {
        objects = (T[]) new Object[maxItems];
    }

    public boolean add(T item) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = item;
                System.out.println("Добавлен " + objects[i]);
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException(String.format("Есть ещё место в магической коробке: "
                        + (objects.length - i)));
            }
        }
        Random random = new Random();
        int randomString = random.nextInt(objects.length);
        return objects[randomString];
    }
}
