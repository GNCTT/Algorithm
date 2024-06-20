import java.util.Locale;

public class StringToInteger {

    boolean isValidChar(char ch) {
        if (ch == ' ' || ch == '+' ||ch == '-' || ch == '.' || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
    public int myAtoi(String s) {
        int indexLead = 0;
        int checkPos = 1;
        for (int i = 0; i < s.length(); i++) {
            if (isValidChar(s.charAt(i))) {
                if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                    indexLead = i;
                    if (i > 0) {
                        char preChar = s.charAt(i - 1);
                        if (preChar == '-') {
                            checkPos = -1;
                        } else {
                            checkPos = 1;
                        }
                    }
                    break;
                }
            } else {
                indexLead = -1;
                break;
            }
        }
        int sum = 0;
        if (indexLead == -1) {
            return 0;
        }
        for (int i = indexLead; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sum = sum * 10 + (int)(s.charAt(i) - '0');
            } else {
                break;
            }
        }

        return sum;
    }

}
