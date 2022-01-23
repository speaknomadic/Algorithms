package com.company.selfprep;

//Да се разработи програма на Java (блок схема и съответстващия й програмен текст),
// която реализира рекурсивен алгоритъм на Евклид за намиране на най-големия общ делител (НОД) на две естествени числа.

public class EvklidRecurssive {

    public static void main(String[] args) {
        int a = 60;
        int b = 35;
        System.out.println(recursiveEvklid(a, b));
    }

    private static int recursiveEvklid(int a, int b) {
        int r = 0;
        r = a % b;
        if (r == 0) {
            return b;
        }
        return recursiveEvklid(b, r);

    }
}




