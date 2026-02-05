
import java.util.Scanner;

//module 3 final project    
public class GroceryShop {

    public static void main(String[] args) {

        String gloceryItems[] = {
            "Rice",
            "Milk",
            "Eggs",
            "Bread",
            "Sugar",
            "Salt",
            "Butter",
            "Cheese",
            "Tomatoes",
            "Onions",
            "Potatoes",
            "Carrots",
            "Chicken",
            "Fish",
            "Apples"
        };

        float[] unitPrices = {
            80.5f,
            120.0f,
            10.0f,
            50.0f,
            90.0f,
            30.0f,
            200.0f,
            250.0f,
            60.0f,
            40.0f,
            35.0f,
            45.0f,
            450.0f,
            500.0f,
            150.0f
        };

        Scanner scanner = new Scanner(System.in);
        Boolean toggle = true;
        Boolean isPurchaseNotComplete = true;
        float TotalBill = 0;

        while (toggle) {

            while (isPurchaseNotComplete) {

                System.out.println("Continue purchasing?: ");
                String purchaseInput = scanner.nextLine();

                if (purchaseInput.equalsIgnoreCase("Complete")) {
                    isPurchaseNotComplete = false;
                    toggle = false;
                } else {
                    try {
                        System.out.println("Enter input: ");
                        String userInput = scanner.nextLine();

                        if (userInput.equalsIgnoreCase("Exit")) {
                            toggle = false;
                        } else {
                            for (int i = 0; i < gloceryItems.length; i++) {
                                if (userInput.equalsIgnoreCase(gloceryItems[i])) {
                                    try {
                                        int index = i;
                                        String item = gloceryItems[i];
                                        float price = unitPrices[i];

                                        System.out.println(item + " unit price: " + price);
                                        System.out.println("How many quatities do you wish to buy?\n");
                                        int quatity = Integer.parseInt(scanner.nextLine());

                                        float itemTotalPrice = quatity * price;
                                        TotalBill = TotalBill + itemTotalPrice;
                                        System.out.println("Total price for " + item + ": " + itemTotalPrice);
                                        System.out.println("Now, the total payment: " + TotalBill);

                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        System.err.println("Index Invalid");
                                    } catch (NumberFormatException e) {
                                        System.err.println("Invalid number input!");
                                    } finally {
                                        System.out.println("Process Completed!");
                                    }
                                }
                            }
                        }

                    } catch (Exception e) {
                    }
                }
            }
        }

    }
}
