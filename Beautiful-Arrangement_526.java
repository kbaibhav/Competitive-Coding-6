// Time Complexity :O(n!) where n is the input
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Recurse on n, at each level you chose one and recurse on other left values from 1 to n
// Before doing recursion check the 2 conditions and while backtracking remove the current integer added.

class Solution {

    int count = 0;
    public int countArrangement(int n) {
        dfs(n, new HashSet<Integer>(), 1);
        return count;

    }


    private void dfs(int n, Set<Integer> path) {

        //base
        if (path.size() == n) {
            count++;
            return;
        }


        for(int i=1; i <=n ;i++)  {
            if (!path.contains(i) &&
                (i%(path.size()+1) == 0 || (path.size()+1)%i == 0)) {

                path.add(i);
                dfs(n, path);
                path.remove(i);
            }

        }
    }
}
