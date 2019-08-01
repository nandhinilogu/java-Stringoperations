//Display the String from Dictionary Order

public class DictionaryOrder {

	public static void main(String[] args) {
		String s1="Welcome to java programming";//input string
		String str=s1.toLowerCase();//input string convert to lowercase
	    String words[]=str.split("\\s");//split white spaces
		for(int i=0;i<words.length-1;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].compareTo(words[j])>0){//compare the strings
					String temp=words[i];//string swap
					words[i]=words[j];
					words[j]=temp;
				}
			}
		}
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);//Display Dictionary order
		}
	   
	}

}
