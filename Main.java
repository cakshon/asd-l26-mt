import java.util.*;

public class Main{
    public static void main(String [] args){
        String [] reg = {"Ahmad", "UNDO", "Bimo", "Ahmad", "Chalid", "UNDO", "Derby", "Bimo"};
        System.out.println(processRegistrations(reg));
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
