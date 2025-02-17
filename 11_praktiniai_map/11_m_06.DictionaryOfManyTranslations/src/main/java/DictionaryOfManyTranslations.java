import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();

        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");
        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie")); // [maata, valehdella]
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow")); // []
    }
}
//Your assignment is to create the class DictionaryOfManyTranslations. In it can be stored one or more translations for each word. The class is to implement the following methods:
//public void add(String word, String translation) adds the translation for the word and preserves the old translations.
//public ArrayList<String> translate(String word) returns a list of the translations added for the word. If the word has no translations, the method should return an empty list.
//public void remove(String word) removes the word and all its translations from the dictionary.
//It's probably best to add the translations to an object variable that is of the type HashMap<String, ArrayList<String>>
