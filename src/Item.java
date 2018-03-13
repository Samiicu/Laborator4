import java.sql.Date;

public abstract class Item {
	
protected String name;
protected String id;
protected float price;
public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public void setPrice(float price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public float getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


	Item(String name,String id,float price){
		this.name=name;
		this.id=id;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "name=" + name + "  id=" + id + " price=" + price ;
	}
	
	
}
