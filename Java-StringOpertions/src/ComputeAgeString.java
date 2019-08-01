
public class ComputeAgeString {

	public static void main(String[] args) {
		String str="ABAB";
		int length=str.length();
		char c[]=str.toCharArray();
		int character_index=c.length-1;
       int age=length+character_index;
       System.out.println(age);
	}

}
