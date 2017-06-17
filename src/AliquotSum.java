/**
 * 
 */

/**
 * @author Osama
 *
 */
/**@Creating Class**/
public class AliquotSum {
/**@Main Method**/
	public static void main(String[] args) {
		/**@Creating Object**/
		AliquotSum aliquotSum = new AliquotSum(); 
		
	/**@Calling the method AliquotSum**/
		System.out.println("Aliquot Sum of 12 is " + aliquotSum.AliquotSum(12));

		/**@All Perfect numbers 1 to 100 are:**/
		System.out.println("All Perfect numbers 1 to 100 are: ");
		/**@For Loop*/
		for (int i = 1; i <= 100; i++) {
			/**@if case*/
			if (aliquotSum.AliquotSum(i) == i) { 
				System.out.print(i + " ");
			}
		}

	}
/**@Creating method*/
	public long AliquotSum(int n) {
		long aliquotSum = 0;
		/**@For Loop*/
		for (int i = 1; i <= n / 2; i++) {
			/**@If Condition*/
			if (n % i == 0) {
				aliquotSum += i;
			}
		}
/**@return Value**/
		return aliquotSum;
	}

}