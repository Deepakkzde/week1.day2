package Week1day2;

public class CharOccurence {

	public static void main(String[] args) {
		 String str ="welcome to chennai";
		    int count =0;
		    str.charAt(1);
		    int len =str.length();
		    //System.out.println(len);
		    for (int i =0;i<=len-1;i++) {
		    	if (str.charAt(i) =='e') {
		    		count++;
		    			
		    	}
		    }
		    System.out.println("The Occurence of E in the string is = "+count);
		    
		    

	}

}
