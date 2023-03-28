public class Main {
    public static void main(String[] args) {
        int maxItems = 5;

        MagicBox<String> box = new MagicBox<>(maxItems);

        box.add("Первый предмет");
        box.add("Второй предмет");
        box.add("Третий предмет");
        box.add("Четвёртый предмет");
        box.add("Пятый предмет");
        box.add("Шестой предмет");

        String randomItem = box.pick();
        System.out.println("\nИз магической коробки достали: " + randomItem);
    }
}