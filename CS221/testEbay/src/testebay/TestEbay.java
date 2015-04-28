/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebay;

import java.util.Scanner;

/**
 *
 * @author mena
 */
public class TestEbay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DigitalCam[] cam = new DigitalCam[4];

        Scanner in = new Scanner(System.in);

        String brand;
        float resolution;

        for (int i = 0; i < 4; i++) {
            System.out.print("Brand: ");
            brand = in.next();
            System.out.print("Resolution: ");
            resolution = in.nextFloat();

            cam[i] = new DigitalCam(brand, resolution);
        }

        cam[0].setResolution(30);

        for (int i = 0; i < 4; i++) {
            System.out.println(cam[i]);
            //System.out.println(cam[i].toString());
        }

    }
}
