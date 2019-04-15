package com.shiva;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccNoGen {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("SBIN?004757?[0-9]{5}[1-2]{2}");
		Matcher m = p.matcher(args[0]);
		if (m.find() && m.group().equals(args[0])) {
			System.out.println("valid acc number");
		} else {
			System.out.println("Not valid acc number");
		}
	}
}
