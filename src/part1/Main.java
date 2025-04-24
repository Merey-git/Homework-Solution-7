package part1;

public class Main {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.addEpisode(new Episode("S1_E1", 1200));
        season1.addEpisode(new Episode("S1_E2", 1300));
        season1.addEpisode(new Episode("S1_E3", 1340));

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2_E1", 1250));
        season2.addEpisode(new Episode("S2_E2", 1400));
        season2.addEpisode(new Episode("S2_E3", 1280));

        Series series = new Series();
        series.addSeason(season1);
        series.addSeason(season2);

        System.out.println("Normal (Season 1):");
        EpisodeIterator normal1 = season1.getSeasonIterator();
        while (normal1.hasNext()) System.out.println(normal1.next().getTitle());
        System.out.println("Normal (Season 2):");
        EpisodeIterator normal2 = season2.getSeasonIterator();
        while (normal2.hasNext()) System.out.println(normal2.next().getTitle());


        System.out.println("Reverse (Season 1):");
        EpisodeIterator reverse1 = season1.getReverseIterator();
        while (reverse1.hasNext()) System.out.println(reverse1.next().getTitle());
        System.out.println("Reverse (Season 2):");
        EpisodeIterator reverse2 = season1.getReverseIterator();
        while (reverse2.hasNext()) System.out.println(reverse2.next().getTitle());

        System.out.println("Shuffle (Season 1):");
        EpisodeIterator shuffle1 = season1.getShuffleIterator(42L);
        while (shuffle1.hasNext()) System.out.println(shuffle1.next().getTitle());
        System.out.println("Shuffle (Season 2):");
        EpisodeIterator shuffle2 = season1.getShuffleIterator(42L);
        while (shuffle2.hasNext()) System.out.println(shuffle2.next().getTitle());

        System.out.println("Binge Mode:");
        EpisodeIterator binge = series.getBingeIterator();
        while (binge.hasNext()) System.out.println(binge.next().getTitle());
    }
}

