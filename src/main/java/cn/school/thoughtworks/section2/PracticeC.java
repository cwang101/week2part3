package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for(String element:collection1){

            String key=getKey(element);
            int value= getValue(element);
            Integer num=result.get(key);
            if (num==null){
                result.put(key,value);
            }else {
                result.put(key,num+value);
            }
        }
        return result;
    }

    private String getKey(String element){
        char[] chars=element.toCharArray();
        int begin=-1;
        int end=0;
        int i=0;
        for(;i<chars.length;i++){
            if(chars[i]>='a'&&chars[i]<='z'){
                if(begin==-1){
                    begin=i;
                }
            }else {
                if(begin>=0) {
                    break;
                }
            }
        }
        end=i;
        return element.substring(begin,end);
    }

    public int getValue(String element){
        char[] chars=element.toCharArray();
        int begin=-1;
        int end=0;
        int i=0;
        for(;i<chars.length;i++){
            if(chars[i]>='0'&&chars[i]<='9'){
                if(begin<0){
                    begin=i;
                }
            }else {
                if(begin>=0) {
                    break;
                }
            }
        }
        end=i;
        if(begin<0){
            return 1;
        }else {
             return Integer.valueOf(element.substring(begin,end));
        }
    }


}
