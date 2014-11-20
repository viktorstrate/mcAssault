package main.dk.qpqp;

/**
 * This file is just for miscellaneous functions, that doesn't fit in, in other places.
 * 
 * @author Viktor Strate
 *
 */

public class Misc {
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
}
