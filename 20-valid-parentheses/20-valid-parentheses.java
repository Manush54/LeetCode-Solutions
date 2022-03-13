import java.util.regex.*;
class Solution {
    public boolean isValid(String s) {
		Matcher m = Pattern.compile("(\\{})|(\\[])|(\\(\\))").matcher(s);
		while(m.find()) {
			s = m.replaceAll("");
			m.reset(s);
		}
		return s.length() == 0;
	}
}