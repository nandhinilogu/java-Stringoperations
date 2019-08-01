//remove whitespaces count number of length in a given string
public class StringLength {

	public static void main(String[] args) {
		String str="Welcome to java programming";//input string
		int count=0;
		String words[]=str.split("\\s");//split white spaces
		for(String word:words){
			count=count+word.length();//count string smallest length
		}
		System.out.println(count);
		
		

	}

}
