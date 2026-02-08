

public class BookAccess {

    
    public static void BookComp(Book book1, Book book2){
        
       float book1Price = book1.getPrice();
       float book2Price = book2.getPrice();

        String priceCmp;

        if (book1Price < book2Price) {
            priceCmp = book1.getTitle()+" costs less than " + book2.getTitle();
        } else if (book1Price == book2Price) {
            priceCmp = book1.getTitle()+" costs as much as " + book2.getTitle();
        } else {
            priceCmp = book1.getTitle()+" costs more than " + book2.getTitle();
        }

        System.out.println(priceCmp);
    }

    public static void main (String [] args){

        Book book1 = new Book();
        book1.setTitle("Atomic Habits");
        book1.setAuthor("seran");
        book1.setPrice(250);
        
        Book book2 = new Book();
        book2.setTitle("Happy Time");
        book2.setAuthor("Vishwa");
        book2.setPrice(500);

        BookComp(book1, book2);

    }
}
