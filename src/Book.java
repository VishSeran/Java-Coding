/* public class Book {
    
    private String title;
    private String author;
    private float price;

    
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public float getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return "Title - " + this.title + "\nAuthor - "
            + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
}
 */

//default and parameterized constructors
/* public class Book {

    private String title;
    private String author;
    private float price;

    public Book(){//default constructor
        this.title=null;
        this.author = null;
    }


    public Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Display(){
        System.out.println("title: " +this.title + "\n author: " + this.author + "\n price: " + this.price);
    }

    public static void main(String []args){

        Book book1 = new Book("Home", "Seran", 250.43f);
        book1.Display();

        Book book2 = new Book();
        book2.Display();
    }
} */

//clonable object implements


