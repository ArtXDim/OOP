import Products.BottleOfWater;
import Products.HotDrink;
import Products.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachin.addProduct(new HotDrink("Latte small", 145.20, 100, "hot"));
        itemMachin.addProduct(new HotDrink("Americano small", 300.2, 100, "warm"));
        itemMachin.addProduct(new HotDrink("ColdCoffee big", 115.80, 300, "cold"));
        itemMachin.addProduct(new HotDrink("Tea Black big", 115.80, 300, "cold"));
       
        for(Product prod: itemMachin.getProdAll())
        {
            System.out.println(prod.toString());
        }

        System.out.println("\n");
        //воспроизведение заложенной в программу логики 
        System.out.println(itemMachin.getProdByName("Tea Black big"));
       
    }
}
