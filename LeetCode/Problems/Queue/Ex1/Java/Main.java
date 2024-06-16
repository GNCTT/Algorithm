import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.predictPartyVictory("DDR"));
        System.out.println("Hello world!");
    }
}

class Solution {
    Character getOther(Character input) {
        if (input == 'D') {
            return 'R';
        }
        return 'D';
    }

    public String predictPartyVictory(String senate) {
        LinkedList<Character> queueD = new LinkedList<Character>();
        for (int i = 0; i < senate.length(); i++) {
            queueD.add(senate.charAt(i));
        }
        System.out.println(senate);
        while (queueD.size() != 1) {
            Character firstChar = queueD.get(0);
            Character otherChar = getOther(firstChar);
            boolean flag = false;
            if (senate.length() == 2) {
                queueD.set(0, senate.charAt(0));
                break;
            }
            for (int i = 1; i < senate.length(); i++) {
                if (senate.charAt(i) == otherChar) {
                    String v = senate.substring(1, i);
                    String v2 = "";
                    if (i + 1 >= senate.length()) {
                        v2 = "";
                    } else {
                        v2 = senate.substring(i + 1);
                    }
                    senate = v + v2 + firstChar;
                    queueD.remove(i);
                    System.out.println(senate);
                    flag = true;
                    break;
                }
            }
            queueD.remove(0);
            //anc
            queueD.add(firstChar);
            if (!flag) {
                break;
            }
        }

        if (queueD.get(0) == 'D') {
            return "Dire";
        }
        return "Radiant";
    }
}