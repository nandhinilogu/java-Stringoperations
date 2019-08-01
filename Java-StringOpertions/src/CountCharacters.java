//UpperCase and Lowercase equal or not
public class CountCharacters {

	public static void main(String[] args) {
		String str="ElEpHaNt";//Enter the String
		int count1=0,count2=0;
		for(int i=0;i<str.length();i++){
			if(Character.isLowerCase(str.charAt(i))){//Check the Lowercase or Uppercase
				count1++;//Lowercount increment
			}
			else{
				count2++;//Uppercount increment
			}
		}
		if(count1==count2){//Check the uppercount and lowercount is equal or not
			System.out.println("Equally Distributed");
		}
		else{
			System.out.println("Not Equally Distributed");
		}

	}

}
