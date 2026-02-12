package Common;

import java.util.Scanner;

//module 3 final project    
public class GroceryShop {

    private static String searchItem(String item, String[] arrayItem) {

        String matched = null;
        int index = 0;
        for (int i = 0; i < arrayItem.length; i++) {
            if (item.equalsIgnoreCase(arrayItem[i])) {
                matched = arrayItem[i];
                index = i;
            }
        }

        return matched;

    }

    private static int searchItemIndex(String item, String[] arrayItem) {

        String matched = null;
        int index = 0;
        for (int i = 0; i < arrayItem.length; i++) {
            if (item.equalsIgnoreCase(arrayItem[i])) {
                matched = arrayItem[i];
                index = i;
            }
        }

        return index;

    }

    private static float averageTotal(float total, int count) {
        float averagae = total / count;
        return (averagae);
    }

    private static void filterByPrice(float price, String[] itemsList, float[] priceList) {
        for (int i = 0; i < priceList.length; i++) {
            if (price > priceList[i]) {
                System.out.println(itemsList[i] + " : " + priceList[i]);
            }
        }
    }

    private static float billAfterDiscount(float discount, float totalBill){

        float discountAmount = (totalBill*discount/100);
        float finalBill = totalBill-discountAmount;
        
        return (finalBill);
    }

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
        int count = 0;

        while (toggle) {

            while (isPurchaseNotComplete) {

                System.out.println("Continue purchasing?: or want to exit then type complete");
                String purchaseInput = scanner.nextLine();

                if (purchaseInput.equalsIgnoreCase("Complete")) {

                    isPurchaseNotComplete = false;
                    toggle = false;

                } else {

                    System.out.println("Enter item name you wish to buy: ");
                    String userInput = scanner.nextLine();

                    if (userInput.equalsIgnoreCase("Exit")) {
                        toggle = false;
                    } else {

                        try {
                            int index = searchItemIndex(userInput, gloceryItems);
                            String item = searchItem(userInput, gloceryItems);
                            float price = unitPrices[index];

                            System.out.println(item + " unit price: " + price);
                            System.out.println("How many quatities do you wish to buy?\n");
                            int quantity = Integer.parseInt(scanner.nextLine());
                            count = count + quantity;
                            float itemTotalPrice = quantity * price;
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
            filterByPrice(120, gloceryItems, unitPrices);
            System.out.println("Your Total Bill: " + TotalBill);
            System.out.println("Your Total items count: " + count);
            System.out.println("Your average bill per item: " + averageTotal(TotalBill, count));

        }

    }
}
