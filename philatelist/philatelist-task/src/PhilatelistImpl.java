import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PhilatelistImpl implements Philatelist {

    ArrayList<PostStamp> stamps = new ArrayList<>();



    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null) throw new IllegalArgumentException();
stamps.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return stamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp stamp : stamps)
            System.out.println(stamp.getName());

    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double v) {
        for (PostStamp stamp : stamps) {
            if (stamp.getMarketPrice() > v) {
                System.out.println(stamp.getName() + " - $" + stamp.getMarketPrice());
            }
        }
    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return false;
    }

    @Override
    public boolean isPostStampWithNameInCollection(String s) {
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {


        return 0;
    }

    @Override
    public double getAveragePostStampPrice() {
        return 0;
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        return null;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String s) {
        return List.of();
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        return List.of();
    }
}
