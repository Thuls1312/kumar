package composition;

public class Usecar {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.cc=150;
		e.noofpiston=4;
		car c=new car();
		c.brand="Honda";
		c.price=500000;
		c.isevehicle=true;
		//c.engines=e;
		System.out.println(c.brand+" "+c.price+" "+c.isevehicle+" "+e.cc+" "+e.noofpiston);
		}

}
