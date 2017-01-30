/** The class StringArrayTools implements a variety of basic array tasks
  * using an array of Strings.
  * 
  * The array has a fixed length MAX_NUMS but the actual number of elements
  * that are used can vary.
  */

import java.util.Scanner;

public class StringArrayTools1
{
  
  private String[] arrayData;
  private int arrayCount;
  public final int MAX_NUMS = 100;
  
  // ------------------ CONSTRUCTOR ----------------------------
  /** The contsructor merely creates the array.
    * It does not fill it with any data.  That is left up to 
    * the fillRandom or fillKeyboard methods.
    */
  public StringArrayTools1 ()
  {
    arrayData = new String[MAX_NUMS];
    arrayCount = 0;
  }
  
  /** Returns the number of objects in the array.
    * @return the count of items in the array. 
    */ 
  public int getCount ()
  {
    return arrayCount;
  }
  
  // ------------------- METHODS TO FILL THE ARRAY -------------------------
  /** Adds an element to the end of the array. 
    * @param n The element to add
    * @return whether the element was successfully added
    */
  public boolean addItem (String n)
  {
    if (arrayCount < MAX_NUMS)
    {
      arrayData[arrayCount] = n;
      arrayCount++;
      return true;
    }
    else
      return false;
  }
  
    /** Fills the array nums with integers from 1 to n
    * @param n Upper bound for numbers with which to fill the array.
    * @param count the array to fill.  Returns a modified array.
    */
  
  /* public void fillRandom (int n, int count)
  {
    if (count > MAX_NUMS)       // check that it's not too many items
      count = MAX_NUMS;
    for (int i = 0; i < count; i++)
      addItem((int)(Math.random() * n) + 1);
  }
 
  
  /** Fills the array with strings entered by the user
    * @param nums the array to fill.  Returns a modified array.
    */
  public void fillKeyboard ()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Please enter a string and press return to enter the next one.");
    System.out.println ("press return one more time to signal the end of the list.");
    
    arrayCount = 0;
    String n = keyboard.nextLine();
    while (n.length() != 0)                 // stop input when user presses return only 
    {
      addItem(n);
      n = keyboard.nextLine();
    }
    keyboard.close();
  }
  
  // -------------------- METHODS TO WORK WITH THE ARRAY --------------------------
  /** Finds the largest element in the array, or the element that comes last alphabetically  
    * @return the largest element in the array 
    */
  public String getMax ()
  {
    String maxStr = arrayData[0]; 
    for (int i = 0; i< arrayCount; i++)
    {
      if (arrayData[i].compareTo(maxStr) > 0)
        maxStr = arrayData [i]; 
    }
    return maxStr; 
  }
  
  
  /** Finds the position of the largest element in the array 
    * @return where the largest element is in the array. 
     */ 
  public int getMaxIndex ()
  {
    int pos = 0; 
    String maxStr = arrayData[0]; 
    for (int i = 0; i < arrayCount; i++)
    {
      if (arrayData[i].compareTo(maxStr) > 0 )
      {
        maxStr = arrayData[i]; 
        pos = i; 
      }
    }
    return pos; 
  }
    
  
  /** Finds the smallest element, or the one that comes first alphabetically, in the array 
    * @return the smallest element in the array 
    */
  public String getMin ()
  {
    String minStr = arrayData[0]; 
    for (int i = 0; i< arrayCount; i++)
    {
      if (arrayData[i].compareTo(minStr) < 0) 
        minStr = arrayData [i]; 
    }
    return minStr; 
  }
  
  /** Min Index
    * @return where the smallest element is in the array. 
    */
  public int getMinIndex()
  {
    int minIndex = 0; 
    String minStr = arrayData[0]; 
    for (int i = 0; i<arrayCount; i++)
    {
      if (arrayData[i].compareTo(minStr) < 0)
      {
        minStr = arrayData[i]; 
        minIndex = i; 
      }
    }
    return minIndex; 
  }
  
  /** Prints the array, each string on its own line.
    */
  public void printArray ()
  {
    for (int i = 0; i < arrayCount; i++)
    {
      System.out.println (arrayData[i]);
    }
    System.out.println();
  }
  
  /** Find the sum of an integer array
    * @return the sum of the elements in the array
    */
  /*public int sumArray ()
  {
    int sum = 0;
    for (int i = 0; i < arrayCount; i++)
      sum = sum + arrayData[i];
    return sum;
  }
  
  
  /** Tests the various array tools */
  public static void main (String[] args)
  {
    StringArrayTools myArray = new StringArrayTools();
    //myArray.fillRandom(100, 12);
    myArray.fillKeyboard ();
    myArray.printArray ();
    System.out.println ("There are " + myArray.getCount() + " strings in the array.");
    //System.out.println ("The sum is " + myArray.sumArray());
    
    // Un-comment these lines one at a time after you have written the appropriate code
      System.out.println (myArray.getMax() + " is the largest element in the array, which comes last alphabetically"); 
      System.out.println ("The largest item is at index " + myArray.getMaxIndex());

      System.out.println (myArray.getMin() + " is the smallest element in the array, which comes first alphabetically");
      System.out.println ("The smallest item is at index " + myArray.getMinIndex());
    
  }
}