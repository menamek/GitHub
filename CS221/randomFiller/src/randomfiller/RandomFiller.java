/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomfiller;

import java.util.Random;

/**
 *
 * @author mena
 */
public class RandomFiller {

    private int[] numb = new int[50];

    public void generatRandom() {
        Random rand = new Random();

        for (int i = 0; i < numb.length; i++) {
            numb[i] = rand.nextInt(50);
        }
    }

    public void display() {
        for (int i = 0; i < numb.length; i++) {
            System.out.print(numb[i]+ " ");
        }
    }

    public void removeDuplicate() {

        boolean[] tem = new boolean[50];
        int Size = 0;
        for (int i = 0; i < numb.length; i++) {
            if (tem[numb[i]] == false) {
                Size++;
                tem[numb[i]] = true;
            }

        }
        int[] res = new int[Size];
        int k = 0;
        for (int i = 0; i < tem.length; i++) {
            if (tem[i] == true) {
                res[k] = i;
                k++;
            }
        }

        numb = res;
    }

    public void removeAll() {
        for (int i = 0; i < numb.length; i++) {
            numb[i] = 0;
        }

    }

    public int[] sublist(int startIndex, int endIndex) {
        int[] tem = new int[endIndex - startIndex + 1];
        System.arraycopy(numb, startIndex, tem, 0, tem.length);
        return tem;

    }
    public static void main(String[] args) {
        RandomFiller c = new RandomFiller();
        c.display();
        c.generatRandom();
        c.display();
        int[] sublist = c.sublist(2, 5);
        for (int i = 0; i < sublist.length; i++) {
            System.out.println(sublist[i]);
        }

        c.removeDuplicate();
        c.display();
        c.removeAll();
        c.display();

    }

}
