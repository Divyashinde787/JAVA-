package OOPS;
class notmain{
	int x,y;
	notmain(int a){
		x=a;
	}
	void fun1(int b) {
		y=b;
	}
	void view() {	
		System.out.println("values : "+(x*y));
	}
}
public class Constuct {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		notmain con = new notmain(10);
		con.fun1(6);
		con.view();
	}
}
