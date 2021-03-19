import java.util.*;

public class Leet40 {
    public static void main(String[] args) {

    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(list, new ArrayList<>(), candidates, target, 0);

        return list;

    }

    static void backtracking(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList(tempList));
        else {
            for(int i= start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i-1]) continue;
                tempList.add(nums[i]);
                backtracking(list, tempList, nums, remain-nums[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
