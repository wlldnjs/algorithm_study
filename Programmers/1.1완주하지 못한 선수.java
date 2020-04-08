/**
    https://programmers.co.kr/learn/courses/30/lessons/42576
    합계: 100.0 / 100.0(정확성: 50.0, 효율성: 50.0)
*/
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<participant.length -1; i++){
            if(!participant[i].equals(completion[i])){    
                return participant[i];
            }
        }
        return participant[participant.length -1];
    }
}
