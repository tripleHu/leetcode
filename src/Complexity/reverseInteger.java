package Complexity;

public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1000000003));
	}
	public static int reverse(int x) {
        StringBuilder stringBuilder;
        if(x < 0){
        	x = (-1) * x;
        	String temp = String.valueOf(x);
        	stringBuilder = new StringBuilder(temp).reverse();
        	stringBuilder.insert(0, '-');
        }
        else{
        	String temp = String.valueOf(x);
        	stringBuilder = new StringBuilder(temp).reverse();
        }
        try{
        	System.out.println(stringBuilder.toString());
        	Integer res = Integer.valueOf(stringBuilder.toString());
        	return res.intValue();
        }catch(Exception e){
        	return 0;
        }
        
       
    }
}
