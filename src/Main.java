
public class Main {
    public static void main(String[] args) {
        Book stalker = new Book("Stalker", 2007);
        System.out.println("Название - " + stalker.bookName);
        System.out.println("Год издания - " + stalker.publishingYear);

        Author vadim = new Author("Vadim", "Poldolin");
        System.out.println("Имя автора - " + vadim.authorName);
        System.out.println("Фамилия автора - " + vadim.authorSurname);
    }
}


