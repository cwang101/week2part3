package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> temp=new cn.school.thoughtworks.section2.PracticeA().countSameElements(collectionA);
        Map<String, Integer> result=new PracticeB().createUpdatedCollection(temp,object);
        return result;
    }
}
