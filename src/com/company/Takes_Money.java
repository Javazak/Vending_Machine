package com.company;


public class Takes_Money {
    int change = 0;



    public void MoneyIn(int inputMoney, int price){
        if (inputMoney <price){
            System.out.println("Money is not enough ");
        }
        else if (inputMoney==price){
            System.out.println("Take it ... ");
        }
        else if (inputMoney > price){
            change = inputMoney - price;
            System.out.println("Thank you, take the   change  " + change);

        }

    }


}
