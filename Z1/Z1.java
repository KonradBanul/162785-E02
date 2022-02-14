import java.time.LocalTime;

public class Z1 {
    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        a[0] = 4;
        a[1] = 3;
        a[2] = 3;
        System.out.println(ArrayUtil.isSorted(a));
        LocalTime[] b = new LocalTime[3];
        b[0] = LocalTime.of(3,5,12);
        b[1] = LocalTime.of(3,5,12);
        b[2] = LocalTime.of(3,5,12);
        System.out.println(ArrayUtil.isSorted(b));
        String[] c = new String[3];
        c[0] = "aaa";
        c[1] = "aab";
        c[2] = "aba";
        System.out.println(ArrayUtil.isSorted(c));
    }
}
class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(T[] tab) {
        for(int i=0; i< tab.length-1; i++) {
            if(tab[i].compareTo(tab[i+1])>0) {
                return false;
            }
        }
        return true;
    }
}