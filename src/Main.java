import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Album album1 = new Album("Udd gaye","Ritviz");
        album1.addSongToAlbum("Udd gaye",4.55);
        album1.addSongToAlbum("Liggi",3.43);
        album1.addSongToAlbum("Sage",3.55);

        Album album2 = new Album("Moosa","siddhu Mossawala");
        album2.addSongToAlbum("too high",2.52);
        album2.addSongToAlbum("old school",2.45);
        album2.addSongToAlbum("Same beef",3.33);

        List<Song> myPlayList = new LinkedList<>();
        System.out.println(album2.addToPlaylist("old School",myPlayList));
        System.out.println(album1.addToPlaylist(1,myPlayList));
        System.out.println(album2.addToPlaylist(1,myPlayList));

        play(myPlayList);
    }

    private static void play(List<Song> myPlayList) {

        ListIterator<Song> itr = myPlayList.listIterator();
        if(myPlayList.size() == 0){
            System.out.println("");
            return;
        }

        System.out.println("Currently playing");
        System.out.println(itr.next());

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    if(itr.hasNext()){
                        System.out.println("Now playing");
                        System.out.println(itr.next());
                    }
                    else{
                        System.out.println("Your Reached end of playlist");
                    }
                    break;
                case 2:
                    if(itr.hasPrevious()){
                        System.out.println("Now playing");
                        System.out.println(itr.previous());
                    }
                    else{
                        System.out.println("Your Already at First Song");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    return;

            }
        }

    }
    static void printAllSong(List<Song> playlist){

        for(Song s:playlist){
            System.out.println(s);
        }

    }
    static void printMenu(){

        System.out.println("1. Play next Song");
        System.out.println("2. Play previous Song");
        System.out.println("3. Play current song again");
        System.out.println("4. Delete current Song");
        System.out.println("5. Show all Songs");
        System.out.println("6. Show menu again");
        System.out.println("7. Exit");
    }
}
