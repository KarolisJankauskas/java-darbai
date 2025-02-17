
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.","for example");
        abbreviations.addAbbreviation("etc.","and so on");
        abbreviations.addAbbreviation("i.e.","more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")){
            if (abbreviations.hasAbbreviation(part)){
                part = abbreviations.findExplanationFor(part);
            }
            System.out.println(part);
            System.out.println(" ");

        }


        System.out.println();
    }
}
//        Create a class Abbreviations for managing common abbreviations.
//        The class must have a constructor, which does not take any parameters.