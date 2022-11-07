/*This code imports Song class and helpers to make the songlist work
 *
 * @author Keegan De souza
 */
import helpers.*;
import Songs.*;
import java.util.ArrayList;

/*This public class represents my program called songlist
 */
public class Songslist
{
/*Array list helps store my songlist 
 */
    private static ArrayList<Music> songs = new ArrayList<>();
    
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);
        /*Here the music is stored based on the songtitle,artistname and playcount Arraylist is also used here to store 
        songs that get added in.
        */
        
        Music myMusic0 = new Music(  "Imagine Dragons", "Coldplay", 63132434);
        songs.add(myMusic0);
        Music myMusic1 = new Music(  "Imagine Dragons", "Radioactive", 31323424);
        songs.add(myMusic1);
        Music myMusic2 = new Music(  "Beautiful Girls", "Kingston", 64374234);
        songs.add(myMusic2);
        Music myMusic3 = new Music(  "Clearest signs", "SwitchO", 73473424);
        songs.add(myMusic3);
        Music myMusic4 = new Music(  "Unholy(feat.CJ)", "Samsmith",  84535434);
        songs.add(myMusic4);
        Music myMusic5 = new Music(  "Wishing Well", "Juice world",  93442342);
        songs.add(myMusic5);
        Music myMusic6 = new Music(  "Glade you came", "Liilz Zi",  34578932);
        songs.add(myMusic6);
        Music myMusic7 = new Music(  "Lucid Dreams", "Juice World",  12746358);
        songs.add(myMusic7);
        Music myMusic8 = new Music(  "Feel Good(Lil)", "24KGoldn",  63424223);
        songs.add(myMusic8);
        Music myMusic9 = new Music(  "Someone elses", "Private Zero",  63424223);
        songs.add(myMusic9);

       

    
       /*
        * This line of code is used to print a line of code such as a sentence.
        */
        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("CW1 Course Work Music List ");
        System.out.println();
        System.out.println("By Keegan Desouza");
        System.out.println();
        executeMenu();

    }


    
     /*
      * This line of code is used to execute the main menu where users can add songs,remove songs,print all songs,print top songs
        and quit the program. 
      * 
      */
      public static void executeMenu()
      {
      boolean wantsToQuit = false;

       while(!wantsToQuit)
      {
      displayMenu();
      System.out.println("==================================");
      System.out.println("==================================");
      int choice = InputReader.getInt("Please Choose a option from (1 to 5) from the Main Menu > ");
      System.out.println("==================================");

    switch(choice)
    {
                case 1: addSong();; break;
                case 2: removeSong(); break;
                case 3: printAllSongs(); break;
                case 4: printTopSongs(); break;
                case 5: wantsToQuit = true; break;  
                default: System.out.println("\n Not Valid!!!\n"); 
                
            }     
        }         
    }
     
   /*
    * This code here is used to provide the user with the minimum playcount whenever they enter digits. 
    */
   private static void printTopSongs() 
    
{
    int choice = InputReader.getInt("Please enter digits to show minimum playcount: " );

    /*
     * This line of code helps display multiple unique songs based on the artist title, artist name and the playcount via the help 
       if statments.
     */
    System.out.println("Printing Top songs");
    System.out.println("------------------");
    System.out.println("      |Song Title|     |Artist Name|     |Playcount|");
    for(Music music : songs )
    {
        if(music.getPlaycount()>= choice)
        System.out.println(" Song " +music.getsongTitle()+ " by " + music.getartistName()+ " streamed " + music.getPlaycount());

    }
}
    
/*This line of code is used to  prints all the unique songs that have been stored in the arraylist. 
 * 
 */
    private static void printAllSongs()
    {
       System.out.println("Printing All songs");
       System.out.println("------------------");
       System.out.println("      |Song Title|     |Artist Name|     |Playcount|");
       for(Music Music  : songs )
       {
         Music.print();
       }
    }

    /*
     * This line of code once executed removes songs by prompting the user to choose which song they would like to remove. 
     */
    private static void removeSong()
    { 
      System.out.println("Removing a song");
      System.out.println("------------------");
      System.out.println("      |Song Title|     |Artist Name|     |Playcount|");
        for(Music Music  : songs )
      {
        Music.print();
      } 
      System.out.println("==========================================");
      int id1 = InputReader.getInt("Please Choose a number between (0 to 10): " );

      songs.remove(id1);
      System.out.println("==========================================");
      System.out.println("Congratulation your song has been deleted!");
      System.out.println("");

    }
    /*
     * This line of code is used to add songs based on the songtitle, artist name and playcount which then is stored in the arraylist.
     */
    private static void addSong()
    {
       
        String songTitle = InputReader.getString("Please enter song title:" );
        String artistName = InputReader.getString("Please enter artist's name:" );
        int playCount = InputReader.getInt("Please enter play count: " );

        Music myMusic = new Music(songTitle, artistName, playCount);
        songs.add(myMusic);
        System.out.println("==========================================");
        System.out.println("Congratulation your song has been added to the list!");
        System.out.println("");

       
    }
    /*
     * This is a menu displayed to the user to choose from.
     */
    public static void displayMenu()
    {
       System.out.println("==================================");
       System.out.println("Main Menu");
       System.out.println("==================================");
       System.out.println(" 1.Add songs"); 
       System.out.println(" 2.Remove songs"); 
       System.out.println(" 3.Print all songs"); 
       System.out.println(" 4.Print Top songs"); 
       System.out.println(" 5.Quit"); 

    
    }

         
    
}