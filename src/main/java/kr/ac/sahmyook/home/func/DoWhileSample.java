package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    Scanner scanner = new Scanner(System.in);
    public void addDashToken() {
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (i < str.length() - 1) {
                System.out.print("-");
            }
        }
    }

    public void burgerKingMenu() {
        boolean isRunning = true;
        int totalPrice = 0;

        while (isRunning) {
            System.out.println("*** 버거킹 메뉴 ***");
            System.out.println("1. 와퍼: 5000원");
            System.out.println("2. 치즈와퍼: 6000원");
            System.out.println("3. 트러플와퍼: 8000원");
            System.out.println("4. 콜라: 1500원");
            System.out.println("5. 사이다: 1500원");
            System.out.println("6. 주문 종료");
            System.out.print("메뉴 선택: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("와퍼를 선택하셨습니다. 가격: 5000원");
                    totalPrice += 5000;
                    break;
                case 2:
                    System.out.println("치즈와퍼를 선택하셨습니다. 가격: 6000원");
                    totalPrice += 6000;
                    break;
                case 3:
                    System.out.println("트러플와퍼를 선택하셨습니다. 가격: 8000원");
                    totalPrice += 8000;
                    break;
                case 4:
                    System.out.println("콜라를 선택하셨습니다. 가격: 1500원");
                    totalPrice += 1500;
                    break;
                case 5:
                    System.out.println("사이다를 선택하셨습니다. 가격: 1500원");
                    totalPrice += 1500;
                    break;
                case 6:
                    System.out.println("주문을 종료합니다.");
                    isRunning = false;
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다.");
                    break;
            }

            System.out.println();
        }

        System.out.println("총 가격: " + totalPrice + "원");
    }

    public void isStringAlphabet() {
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        boolean isAllAlphabet = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isAlphabetic(str.charAt(i))) {
                isAllAlphabet = false;
                break;
            }
        }

        if (isAllAlphabet) {
            System.out.println("모든 글자가 영문자입니다.");
        } else {
            System.out.println("영문자가 아닌 글자가 포함되어 있습니다.");
        }
    }
}
