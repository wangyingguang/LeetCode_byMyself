package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class No102_BinaryTreeLevelOrderTraversal {
	List<List<Integer>> ret = new ArrayList<List<Integer>>();
	public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return ret;
        Queue<TreeNode> q0 = new LinkedList<TreeNode>();
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        q0.add(root);
        TreeNode tmp;
        while(q0.isEmpty() && q1.isEmpty()){
        	tmp = q0.poll();
        	
        }
        return null;
    }
}
