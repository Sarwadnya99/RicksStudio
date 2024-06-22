import java.util.Scanner;

class RicksApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to Ricks Guitar Studio!");
        Inventory inventory = new Inventory();
        inventory.addGuitar(getGuitar("1", 134));
        inventory.addGuitar(getGuitar("2", 145));
        inventory.addGuitar(getGuitar("3", 198));
        System.out.println("Please enter the Guitar you want us to fetch for you : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Guitar guitar = inventory.getGuitar(str);
        System.out.println("The Price of the guitar you are looking for is " + guitar.getPrice());
    }
    private static Guitar getGuitar(String srnoString, double price){
        return new Guitar(srnoString, "Top", "back", "builder", "model", "type", price);
    }
}