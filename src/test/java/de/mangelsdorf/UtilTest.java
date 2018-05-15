package de.mangelsdorf;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest
{
	@Test (expected=IllegalArgumentException.class)
	public void testIstErstesHalbjahr()
	{
		Util.istErstesHalbjahr(-2);
	}
}