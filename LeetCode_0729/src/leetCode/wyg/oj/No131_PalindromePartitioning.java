package leetCode.wyg.oj;

import java.util.ArrayList;
import java.util.List;

public class No131_PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new No131_PalindromePartitioning().partition("akjfkaljfkdjfkf").toString());
	}
	private boolean isPalindrome(String s){
		if(s==null || s.length() == 0)
			return false;
		if(s.length() == 1){
			return true;
		}
		int begin = 0;
		int end = s.length()-1;
		while(begin < end){
			if(s.charAt(begin) != s.charAt(end)){
				return false;
			}else{
				begin++;
				end--;
			}
		}
		return true;
	}
	public List<List<String>> partition(String s) {
		List<List<String>> list = new ArrayList<List<String>>();
	    ArrayList<String> tmp = new ArrayList<String>();
	    
	    getRs(list, tmp, s);
	    
	    return list;
    }
	public void getRs(List<List<String>> list,ArrayList<String> tmp,String s)
	  {
	    if(s.length()==0||s==null)
	    {
	      list.add(new ArrayList<String>(tmp));
	      return;
	    }
	    else
	    {
	      for(int i = 1;i<=s.length();i++)
	      {
	        if(isPalindrome(s.substring(0, i)))
	        {
	          tmp.add(s.substring(0, i));
	          getRs(list, tmp, s.substring(i));
	          tmp.remove(tmp.size()-1);
	        }
	      }
	    }
	  }
}
