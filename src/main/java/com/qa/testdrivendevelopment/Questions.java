package com.qa.testdrivendevelopment;

public class Questions {
	/**
	 * There is a well known mnemonic which goes "I before E, except after C", which
	 * is used to determine which order "ei" or "ie" should be in a word. <br>
	 * <br>
	 *
	 *
	 * Write a function which returns the boolean True if a string follows the
	 * mnemonic, and returns the boolean False if not. <br>
	 * <br>
	 *
	 *
	 * For Example: <br>
	 * iBeforeE("ceiling") → True <br>
	 * iBeforeE("believe") → True <br>
	 * iBeforeE("glacier") → False <br>
	 * iBeforeE("height") → False
	 */
	public boolean iBeforeE(String input) {
		for (int i = 0; i < input.length() - 1; i++) {
			if (i != 0) {
			}
			if (input.substring(i, i + 2).equalsIgnoreCase("ie")) {
				if (i == 0) {
					return true;
				}
				if (input.substring(i - 1, i).equals("c")) {
					return false;
				} else {
					return true;
				}
			}
			if (input.substring(i, i + 2).equalsIgnoreCase("ei")) {
				if (i == 0) {
					return false;
				} else if (input.substring(i - 1, i).equals("c")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
}
