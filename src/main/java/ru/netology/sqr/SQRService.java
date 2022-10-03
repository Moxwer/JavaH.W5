package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
        /*
        от 10 до 99
        i*i
        диапазон от 300 до 400
        количество
     */
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int x = i * i;
            if (x > 3000 && x < 5000) {
                count++;
            }
        }
        System.out.println(count);
    }
}