package org.tnsif.secondpackage;
//Way to import another package 
//import org.tnsif.firstpackage.*;
import org.tnsif.firstpackage.Base;
public class Executor {

	public static void main(String[] args) {
		Base b1 = new Base();
		/*if any method is default we cannot access into another package 
		 * we can only access inside the same package*/
		//b1.methodDefault();
		
		b1.methodPublic();
	}

}
