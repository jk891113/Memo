package TxtBox.Presentation;

import TxtBox.TxtMenu.MemoList;

import java.util.Scanner;

public class InputInterface {
    public void inputInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------메모 입력------------------");

        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("비밀번호 : ");
        String password = scanner.nextLine();

        System.out.print("제목 : ");
        String title = scanner.nextLine();

        System.out.println("내용 : ");
        String contents = scanner.nextLine();

        MemoList memoList = new MemoList();
        memoList.toString();
        System.out.println("메모 입력이 완료 되었습니다.");

    }
}
