import java.util.HashMap;

public class TwoSumHash {
    public static void main(String[] args) {
        int[] twoSum = {2,11,111,13,7};
        int target = 13;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < twoSum.length; i++){
            int complemento = target - twoSum[i];

            if (map.containsKey(complemento)){
                System.out.println(i + " : " + map.get(complemento));
            }

            map.put(twoSum[i],i);
        }
    }
}
