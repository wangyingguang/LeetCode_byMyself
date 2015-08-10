package leetCode.wyg.oj;

public class No155_MinStack {
	int [] arr;
	int min;
	int index;
	
	public No155_MinStack() {
		arr = new int[100000];
		index = -1;
		min = Integer.MAX_VALUE;
	}
	public void push(int x) {
        index++;
        arr[index] = x;
        min = min < x?min:x;
    }

    public void pop() {
        index--;
    }

    public int top() {
        return arr[index];
    }

    public int getMin() {
        return min;
    }
}
