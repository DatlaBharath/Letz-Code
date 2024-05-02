import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            List<Integer> ele = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j == 0){
                    ele.add(1);
                }
                else if(j == i){
                    ele.add(1);
                }
                else{
                    ele.add(sol.get(i-1).get(j-1) + sol.get(i-1).get(j));
                }
            }
            sol.add(ele);
        }
        return sol;
    }
    public static void main(String[] args) {
        List<List<Integer>> sol = generate(5);
        System.out.println(sol);
    }
}
