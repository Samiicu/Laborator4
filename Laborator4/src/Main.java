import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Item[] items=new Item[3];
		items[0]=new Clothing("Haina","10",100,"Red","Wool","M");
		items[1]=new Food("kebab","11",10,"01-01-2020",1500);
		items[2]=new Appliance("Microwave","12",250,24,1000,"A");
		ArrayList <Item> iteme=new ArrayList<Item>();
		iteme.add(items[0]);
		iteme.add(items[1]);
		iteme.add(items[2]);
		ArrayList <Integer> quantities=new ArrayList<Integer>();
		quantities.add(new Integer(2));
		quantities.add(new Integer(3));
		quantities.add(new Integer(1));
		
		Stock stock=new Stock(iteme,quantities);
		
		ShoppingCart cart=new ShoppingCart(stock);
		
		cart.add(items[0]);
		cart.add(items[1]);
		cart.add(items[2]);
		cart.add(items[0]);
		cart.removeItem("10");
		cart.add(items[0]);
	System.out.println();
		System.out.println(cart.list());
		
		

	}

}
