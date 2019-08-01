//Compare Two strings Equal or not
public class StringReverse {

	public static void main(String[] args) {
		String s="Hari";//input from string1
		String s1="Wipro";//input from string2
		String str=s.toLowerCase();
		StringBuilder sb= new StringBuilder();
		String ss=sb.reverse().toString();//Reverse the First String
        if(ss.equals(s1)){//Check the Two strings are equal or Not
        	System.out.println("Strings are equal");
        }
        else{
        	System.out.println("Reverse Not Supported");
        }
	}

}
