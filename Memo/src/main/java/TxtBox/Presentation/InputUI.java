package TxtBox.Presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputUI {

    private HashMap memoDB = new HashMap();

    public void inputUI() {
        final List<String> memoItemList = new ArrayList<>();
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

        memoItemList.add(name);
        memoItemList.add(password);
        memoItemList.add(title);
        memoItemList.add(contents);

        int txtNumber = memoDB.size() + 1;
        memoDB.put(txtNumber, memoItemList);

        System.out.println(txtNumber);
        System.out.println("메모 입력이 완료 되었습니다.");
    }

    public void getUI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출력할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
        System.out.println("이름 : " + memoDB.get(number));
        System.out.println("제목 : " + memoDB.get(number));
    }
}
