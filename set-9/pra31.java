import java.util.*;

public class pra31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<String> playlist = new LinkedList<>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter songs:");
        for (int i = 0; i < n; i++) {
            playlist.add(sc.nextLine());
        }

        System.out.println("Full Playlist: " + playlist);

        System.out.println("\nPlaying first song: " + playlist.removeFirst());
        System.out.println("Playlist: " + playlist);

        System.out.println("\nSkipping last song: " + playlist.removeLast());
        System.out.println("Playlist: " + playlist);
    }
}