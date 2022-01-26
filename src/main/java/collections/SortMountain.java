package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountain {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class NameCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain>{
        public int compare(Mountain one, Mountain two){
            return (two.height - one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountain().go();
    }

    public void go(){
        mtn.add(new Mountain("A", 1));
        mtn.add(new Mountain("B", 2));
        mtn.add(new Mountain("C", 3));
        mtn.add(new Mountain("D", 4));
        System.out.println("In order by adding:\n" + mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("By name:\n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By height:\n" + mtn);
    }
}

class Mountain {
    String name;
    int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString(){
        return name + " " + height;
    }
}
