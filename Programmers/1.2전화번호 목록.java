/**
    https://programmers.co.kr/learn/courses/30/lessons/42577
    합계: 69.2 / 100.0(정확성: 69.2, 효율성: 0.0)
*/
class Solution {
    public boolean solution(String[] phoneBook) {
        if(phoneBook.length == 1){
            return true;
        }
        String prePhoneNumeber = phoneBook[0];
        boolean isNotMatch = true;
        
        for(int i=1;i<phoneBook.length;i++){
            for(int j=0; j<prePhoneNumeber.length(); j++){
                if(phoneBook[i].charAt(j) != prePhoneNumeber.charAt(j)){
                    break;
                }
                if(j == prePhoneNumeber.length()-1){
                    isNotMatch = false;
                }
            }
        }
        return isNotMatch;
    }
}
