package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    public void sum1To10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합: " + sum);
    }

    public void sumEven1To100() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1부터 100까지의 짝수의 합: " + sum);
    }

    public void oneGugudan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public void sumMinToMax() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        int rangeSum = 0;
        for (int i = min; i <= max; i++) {
            rangeSum += i;
        }
        System.out.println(min + "부터 " + max + "까지의 합: " + rangeSum);
    }

    public void printStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("줄수를 입력하세요: ");
        int rows = scanner.nextInt();
        System.out.print("칸수를 입력하세요: ");
        int cols = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printNumberStar() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void printTriangleStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력할 줄 수를 입력하세요: ");
        int n = scanner.nextInt();

        if (n > 0) { // 직각삼각형
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else { // 역삼각형
            n = -n;
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void guguDan() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
