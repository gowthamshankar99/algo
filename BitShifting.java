import java.math.BigInteger;

public class BitShifting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = convertToBinary(3);
		String num2 = convertToBinary(2);
    
		BigInteger bNum1 = new BigInteger(num1, 2);
		BigInteger bNum2 = new BigInteger(num2, 2);
		
		BigInteger zeros = new BigInteger("0", 2);
		
		BigInteger carry, answer;
		
		while(bNum2.compareTo(zeros) != 0) {
			
			// xor adds the values 
			answer = bNum1.xor(bNum2);
			
			// and operator keeps the carry value
			// <<  shift left shifts one bit to the left side
			carry = bNum1.and(bNum2).shiftLeft(1);
			bNum1 = answer;
			bNum2 = carry;
		}
		
		System.out.println(bNum1);
	}
	
	
	
	public static String convertToBinary(int num) {
		
		int i = 0;
		int maxValue = 0;
		// find Maximum number
		while(Math.pow(2, i) <= num) {
			maxValue = i;
			i++;
    }
		
		// result stringBuilder
		StringBuilder sb = new StringBuilder();
		
		for(int j=maxValue;j>=0;j--) {
			if(Math.pow(2, j) <= num) {
				sb.append("1");
				num = (int) (num - Math.pow(2, j));
			}  else {
				sb.append("0");
			}
		}
	
		return sb.length() < 2 ? "0"+sb.toString() : sb.toString();
	}

}
