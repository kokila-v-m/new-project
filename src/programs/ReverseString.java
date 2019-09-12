package programs;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string or sentence");
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		String rs="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int j=i-1;
			while(j>=k)
			{
				rs+=ch[j];
				j--;
			}
			if(i<ch.length)
				rs+=ch[i];
		}
		System.out.println(rs);  
	}
}
