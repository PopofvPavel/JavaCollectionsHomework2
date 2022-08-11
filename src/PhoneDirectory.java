import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneDirectory {
    private Map<String, HashSet<String>> phoneDirectory = new HashMap<>();
    public void add(String surname, String number){

        if(!this.phoneDirectory.containsKey(surname)){
            HashSet<String> newHashSet = new HashSet<>();
            newHashSet.add(number);
            phoneDirectory.put(surname,newHashSet);
        } else{
            HashSet updatedHashSet = this.phoneDirectory.get(surname);
            updatedHashSet.add(number);
            phoneDirectory.put(surname,updatedHashSet);
        }

    }
    public HashSet<String> get(String surname){
        return this.phoneDirectory.get(surname);
    }
}
