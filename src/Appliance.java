
public class Appliance extends Item{
	private int guarantee,voltage;
	private String classE;
	Appliance(String name,String id,float price,int guarantee,int voltage,String classE){
		super(name,id,price);
		this.guarantee=guarantee;
		this.voltage=voltage;
		this.classE=classE;
	}
	
	@Override
	public String toString() {
		return super.toString()+" guarantee="+guarantee+" voltage="+voltage+" classE="+classE ;
	}


}
