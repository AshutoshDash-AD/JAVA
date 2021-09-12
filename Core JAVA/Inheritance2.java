class Professor
{
	private String clgName="ITER College";
	private String designation="HOD CSE Department";
	int age=43,salary=70000;
	
	public void setDesign(String designation)
	{
		this.designation=designation;
	}
	public String getDesign()
	{
		return designation;
	}
	
	protected void setClg(String clgName)
	{
		this.clgName=clgName;
	}
	protected String getClg()
	{
		return clgName;
	}
}

public class Inheritance2 extends Professor
{
	public static void main(String[] args) 
	{
		Inheritance2 obj=new Inheritance2();
		
		System.out.println("Details of Proffesor Venkatesh Swaminathan: ");
		System.out.println("College name: "+obj.getClg()+"\nDesignation: "+obj.getDesign()+"\nAge: "+obj.age+"\nSalary: "+obj.salary);
	
		System.out.println("\nDetails of Proffesor Debanjali Tripathy: ");
		obj.setClg("IIT Roorkee");
		obj.setDesign("Ph.D MicroBiology");
		obj.age=35;
		obj.salary=35000;
		System.out.println("College name: "+obj.getClg()+"\nDesignation: "+obj.getDesign()+"\nAge: "+obj.age+"\nSalary: "+obj.salary);
	}

}
