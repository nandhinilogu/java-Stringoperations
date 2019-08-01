//merge Two strings
public class MergeString {

	public static void main(String[] args) {
		String s1="ABC";//input String1
		String s2="DEF";//input String2
		String s="";
		for(int i=0;i<s1.length();i++){
			s=s+s1.charAt(i)+s2.charAt(i);//merge Strings
		}
        System.out.println(s);
	}

}
