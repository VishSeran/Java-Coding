package PhoneBook;

public class PhoneBookHashMap {
    
    public static boolean isNameValid(String name){
        if(name.matches("\"^[a-zA-Z' -]+$\"")== false){
            System.out.println("Name is invalid!");
            return false;
        }
        return true;
    }

    public static boolean isNumberValid(String number) {
        if(number.matches("\\+?\\d{1,4}?[-.\\s]?\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}") == false){

            System.out.println("Phone number is invalid");
            return false;
        }
        return true;
    }
}
