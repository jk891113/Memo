import TxtBox.Presentation.*;
import TxtBox.TxtMenu.MemoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaseInterface UI = new BaseInterface();
        UI.run(); //웹브라우저 예시

        Scanner scanner = new Scanner(System.in);

        while(true) {
            int chooseMenu = scanner.nextInt();
            if (chooseMenu == 1) {
                InputInterface inputUI = new InputInterface();
                inputUI.inputInterface();

            } else if (chooseMenu == 2) {
                GetInterface getUI = new GetInterface();
                getUI.getInterface();

            } else if (chooseMenu == 3) {
                ReviseInterface editUI = new ReviseInterface();
                editUI.reviseInterface();

            } else if (chooseMenu == 4) {
                DeleteInterface deleteUI = new DeleteInterface();
                deleteUI.deleteInterface();

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
