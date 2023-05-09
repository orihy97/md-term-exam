package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    public void maxNumber() {
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        System.out.println("입력한 숫자 중 가장 큰 수는 " + max + "입니다.");
    }

    public void minNumber() {
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        int min = num1;
        if(num2 < min) {
            min = num2;
        }

        System.out.println("입력한 숫자 중 가장 작은 수는 " + min + "입니다.");
    }

    public void threeMaxMin() {System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("세 번째 숫자를 입력하세요 : ");
        int num3 = sc.nextInt();

        int max = num1;
        int min = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        if(num2 < min) {
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }

        System.out.println("입력한 숫자 중 가장 큰 수는 " + max + "입니다.");
        System.out.println("입력한 숫자 중 가장 작은 수는 " + min + "입니다.");
    }

    public void checkEven() {
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + "은(는) 짝수입니다.");
        } else {
            System.out.println(num + "은(는) 홀수입니다.");
        }
    }

    public void isPassFail() {
        Scanner scanner= new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = scanner.nextInt();
        int sum = kor + eng + math;
        double average = sum / 3.0;

        if (average >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
            System.out.println("합격입니다!");
        } else {
            if (average < 60) {
                System.out.println("평균점수 미달로 불합격입니다.");
            }
            if (kor < 40) {
                System.out.println("국어 과목의 점수 미달로 불합격입니다.");
            }
            if (eng < 40) {
                System.out.println("영어 과목의 점수 미달로 불합격입니다.");
            }
            if (math < 40) {
                System.out.println("수학 과목의 점수 미달로 불합격입니다.");
            }
        }
    }

    public void scoreGrade() {
        System.out.print("점수를 입력하세요 : ");
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("A학점입니다.");
        } else if(score >= 80) {
            System.out.println("B학점입니다.");
        } else if(score >= 70) {
            System.out.println("C학점입니다.");
        } else if(score >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }
    }

    public void checkPlusMinusZero() {
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println(num + "은(는) 양수입니다.");
        } else if(num < 0) {
            System.out.println(num + "은(는) 음수입니다.");
        } else {
            System.out.println(num + "은(는) 0입니다.");
        }
    }

    public void whatCharacter() {
        System.out.print("알파벳을 입력하세요 : ");
        char ch = sc.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "는(은) 소문자입니다.");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "는(은) 대문자입니다.");
        } else
            System.out.println(ch + "는(은) 기타문자 입니다.");
    }
}
