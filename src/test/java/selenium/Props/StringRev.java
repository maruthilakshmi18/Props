package selenium.Props;

public class StringRev {


	public static void main(String args[])
	{
	//string reverse ans sentence remain same
	String str= "my name is";
	String sentrev="";
	//System.out.println(str);
	String words[]=str.split(" ");
	for(String word : words)
	{
		//System.out.println(word);
		
		char[] ch=word.toCharArray();
		
		String rev="";
		for(int i=ch.length-1; i>=0; i--)
		{
			rev=rev+ch[i];
						
		}
		System.out.println(rev);
		
		sentrev=sentrev+rev;
		
				
			
	}
	System.out.println(sentrev);
	
	/*StringBuilder sb=new StringBuilder();
	sb.append(sentrev.substring(0,2));
	sb.append(" ");
	sb.append((sentrev.substring(2,6)));
	sb.append(" ");
	sb.append((sentrev.substring(6,8)));
	System.out.println(sb);
	//System.out.println(words.length);
	 //System.out.println("");
*/	
	
	}
}
