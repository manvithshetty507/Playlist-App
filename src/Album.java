import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String title;
    private String artist;
    private List<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    //find song

    boolean findSong(String title){
        for(Song song:songs){
            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    //add song
    String addSongToAlbum(String title,double duration){
        if(findSong(title) == false){
            Song song = new Song(title,duration);
            songs.add(song);
            return "Song has been Added";
        }
        else{
            return "Song already Exists";
        }
    }

    //add song to playlist from album

    String addToPlaylist(String title, List<Song> playList){
        if(findSong(title) == true){

            for(Song s:this.songs){
                if(s.getTitle().equals(title)){
                    playList.add(s);
                    return "Song added to Playlist";
                }
            }

        }
        return "Song not found in the Album";
    }

    String addToPlaylist(int trackNo,List<Song> playList){
        int index = trackNo-1;

        if(index >=0 && index < this.songs.size()){
            playList.add(this.songs.get(index));
            return "songs has been added to playlist";
        }
        else{
            return "Invalid TrackNo";
        }
    }
}
