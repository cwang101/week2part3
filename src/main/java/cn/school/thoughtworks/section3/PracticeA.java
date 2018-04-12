package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        List<String> target=object.get("value");
        for(Map.Entry<String,Integer> entryA:collectionA.entrySet()){
            String key=entryA.getKey();
            int value=entryA.getValue();
            if(target.contains(key)){
                result.put(key,value-1);
            }else {
                result.put(key,value);
            }
        }
        return result;
    }
}
