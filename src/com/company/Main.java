package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        String menu;
        int coins;
        String codeOfProduct;
Takes_Money obj = new Takes_Money();

Product one = new Product(" Mars ","A1",250);
Product two = new Product(" KitKat ","B2",300);
Product three = new Product(" Milky ","C3",200);
Product four = new Product(" Orbit ","D4",150);
Product five = new Product(" Lays ","E5",300);


ArrayList<Product> prods = new ArrayList<>();
prods.add(one);
prods.add(two);
prods.add(three);
prods.add(four);
prods.add(five);


        System.out.println("For Menu please select *menu* ");

        Scanner scan = new Scanner(System.in);
        menu = scan.nextLine();
        if (menu.equals("menu")){
            System.out.println("Here is Menu");
            for (int i = 0; i <prods.size() ; i++) {
                System.out.println(prods.get(i).productName + prods.get(i).productCode + " " + prods.get(i).productPrice);
            }
        }
        else
        {System.out.println("Error. ");
        }

        System.out.println("Input coins and select the product's code...");
        codeOfProduct = scan.nextLine();
        coins = scan.nextInt();


        for (int i = 0; i <prods.size() ; i++) {
            if (prods.get(i).getCode().equals(codeOfProduct)){
                obj.MoneyIn(coins,prods.get(i).getPrice());

                break;
            }
            else continue;
        }


    }


}
