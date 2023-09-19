package composition;

public class Usemobile {
	public static void main(String[] args) {
		Processor aa1=new Processor();
		aa1.ram=2;
		aa1.name="android";
		Mobile bb1=new Mobile();
		bb1.price=9000;
		bb1.brand="redmi";
		bb1.iscostly=true;
		bb1.m=aa1;
		Processor aa2=new Processor();
		aa2.ram=5;
		aa2.name="double";
		Mobile bb2=new Mobile();
		bb2.price=15000;
		bb2.brand="redmi";
		bb2.iscostly=true;
		bb2.m=aa2;
		Processor aa3=new Processor();
		aa3.ram=10;
		aa3.name="crushed";
		Mobile bb3=new Mobile();
		bb3.price=25000;
		bb3.brand="redmi";
		bb3.iscostly=false;
		bb3.m=aa3;
		Mobile [] num= {bb1,bb2,bb3};
		for(int i=0;i<num.length;i++) {
			if(num[i].brand.equals("redmi")&&num[i].m.name.equals("crushed"))
			//System.out.println(num[i].price+" "+num[i].brand+" "+num[i].iscostly+" "+num[i].m);
		
			System.out.println(num[i].price+" "+num[i].brand+" "+num[i].iscostly+" "+num[i].m.ram+" "+num[i].m.name);
		
		}	
		
		
		
	}

}
