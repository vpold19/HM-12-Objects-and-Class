
public class Main {
    public static void main(String[] args) {
        Book stalker = new Book("Stalker", 2007);
        System.out.println("Название - " + stalker.getBookName());
        System.out.println("Год издания - " + stalker.getPublishingYear());

        Author vadim = new Author("Vadim", "Poldolin");
        System.out.println("Имя автора - " + vadim.getAuthorName());
        System.out.println("Фамилия автора - " + vadim.getAuthorSurname());
    }
}


