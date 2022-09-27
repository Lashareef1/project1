package com.infinite.day3;
abstract class Vehicle {
	abstract void name ();
	abstract void type();
}
class passionpro extends Vehicle {

	@Override
	void name() {
		System.out.println("Name is passionpro");
		
	}

	@Override
	void type() {
		System.out.println("its a 2 wheeler");
	}

}


class scross extends Vehicle {

	@Override
	void name() {
		System.out.println("Name is scross...");
		
	}

	@Override
	void type() {
		System.out.println("its a 4 wheeler");
		
	}

	
}
public class AbsTest {

	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[] {
				new passionpro(),
				new scross()
		};
		 for (Vehicle v : arr) {
			 v.name();
			 v.type();
		 }
			
		}
	}




