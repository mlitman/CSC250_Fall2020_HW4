
public class Driver 
{
	public static void main(String[] args)
	{
		String bin = "10101010101111111";
		int dec = Driver.binaryToDecimal(bin);
		String hex = Driver.decimalToHex(dec);
		System.out.println(hex);
	}
	static String decimalToHex(int dec)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(dec > 0)
		{
			answer = map.charAt(dec%16) + answer;
			dec /= 16;
		}
		return answer;
	}
	
	static int binaryToDecimal(String bin)
	{
		int place = 1;
		int sum = 0;
		for(int i = bin.length()-1; i >= 0; i--)
		{
			if(bin.charAt(i) == '1')
			{
				sum += place;
			}
			place *= 2;
		}
		return sum;
			
	}
}
