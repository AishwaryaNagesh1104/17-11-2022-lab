package stringfunction;

public class Stringfunctions {

	    public static void main(String[] args) {

	        String name="Aishwarya Nagesh";
	        int value= name.length();
	        System.out.println(value);

	        String lstring = name.toLowerCase();
	        System.out.println(lstring);

	        String ustring= name.toUpperCase();
	        System.out.println(ustring);

	        String nontrimstring="     aishwarya     ";
	        System.out.println(nontrimstring);

	        String trimedstring=nontrimstring.trim();
	        System.out.println(trimedstring);


	        System.out.println(name.substring(1,4));
	        System.out.println(name.replace("a","s"));


	    }

	}


