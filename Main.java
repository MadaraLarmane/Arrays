package com.company;

public class Main{
public static void taskNumber1(){
    System.out.println("For loop");
    int[] myArray = new int [] {5, 3, 7, 6, 2, 8};
    for (int i = 0; i < 6; i++){
        System.out.println(myArray[i]);
    }
    System.out.println("For each loop");
    for (int i : myArray){
        System.out.println(i);
    }
    System.out.println("Do while loop");
    int i = 0;
    do{
        System.out.println(myArray[i]);
        i++;
    } while (i < myArray.length);

}
    public static void taskNumber1WhileLoop(){
    int[] myArray = new int[]{5, 3, 7, 6, 2, 8};
        System.out.println("While loop");
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }
    }
    public static void taskNumber2() {
        int[] myArray = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        for (int i = 0; i < 10; i++) {
            if (myArray[i] < 0) {
                System.out.println("Negative number: " + myArray[i]);
            }
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println("Odd number: " + myArray[i]);
                count++;
            }
        }
        System.out.println("There are " + count + " odd numbers");
    }
    public static void taskNumber2SameValues() {
        int[] myArray = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("Elements with the same value: ");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    System.out.println(myArray[j]);
                }
            }
        }
    }
    public static void taskNumb2Each2Element(){
        int[] myArray = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("Every second element in array: ");
        for (int i=0; i<myArray.length; i=i+2){
            System.out.println(myArray[i]);
        }
    }
    public static void taskNumb2Average(){
        int[] numbers = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        System.out.println("Average value of the array is: ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
            double average = sum / numbers.length;
                System.out.println(average);

        System.out.println("Elements above average: ");
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < average)
                System.out.println(numbers[i]);
}

        public static void main (String[]args){
            taskNumber1();
            taskNumber1WhileLoop();
            taskNumber2();
            taskNumber2SameValues();
            taskNumb2Each2Element();
            taskNumb2Average();
        }
    }
