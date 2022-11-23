package TxtBox.Presentation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class InputUI {
    Scanner scanner = new Scanner(System.in);
    private HashMap memoDB = new HashMap();

    int bignum = 0;

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

        int txtNumber = 0;
        txtNumber = memoDB.size() + 1;
        for (int i = 1; i <= 100; i++) {
            txtNumber = memoDB.size() + 1;
            if (memoDB.get(i) == null) {
                txtNumber = i;
                break;
            }
        }

        memoDB.put(txtNumber, memoItemList);

        System.out.println(txtNumber + "번 메모 입력이 완료 되었습니다.");

        if (bignum < txtNumber)
        {
            bignum = txtNumber;
        }
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

    public void getAllUI() {
        for (int i = 1; i <= bignum; i++) {
            if (memoDB.get(i) == null) {
                continue;
            }
            System.out.println(i + " : " + memoDB.get(i));
        }
    }

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
        if (pw.equals(memoData.get(1))) {
            memoDB.remove((number));
            System.out.println(number + "번의 메모가 삭제 되었습니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }

    public void replaceUI() {
        System.out.println("수정할 메모의 번호를 입력하세요.");
        System.out.print("번호 : ");
        int number = scanner.nextInt();
        List memoData = (List) memoDB.get(number);
        System.out.println("이름 : " + memoData.get(0));
        System.out.println("제목 : " + memoData.get(2));
        System.out.println("내용 : " + memoData.get(3));
        System.out.println("작성시간 : " + memoData.get(4));

        System.out.print("비밀번호 : ");
        String pw = scanner.next();
        if (pw.equals(memoData.get(1))) {
            final List<String> memoItemList = new ArrayList<>();

            String password = pw;

            System.out.print("이름 : ");
            String name = scanner.nextLine();

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

            System.out.println(now + "에 수정됨.");
            memoItemList.add(now);
            memoDB.replace(number,memoItemList);

            System.out.println(number + "번의 메모가 수정 되었습니다.");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
