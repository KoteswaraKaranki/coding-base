package org.karanki.coding.hacker_rank.algorithms.warmpup.time_conversion;

import java.util.Scanner;

/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/time-conversion">https://www.hackerrank.com/challenges/time-conversion</a>
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String time = in.next();

		boolean am = time.substring(8).equalsIgnoreCase("AM");
		int hh = Integer.valueOf(time.substring(0, 2));		
		
		//https://en.wikipedia.org/wiki/12-hour_clock
		
		//AM cases
		// 12:00AM (Midnight) => 	00:00
		// 12:01AM 	=> 	00:01
		// 12:59AM 	=> 	00:59
		// 01:00AM	=>	01:00
		
		//PM cases
		// 12:00PM (Noon)	=>	12:00
		// 12:01PM	=>	12:01
		// 12:59PM	=>	12:59
		// 01:00PM	=>	13:00
				
		
		int newHour = hh;

		if (am && hh == 12) {
			newHour = 0;
		} else if (!am && hh != 12) {
			newHour += 12;
		}
		
		
		System.out.println(String.format("%02d", newHour) + ":" + time.substring(3, 8));
		

		in.close();
	}
}
