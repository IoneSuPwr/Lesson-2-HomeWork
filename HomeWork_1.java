package main.java.pack_2;

public class HomeWork_1 {
    private static int a;
    private static int b;
    private static int input;
    private static String word;
    private static int times;

    public static void main(String[] args) {
        System.out.println(withNum(a=11, b=29));
        NegOrPos(input=0);
        System.out.println(NegNum(input=-4));
        StringNum(word="Hello", times=7);
        System.out.println(VysokosnyYear(2020));
    }

    /** 1 Задание */
    public static boolean withNum(int a, int b) {
        int sum = a + b;
        return ((sum >= 10) && (sum <= 20));
    }
    /** 2 Задание */
    public static void NegOrPos(int input) {
        if (input >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
    /** 3 Задание */
    public static boolean NegNum(int input) {
        return (input < 0);
    }
    /** 4 Задание */
    public static void StringNum(String word, int times) {
        for (int x = 0; x < times; x++) {
            System.out.println(word);
        }
    }
    /** 5 Задание */
    public static boolean VysokosnyYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
