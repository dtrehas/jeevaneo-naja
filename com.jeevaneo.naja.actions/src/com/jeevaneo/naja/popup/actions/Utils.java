package com.jeevaneo.naja.popup.actions;

import java.util.Set;

import com.jeevaneo.naja.Category;
import com.jeevaneo.naja.Task;

public class Utils {

	public static String fullname(Task task) {
		String ret = task.getName();
		if (null != task.getCategory()) {
			ret = fullname(task.getCategory()) + "/" + ret;
		}
		return ret;
	}

	public static String fullname(Category cat) {
		String ret = cat.getName();
		if (null != cat.getParentCategory()) {
			ret = fullname(cat.getParentCategory()) + "/" + ret;
		}
		return ret;
	}

	public static String daysAndHours(int hours) {
		if(hours==0)
		{
			return "0";
		}
		
		int days = hours / 8;
		int hrs = hours % 8;
		String day = "";
		if (days > 0) {
			day = String.format("%dj", days);
			if (hrs > 0) {
				day += " ";
			}
		}
		String hour = "";
		if (hrs > 0) {
			hour = String.format("%dh", hrs);
		}
		return day + hour;
	}

	public static String csl(Set<String> nameListe) {
		String stringNameList = "\"";
		final String crlf = "\n"; // System.getProperty("line.separator", "\n");
		int i = 0;
		for (String name : nameListe) {
			if (i > 0) {
				stringNameList += crlf;
			}
			stringNameList += name;
			i++;
		}
		stringNameList += "\"";
		return stringNameList;
	}

}
