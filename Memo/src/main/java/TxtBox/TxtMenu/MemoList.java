package TxtBox.TxtMenu;

import java.util.ArrayList;
import java.util.List;

public class MemoList {
    private final List<MemoListItem> memoListItemList = new ArrayList<>();

    public MemoList(MemoListItem name, MemoListItem password, MemoListItem title, MemoListItem contents) {
        memoListItemList.add(name);
        memoListItemList.add(password);
        memoListItemList.add(title);
        memoListItemList.add(contents);
    }

    public List<MemoListItem> getMemoListItemList() {
        return memoListItemList;
    }
}
