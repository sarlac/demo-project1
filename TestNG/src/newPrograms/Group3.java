package newPrograms;

import org.testng.annotations.Test;

public class Group3 {
  @Test(groups= {"three-wheeler"})
  
  public void Auto() 
  {
	  System.out.println("three wheeler");
  }
  @Test(groups= {"two-wheeler"})
  public void Herohonda() 
  {
	System.out.println("two wheeler bike");  
  }
  @Test(groups= {"two-wheeler"})
  public void Tvs() 
  {
	System.out.println("two wheeler bike");  
  }
  @Test(groups= {"Four-wheeler"})
  public void Swift() 
  {
	System.out.println("four wheeler ");  
  }
  @Test(groups= {"Four-wheeler"})
  public void Baleno() 
  {
	System.out.println("two wheeler ");  
  }
}
