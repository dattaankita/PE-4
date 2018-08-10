package com.stackroute.PE_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest 
   
{
	private static App ap;

	@BeforeClass
	public static void setup() {
		 ap = new App();

	}

	@AfterClass
	public static void teardown() {
		ap = null;

	}
		 
	    
	    @Test
	    public void testresult() {
	        //fail("Not yet implemented");
	        String s="good morning to all";
	        String s1="lla ot gninrom doog";
	        String res=ap.result(s);
	        assertEquals(s1,res);
	    }
	    
	    
	    @Test
	    public void testresult1() {
	        //fail("Not yet implemented");
	        String s="good morning to all";
	        String s1="doog gninrom";
	        String res=ap.result(s);
	        assertNotEquals(s1,res);
	    }
	    
	    @Test
	    public void testWord() {
	        //fail("Not yet implemented");
	        String para="this is just an example";
	        String s="an example is just this";
	        String res=ap.word(para);
	        assertEquals(s,res);
	    }
	    
	    
	    @Test
	    public void testWord2() {
	        //fail("Not yet implemented");
	        String para="this is just an example";
	        String s="this is just an example";
	        String res=ap.word(para);
	        assertNotEquals(s,res);
	    }
	    
	    @Test
	    public void testCheck() {
	        //fail("Not yet implemented");
	        String s1="hello!are you harry?";
	        String s2="harry";
	        boolean s=ap.check(s1,s2);
	        assertEquals(true,s);
	    }
	    
	    
	    @Test
	    public void testCheck1() {
	        //fail("Not yet implemented");
	        String s1="hello!are you harry?";
	        String s2="husdd";
	        boolean s=ap.check(s1,s2);
	        assertEquals(false,s);
	    }
	    
	    @Test
	    public void testOccur() {
	        //fail("Not yet implemented");
	    String s="shse sells";
	    String sub="se";
	    String s1="3,6";
	    String res=ap.occur(sub,s);
	    assertEquals(s1,res);
	    }
	 
	 
	    @Test
	    public void testOccur1() {
	        //fail("Not yet implemented");
	    String s="shse sells";
	    String sub="se";
	    String s1="3,5,3,4,7";
	    String res=ap.occur(sub,s);
	    assertNotEquals(s1,res);
	    }
}
