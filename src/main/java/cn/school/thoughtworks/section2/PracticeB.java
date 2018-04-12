package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for(String element:collection1){
            String[] splits=element.split("-",-1);
            int increase;
            if(splits.length<=1){
                increase=1;
            }else {
                increase=Integer.valueOf(splits[1]);
            }
            Integer num=result.get(splits[0]);
            if (num==null){
                result.put(splits[0],increase);
            }else {
                result.put(splits[0],num+increase);
            }
        }
        return result;
    }
}
