package Lab_Programs;

public class Pyramid
{
	
  public static void pyr(int n)
  {
    for (int row = n; row > 0; row--)
    {
      // Calculate # of Spaces
      int spaces = row - n;
      
      // Forward Spaces
      for (int fSpaces = 0; fSpaces < spaces; fSpaces++)
      {
        System.out.print(" ");
      }
      
      // Numbers in Front
      for (int nFront = row; nFront > 1; nFront--)
      {
        System.out.print(nFront);
      }
      
      // Numbers in Back
      for (int nBack = 1; nBack <= row; nBack++)
      {
        System.out.print(nBack);
      }
      
      // Newline
      System.out.println();
    }
  }
  
  public static void main(String[] args)
  {
    // Test(s)
    pyr(5);
  }
}
