
public class Main {
    public static void main(String[] args) {
        Book stalker = new Book();
        stalker.bookName = "STALKER";
        System.out.println("Название - " + stalker.bookName);

        stalker.publishingYear = 2007;
        System.out.println("Год издания - " + stalker.publishingYear);

        Author vadim = new Author();
        vadim.authorName = "Vadim";
        System.out.println("Имя автора - " + vadim.authorName);

        vadim.authorSurname = "Poldolin";
        System.out.println("Фамилия автора - " + vadim.authorSurname);
    }
}


