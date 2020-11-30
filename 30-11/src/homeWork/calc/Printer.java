package homeWork.calc;


import java.util.*;

class Printer {
    void print(Var result) {
        if (result != null) {
            System.out.println(result);
        }
    }

    public void printvar(Map<String, Var> value) {
        Map<String, Var> hm;
        hm = value;
        Set<Map.Entry<String, Var>> setv = hm.entrySet();
        Iterator<Map.Entry<String, Var>> i = setv.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Var> me = i.next();
            System.out.println(me.getKey() + " = " + me.getValue());
        }
    }

    public void printsort(Map<String, Var> arr) {
        Map<String, Var> hm;
        hm = arr;
        TreeSet<String> name = new TreeSet<>(hm.keySet());
        for (String s : name) {
            System.out.println(s+" = "+ hm.get(s));
        }

    }
}



