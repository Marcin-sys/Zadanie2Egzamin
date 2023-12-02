package mirocha.marcin.zadanie.egzamin;

public class Wezel {

    private Wezel lewaStrona;
    private Wezel prawaStrona;
    private Wezel parent;
    private int value;

    public Wezel(int value) {
        this.value = value;
        this.lewaStrona = null;
        this.prawaStrona = null;
        this.parent = null;
    }


    public Wezel getLewaStrona() {
        return lewaStrona;
    }

    public void setLewaStrona(Wezel lewaStrona) {
        this.lewaStrona = lewaStrona;
    }

    public Wezel getPrawaStrona() {
        return prawaStrona;
    }

    public void setPrawaStrona(Wezel prawaStrona) {
        this.prawaStrona = prawaStrona;
    }

    public Wezel getParent() {
        return parent;
    }

    public void setParent(Wezel parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
