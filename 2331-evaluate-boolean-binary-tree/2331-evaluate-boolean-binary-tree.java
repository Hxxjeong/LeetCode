/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {
    public boolean evaluateTree(TreeNode root) {
        // 리프: 0/1 = f/t
        // 리프X: 2/3 = or/and
        
        boolean answer;
        
        if(root.val == 0) return false;
        if(root.val == 1) return true;
        
        // 후위 순회
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        
        if(root.val == 2) answer = left || right;
        else answer = left && right;
        
        return answer;
    }
}