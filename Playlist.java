import java.util.ArrayList;

import PlaylistProject.Song;
public class Playlist{
private ArrayList<Song> songs;
public Playlist{
    songs = new ArrayList<>();
}

public void addSong(Song song){
    songs.add(song);
    System.out.println("Added " + song.toString());
}

public void likeSong(int index){
    songs.get(index).like();
}
public void removeSong(int index){
    songs.remove(index);
}
public void printSongs(){
    for (Song s: songs){
        System.out.println(s);
    }
}
public void printLikedSongs(){
    for (Song s: songs){
        if(s.isLiked()){
            System.out.println(s);
        }
    }
}
public int getTotalDuration(){
    int total = 0;
    for (Song s: songs){
        total += s.getDurationSeconds();
    }
    return total;
}
public void removeAllUnlikedSongs() {
        // Common bug avoided: removing while iterating forward
        for (int i = songs.size() - 1; i >= 0; i--) {
            if (!songs.get(i).isLiked()) {
                songs.remove(i);
            }
        }
    }
}