package com.aditya;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
   // extends Test
{
	App ob;
	/*TODO list
	*1.""->""
	*2."AA"->""
	*3."A"->""
	*4."AAAA"->"AA",
	*5."BAA"->"BA"
	*6."ABA"->"BA"
	*7."ABCD"->"BCD"
	*8."AACD"->"CD"
	*9."BACD"->"BCD"
	*10."BBAA"->"BBAA"
	*11."AABAA"->"BAA"
	*/

	@BeforeEach
	void setUp(){
		ob=new App();
	}
	@Test
	void test2(){
		assertEquals("",ob.Remove("AA"));
	}
	@Test
	void test3(){
		assertEquals("",ob.Remove("A"));
	}
	@Test
	void test4(){
		assertEquals("AA",ob.Remove("AAAA"));
	}
	@Test
	void test5(){
		assertEquals("BA",ob.Remove("BAA"));
	}
	@Test
	void test6(){
		assertEquals("BA",ob.Remove("ABA"));
	}
	@Test
	void test7(){
		assertEquals("BCD",ob.Remove("ABCD"));
	}
	@Test
	void test8(){
		assertEquals("CD",ob.Remove("AACD"));
	}
	@Test
	void test9(){
		assertEquals("BCD",ob.Remove("BACD"));
	}
	@Test
	void test10(){
		assertEquals("BBAA",ob.Remove("BBAA"));
	}
	@Test
	void test11(){
		assertEquals("BAA",ob.Remove("AABAA"));
	}	
		
}
