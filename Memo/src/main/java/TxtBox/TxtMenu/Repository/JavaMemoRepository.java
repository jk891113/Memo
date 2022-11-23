package TxtBox.TxtMenu.Repository;

import TxtBox.TxtMenu.MemoList;
import TxtBox.TxtMenu.MemoListItem;

import java.util.HashMap;

public class JavaMemoRepository implements MemoRepository {
    private HashMap memoDB = new HashMap();

    @Override
    public void saveMemo(MemoList memoList) {
        int txtNumber = this.memoDB.size() + 1;
        this.memoDB.put(txtNumber, memoList);
    }

    @Override
    public MemoListItem getMemoListItem(int txtNumber, String inputName, String inputPassword, String inputTitle, String inputContents) {
        return null;
    }

    @Override
    public MemoList getMemoList(int txtNumber) {
        return null;
    }
}
