package part1;
import java.util.List;
import java.util.Iterator;

public class BingeIterator implements EpisodeIterator {
    private List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        if (!seasons.isEmpty()) {
            currentIterator = seasons.get(0).getSeasonIterator();
        }
    }

    public boolean hasNext() {
        while (currentIterator != null && !currentIterator.hasNext()) {
            seasonIndex++;
            if (seasonIndex < seasons.size()) {
                currentIterator = seasons.get(seasonIndex).getSeasonIterator();
            } else {
                currentIterator = null;
            }
        }
        return currentIterator != null && currentIterator.hasNext();
    }

    public Episode next() {
        return currentIterator.next();
    }
}

