
public class qsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9,8,7,6,5,4,3,2,1,0}; 
		quick_sort(a,0,9);
	}
	public static void quick_sort(int s[], int l, int r)  
	{  
	    if (l < r)  
	    {  
	        //Swap(s[l], s[(l + r) / 2]); //���м��������͵�һ�������� �μ�ע1  
	        int i = l, j = r, x = s[l];  
	        while (i < j)  
	        {  
	            while(i < j && s[j] >= x) // ���������ҵ�һ��С��x����  
	                j--;    
	            if(i < j)   
	                s[i++] = s[j];  
	              
	            while(i < j && s[i] < x) // ���������ҵ�һ�����ڵ���x����  
	                i++;    
	            if(i < j)   
	                s[j--] = s[i];  
	        }  
	        s[i] = x;  
	        quick_sort(s, l, i - 1); // �ݹ����   
	        quick_sort(s, i + 1, r);  
	    }  
	}  
}
