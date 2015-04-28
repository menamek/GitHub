/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amount;

import java.util.Scanner;

/**
 *
 * @author mena
 */
public class Amount {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("enter an amount: ");
            String c = in.nextLine();
            double input = Double.parseDouble(c);
            int i = (int) input;
            double s= (input-i)*100;
            int res=(int)s/25;
            int res2= (int)s-(res*25);
            int res3=(int)res2/10;
            int res4=res2-(res3*10);
            int res5=res4/5;
            int res6=(int)res4%5;
            System.out.println("your amount"+ input +"consists of");
            System.out.println(i+" dollars");
            System.out.println(res+" quarter");
            System.out.println(res3+" dimes");
            System.out.println(res5+" nicles");
            System.out.println(res6+" peni");
        }
    }
    
}
