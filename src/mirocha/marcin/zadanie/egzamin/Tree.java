package mirocha.marcin.zadanie.egzamin;

import java.util.HashMap;
import java.util.TreeSet;

/*
* Stwórz drzewo binarne liczb w którym liczby większe są po prawej
stronie, a mniejsze po lewej. Należy stworzyć klasę Tree która posiada
referencję do węzła będącego korzeniem. Do reprezentacji węzła stwórz
klasę Node. Klasa Tree powinna mieć metody add(int value), która dodaje
element do drzewa, contains(int value), która sprawdza czy w drzewie
znajduje się dana wartość, max(), która zwraca największą liczbę w
drzewie oraz min(), która zwraca najmniejszą liczbę w drzewie. Klasa
Node może zawierać dowolne metody potrzebne do rozwiązania, można
tworzyć dowolną ilość innych klas w ramach potrzeb.

* */
public class Tree {

    private Wezel root;

    public boolean add( int value) {
        Wezel parent = null;
        Wezel obecny = getRoot();

        while (obecny != null) {
            parent = obecny;
        }

        Wezel temp = new Wezel(value);
        if (parent == null) {
            setRoot(temp);
        } else if (value > parent.getValue()) {
            parent.setPrawaStrona(temp);
            temp.setParent(parent);
        } else if (value < parent.getValue()) {
            parent.setLewaStrona(temp);
            temp.setParent(parent);
        }
        return true;

    }

    public void contains(int value){

    }

    public int getMax(){
        Wezel obecny = this.root;
        while (obecny.getPrawaStrona() != null){
            obecny = obecny.getPrawaStrona();
        }
        return obecny.getValue();
    }

    public int getMin(){
        Wezel obecny = this.root;
        while (obecny.getLewaStrona() != null){
            obecny = obecny.getLewaStrona();
        }
        return obecny.getValue();
    }

    public Wezel getRoot(){
        return root;
    }

    public  void setRoot(Wezel root){
        this.root = root;
    }
}
