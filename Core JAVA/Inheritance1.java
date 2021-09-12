class Bicycle
{
	public int gear;
    public int speed;
    
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
	}
	
    public void applyBrake(int decrement)
    {
    	speed -= decrement;
	}
	 
    public void speedUp(int increment)
    {
        speed += increment;
    }
	
    public String toString()
    {
    	return ("No of gears are " + gear + "\n"
	                + "Speed of bicycle is " + speed);
    }
}

class MountainBike extends Bicycle
{
	public int seatHeight;
	
	public MountainBike(int gear, int speed,int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }
 
	public void setHeight(int newValue)
    {
		seatHeight = newValue;
    }
 
    public String toString()
    {
        return (super.toString()+"\nSeat height is "+seatHeight);
    }
}

public class Inheritance1
{
	public static void main(String[] args) 
	{
		MountainBike obj=new MountainBike(4, 70, 25);
		System.out.println(obj.toString());
		
		obj.applyBrake(30);
		System.out.println("Applying brakes speed reduces to "+obj.speed);
	}
}
