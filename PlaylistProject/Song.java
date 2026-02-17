package PlaylistProject;
public class Song{
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean liked;

    public Song(String title, String artist, int durationSeconds, boolean liked){
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
        this.liked = false;
    }
    

    public void like(){
        liked = false;
    }

    public int getDuration(){
        return durationSeconds;
    }

    public String toString(){
        int minutes = durationSeconds/60;
        int seconds = durationSeconds%60;
        String time = minutes + ":" + (seconds < 10 ? "0" : "") + seconds;
        if(liked = true){
        return "“" + title + "” by " + artist + " (" + time + ") -- liked";
    }

    return "“" + title + "” by " + artist + " (" + time + ") -- liked";
    }

    
}
