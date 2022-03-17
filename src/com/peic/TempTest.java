package com.peic;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author peic
 * @date 2022/3/17 - 23:46
 **/
public class TempTest {
    private static final int DSJFDKFG_SIZE = 10;//PRSF

    public static final int NUM3 = 1;//psf

    public static final String aaa= "aaa";//psfs



    public static void main(String[] args) {
        System.out.println("");//sout
        System.out.println("args = " + Arrays.deepToString(args));//soutp
        System.out.println("TempTest.main");//soutm

        int num1 =10;
        System.out.println("num1 = " + num1);//soutv

        for (int i = 0; i < 10; i++) {
            //fori
            System.out.println(i);//i.sout
        }

        for (String arg : args) {
            //iter
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            //itar
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(567);

        for (Object o : list) {
            //list.for
        }

        for (int i = 0; i < list.size(); i++) {
            //list.fori
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            //list.forr
        }

        if (list == null) {
            //ifn
        }

        if (list != null) {
            //inn
        }

    }
}
