package TxtBox.Presentation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class InputUI {
    Scanner scanner = new Scanner(System.in);
    private HashMap memoDB = new HashMap();

    public void inputUI() {
        final List<String> memoItemList = new ArrayList<>();

        System.out.println("------------------메모 입력------------------");

        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("비밀번호 : ");
        String password = scanner.nextLine();

        System.out.print("제목 : ");
        String title = scanner.nextLine();

        System.out.print("내용 : ");
        String contents = scanner.nextLine();

        memoItemList.add(name);
        memoItemList.add(password);
        memoItemList.add(title);
        memoItemList.add(contents);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd h:mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());

        System.out.println(now + "에 작성됨.");
        memoItemList.add(now);

        int txtNumber = memoDB.size() + 1;
        memoDB.put(txtNumber, memoItemList);

        System.out.println(txtNumber);
        System.out.println("메모 입력이 완료 되었습니다.");
    }

    public void getUI() {
        System.out.println("출력할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
        List memoData = (List) memoDB.get(number);
        System.out.println("이름 : " + memoData.get(0));
        System.out.println("제목 : " + memoData.get(2));
        System.out.println("내용 : " + memoData.get(3));
        System.out.println("작성시간 : " + memoData.get(4));
    }

//    public void getAllUI() {
//        for (int i = 1; i < memoDB.size(); i++) {
//            System.out.println(i + " : " + memoDB.get(i));
//        }
//    }

    public void deleteUI() {
        System.out.println("삭제할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
        List memoData = (List) memoDB.get(number);
        System.out.println("이름 : " + memoData.get(0));
        System.out.println("제목 : " + memoData.get(2));
        System.out.println("내용 : " + memoData.get(3));
        System.out.println("작성시간 : " + memoData.get(4));

        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        if (pw == memoData.get(1)) {
            memoDB.remove((number));
            System.out.println(number + "번의 메모가 삭제 되었습니다.");
        }
        System.out.println("비밀번호가 일치하지 않습니다.");

//        for (int i = 1; i < memoDB.size(); i++) {
//            if (memoDB.containsKey(i)) {
//                continue;
//            } else {
//
//            }
//        }
//            System.out.println(i + " : " + memoDB.get(i));


    }
}
