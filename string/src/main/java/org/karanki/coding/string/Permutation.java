package org.karanki.coding.string;

public class Permutation {

	static public void permutePrint(String str, int start, int end) {

		if (start == end) {
			System.out.println(str);
			return;
		}

		for (int i = start; i <= end; i++) {
			str = swap(str, start, i);
			permutePrint(str, start+1, end);
			str = swap(str, start, i);		
		}
	}
		

	
	/**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
  /* static private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
	*/
	/**
	 * Swap Characters at position
	 * 
	 * @param a
	 *            string value
	 * @param i
	 *            position 1
	 * @param j
	 *            position 2
	 * @return swapped string
	 */
	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {

		String str = "abc";
		permutePrint(str, 0, str.length() - 1);

	}

}
