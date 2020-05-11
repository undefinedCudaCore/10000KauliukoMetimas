/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10000kauliukometimas;

/**
 *
 * @author TK's Thermaltake
 */
public class Main {

    public static void main(String[] args) {
        int r = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        for (int i = 0; i < 10000; i++) {
            r = (int) Math.floor(Math.random()*6)+1;
            switch(r) {
                case 1:
                    r1 = r;
                    ++count1;
                    break;
                case 2:
                    r2 = r;
                    ++count2;
                    break;
                case 3:
                    r3 = r;
                    ++count3;
                    break;
                case 4:
                    r4 = r;
                    ++count4;
                    break;
                case 5: 
                    r5 = r;
                    ++count5;
                    break;
                case 6: 
                    r6 = r;
                    ++count6;
                    break;
            }
        }
        System.out.println(r1+" pasikartoja " + count1 + " kartus.");
        System.out.println(r2+" pasikartoja " + count2 + " kartus.");
        System.out.println(r3+" pasikartoja " + count3 + " kartus.");
        System.out.println(r4+" pasikartoja " + count4 + " kartus.");
        System.out.println(r5+" pasikartoja " + count5 + " kartus.");
        System.out.println(r6+" pasikartoja " + count6 + " kartus.");
    }
}
