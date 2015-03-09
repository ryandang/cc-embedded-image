// SkeletonApp.java - application class

package applications;
import useful.*;
import java.io.*;

/**
* Application which displays a welcome message on standard output.
* <p>A name or myArgs may be included in the greeting.  The myArgs are 
* supplied as command-line arguments.</p>
* <p>USAGE IS: java SkeletonApp name1 [name2 etc] # people to greet</p>
*  @version 5.0
*  @author Brian Perry
*/
public class Lab3
{
  //============================================static data
  // none

  //============================================instance data
  /** Used to store the myArgs of people to greet */
  private String[] myArgs;   // will contain the myArgs of people to greet

  private BufferedReader br;    // (reference to) the file object which will read the data
    
  //============================================constructors
  // none defined ( :. default constructor provided by compiler )

  //============================================methods
  //=========================(alphabetic by method name)

  //--------------------------------------------init()
  /**
  * Performs one-time intialization at start of application
  * <p>This method processes the command-line arguments.</p>
  * @param args arguments from command-line
  * <p>opens input and/output files or database(s)</p> 
  * <p>opens network connections</p>
  */
  private String init(String[] args)
  {
    String temp = "";
    if (args.length > 0)
    {
      //--- display the message on standard output
      myArgs = new String[args.length];
      for (int k = 0; k < args.length; k++)
      {
        myArgs[k] = args[k];    
      }
      System.out.println();
    }
    else
    {
      usage();      // display usage message (run instructions)
      System.err.println("Program terminating abnormally");
      System.exit(9999);  // kills the Java Virtual Machine (JVM)
    }
    
    // create the file object (it is open when created)
    br = new BufferedReader( new InputStreamReader(System.in));

    return temp;
  } // end of init()

  //--------------------------------------------run()
  /**
  * Controls the major part of the application (typically in 
  * a loop which reads input file(s)) but in this case
  * processes the items stored in array myArgs from the array args
  */
  private void run() throws IOException
  
  {
  
    String         buf; // into which to read 
	boolean notdone = true;
// TODO
	String  buf1;
	String 	buf2;
	String  buf3;
	String newformatedDate;


	while(notdone)	
	{
		System.out.println("\n***************************************************");
		System.out.println("Please Enter the date you would like to be reformat: ");	
		buf1 = br.readLine(); // read the (next) record from the file
		System.out.println("Please Enter the format of the date you just entered (some valid format DD-MM-YYYY, MM/DD/YYYY, YYYYMMDD and DD-MON-YYYY): ");
		buf2 = br.readLine();
		System.out.println("Please Enter the format of the date you prefer (some valid format DD-MM-YYYY, MM/DD/YYYY, YYYYMMDD and DD-MON-YYYY): ");
		buf3 = br.readLine();		

		//newformatedDate = Useful.convertDate(buf1, buf2, buf3);
		
		System.out.println("Do you want Exit?(Y/N): ");
		buf = br.readLine();
	
		System.out.println("\n*************************************************** \n\n\n");
//		System.out.println("just read: " + buf + myArgs.length);  
//		buf2 = Useful.convertDate(" ", " ", " ");
		if(buf.toUpperCase().equals("Y"))
		{
			System.out.println("Good Bye!");
			notdone = false;
		}
	}
	
  }  // end of run()

  //--------------------------------------------usage()
  /**
  * Displays a help message for how to use this application
  */
  private void usage()
  {
  System.err.println("USAGE IS: " +
                     "Lab 3. Plese enter at least 1 parameter");
  } // end of usage()

  //--------------------------------------------wrap()
  /**
  * Performs one-time cleanup just before the application ends.
  * <p>closes input and/output files or database(s)</p> 
  * <p>closes network connections</p>
  */
  private int wrap()
  {
    int retval = 0;
    System.out.println("+++program ending+++");
    return retval;
  }  // end of wrap()

  //--------------------------------------------main()
  /**
  * This is the first method called.  Controls the application
  * (but the major work is done in the init(), run() and  wrap()
  * methods).
  */
  public static void main(String[] args)
    throws IOException
  {
    Lab3 theApp = new Lab3(); // make object of own class

    theApp.init(args);
    theApp.run();
    theApp.wrap();
  } // end of main()

} // end of class
