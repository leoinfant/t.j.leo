public boolean isMatch(String a, String b) {
	// base case
	if (b.length() == 0) {
		return a.length() == 0;
	}
 
	// special case
	if (b.length() == 1) {
 
		// if the length of s is 0, return false
		if (a.length() < 1) {
			return false;
		}
 
		//if the first does not match, return false
		else if ((b.charAt(0) != a.charAt(0)) && (b.charAt(0) != '.')) {
			return false;
		}
 
		// otherwise, compare the rest of the string of s and p.
		else {
			return isMatch(a.substring(1), b.substring(1));
		}
	}
 
	// case 1: when the second char of p is not '*'
	if (b.charAt(1) != '*') {
		if (a.length() < 1) {
			return false;
		}
		if ((b.charAt(0) != a.charAt(0)) && (b.charAt(0) != '.')) {
			return false;
		} else {
			return isMatch(a.substring(1), b.substring(1));
		}
	}
 
	// case 2: when the second char of p is '*', complex case.
	else {
		//case 2.1: a char & '*' can stand for 0 element
		if (isMatch(a, b.substring(2))) {
			return true;
		}
 
		//case 2.2: a char & '*' can stand for 1 or more preceding element, 
		//so try every sub string
		int i = 0;
		while (i<a.length() && (a.charAt(i)==b.charAt(0) || b.charAt(0)=='.')){
			if (isMatch(a.substring(i + 1), b.substring(2))) {
				return true;
			}
			i++;
		}
		return false;
	}
}
