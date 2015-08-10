package leetCode.wyg.oj;

public class No149_MaxPointsOnLine {
	public int maxPoints(Point[] points) {
        if(points == null) return 0;
        if(points.length <= 2) return points.length;
        int max = 2;
        int count = 1;
        int len = points.length;
        int dx, dy;
        for(int i = 0; i < len - 2; i++ ){
        	
        	for(int j = i+1; j < len - 1; j++){
        		if(points[j].x == points[i].x && points[j].y == points[i].y){
        			count++;
        			j++;
        			continue;
        		}
        		dx = points[j].x-points[i].x;
        		dy = points[j].y-points[i].y;
        		count++;
        		for(int k = j+1; k < len; k++){
        			if(dx == 0 && dy != 0){
        				if(points[k].x == points[j].x)
        					count++;
        			}
        			else if(dy == 0 && dx != 0){
        				if(points[k].y == points[j].y)
        					count++;
        			}else if(dx == 0 && dy == 0){
        				count++;
    					dx = points[k].x-points[j].x;
    	        		dy = points[k].y-points[j].y;
        			}else{
        				if((points[k].y-points[j].y)*dx == dy*(points[k].x-points[j].x)){
        					count++;
        				}
        			}
        		}
        		max = max>count?max:count;
            	count = 1;
        	}
        	
        }
        return max;
    }
}


class Point {
	 int x;
	 int y;
	 Point() { x = 0; y = 0; }
	 Point(int a, int b) { x = a; y = b; }
}