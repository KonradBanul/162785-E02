import java.io.File;
import java.util.Arrays;

public class Z3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pod("out")));
        System.out.println(Arrays.toString(pod("idea")));
        System.out.println(Arrays.toString(pod("src")));
    }
    public static String[] pod(String p) {
        File file = new File(p);
        return file.list((k, ex)->k.getAbsoluteFile().isDirectory());
    }
}
