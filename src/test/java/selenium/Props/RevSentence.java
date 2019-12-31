package selenium.Props;

import java.util.ArrayList;
import java.util.List;

public class RevSentence {
	public static void main(String args[])
	{
	//whole sentencee reverse
		
		String str= "i am name is";
		String rev="";
		//si eman ma i
		//s ie manm a1
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Integer> list = new ArrayList<Integer>();
		int j =1;
		String words[]= str.split(" ");
		for(String word : words)
		{
			//map.put(j, word.length());
			list.add(word.length());
			j++;
			//System.out.println(word.length());
			
			 char[] ch=word.toCharArray();
				
				
				for(int i=ch.length-1; i>=0; i--)
				{
					rev=rev+ch[i];
							
				}
				//System.out.println(rev);
		}
		System.out.println(rev);
		String newSentence = "";
		/*for(Entry<Integer,Integer> m : map.entrySet()) {
			System.out.println("words length :"+m.getValue());
			
		}*/
		int k =0;
		for(Integer i : list) {
			System.out.println(i);
		}
//		for(int a=0; a<list.size();a++) {
//			System.out.println(a);
//			System.out.println(list.get(a));
//		}
		//String 
		//str = str.replaceAll(" " ,"");
		//System.out.println(str);
		
      
		
		//System.out.println(rev);
		
		
}
}
