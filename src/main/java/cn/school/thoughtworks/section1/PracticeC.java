package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result=new ArrayList<>();
        PracticeA practiceA=new PracticeA();
        for(Map.Entry<String,List<String>> entry:collection2.entrySet()){
            result.addAll(practiceA.collectSameElements(collection1,entry.getValue()));
        }
        return result;
    }
}
