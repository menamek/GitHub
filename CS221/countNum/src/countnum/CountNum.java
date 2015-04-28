/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countnum;

import java.util.Scanner;

/**
 *
 * @author mena
 */
public class CountNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.print("enter any number: ");
		int num = in.nextInt();
		int even = 0;
		int odd = 0;
		int zero = 0;

		if (num == 0)
			zero++;

		while (num > 0) {
			int r = num % 10;

			if (r == 0) {
				zero++;
			} else if (r % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num = num / 10;
		}
		System.out.println("Odd digits:" + odd);
		System.out.println("Even digits:" + even);
		System.out.println("Zero digits:" + zero);
    }
    
}
