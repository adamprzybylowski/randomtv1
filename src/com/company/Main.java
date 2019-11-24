package com.company;

public class Main {
/* A very simple program that will randomly select a TV station for you from the created array */
    public static void main(String[] args) {
	// Build array with 10 tv station
        String[] newtv = {"TVP1","TVP2","CNBC","TVN7","Polsat","Discovery","NBC","TVN","Polsat","National Geographic"};
      //Generate random number 0-0,9(9)
        double random = Math.random();
                random *=10;
                //Change random to (int)
                int randomIndex = (int) random;
                //Output
        System.out.print(newtv[randomIndex]);
    }
}
