//Toggle the string
public class ToggleString {
public static void main(String[] args) {
	String str="WeLcOmE";//input String
	String s1="";
	int count;
	for(int i=0;i<str.length();i++){
	if(Character.isLowerCase(str.charAt(i))){//check the character
	s1=s1+Character.toUpperCase(str.charAt(i));//toggle to uppercase
		}
	else{
	s1=s1+Character.toLowerCase(str.charAt(i));	//toggle to lowercase
	}
}
	System.out.println(s1);
}
}
