package TxtBox.TxtMenu.Repository;

import TxtBox.Presentation.InputUI;
import TxtBox.TxtMenu.MemoList;
import TxtBox.TxtMenu.MemoListItem;

public interface MemoRepository {
    void saveMemo(InputUI memoListItemList);
    MemoListItem getMemoListItem(int txtNumber, InputUI memoListItemList);
    MemoList getMemoList(int txtNumber);

}
