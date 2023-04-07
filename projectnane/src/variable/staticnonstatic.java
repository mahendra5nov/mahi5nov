package variable;

public class staticnonstatic {
static int a=12;
int b=22;
public static void main (String []args)
{
		System.out.println("static veriable a="+a);//12
		staticnonstatic x= new staticnonstatic();
		System.out.println(" non static veriable b="+x.b);//22
		staticnonstatic y= new staticnonstatic();
		System.out.println(" non static veriable b="+y.b);//22
		x.b=24;
		System.out.println(" non static veriable b="+x.b);//24
		System.out.println(" non static veriable b="+y.b);//22
		System.out.println(" static veriable a="+x.a);
		System.out.println(" static veriable a="+y.a);
		x.a=13;
		System.out.println(" static veriable a="+x.a);
		System.out.println(" static veriable a="+y.a);
		
}
}
