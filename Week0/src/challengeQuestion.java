public class challengeQuestion {
    public static int countElements(int[] nums){
        int maxCounter = 0;
        int minCounter = 0;
        int result = 0;
        int min = nums[0];
        int max = nums[0];


        for (int i = 0; i < nums.length-1; i++) {
            if(min > nums[i+1]) {
                min = nums[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == min){
                minCounter++;
            }
        }

        for (int i = 0; i < nums.length-1; i++) {
            if(max < nums[i+1]) {
                max = nums[i + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == max){
                maxCounter++;
            }
        }
        if((minCounter == maxCounter) && minCounter == nums.length){
            result = 0;
        } else{
            result = nums.length - minCounter - maxCounter;
        }
        return result;
    }

//    public static int countWords(String[] words1, String[] words2) {
//        int counter = 0;
//        int repCounter = 0;
//        String repToken1 = null;
//        String repToken2 = null;
//
//        int numRepToken1 = 0;
//        int numRepToken2 = 0;
//
//        for(int i=0; i<words1.length; i++){
//            for(int k=0;k<words2.length;k++){
//                if (words1[i].equals(words2[k])) counter++;
//            }
//        }
//        for (int i = 0; i < words1.length; i++) {
//            repToken1 = words1[i];
//            for (int j = 0; j < words2.length; j++) {
//                repToken2 = words2[j];
//                if(repToken2.equals(repToken1))
//            }
//        }
//
//        return counter;
//    }

    public static void main(String[] args) {
        int[] arr1 = {-475,-705,185,-334,131,-951,459,185,-825,185,185,185,156,185,185};
        int result1 = countElements(arr1);
        System.out.println(result1);

        int[] arr2 = {1,1,1,1};
        int result2 = countElements(arr2);
        System.out.println(result2);

//        String[] str1 = {"leetcode","is","amazing","as","is","as","is"};
//        String[] str2 = {"amazing","leetcode","is"};
//        int result3 = countWords(str1,str2);
//        System.out.println(result3);
    }
}
