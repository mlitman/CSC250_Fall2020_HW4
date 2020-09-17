
public class Driver 
{
	public static void main(String[] args)
	{
		String bin = "10101010101111111";
		bin = Driver.padZeroForHex(bin);
		String answer = "";
		for(int i = 0; i < bin.length(); i += 4)
		{
			answer = answer + nibbleToHextet("" + bin.charAt(i) + 
					bin.charAt(i+1) + bin.charAt(i+2) + bin.charAt(i+3));

		}
		System.out.println(answer);

	}
	
	static String nibbleToHextet(String nibble)
	{
		String[] nibbles = {"0000","0001","0010","0011","0100","0101",
				"0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		String map = "0123456789ABCDEF";
		
		for(int i = 0; i < nibbles.length; i++)
		{
			if(nibbles[i].equals(nibble))
			{
				return "" + map.charAt(i);
			}
		}
		return "-1";
	}
	
	static String padZeroForHex(String bin)
	{
		int zerosToAdd = 4 - (bin.length()%4);
		for(int i = 0; i < zerosToAdd; i++)
		{
			bin = "0" + bin;
		}
		return bin;
	}
}
