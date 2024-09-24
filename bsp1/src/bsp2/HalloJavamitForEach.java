package bsp2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    List<String> stringListOld = new ArrayList<>();

    public void printOld(){
        for(String arrayList: stringListOld){
            System.out.println(arrayList);
        }
    }

    public void printNew(){
        stringListOld.forEach(System.out::println);
    }

}
