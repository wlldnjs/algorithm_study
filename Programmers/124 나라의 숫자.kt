/**
    https://programmers.co.kr/learn/courses/30/lessons/12899?language=java
    합계: 100.0 / 100.0(정확성: 70.0, 효율성: 30.0)
*/
class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
            while(n/3 > 0){
            sb.insert(0,convertTo124(n%3));
            if(n%3 == 0){
                n = n-1;
            }
                n = n/3;
            }
        
        if(n%3 > 0){
            sb.insert(0,convertTo124(n));
        }
        
        return sb.toString();
    }
    
    private String convertTo124(int input){
        switch(input % 3){
            case 0: 
                return "4";
            case 1:
                return "1";
            case 2:
                return "2";
        }
        return "-1";
    }   
}
