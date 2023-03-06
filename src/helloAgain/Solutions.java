package helloAgain;

import java.util.*;



public class Solutions {
    public boolean squareIsWhite(String coordinates) {
        //Pattern  - if the coordinates are converted to integer and added  - the sum is either even(black) or odd(white)

        int num1 = coordinates.charAt(0) - '0';
        int num2 = coordinates.charAt(1);
        return (num1+num2)%2==0?false:true;


    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
