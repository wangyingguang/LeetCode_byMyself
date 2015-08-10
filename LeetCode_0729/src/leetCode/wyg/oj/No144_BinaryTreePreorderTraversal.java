package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.List;

public class No144_BinaryTreePreorderTraversal {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(100);
		root.left = new TreeNode(99);
		root.left.left = new TreeNode(9);
		root.right = new TreeNode(98);
		List<Integer> list = new No144_BinaryTreePreorderTraversal().preorderTraversal(root);
		for(Integer a :list){
			System.out.println(a+" ");
		}
	}
	List<Integer> list = new ArrayList<Integer>();
	public  List<Integer> preorderTraversal(TreeNode root) {
        //List<Integer> list = new ArrayList<Integer>();
        if(root == null){
        	return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}

