package test;

import java.util.HashMap;
import java.util.Map;

abstract class vehicle{
    private String name;
    abstract public String getName(String val);
    public String getName(){
    	return "vehicle name:" + name;
    }
	public void setName(String val){
    	name = val;
    }
}

class Car extends vehicle{
	public Car(String val){
    	setName(val);
   }
public String getName(String val){
	return "Car name : " + val;
   }
public String getName(byte val[]){
	return "Car name : " + val;
   }
}

public class QWESAD {
	public static void main(String[] args){
		vehicle obj = new Car("Spark");
    System.out.print(obj.getName());
    }
}
