import java.util.Scanner;

public class BookMenu {

    public static void main (String [] args){
        Book [] books = new Book[10];
        int bkIndex = 0;
        Scanner scanner  = new Scanner(System.in);

        while(true){
            System.out.println("press 1 to view all books \n press 2 to add a new book");
            int userSelection = Integer.parseInt(scanner.nextLine());

            if(userSelection == 1) {
                for(int i=0; i<books.length;i++){
                    if(books[i] != null){
                        System.out.println(books[i]);
                        System.out.println("\n");
                    }else {
                        System.out.println("no any book yet added");
                        break;
                    }
                }
            }else if (userSelection == 2){
                if(bkIndex == 10){
                    System.out.println("maximum amount of books are filled!");
                    continue;
                }else{
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.println("Enter price: ");
                    float price = Float.parseFloat(scanner.nextLine());

                    Book book = new Book();
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setPrice(price);

                    books[bkIndex++] = book;

                }
            }else{
                break;
            }
        }
        

    }
    
}
