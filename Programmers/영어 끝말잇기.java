/**
    https://programmers.co.kr/learn/courses/30/lessons/12981?language=java
    합계: 100.0 / 100.0(정확성: 100.0)
*/

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> wordSet = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            // 이전 단어의 마지막 글자와 현재 단어의 첫번째 단어가 같은지 확인
            if (i != 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                return new int[]{i%n+1, i/n+1};
            }

            // 중복된 단어인지 확인
            if (wordSet.contains(words[i])) {
                return new int[]{i%n+1, i/n+1};
            }
            wordSet.add(words[i]);
        }
        
        return new int[]{0, 0};
    }
}
