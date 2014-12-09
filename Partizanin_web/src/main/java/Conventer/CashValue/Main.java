package Conventer.CashValue;

import Conventer.CashValue.get_current_exchange_rate.SiteFilter;

/**
 * Created with Intellij IDEA.
 * Project name: proff16.
 * User: Partizanin.
 * Date: 08.12.2014.
 * Time:  13:40.
 * To change this template use File|Setting|Editor|File and Code Templates.
 */
public class Main {

    public static void main(String[] args) {

        SiteFilter.UAH uah = new SiteFilter.UAH();
        SiteFilter.USD usd = new SiteFilter.USD();
        SiteFilter.EUR eur = new SiteFilter.EUR();
        SiteFilter.RUB rub = new SiteFilter.RUB();

        System.out.println("---------UAH---------");

        System.out.println("USD\nsell: " + uah.getSellUSD() + "\nbuy:  " + uah.getBuyUSD());
        System.out.println("EUR\nsell: " + uah.getSellEUR() + "\nbuy:  " + uah.getBuyEUR());
        System.out.println("RUB\nsell: " + uah.getSellRUB() + "\nbuy:  " + uah.getBuyRUB());


        System.out.println("\n\n");

        System.out.println("---------USD---------");

        System.out.println("UAH\nsell: " + usd.getSellUAH() + "\nbuy: " + usd.getBuyUAH());
        System.out.println("EUR\nsell: " + usd.getSellEUR() + "\nbuy: " + usd.getBuyEUR());
        System.out.println("RUB\nsell: " + usd.getSellRUB() + "\nbuy: " + usd.getBuyRUB());


        System.out.println("\n\n");

        System.out.println("---------EUR---------");

        System.out.println("USD\nsell: " + eur.getSellUSD() + "\nbuy: " + eur.getBuyUSD());
        System.out.println("UAH\nsell: " + eur.getSellUAH() + "\nbuy: " + eur.getBuyUAH());
        System.out.println("RUB\nsell: " + eur.getSellRUB() + "\nbuy: " + eur.getBuyRUB());


        System.out.println("\n\n");


        System.out.println("---------RUB---------");

        System.out.println("USD\nsell: " + rub.getSellUSD() + "\nbuy: " + rub.getBuyUSD());
        System.out.println("EUR\nsell: " + rub.getSellEUR() + "\nbuy: " + rub.getBuyEUR());
        System.out.println("UAH\nsell: " + rub.getSellUAH() + "\nbuy: " + rub.getBuyUAH());


    }
}
