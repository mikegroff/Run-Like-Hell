//Michael Groff
//COP 3503, Fall 2017
import java.io.*;
import java.util.*;
import java.lang.*;

public class RunLikeHell
{
  public static int maxGain(int [] blocks)
  {
    int l = blocks.length, maxi = 0, maxk = 0;
    if(l == 0)
      return 0;

    //since we must skip over at least one block every time the max amount of
    //knowledge gained will have two different possibilities
    //one with the current block in front of us and one without it
    for(int i = 0; i < l; i++)
    {
      if( blocks[i] <= 0)
        continue;//in case of negative numbers we effectivly ignore their existence
      int newmax = Math.max( maxi + blocks[i], maxk);
      maxi = maxk;
      maxk = newmax;
    }
    return maxk;
  }
  public static double difficultyRating()
  {
    return 2.0;//
  }
  public static double hoursSpent()
  {
    return 6.0;//
  }
}
