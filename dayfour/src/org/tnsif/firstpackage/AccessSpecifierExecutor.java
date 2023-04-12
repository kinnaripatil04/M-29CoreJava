//driver class
/*program to demonstrate on packages, access specifiers and
 * instance of operator
 */
package org.tnsif.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		
		/*Private members cen't be accessed into
		 * another class*/
		//b.varPrivate;
		//b.methodPrivate();
		
		System.out.println(b instanceof Base);
	}
}
