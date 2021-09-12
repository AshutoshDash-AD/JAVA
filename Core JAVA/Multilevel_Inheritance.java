class GrandParent
{
	void showG()
	{
		System.out.print("I'm the GrandParent class");
	}
	int G_age=76;
}

class Parent extends GrandParent
{
	void showP()
	{
		System.out.print("I'm the Parent class");
	}
	int P_age=38;
}

class Child extends Parent
{
	void showC()
	{
		System.out.print("I'm the Child class");
	}
	int C_age=9;
}

public class Multilevel_Inheritance 
{
	public static void main(String[] args) 
	{
		Child obj=new Child();
		
		obj.showG();
		System.out.println(" and I'm "+obj.G_age+" years old\n");
		
		obj.showP();
		System.out.println(" and I'm "+obj.P_age+" years old\n");

		obj.showC();
		System.out.println(" and I'm "+obj.C_age+" years old\n");
	}
}
