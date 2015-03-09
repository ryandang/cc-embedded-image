package applications;

import java.io.*;
import test.*;

public class TestApplication
{


  private CCImageTest test;
  
  private String init()
  {
  
    String temp = "";

	System.out.println("\n***************************************************");    

    return temp;
  }

  //--------------------------------------------run()
  private void run() throws IOException
  {
  
	System.out.println("Please Enter the date you would like to be reformat: ");	
	test = new CCImageTest();
	test.runAllTests();
  }  // end of run()

  private int wrap()
  {
    int retval = 0;
    System.out.println("+++program ending+++");
    return retval;
  }  // end of wrap()
  
  public static void main(String[] args)
    throws IOException
  {
    TestApplication test = new TestApplication();

    test.init();
    test.run();
    test.wrap();
  }
}
