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
public class Book implements Cloneable {

    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void Display() {
        System.out.println("title: " + this.title + "\n author: " + this.author + "\n price: " + this.price);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
                + this.author + "\nPrice - " + String.format("%.2f", this.price);
    }

    public static void main (String []args) throws CloneNotSupportedException {

        Book book1 = new Book("Happy", "Vishwa", 250.54f);
        System.out.println(book1 + "\n");

        Book book2 = new Book("time","Seran", 500f);
        System.out.println(book2 +"\n");

        Book book3 = (Book)(book1.clone());
        System.out.println(book3);

        book1.title = "Bad";
        book1.price = 1000f;
        System.out.println(book1 + "\n");
        System.out.println(book3);


    }
}


