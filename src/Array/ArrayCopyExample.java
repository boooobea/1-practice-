package Array;
import java.util.Arrays;
public class ArrayCopyExample {
	public static void main(String[] args) {
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
//배열의복사 System.arraycopy - Arrays.copyOf		
		
//System.arraycopy(originArr, offset, targerArr, offset, length)
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		System.out.println(Arrays.toString(newStrArray));
		
//		---
		
//Arrays.copyOf
		newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		System.out.println(Arrays.toString(newStrArray));
		
		
	}//main
}//end class
