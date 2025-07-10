public class TwoSum {
    public static void main(String[] args) {
        int[] twoSum = {2,1,0,0,4,1,11,13,7};
        int target = 15;

        for (int i = 0; i < twoSum.length; i++){
            for (int j = i + 1; j < twoSum.length; j++){
                if (twoSum[i] + twoSum[j] == target){
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}
