
public class SortCharacters {

	public static void main(String[] args) {
		String str="Welcome to JAVA";
		String s=str.replaceAll(" ", "").toLowerCase();
		int length=s.length();
		//System.out.println(s);
		String oddstring="";
        char c[]=s.toCharArray();
        for(int i=0;i<length-1;i++){
        	for(int j=i+1;j<length;j++){
        		if(c[i]>c[j]){
        		char temp=c[i];
        		c[i]=c[j];
        		c[j]=temp;
        	}
        	}
        }
        for(int i=0;i<length;i++){
        	System.out.print(c[i]);
        	if(i%2==0){
        	oddstring=oddstring+c[i];
        	}
        }
        System.out.println();
        System.out.println(oddstring);
	}

}
