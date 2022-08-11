import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"gg", "wp", "lff", "zro", "brk","nmi","chpr","gg","wp"};
        Set uniqueWords = new HashSet();
        Map<String, Integer> wordsAmount = new HashMap();

        for (String word : words){
            if (!wordsAmount.containsKey(word)) {
                wordsAmount.put(word, 1);

            } else{
                wordsAmount.put(word, wordsAmount.get(word) + 1);

            }

            uniqueWords.add(word);
        }

        System.out.println(uniqueWords);
        System.out.println(wordsAmount);

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Michael","1337228");
        phoneDirectory.add("Scottie","7821416");
        phoneDirectory.add("Steph","47582571");
        phoneDirectory.add("Michael","228555");

        HashSet<String> numbers = phoneDirectory.get("Michael");
        HashSet<String> numbers2 = phoneDirectory.get("Scottie");
        System.out.println(numbers.toString() + numbers2);


    }
}
