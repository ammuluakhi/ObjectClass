package ObjectClass;
class MultipleObject1{
	void Display() {
		System.out.println("welcome to java class");
	}
}
public class MultipleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleObject1 mo1,mo2,mo3;
mo1=new MultipleObject1();
mo2=new MultipleObject1();
mo3=new MultipleObject1();
mo1.Display();
mo2.Display();
mo3.Display();
	}

}
