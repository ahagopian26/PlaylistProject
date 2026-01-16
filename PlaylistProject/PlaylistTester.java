public class PlaylistTester {
    public static void main(String[] args) {

        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");

        p.addSong(new Song("This Must Be the Place", "Talking Heads", 296));
        p.addSong(new Song("Dominoes", "Donald Byrd", 273));
        p.addSong(new Song("Check the Rhime", "A Tribe Called Quest", 216));
        p.addSong(new Song("Con Altura", "Rosalia", 161));
        p.addSong(new Song("California", "Joni Mitchell", 230));

        System.out.println("Printing the songs...\n");
        p.printSongs();

        System.out.println("\nLiking the songs in position 1, 3 and 4...\n");
        p.likeSong(1);
        p.likeSong(3);
        p.likeSong(4);

        System.out.println("Printing the songs...\n");
        p.printSongs();

        System.out.println("\nRemoving the song in position 2...\n");
        p.removeSong(2);

        System.out.println("Printing the songs...\n");
        p.printSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        p.printLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...");
        System.out.println(p.totalDuration());

        System.out.println("\n\nRemoving all unliked songs at once...\n");
        p.removeUnliked();

        System.out.println("Printing all songs...\n");
        p.printSongs();
    }
}
