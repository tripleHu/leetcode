package mathematics;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(0));
	}
	public static boolean isPalindrome(int x) {
        if(x < 0)return false;
        else{
        	StringBuffer sb = new StringBuffer(String.valueOf(x));
        	StringBuffer sb1 = new StringBuffer(String.valueOf(x)).reverse();
        	return sb.equals(sb1);
        }
    }
}
