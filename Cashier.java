import java.util.*;
public class Cashier
{
    private static double cash;
    static ArrayList<Item> products = new ArrayList<Item>();
    static ArrayList<Item> user = new ArrayList<Item>();
    public Cashier(double c)
    {
        cash = c;
    }
    public static void purchase(String product)
    {
        //buy a product
        for(int i = 0; i < products.size(); i++)
        {
            if(products.get(i).getName().equals(product)){
                if(products.get(i).getPrice() > cash){
                    System.out.println("You do not have enough!");
                }
                else{
                    cash = products.get(i).getPrice() - cash;
                    user.add(products.get(i));
                    System.out.println("Purchased");
                }
            }
            else{
                System.out.println("Product not found");
            }
        }
    }
    public static void undo(String product)
    {
        //return a product
        for(int j = 0; j < user.size(); j++)
        {
             if(user.get(j).getName().equals(product)){
                 cash += user.get(j).getPrice();
                 user.remove(j);
                 System.out.println("Item has been returned");
             }
             else
             {
                System.out.println("You do not own this item");
             }
        }
    }
}