package br.com.alura.titlelist.titlelistmaker;

public class Title implements Comparable<Title>{
    private final String titleName;

    public Title(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }

    @Override
    public int compareTo(Title other) {
        return this.titleName.compareTo(other.titleName);
    }

    @Override
    public String toString() {
        return getTitleName();
    }
}
