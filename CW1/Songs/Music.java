package Songs;

/** 
 * This class will store the details of a single song
 * @author Keegan De souza
 
*/

public class Music
{
/*
*This code holds my song title artist name and play count that would be used within the program
*Furthermore the code created here would be used to add unique songs to my arraylist. 
*/    
    private String songTitle;              
    private String artistName; 
    private int playCount;            

    public Music(String songTitle, String artistName, int playCount) 
    {
        
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.playCount = playCount;
        
    }

    


    public String getsongTitle()
    {
    return songTitle;
    }

    public String getartistName()
    {
    return artistName;
    }

    public int getPlaycount()
    {
    return playCount;
    }

    public void print()
    {
        System.out.println(" \nSong " + songTitle + " by " + artistName + " Streamed " + playCount);
    }
}



