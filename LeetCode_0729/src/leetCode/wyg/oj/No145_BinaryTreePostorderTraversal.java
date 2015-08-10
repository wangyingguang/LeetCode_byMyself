package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.List;

public class No145_BinaryTreePostorderTraversal {
	List<Integer> ret = new ArrayList<Integer>();
	public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return ret;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ret.add(root.val);
        return ret;
    }
}
