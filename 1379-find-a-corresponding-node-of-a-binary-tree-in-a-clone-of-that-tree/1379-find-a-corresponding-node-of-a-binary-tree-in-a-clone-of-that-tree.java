/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode answer = new TreeNode();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(cloned);
        
        while(!queue.isEmpty()) {
            answer = queue.poll();
            
            // 노드 값 비교
            if (answer.val == target.val) break;
            
            if(answer.left != null) queue.offer(answer.left);
            if(answer.right != null) queue.offer(answer.right);
        }

        return answer;
    }
}