package com.stackroute.ao1;

public class FindMissingNumber
{
        public static void main(String[] args) {

            int total_num;

            int[] numbers = new int[]{1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
            //int[] numbers = new int[]{1,2,3,4,5,6,8,9};
            total_num = 51;
            int expected_num_sum = total_num * ((total_num + 1) / 2);
            int num_sum = 0;
            for (int i: numbers) {
                num_sum += i;
            }
            System.out.print( expected_num_sum - num_sum);
            System.out.print("\n");
        }
    }

