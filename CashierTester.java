public class CashierTester
{
    public static void main(String[] args)
    {
        Cashier c1 = new Cashier(500);
        
        Item Apple = new Item("apple", 1);
        Item Chips = new Item("potato chips", 2.50);
        Item Milk = new Item("milk", 3);
        Cashier.products.add(Apple);
        Cashier.products.add(Chips);
        Cashier.products.add(Milk);
        
        Cashier.purchase("milk");
        
        Cashier c2 = new Cashier(10000);
        
        Item TV = new Item("tv", 499.99);
        Item Speaker = new Item("speaker", 99.99);
        Item Computer = new Item("computer", 299.99);
        Cashier.products.add(TV);
        Cashier.products.add(Speaker);
        Cashier.products.add(Computer);
        Cashier.purchase("computer");
    }
}