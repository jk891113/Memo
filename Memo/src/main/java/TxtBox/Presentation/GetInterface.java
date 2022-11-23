package TxtBox.Presentation;

import java.util.Scanner;

public class GetInterface {
    Scanner scanner = new Scanner(System.in);
    public void getInterface() {
        System.out.println("출력할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
    }
}
