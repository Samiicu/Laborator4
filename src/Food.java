import java.sql.Date;

public class Food extends Item {
private String expiringDate;
private float noGrams;
Food(String name,String id,float price,String expiringDate,float noGrams){
	super(name,id,price);
	this.expiringDate=expiringDate;
	this.noGrams=noGrams;
}
	

@Override
public String toString() {
	return super.toString()+" expiringDate="+expiringDate+" noGrams="+noGrams ;
}

}
