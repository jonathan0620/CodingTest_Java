import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
      //1. 
       ArrayList<Integer> list = new ArrayList();
       //2. 
        int saveNum = -1;
        for(int i=0; i<arr.length; i++){
            //3. 
            if(saveNum != arr[i]){
               //4.
                saveNum=arr[i];
                //5.
                list.add(arr[i]);
            }
        }
        //6.
        int[] answer = new int[list.size()];
        //7.
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}