package com.peic;

import java.util.ArrayList;
import java.util.Date;

    public class HelloWorld {

        private final static int SADGDGSDF_SIZE = 10;
        public HelloWorld() {}


//这是一个注释
    public static void main(String[] args) {
        //region Description
        getList();
    }

        private static void getList() {
            System.out.println("Hello world");
            ArrayList<Object> list2 = new ArrayList<>();
            //endregion
            list2.add("aaa");

            /*LinkedList list1 = new LinkedList();*/

            Date date = new Date();

            try {
                test22();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void test22(){
    }
}
