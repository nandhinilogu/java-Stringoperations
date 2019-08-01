//count is event clockwise rotation 
//count is odd anticlockwise rotation
import java.util.Scanner;

public class ClockAndAnitclockwiseRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String str=in.nextLine();//input string
        char end,start;
        String s="";
        int length=str.length();
        if(length%2==0){//check count is odd or even
         end=str.charAt(0);
         for(int i=1;i<length;i++){
        	s=s+str.charAt(i);//count is even clockwise rotation 
         }
         s=s+end;
         System.out.println(s);
        }
        else{
        	start=str.charAt(str.length()-1);
        	s=s+start;
        	for(int i=0;i<length-1;i++){//count is odd Anticlockwise rotation
        		s=s+str.charAt(i);
        	}
        	System.out.println(s);
        }
	}

}
