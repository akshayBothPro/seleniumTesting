package seleniumClasses;
import junit.framework.TestSuite;

public class test {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(gmail.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
