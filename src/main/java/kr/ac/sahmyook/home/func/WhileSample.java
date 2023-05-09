package kr.ac.sahmyook.home.func;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
    Scanner scanner= new Scanner(System.in);
    Random random = new Random();
    public void printUniCode() {
        while (true) {
            System.out.print("문자 하나를 입력하세요 (0 입력시 종료): ");
            char ch = scanner.next().charAt(0);
            if (ch == '0') {
                break;
            }
            System.out.println(ch + "의 유니코드: " + (int) ch);
        }
    }

    public void sum1To100() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1부터 100까지의 합: " + sum);
    }

    public void numberGame() {

        int answer = random.nextInt(100) + 1;
        int guess = 0;
        int count = 0;
        while (guess != answer) {
            System.out.print("1부터 100까지의 숫자를 입력하세요: ");
            guess = scanner.nextInt();
            count++;
            if (guess < answer) {
                System.out.println("더 큰 숫자를 입력하세요.");
            } else if (guess > answer) {
                System.out.println("더 작은 숫자를 입력하세요.");
            }
        }
        System.out.println("정답입니다! " + count + "번만에 맞추셨습니다.");
    }

    public void countCharacter() {
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next();
        int length = 0;
        while (length < str.length()) {
            length++;
        }
        System.out.println("입력한 문자열의 길이: " + length);
    }

    public void countInChar() {
        System.out.print("문자열을 입력하세요: ");
        String inputStr = scanner.next();
        System.out.print("찾을 문자를 입력하세요: ");
        char target = scanner.next().charAt(0);
        int countChar = 0;
        int index = 0;
        while (index < inputStr.length()) {
            if (inputStr.charAt(index) == target) {
                countChar++;
            }
            index++;
        }
        System.out.println("입력한 문자열에서 " + target + "의 개수: " + countChar);
    }
}
