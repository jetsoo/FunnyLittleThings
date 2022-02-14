package com.company;

import java.util.Arrays;

public class Main {

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPrime(int num){
        boolean prime = true;
        for(int i =2; i < num/2;i++){
            if(num % i == 0){
                prime = false;
                return prime;
            }
        }
        return true;
    }
    public static int countTrues(boolean[] array){
        int counter = 0;
        for(int i =0; i< array.length;i++){
            if(array[i]){
                counter++;
            }
        }
        return counter;
    }
    public static int hoursToSeconds(int hours){
        int seconds = hours * 360;
        return  seconds;
    }
    public static int[] multiplesInArray(int num, int length){
        int[] arr = new int[length];
        int counter = 1;
        for (int i= 0; i< arr.length;i++){
            arr[i] = num *counter;
            counter++;
        }
        return arr;
    }
    public static int numWar(int[] arr){
        int sumEven =0;
        int sumOdd =0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                sumEven+= arr[i];
            }
            else {
                sumOdd+= arr[i];
            }
        }
        if(sumEven> sumOdd){
            System.out.println("Even wins by :");
            return sumEven - sumOdd;
        }
        else{
            System.out.println("Odd wins by :");
            return sumOdd - sumEven;
        }

    }
    public static void rockPaperScissor(String player1,String player2){
        if (player1.equals(player2)) {
            System.out.println("Tie!");
        }
        if(player1.equals("rock") && player2.equals("scissor")){
            System.out.println("Player 1 wins!");
        }
        else if(player1.equals("rock") && player2.equals("paper")){
            System.out.println("Player 2 wins!");
        }
        else if(player1.equals("scissor") && player2.equals("rock")){
            System.out.println("Player 2 wins!");
        }
        else if(player1.equals("scissor") && player2.equals("paper")){
            System.out.println("Player 1 wins!");
        }
        else if(player1.equals("paper") && player2.equals("rock")){
            System.out.println("Player 1 wins!");
        }
        else if(player1.equals("paper") && player2.equals("scissor")){
            System.out.println("Player 2 wins!");
        }

    }
    public static int findMissingNum(int[] arr){
        int counter =1;
        for(int i =0; i< arr.length;i++){
            if(arr[i] != counter){
                return counter;
            }
            counter++;
        }
        return 0;
    }

    public static void main(String[] args) {
	    int x = 41;
        boolean[] arrayo = {true,false,true,true,false,true,false,false,true,false,true,false,false,false,false,true};
        int hours = 18;
        int[] war = {12,134,76,34,98,345,12,654,86,234,891};
        System.out.println(isEven(x));
        System.out.println(isPrime(x));
        System.out.println(countTrues(arrayo));
        System.out.println(hoursToSeconds(hours));
        System.out.println(Arrays.toString(multiplesInArray(13, 12)));
        System.out.println(numWar(war));
        rockPaperScissor("scissor","rock");
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findMissingNum(nums));
    }
}
