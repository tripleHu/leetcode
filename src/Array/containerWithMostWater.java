package Array;

public class containerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2}; 
		System.out.println(MaxArea(a));

	}
	public static int MaxArea(int [] height){
		int MaxArea = 0;
		//暴力求解，时间复杂度为O(n^2)
		/*for(int i = 0; i < height.length; i++){
			for(int j =i; j < height.length; j++){
				int AreaHeight = height[i] < height[j] ? height[i] : height[j];
				int Area = (j - i) * AreaHeight;
				MaxArea = Area > MaxArea ? Area : MaxArea;
			}
		}*/
		//贪心算法
		int l = 0; int r = height.length -1;
		while(l < r){
			int AreaHeight = height[l] < height[r] ? height[l] : height[r];
			int Area = (r - l) * AreaHeight;
			MaxArea = Area > MaxArea ? Area : MaxArea;
			if(height[l] > height[r]) r--;
			else l++;
		}
		return MaxArea;
	}
}
