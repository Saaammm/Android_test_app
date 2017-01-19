package junit2.example.com.junitsample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.MediumTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;


/**
 * Created by Eegasampath_Kumar on 12/22/2016.
 */
@RunWith(AndroidJUnit4.class)
@MediumTest
public class MyActivityEspressoTest  extends ActivityInstrumentationTestCase2<MainActivity> {
    public MyActivityEspressoTest() {
        super(MainActivity.class);
    }

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSendingTextToWelcomeActivity() {
        onView(withId(R.id.edit_text))
                .perform(typeText("Dolly"));
        onView(withId(R.id.hello_button))
                .perform(click());
        onView(withId(R.id.greeting_text))
                .check(matches(withText(containsString("Dolly"))));
    }
}
