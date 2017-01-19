package junit2.example.com.junitsample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Eegasampath_Kumar on 12/21/2016.
 */
public class ExampleTest2 {
    @Test
    public void addition_isCorrectorNot() throws Exception {
        assertEquals(0, 2 - 2);
    }
}
