import java.util.*;

public class Main{
    public static void main(String [] args){
        String [] reg = {"Ahmad", "UNDO", "Bimo", "Ahmad", "Chalid", "UNDO", "Derby", "Bimo"};
        System.out.println(processRegistrations(reg));
        int [] aip ={102, 105, 102, 110, 118, 125, 110, 130};
        int [] dsp = {95, 110, 105, 105, 125, 140, 118};

        ArrayList<Integer> ai = new ArrayList<>();
        for(int a:aip){
            ai.add(a);
        }
        ArrayList<Integer> ds = new ArrayList<>();
        for(int a:dsp){
            ds.add(a);
        }

        System.out.println(countSharedParticipants(ai, ds));

        
    }

    public static int countSharedParticipants(List<Integer> ai, List<Integer> ds) {
        // Write your complete implementation here.
        Set<Integer> a = new HashSet<Integer>();
        a.addAll(ai);
        Set<Integer> d = new HashSet<Integer>();
        d.addAll(ds);

        int counter=0;
        for(int e:a){
            if (d.contains(e)){
                counter++;
            }
        }
        return counter;
    }

    public static List<String> processRegistrations(String[] entries){
        // Write your implementation here.
        Stack<String> regNames = new Stack<>();
        Set<String> registrant = new LinkedHashSet<>();
        ArrayList<String> reg = new ArrayList<>();

        for(String s:entries){
            if(s.equalsIgnoreCase("UNDO") && !regNames.empty()){
                regNames.pop();
            }else{
                regNames.push(s);
            }
        }
        
        registrant.addAll(regNames);
        reg.addAll(registrant);

        return reg;
    }
}
