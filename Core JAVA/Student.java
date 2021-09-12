public class Student 
{
	String name,address;
	int age;
	double gp;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public void setGP(double gp)
	{
		this.gp=gp;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public double getGP()
	{
		return gp;
	}
	
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setName("Ashutosh Dash");
		s1.setAge(21);
		s1.setAddress("P-No.296/2980, Santoshi Vihar, BBSR");
		s1.setGP(9.45);
		
		System.out.println("Details of student: ");
		System.out.println("Name: "+s1.getName()+
		                   "\nAge: "+s1.getAge()+
		                   "\nAddress: "+s1.getAddress()+
		                   "\nGradePoint: "+s1.getGP());
	}
}
