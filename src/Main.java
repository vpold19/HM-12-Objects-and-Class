
public class Main {
    public static  Book createBook(String bookName, int publishingYear){
        Book stalker = new Book();
        stalker.bookName=bookName;
        stalker.publishingYear=publishingYear;
        return stalker;
    }
    public static Author createAuthor(String name, String surname){
        Author vadim = new Author();
        vadim.authorName=name;
        vadim.authorSurname=surname;
        return vadim;
    }

    public static void main(String[] args) {
        Book stalker = createBook("STALKER", 2007);
        System.out.println("Название - " + stalker.bookName);
        System.out.println("Год издания - " + stalker.publishingYear);

        Author vadim = createAuthor("Vadim", "Poldolin");
        System.out.println("Имя автора - " + vadim.authorName);
        System.out.println("Фамилия автора - " + vadim.authorSurname);
    }
}


