package examples.InheritanceConcepts;

import java.security.ProtectionDomain;

class ParentClass{
	protected void display() {
		System.out.println("Parent Class method always has high or same priority visbility than child class");
	}
}

class ChildClass extends ParentClass{
	public  void display() {
		System.out.println(" Cannot reduce the visibilty of inherited method Ex., pulbic in parent class and protected child class not allowed");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("--------------");
		ChildClass cc = new ChildClass();
		cc.display();
			

	}

}


