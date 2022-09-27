package com.infinite.intf;

interface ITraining {
	void name();
	void email();
}
class Vardhi implements ITraining {

	@Override
	public void name() {
	System.out.println("Name is Vardhi..");
		
	}

	@Override
	public void email() {
		System.out.println("email is vardhi@gmail.com");
		
	}
	
}
class Kishore implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Kishore..");
		
	}

	@Override
	public void email() {
		System.out.println("email is Kishore@gmail.com");
		
	}
	
}


	public class IntfDemo {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
				new Vardhi(),new Kishore()
		};
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
		}

	}


