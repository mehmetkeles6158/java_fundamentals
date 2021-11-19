package labs_examples.my_practices.myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
//    public static void main(String[] args) {
//
//        System.out.println("Welcome To The TYSON.Here is the info about our three models.");
//
//        System.out.println();
//        Products item01 = new Products("Tyson", "T1", 01, 199.99);
//        Products item02 = new Products("Tyson", "T2", 02, 299.99);
//        Products item03 = new Products("Tyson", "T3", 03, 399.99);
//
//        System.out.println(item01);
//        System.out.println(item02);
//        System.out.println(item03);
//
//        System.out.println();
//
//
//        ArrayList<Double> price_list = new ArrayList<>();
//
//        price_list.add(item01.getProduct_price());
//        price_list.add(item02.getProduct_price());
//        price_list.add(item03.getProduct_price());
//        System.out.println(price_list);
//
//        System.out.println();
//        System.out.println("Please enter model to see more info!");
//        Scanner input = new Scanner (System.in);
//        String user_input = input.next();
//
//        if(user_input.equals("T1")){
//            item01.description();
//        }
//
//
//
//
//
//
////
////        double total = item01.getProduct_price() + item02.getProduct_price() + item03.getProduct_price();
////        System.out.println(total);
////
////        LinkedList list01 = new LinkedList();
////
////        list01.add(item01.getProduct_price());
////        list01.add(item02.getProduct_price());
////        list01.add(item03.getProduct_price());
////
////        System.out.println(list01);
//
//
//
//
//
//    }

    public static class SecretWord {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String secret = "Please", guess = "";

            System.out.print("Secret word?");

            while (!guess.equals(secret)) {
                guess = input.next();

                if (guess.equals(secret)) {
                    System.out.println("enter");
                } else {
                    System.out.println("try again");
                }
            }
        }
    }


}



