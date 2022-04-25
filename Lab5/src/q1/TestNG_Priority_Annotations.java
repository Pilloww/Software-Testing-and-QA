package q1;

import org.testng.annotations.Test;

public class TestNG_Priority_Annotations {
  @Test()
  public void cmethod() {
	  System.out.println("I'm in method C");
  }
  @Test()
  public void bmethod() {
	  System.out.println("I'm in method B");
  }
  @Test(priority=6)
  public void amethod() {
	  System.out.println("I'm in method A");
  }
  @Test(priority=0)
  public void emethod() {
	  System.out.println("I'm in method E");
  }
  @Test(priority=6)
  public void dmethod() {
	  System.out.println("I'm in method D");
  }
  //non-priority test methods were run first and were run in terms of
  //alphabetical order so bmethod was run before cmethod
  //then highest priority 0 emethod was run
  //then as amethod and dmethod have same priority, they were run
  //in alphabetical order so amethod runs before dmethod
}
