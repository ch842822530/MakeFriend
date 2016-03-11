package cn.itcast.maven;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

public class MakeFriendTest {

	@Test
	public void testMakeFriend(){		
		MakeFriend makeFriend = new MakeFriend();
		String str = makeFriend.MakeFriend("wangwu");
		assertEquals("Hey,John make a friend please.",str);		

	}
}