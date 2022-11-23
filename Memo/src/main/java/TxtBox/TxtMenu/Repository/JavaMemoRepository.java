package TxtBox.TxtMenu.Repository;

import TxtBox.Presentation.InputUI;
import TxtBox.TxtMenu.MemoList;
import TxtBox.TxtMenu.MemoListItem;

import java.util.HashMap;

public class JavaMemoRepository implements MemoRepository {
    private HashMap memoDB = new HashMap();

    @Override
    public void saveMemo(InputUI memoListItemList) {
        int txtNumber = this.memoDB.size() + 1;

        this.memoDB.put(txtNumber, memoListItemList);
    }

    @Override
    public MemoListItem getMemoListItem(int txtNumber, InputUI memoListItemList) {
        return null;
    }

    @Override
    public MemoList getMemoList(int txtNumber) {
        return null;
    }
}
