import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookList bl = new BookList();
        Logic log = new Logic();
        Viewer view = new Viewer();

        bl.add(new Book(1, "Заводной апельсин", "Энтони Бёрджес", "АСТ", 1962, 229, 100, "Мягкий переплёт"));
        bl.add(new Book(2, "Семя желания", "Энтони Бёрджес", "АСТ", 1962, 422, 150, "Мягкий переплёт"));
        bl.add(new Book(3, "M/F", "Энтони Бёрджес", "АСТ", 1971, 334, 125, "Мягкий переплёт"));
        bl.add(new Book(4, "Мотылёк", "Анри Шарьер", "Азбука", 1969, 516, 250, "Твёрдый переплёт"));

        List<Book> l = log.Author(bl, "Энтони Бёрджес");
        view.print("Книги Энтони Бёрджес: ", l);

        List<Book> l1 = log.Publisher(bl, "АСТ");
        view.print("Издательство 'АСТ': ", l1);

        List<Book> l2 = log.Year(bl, 1960);
        view.print("Книги старше 1960 г.: ", l2);
    }
}
