
public class Main {
    public static void main(String[] args) {
        Author vadim = new Author("Vadim", "Poldolin");
        Book stalker = new Book("Stalker", 2007, vadim);
        System.out.println("Название книги - " + stalker.getBookName());
        System.out.println("Год издания - " + stalker.getPublishingYear());
        stalker.setPublishingYear(2009);
        System.out.println("Повторное переиздание - " + stalker.getPublishingYear());
        System.out.println("Имя писателя - " + stalker.getAuthor().getAuthorName());
        System.out.println();
        Author valery = new Author("Valery", "Zavolsky");
        Book harryPotter = new Book("Harry Potter", 2000,valery);
        System.out.println("Название книги - " + harryPotter.getBookName());
        System.out.println("Год издания - " + harryPotter.getPublishingYear());
        System.out.println("Имя писателя - " + harryPotter.getAuthor().getAuthorName());

        System.out.println();


        System.out.println("Имя автора - " + vadim.getAuthorName());
        System.out.println("Фамилия автора - " + vadim.getAuthorSurname());
        System.out.println();
        System.out.println("Имя автора - " + valery.getAuthorName());
        System.out.println("Фамилия автора - " + valery.getAuthorSurname());

    }
}


