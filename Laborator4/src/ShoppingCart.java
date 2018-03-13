import java.util.ArrayList;

public class ShoppingCart {
private ArrayList<Item> items=new ArrayList<Item>();
private Stock stock;

ShoppingCart(Stock stock){
	this.stock=stock;
}
public void add(Item ... items) {
	
	
	for(Item item : items) {
		if(stock.getQuantity(stock.getIndex(item))>0) {
		this.items.add(item);
		stock.setQuant(stock.getIndex(item), new Integer(stock.getQuantity(stock.getIndex(item))-1));
		}
		else {
			System.out.println("Nu mai e disponibil "+item);
		}
	}
}

public float getTotalPrice() {
	float price=0;
	for(Item item : items) {
		price+=item.getPrice();
	}
	return price;
}

public String list() {
	String result=" ";
	for(Item item :items)
    result+=item.toString()+"\n";
	return result;
}

public void removeItem(String id) {
	for(int i=0;i<items.size();i++)
	    if(id.equals(items.get(i).getId())) {
	    	stock.setQuant(stock.getIndex(items.get(i)), new Integer(stock.getQuantity(stock.getIndex(items.get(i)))+1));
	    	items.remove(i);
	    	return;
	    }
}

public void comfirmShopping() {
	System.out.println("Tocmai ai cumparat: "+list());
	items.clear();
}

}
