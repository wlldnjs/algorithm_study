/**
    https://programmers.co.kr/learn/courses/30/lessons/42888?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
import java.util.*

class Solution {
    fun solution(record: Array<String>): Array<String> {
        val FLAG_ENTER = "Enter"
        val FLAG_CHANGE = "Change"
        val FLAG_LEAVE = "Leave"
        
        val ENTER_MESSAGE = "님이 들어왔습니다."
        val LEAVE_MESSAGE = "님이 나갔습니다."
        
        val userMap = HashMap<String, String>()
        val messageList = ArrayList<String>()
        
        record.forEach{
            val st = StringTokenizer(it, " ")
            when(st.nextToken()){
                FLAG_ENTER -> {
                    st.nextToken().also {id -> 
                        userMap[id] = st.nextToken()
                        messageList.add("$id $ENTER_MESSAGE")
                    }
                }
                FLAG_CHANGE -> {
                    userMap[st.nextToken()] = st.nextToken()
                }
                FLAG_LEAVE -> {
                    val id = st.nextToken()
                    messageList.add("$id $LEAVE_MESSAGE")
                }
            }    
        }
        
        for(i in messageList.indices){        
            val st = StringTokenizer(messageList[i], " ")
            st.nextToken().let{
                messageList[i] = messageList[i].replace("$it ", userMap[it]!!)
            }
        }
        
        return messageList.toTypedArray()
    }
}
