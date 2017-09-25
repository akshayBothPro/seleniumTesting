package seleniumClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({ Test.class })
public class AllTests {
	public static Test suite() {
	    TestSuite suite = new TestSuite();
	    suite.addTestSuite(gmail.class);
	    return suite;
	  }

	  public static void main(String[] args) {
	    junit.textui.TestRunner.run(suite());

}
}