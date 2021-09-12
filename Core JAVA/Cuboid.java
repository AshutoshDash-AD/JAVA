
public class Cuboid 
{
	int width,height,depth;
	
	Cuboid()
	{
		System.out.println("Default Constructor called with dimensions 25unit each (25unit Cube)");
		width=height=depth=25;
	}
	
	Cuboid(int width,int height,int depth)
	{
		System.out.println("Parameterized Constructor called with user input dimensions");
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	Cuboid(int width,int height)
	{
		System.out.println("Parameterized Constructor called with a constant depth of 10unit");
		this.depth=10;
		this.width=width;
		this.height=height;
	}
	
	Cuboid(int height)
	{
		System.out.println("Parameterized Constructor called with a constant depth of 10unit and width of 25unit");
		this.depth=10;
		this.width=25;
		this.height=height;
	}
	
	public int volume()
	{
		return width*height*depth;
	}
	
	public static void main(String[] args) 
	{
		Cuboid c1=new Cuboid();
		System.out.println("Its volume is "+c1.volume()+"\n");
		
		Cuboid c2=new Cuboid(20,30,60);
		System.out.println("Its volume is "+c2.volume()+"\n");
		
		Cuboid c3=new Cuboid(15,40);
		System.out.println("Its volume is "+c3.volume()+"\n");
		
		Cuboid c4=new Cuboid(30);
		System.out.println("Its volume is "+c4.volume());
	}

}
