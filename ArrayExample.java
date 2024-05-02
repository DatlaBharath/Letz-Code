import java.lang.reflect.Method;
import java.util.ArrayList;
public class ArrayExample {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4};
    ArrayList<Integer> colArr = new ArrayList<Integer>();
        for (int i : intArr) {
            System.out.println(i);
        }
        for (Method m : colArr.getClass().getMethods()) {
            System.out.println(m.getName());
        }
    }
    
}
