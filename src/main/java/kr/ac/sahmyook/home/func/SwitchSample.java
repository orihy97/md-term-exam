package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    Scanner scanner = new Scanner(System.in);
    public void calculator() {
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }

    public void fruitPrice() {
        System.out.print("과일 이름을 입력하세요(사과, 바나나, 복숭아, 키위): ");
        String fruit = scanner.next();

        int price = 0;

        switch (fruit) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 1500;
                break;
            case "복숭아":
                price = 2000;
                break;
            case "키위":
                price = 2500;
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
                System.exit(0);
        }

        System.out.println(fruit + " " + price + "원");
    }
}
