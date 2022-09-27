package com.infinite.day3;
abstract class Training {
	abstract void name();
	abstract void email();
	
}
class javed extends Training {

	@Override
	void name() {
		System.out.println("Name is Javed..");
	}

	@Override
	void email() {
		System.out.println("Email is javed@email.com");
	}
}
	class yeshwanth extends Training {

	@Override
	void name() {
		System.out.println("Name is yeshwanth...");
	}
	@Override
	void email() {
		System.out.println("Email is yeshwanth@gmail.com");
		
	}
}
	class sindhu extends Training {
	@Override
	void name() {
		System.out.println("Name is sindhu..");
		
	}

	@Override
	void email() {
		System.out.println("Email is sindhu@email.com");
		
	}

	
	
}
     public class AbsDemo {
	 public static void main(String[] args) {
	 	
//		Trianing obj1 = new yeshwanth();
//		Training obj2 = new Sindu();
//		Training obj3 = new Javed();
		Training[] arr = new Training[] {
				new javed(),
				new  yeshwanth(),
				new sindhu ()
		};
		for (Training t : arr) {
			t.name();
			t.email();
			
		
		}
					
		}
     
}
		
	

	



