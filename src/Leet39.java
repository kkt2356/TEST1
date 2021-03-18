import java.util.*;

public class Leet39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        System.out.println(combinationSum(candidates, 7));
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    static void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] nums, int remain, int start) {
        if(remain < 0 ) return;
        else if(remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for(int i = start; i < nums.length; i++ ) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() -1);
            }
        }
    }
}
