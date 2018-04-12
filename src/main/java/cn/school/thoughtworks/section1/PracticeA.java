package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> copy1=new ArrayList<>(collection1);
        List<String> copy2=new ArrayList<>(collection1);
        copy1.removeAll(collection2);
        copy2.removeAll(copy1);
        return copy2;
    }
}
