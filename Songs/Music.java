package Songs;

/** 
 * This class will store the details of a single song
 * @author Keegan De souza
 * 
 *
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
 /*
  * This are the contructors.
  */
    public Music(String songTitle, String artistName, int playCount) 
    {
        
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.playCount = playCount;
        
    }

 /*
  * This code returns the get title value when called.
  */
    public String getsongTitle()
    {
    return songTitle;
    }
 /*
  * This code returns the get artists name value when called.
  */

    public String getartistName()
    {
    return artistName;
    }
 /*
  * This code returns the get play count value when called.
  */

    public int getPlaycount()
    {
    return playCount;
    }
 /*
  * This code here prints the songs title,artist name and playcount.
  */

    public void print()
    {
        System.out.println(" \nSong " + songTitle + " by " + artistName + " Streamed " + playCount);
    }
}



