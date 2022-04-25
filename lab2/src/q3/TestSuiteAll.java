package q3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//import the test classes and dependencies from the packages
import q1.*;
import q2.*;
@RunWith(Suite.class)
//add the 2 test classes
@SuiteClasses({ TriangleTest.class, RETest.class})
public class TestSuiteAll {

}
