package com.test;

public class ConvertStringValues {

	
	public static String convertToCamel(String name) {
		//String name ="val";

		
		name = name.replace("_", " ");

	    final StringBuilder ret = new StringBuilder(name.length());
	    
	    

	    int i =0;
	    for (String word : name.split(" ")) {
	    	word = word.trim();
	    	
	        if (!word.isEmpty()) {
	        	if(i == 0) {
	        		ret.append(word.toLowerCase());
	        	}else {
		            ret.append(Character.toUpperCase(word.charAt(0)));
		            ret.append(word.substring(1).toLowerCase());	        		
	        	}
	        	i++;
	        	
	        }
	    }

	    return ret.toString();
		
	}	
}
