/*
 * Lesson 34 Coding Activity 2
 *
 * For the Lesson 34 activities, you will be asked to write one or more methods.
 * Use the template to write a main method that tests each of your methods,
 * then paste everything into the code runner box. Your submission should
 * begin with the first import statement and end with the final }.
 *
 * Write a method that takes an array of ints as a parameter
 * and returns the average value of the array as a double.
 *
 *     public static double average(int [] a)
 *
 * For example, average(a) would return 2.0
 * if a = {1, 2, 3} or 1.0 if a = {1, 1, 1}.
 */


import java.util.Scanner;

class two {
    public static double average(int[] list) {
        int sum = 0, average;

        for (int value:list) {
            sum += value;
        }

        average = sum/list.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an list of number, separate with a space: ");
        String data = input.nextLine();

        // Put what we currently have into an array
        String[] _list = data.split(" ");
        int[] list = new int[_list.length];

        // Convert this to an integer array
        for(int x=0;x<list.length;x++) {
            list[x] = Integer.parseInt(_list[x]);
        }

        System.out.println("Average: " + average(list));
    }
}