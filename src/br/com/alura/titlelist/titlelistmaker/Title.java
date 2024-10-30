package br.com.alura.titlelist.titlelistmaker;

public class Title {
    private final String titleName;

    public Title(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }

    @Override
    public String toString() {
        return getTitleName();
    }
}
