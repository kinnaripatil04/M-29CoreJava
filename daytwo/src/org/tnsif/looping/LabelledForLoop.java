//program t0 demonstrate on label for loop
package org.tnsif.looping;

public class LabelledForLoop {

	public static void main(String[] args) {
		//label-->we can give any name to it
		outer:
			for(int i = 1; i <= 5; i++) {
				System.out.println();
				//label
				inner:
					for(int j = 1; j <=5; j++) {
						if(j==4) {
							//it will skip 4
							continue;
						}
						System.out.print(j + " ");
					}
			}

	}

}
