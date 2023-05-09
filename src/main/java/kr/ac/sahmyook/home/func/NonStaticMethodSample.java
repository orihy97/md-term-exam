package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    public void testScanner() {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력받기
        System.out.print("정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.println("입력한 정수는 " + num1 + "입니다.");

        // 실수 입력받기
        System.out.print("실수를 입력하세요: ");
        double num2 = scanner.nextDouble();
        System.out.println("입력한 실수는 " + num2 + "입니다.");

        // 문자열 입력받기
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next();
        System.out.println("입력한 문자열은 " + str + "입니다.");

    }

    public void testRandom() {
        Random random = new Random();

        // 0~9 사이의 정수 난수 출력
        int randomInt = random.nextInt(10);
        System.out.println("정수 난수: " + randomInt);

        // 0.0~1.0 사이의 실수 난수 출력
        double randomDouble = random.nextDouble();
        System.out.println("실수 난수: " + randomDouble);
    }
}
