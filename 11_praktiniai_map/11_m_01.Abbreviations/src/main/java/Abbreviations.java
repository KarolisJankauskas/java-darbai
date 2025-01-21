import java.util.HashMap;

public class Abbreviations {

    private final HashMap<String, String> abbreviationMap;

    public Abbreviations() {
        abbreviationMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationMap.put(abbreviation,explanation);

    }
    public boolean hasAbbreviation(String abbreviation){

        return abbreviationMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){

        return abbreviationMap.getOrDefault(abbreviation,null);
    }

}
