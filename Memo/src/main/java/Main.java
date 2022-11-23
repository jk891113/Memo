import TxtBox.Presentation.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseUI UI = new BaseUI();
        UI.run(); //웹브라우저 예시

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int chooseMenu = scanner.nextInt();
            if (chooseMenu == 1) {
                InputUI inputUI = new InputUI();
                inputUI.inputUI();

            } else if (chooseMenu == 2) {
                GetUI getUI = new GetUI();

            } else if (chooseMenu == 3) {

            } else if (chooseMenu == 4) {

            } else if (chooseMenu == 5) {
                System.out.println("메모장을 종료합니다.");
                System.exit(0);

            } else {
                System.out.println("잘못된 명령어 입니다.");
                System.exit(0);
            }
        }
    }
}
