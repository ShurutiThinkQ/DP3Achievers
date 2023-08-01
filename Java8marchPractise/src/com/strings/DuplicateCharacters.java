package com.strings;

public class DuplicateCharacters {
	
	public static void findDuplicateChar(String st)
	{
		int count;
		char ch[]= st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if(ch[i]=='\0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]&&ch[j]!='\0')
				{
				    count++;
				    ch[j]='\0'; 
					
				}
			}
			
			System.out.println(ch[i]+":"+count);
			
		}
		
		
	}

	public static void main(String[] args) {
		
		String str="Missisipi";
		
	  findDuplicateChar(str);
		
		
	}
}
