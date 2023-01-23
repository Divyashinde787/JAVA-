package OOPS;

class a{
	int no1=10;	
}
class b extends a{
	int no2=20;
}
class c extends b{
 int no3=30;
	 void add() {
		System.out.println("add : "+(no1+no2+no3));
	}
}
public class fun1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj = new c();
		obj.add();
	}
}
