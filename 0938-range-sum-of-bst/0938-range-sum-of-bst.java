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
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 이진 트리에서 low과 high 사이에 있는 값 더하기        
        int answer = 0;
        
        if (root == null) // leaf 노드의 자식은 없으므로 root가 null이 되는 경우 처리
            return 0;
        
        if (root.val >= low && root.val <= high) // root 값이 low과 high 사이에 있는 경우
            answer += root.val;
        
        if (root.val > low) // root가 low보다 큰 경우
            answer += rangeSumBST(root.left, low, high); // 왼쪽 서브트리 추가 탐색
        
        if (root.val < high)    // root가 high보다 작은 경우
            answer += rangeSumBST(root.right, low, high);   // 오른쪽 서브트리 추가 탐색
        
        return answer;
    }
}