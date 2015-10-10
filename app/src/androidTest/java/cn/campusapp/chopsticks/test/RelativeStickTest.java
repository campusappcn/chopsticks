package cn.campusapp.chopsticks.test;

import android.annotation.SuppressLint;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.PositionAssertions.isBelow;
import static android.support.test.espresso.assertion.PositionAssertions.isLeftAlignedWith;
import static android.support.test.espresso.assertion.PositionAssertions.isLeftOf;
import static android.support.test.espresso.assertion.PositionAssertions.isRightOf;
import static android.support.test.espresso.assertion.PositionAssertions.isTopAlignedWith;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import cn.campusapp.chopsticks.test.R;

/**
 * test for chopstick
 * <p>
 * Created by nius on 10/9/15.
 */
@SuppressLint("NewApi")
@RunWith(AndroidJUnit4.class)
public class RelativeStickTest {

    @Rule
    public ActivityTestRule<RelativeActivity> mActivityTestRule = new ActivityTestRule<>(RelativeActivity.class);

    @Test
    public void testLayoutInOnCreate() {

        onView(withId(R.id.top_right))
                .check(isRightOf(withId(R.id.center)))
        ;


        onView(withId(R.id.below_center_align_left))
                .check(isBelow(withId(R.id.center)))
                .check(isLeftAlignedWith(withId(R.id.center)))
        ;

        onView(withId(R.id.center_left_align_top))
                .check(isLeftOf(withId(R.id.center)))
                .check(isTopAlignedWith(withId(R.id.center)))
        ;

        onView(withId(R.id.bottom_center_horizontal))
                .check(isBelow(withId(R.id.below_center_align_left)))
        ;

//        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
//
//        assertEquals(100, lp.width);
//        assertEquals(10, lp.leftMargin);
//        assertEquals(RelativeLayout.TRUE, lp.getRules()[RelativeLayout.ALIGN_PARENT_BOTTOM]);

    }


}