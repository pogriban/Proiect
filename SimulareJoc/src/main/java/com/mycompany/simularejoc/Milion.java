/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simularejoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class Milion extends AllQuestion {

    public Milion(int id, String questoin, String answer1, String answer2, String answer3, String answer4, String correct) {
        super(id, questoin, answer1, answer2, answer3, answer4, correct);
    }
    static int r1, r2, r3, r4, max1 = 0;
    static AllQuestion allQ;
    static int count = 0;
    static int nrIntr = 1;
    static Random random = new Random();

    public static Scanner sc = new Scanner(System.in);
    public static int array[] = new int[4];

    public static void main(String args[]) {
        System.out.println();
        AllQuestion p;
        System.out.println();
        ArrayList<AllQuestion> allQ = new ArrayList<>();
        allQ.add(t1);
        allQ.add(t2);
        allQ.add(t3);
        allQ.add(t4);
        allQ.add(t5);
        allQ.add(t6);
        allQ.add(t7);
        allQ.add(t8);
        allQ.add(t9);
        allQ.add(t10);
        allQ.add(t11);
        allQ.add(t12);
        allQ.add(t13);
        allQ.add(t14);
        allQ.add(t15);
        allQ.add(t16);
        allQ.add(t17);
        allQ.add(t18);
        allQ.add(t19);
        allQ.add(t20);
        allQ.add(t21);
        allQ.add(t22);
        allQ.add(t23);
        allQ.add(t24);
        allQ.add(t25);
        allQ.add(t26);
        allQ.add(t27);
        allQ.add(t28);
        allQ.add(t29);
        allQ.add(t30);
        allQ.add(t31);
        allQ.add(t32);
        allQ.add(t33);
        allQ.add(t34);
        allQ.add(t35);
        allQ.add(t36);
        allQ.add(t37);
        allQ.add(t38);
        allQ.add(t39);
        System.out.print("Introduceti numele: ");
        String name = sc.nextLine();
        System.out.println();
        afisIntrebare(t38);
        for (int i = 0; i < 9; i++) {
            p = randIntr(allQ, random.nextInt(37), random.nextInt(35));
            System.out.println(name + " doriti sa continuam cu intrebarea nr (" + (i + 2) + "): Y/N");;
            char yesOrNot = sc.next().charAt(0);
            if (yesOrNot == 'Y' || yesOrNot == 'y') {
                if (afisIntrebare(p)) ; else {
                    System.out.println("Imi pare rau! " + name + " aici punem punct cu " + count + " $");
                    break;
                }

            }
            if (yesOrNot == 'N' || yesOrNot == 'n') {
                break;
            }
        }
        {
            System.out.println("La revedere " + name + " aveti " + count + "$");
        }

    }

    public static boolean afisIntrebare(AllQuestion a) {
        boolean m;

        System.out.println(a.getId() + " " + a.getQuestoin() + a.getAnswer1() + a.getAnswer2() + a.getAnswer3() + a.getAnswer4());
        System.out.println("Aveti nevoie de ajutor? 1(50/50) 2 help   3 Phone Friend");
        char intrCorec2 = sc.next().charAt(0);
        switch (intrCorec2) {
            case '1': {
                a50_50(a);
                break;
            }
            case '2': {
                help(a);
                break;
            }
            case '3': {
                phoneFriend(a);
                break;
            }
        }
        char intrCorec1 = sc.next().charAt(0);
        if (intrCorec1 == a.getCorrect().toLowerCase().charAt(0) || intrCorec1 == a.getCorrect().toUpperCase().charAt(0)) {
            count += 5;
            System.out.println("Corect aveti " + count + " $");
            //System.out.println("Corect ");

            m = true;
        } else {
            m = false;
        }
        return m;
    }

    public static AllQuestion randIntr(ArrayList<AllQuestion> allQ, int rand1, int rand2) {
        for (AllQuestion elem : allQ) {
            if (elem.getId() == (rand1 + rand2) / 2) {

                return elem;
            }

        }

        return t39;
    }

    public static void a50_50(AllQuestion a) {

        //System.out.println(a.getId() + " "  + (a.getRasCorect()) + a.getRaspuns2() + a.getRaspuns3() + a.getRaspuns4());
        //char intrCorec = sc.next().charAt(0);
        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer2() + a.getAnswer4());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer1() + a.getAnswer4());
        }

    }

    public static void help(AllQuestion a) {

        do {

            r1 = ((int) (Math.random() * 100));
            r2 = ((int) (Math.random() * 100));
            r3 = ((int) (Math.random() * 100));
            r4 = (int) (Math.random() * 10);
        } while ((r1 + r2 + r3 + r4) != 100);
        array[0] = r1;
        array[1] = r2;
        array[2] = r3;
        array[3] = r4;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(" " + a.getAnswer1() + array[3] + "% " + a.getAnswer2() + array[2] + "% " + a.getAnswer3() + array[0] + "% " + a.getAnswer4() + array[1] + "%");
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(" " + a.getAnswer1() + " " + array[1] + "%" + a.getAnswer2() + " " + array[3] + "%" + a.getAnswer3() + " " + array[2] + "%" + a.getAnswer4() + " " + array[0] + "%");
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(" " + a.getAnswer1() + " " + array[0] + "% " + a.getAnswer2() + array[1] + "% " + a.getAnswer3() + array[3] + "% " + a.getAnswer4() + array[2] + "%");
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(" " + a.getAnswer1() + " " + array[0] + "%" + a.getAnswer2() + " " + array[2] + "%" + a.getAnswer3() + " " + array[1] + "%" + a.getAnswer4() + " " + array[3] + "%");
        }

    }

    public static void phoneFriend(AllQuestion a) {

        if (a.getCorrect().charAt(0) == a.getAnswer1().charAt(0)) {
            System.out.println(" " + a.getAnswer1());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer2().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer2());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer3().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer3());
        }
        if (a.getCorrect().charAt(0) == a.getAnswer4().charAt(0)) {
            System.out.println(a.getId() + " " + a.getAnswer4());
        }

    }

}
