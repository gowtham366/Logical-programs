/*
 * Enter your code here. Read input from STDIN. Print your output to STDOUT.
 * Your class should be named CandidateCode.
 */

import java.io.*;
import java.util.*;

public class CandidateCode {
    public static void main(String args[]) throws Exception {

        //Write code here
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        if (testCases >= 1 && testCases <= 10) {
            for (int index = 1; index <= testCases; index++) {
                int numOfHouses = in.nextInt();
                if (numOfHouses >= 1 && numOfHouses <= 10000) {
                    int[] ticketNums = new int[numOfHouses];
                    for (int house = 0; house < numOfHouses; house++) {
                        int ticketNum = in.nextInt();
                        ticketNums[house] = (ticketNum >= -1000 && ticketNum <= 1000) ? ticketNum : 0;
                    }
                    //Method implementation
                    int[] temp = new int[6];
                    for (int i = 0; i < ticketNums.length; i++) {
                        temp[0] = ticketNums[i];
                        temp[1] = 0;
                        temp[2] = ticketNums[i];
                        for (int j = i + 2; j < ticketNums.length; j++) {
                            int sum = ticketNums[i] + ticketNums[j];
                            if (temp[2] < sum) {
                                temp[0] = ticketNums[i];
                                temp[1] = ticketNums[j];
                                temp[2] = sum;
                            }

                        }
                        if (temp[5] < temp[2]) {
                            temp[3] = temp[0];
                            temp[4] = temp[1];
                            temp[5] = temp[2];
                        }
                    }
                    String result = "";
                    if (temp[4] != 0)
                        result += String.valueOf(temp[4]);
                    if (temp[3] != 0)
                        result += String.valueOf(temp[3]);
                    System.out.println(result);
                    //End
                }
            }
        }
    }
}
