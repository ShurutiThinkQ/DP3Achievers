package com.revision;

class Vehicle
{
   String name;
   int noOfWheels;
   
   public Vehicle()
   {
	   this("Car",4);
	   System.out.println("Default");
	 
	   
   }

	public Vehicle(String name, int noOfWheels) {
	
		
		this.name = name;
		this.noOfWheels = noOfWheels;
	} 
	
    void calcAvgPerkm()
	{
		System.out.println("12");
	}
  
    
    Vehicle getVehicletype(Vehicle v)
    {
    	v.name="Bike";
    	return this;
    }
    
	public String toString()
	{
		return name+"  "+noOfWheels;
	}
	
	

}

class Car extends Vehicle
{
	
	int modelNo;
	String brand;
	
	public Car()
	{
	 
	}
	
	@Override
	
	public  void calcAvgPerkm()
	{
		System.out.println("18");
	}
	
	Car getVehicletype(Vehicle v)
	    {
	    	v.name="audi";
	    	return this;
	    }
	
	
	public void calAvgperKm(int value)
	{
		System.out.println(value);
	}
	// overloading cannot be done only basis on return type
	
	
	public int calAvgperKm(float value)
	{
		System.out.println(value);
		return (int) value;
	}
	
	public void display()
	{
		
	}
	
	
	public Car(String name, int noOfWheels, int modelNo, String brand) {
		super(name, noOfWheels);
		this.modelNo = modelNo;
		this.brand = brand;
	}
	
	
	
}

public class Constructor1 {
	
	public static void main(String[] args) {
		
		//StaticDemo.main("Java");
		Car v = new Car();
		
		
		
		
	}

}
