import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Z2 {
    public static <E> void print(Iterable<E> element) {
        for(E e : element) {
            System.out.print("["+ e +"],");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(2);
        a.add(1);
        print(a);
        LinkedList<String> b = new LinkedList<>();
        b.add("abc");
        b.add("bc");
        b.add("ab");
        print(b);
        PriorityQueue<Integer> c = new PriorityQueue<>();
        c.add(6);
        c.add(3);
        c.add(5);
        print(c);
    }
}
