/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package twitter;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwitterTest {
    @Test public void appHasAGreeting() {
        Twitter classUnderTest = new Twitter();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}