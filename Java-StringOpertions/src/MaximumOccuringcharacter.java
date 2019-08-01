//maximum and minimum occuring character
public class MaximumOccuringcharacter {

	public static void main(String[] args) {
		String str="Wipro Technologies";//input String
		String s=str.replaceAll(" ", "").toLowerCase();
		int count[]=new int[256];//ASCII SIZE for 256
        int length=s.length();
        for(int i=0;i<length;i++)
        	count[s.charAt(i)]++;
        int max=0,min=1000;
        char max_occur_character=' ',min_occur_character=' ';
        for(int i=0;i<length;i++){
        	if(max<count[s.charAt(i)]){//count max character
        		max=count[s.charAt(i)];
        		max_occur_character=s.charAt(i);
        	}
        }
        for(int i=0;i<length;i++){
            	if(min>count[s.charAt(i)]){//count minimum character
            		min=count[s.charAt(i)];
            		min_occur_character=s.charAt(i);
            	}
        }
        System.out.println(max_occur_character);
        System.out.println(min_occur_character);
	}
      
}
