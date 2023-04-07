
package casting;

public class test_upcasting {
	
public static void main(String[] args) {
	System.out.println("***********super class method****************");
	upcastiing a = new upcastiing();
	a.demo();
	a.test();
	a.memo();
	
	System.out.println("****************** sub class method*******************");
	upcast b = new upcast();
	b.demo();
	b.sub();
	b.test();
	
	System.out.println("******************** test upcasting*******************");
	upcastiing c = new upcast();
	c.demo();
	c.memo();
	c.test();
	
	upcast d = (upcast) new upcastiing();
	d.demo();
	d.sub();
	d.test();
	d.memo();
	




}
}
