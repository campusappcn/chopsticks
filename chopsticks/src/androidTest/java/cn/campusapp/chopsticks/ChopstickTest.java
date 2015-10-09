package cn.campusapp.chopsticks;

import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.junit.Test;
import org.junit.runner.RunWith;

import static cn.campusapp.chopsticks.Chopstick.chop;

/**
 * test for chopstick
 * <p/>
 * Created by nius on 10/9/15.
 */
@RunWith(AndroidJUnit4.class)
public class ChopstickTest {

    @Test
    public void test() {
        View view = new View(null);

        chop(view).isInRelative()
                .width(100)
                .marginLeft(10)
                .alignParentBottom()
                .stick();

    }


}