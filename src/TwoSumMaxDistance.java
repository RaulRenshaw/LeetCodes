public class TwoSumMaxDistance {
    public static void main(String[] args) {
        int[] twoSum = {2,1,7,0,4,1,11,13,7};
        int target = 9;
        int maxDistance = 2;

        for (int i = 0; i < twoSum.length; i++){
            //o int j = Math.max(0, i - maxDistance pode ser substituido por i + 1;
            //Dependendo so contexto i+1 compara valores a frente somente
            //Math.max compara valores bidirecionais ou de proximidade
            //Uso depende da aplicação
            for (int j = Math.max(0, i - maxDistance); j <= Math.min(i + maxDistance, twoSum.length - 1); j++){
                if (twoSum[i] + twoSum[j] == target){
                    System.out.println(i + " : " + j);
                }
            }
        }
    }
}
