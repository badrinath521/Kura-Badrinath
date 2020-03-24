package com.epamtak12.junittdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class Removefirst2characters 
{
	/*TODO List for my features
	 * 1) A is at 0 position :ABCD=>BCD
	 * 2) A is at both 0 and 1 st position :AACD=>CD
	 * 3) A is at 1st position :BACD=>BCD
	 * 4) A is not present :BBAA=>BBAA
	 * 5) A IS AT 0 and 1 st position :AABAA=>BAA
	 */
Deletefirst2A deletefirst2A=new Deletefirst2A();
@Test
void testA_at_0() 
{
	assertEquals("BCD",deletefirst2A.delete("ABCD"));
}
@Test
void testA_at_0and1()
{
	assertEquals("CD",deletefirst2A.delete("AACD"));
}
@Test
void testA_at_1()
{
	assertEquals("BCD",deletefirst2A.delete("BACD"));
}
@Test
void testA_not_present()
{
	assertEquals("BBAA",deletefirst2A.delete("BBAA"));
}
@Test
void testA_at_0and1position()
{
	assertEquals("BAA",deletefirst2A.delete("AABAA"));
}
}