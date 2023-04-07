package variable;

public class localglobal {
 int a=11;//global veriable
 public void test() 
 {
	 int b=44;
	 System.out.println(a);//global vriable
	 System.out.println(b);//local vriable
 }
 public void demo() 
 {
	 int c=55;
	 System.out.println(a);//global vriable
	 System.out.println(c);//local vriable
	// System.out.println(b);//local veriable form another method
	 
 }
 public static void main(String [] agrs)
 {
	 localglobal m=new localglobal();
	 m.test();
	 m.demo();
 }
}
