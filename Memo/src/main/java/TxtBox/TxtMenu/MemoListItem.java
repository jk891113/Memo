package TxtBox.TxtMenu;

public class MemoListItem {
    private String name;
    private String password;
    private String title;
    private String contents;

    public MemoListItem(String name, String password, String title, String contents) {
        this.name = name;
        this.password = password;
        this.title = title;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }
    public String getTitle() {
        return title;
    }
    public String getContents() {
        return contents;
    }
//    public String getMemo() {return name, title, contents;}
}

