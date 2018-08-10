		package com.stackroute.PE_4;
		
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collections;
		import java.util.List;
		import java.util.ListIterator;
		
		public class App 
		{
		
			private int x;
			
		    public String word(String st) {
		    	String[] s=st.split(" ");
		        for (int i = 0; i < s.length; i++) 
		        {
		          for (int j = i + 1; j <s.length; j++) 
		           {
		              if (s[i].compareTo(s[j])>0) 
		                {
		                  String temp = s[i];
		                  s[i] = s[j];
		                  s[j] = temp;
		                 }
		            }
		         }
		        String st2=new String();
		        for(int i=0;i<s.length;i++) {
		        	st2= st2+s[i]+" ";
		        }
		        String st3=st2.trim();
		        return st3;
		    }
		
			public String result(String s) {
				byte [] strAsByteArray = s.getBytes();
		        byte [] result = new byte [strAsByteArray.length];
		        for (int i = 0; i<strAsByteArray.length; i++)
					result[i] = strAsByteArray[strAsByteArray.length-i-1];
		        String st=new String(result);
				return st;
			}
			
		   public boolean check(String word,String sub)
		   {
			   if(word.contains(sub))
			   return true;
			   
			   return false;
		   }
		
		
		public String occur(String sub, String s) {
			int l= 0;
			//int c = 0;
            int x=0;
			while(l != -1){

			    l = s.indexOf(sub,l);
			}
			l=l+1;
			x=l+2;
		    String st=new String();
		    st=st+ l+ ","+x;
		    return st;
			
		 }
		}
