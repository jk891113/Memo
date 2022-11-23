package TxtBox.Presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUI {
    private final List<String> memoListItemList = new ArrayList<>();

    public void inputUI() {
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

        memoListItemList.add(name);
        memoListItemList.add(password);
        memoListItemList.add(title);
        memoListItemList.add(contents);

        System.out.println("메모 입력이 완료 되었습니다.");
        System.out.println(memoListItemList);

    }
    public void getInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
    }
}
