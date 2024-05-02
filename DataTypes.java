// import java.lang.reflect.Method;

public class DataTypes {
    public static void main(String[] args) {
        // int, float, double, char, String,long,boolean
        int integer = 2147483647;
        long longInt =  214748364834L;
        float floatInt = 1.3444444444444444444444444444444444444444444444f;
        double doubleInt = 21474836483.3556;
        boolean bool = true;
        String s = "Hello";
        StringBuilder sb = new StringBuilder("Java ");
        System.out.println(sb);
        sb.append(s);
        System.out.println(sb);
        sb.insert(1,"a");
        System.out.println(sb);
        sb.replace(1,4,"ee");
        System.out.println(sb);
        sb.reverse();
        // System.out.println(sb.length());
        // for (Method method : sb.getClass().getMethods()) {
        //     System.out.println(method.getName());
        //   }
        
        System.out.println(sb);
        System.out.println(integer);
        System.out.println(longInt);
        System.out.println(floatInt);
        System.out.println(doubleInt);
        System.out.println(bool);
        System.out.println(s);
        System.out.println(s.charAt(2));
    }
}
