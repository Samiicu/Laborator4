import java.util.ArrayList;

import javafx.util.Pair;

public class Stock {
private ArrayList<Item> items=new ArrayList<Item>();
private ArrayList<Integer> quantities=new ArrayList<Integer>();

Stock(ArrayList<Item> items, ArrayList<Integer> quantities){
	for(Item item : items) {
		this.items.add(item);
	}
	for(Integer quantity: quantities) {
		this.quantities.add(quantity);
	}
}

public int getQuantity(int index) {
	return quantities.get(index).intValue();
}

public void setQuant(int index,Integer quant) {
	quantities.set(index,quant );
}

public int getIndex(Item item) {
	for(int i=0;i<items.size();i++) {
		if(item.getId().equals(items.get(i).getId()))
			return i;
	}
	return 0;
	
}

public ArrayList<Item> getItems() {
	return items;
}

public void setItems(ArrayList<Item> items) {
	this.items = items;
}

public ArrayList<Integer> getQuantities() {
	return quantities;
}

public void setQuantities(ArrayList<Integer> quantities) {
	this.quantities = quantities;
}

}
