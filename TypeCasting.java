public class TypeCasting {
    public static void main(String[] args) {
        // int, float, double, char, String,long,boolean
        int integer = 2147483647;
        float floatInt = 1.3444444444444444444444444444444444444444444444f;

        // string to integer
        System.out.println(Integer.parseInt("123"));

        // int to string
        System.out.println(Integer.toString(1234));

        // float to string
        System.out.println(Float.toString(4.32f));

        // string to float
        String sInt = "1234.45";
        System.out.println(Float.parseFloat(sInt));

        // float to int
        System.out.println((int)floatInt);

        // int to float
        System.out.println((float)integer);

        // stringBuilder to string to int
        StringBuilder sb = new StringBuilder("12345");
        System.out.println(Integer.parseInt(sb.toString()));
        
    }
}
