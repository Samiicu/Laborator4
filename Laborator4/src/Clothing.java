
public class Clothing extends Item{
	private String color,material,size;
	
	Clothing(String name,String id,float price,String color,String material,String size){
		super(name,id,price);
		this.color=color;
		this.material=material;
		this.size=size;
	}
	@Override
	public String toString() {
		return super.toString()+" color="+color+" size="+size+" material="+material ;
	}


}
