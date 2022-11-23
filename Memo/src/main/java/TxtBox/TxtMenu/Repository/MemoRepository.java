package TxtBox.TxtMenu.Repository;

import TxtBox.TxtMenu.MemoList;
import TxtBox.TxtMenu.MemoListItem;

public interface MemoRepository {
    void saveMemo(MemoList memoList);
    MemoListItem getMemoListItem(int txtNumber, String inputName, String inputPassword, String inputTitle, String inputContents);
    MemoList getMemoList(int txtNumber);

}
