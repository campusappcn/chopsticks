package cn.campusapp.chopsticks;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.widget.RelativeLayout;

/**
 * Layout helper for a view in relative layout
 * <p/>
 * Created by nius on 10/9/15.
 */
@SuppressWarnings("unused")
public class RelativeLayoutStick extends MarginStick<RelativeLayoutStick> {

    private static final int FALSE = 0;
    @NonNull
    final RelativeLayout.LayoutParams mLp;

    RelativeLayoutStick(@NonNull RelativeLayout.LayoutParams lp) {
        this.mLp = lp;
    }

    @Override
    protected RelativeLayoutStick getThis() {
        return this;
    }

    @NonNull
    @Override
    protected RelativeLayout.LayoutParams lp() {
        return mLp;
    }

    public RelativeLayoutStick alignTop(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_TOP, id);
        return this;
    }

    public RelativeLayoutStick alignBottom(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_BOTTOM, id);
        return this;
    }

    public RelativeLayoutStick alignLeft(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_LEFT);
        return this;
    }

    public RelativeLayoutStick alignRight(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_RIGHT);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignEnd(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_END, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignStart(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_START, id);
        return this;
    }

    public RelativeLayoutStick alignBaseLine(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_BASELINE, id);
        return this;
    }


    public RelativeLayoutStick toRightOf(@IdRes int id) {
        lp().addRule(RelativeLayout.RIGHT_OF, id);
        return this;
    }

    public RelativeLayoutStick toLeftOf(@IdRes int id) {
        lp().addRule(RelativeLayout.LEFT_OF, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick toStartOf(@IdRes int id) {
        lp().addRule(RelativeLayout.START_OF, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick toEndOf(@IdRes int id) {
        lp().addRule(RelativeLayout.END_OF, id);
        return this;
    }


    public RelativeLayoutStick above(@IdRes int id) {
        lp().addRule(RelativeLayout.ABOVE, id);
        return this;
    }

    public RelativeLayoutStick below(@IdRes int id) {
        lp().addRule(RelativeLayout.BELOW, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignParentStart(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_START);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_START, FALSE);
        }
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignParentStart() {
        return alignParentStart(true);
    }

    public RelativeLayoutStick alignParentLeft(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_LEFT, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick alignParentLeft() {
        return alignParentLeft(true);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignParentEnd(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_END);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_END, FALSE);
        }
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutStick alignParentEnd() {
        return alignParentEnd(true);
    }

    public RelativeLayoutStick alignParentRight(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_RIGHT, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick alignParentRight() {
        return alignParentRight(true);
    }

    public RelativeLayoutStick alignParentTop(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_TOP);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_TOP, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick alignParentTop() {
        return alignParentTop(true);
    }

    public RelativeLayoutStick alignParentBottom(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick alignParentBottom() {
        return alignParentBottom(true);
    }

    public RelativeLayoutStick centerInParent(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_IN_PARENT);
        } else {
            lp().addRule(RelativeLayout.CENTER_IN_PARENT, 0);
        }
        return this;
    }

    public RelativeLayoutStick centerInParent() {
        return centerInParent(true);
    }

    public RelativeLayoutStick centerVertical(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_VERTICAL);
        } else {
            lp().addRule(RelativeLayout.CENTER_VERTICAL, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick centerHorizontal(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_HORIZONTAL);
        } else {
            lp().addRule(RelativeLayout.CENTER_HORIZONTAL, FALSE);
        }
        return this;
    }

    public RelativeLayoutStick centerHorizontal() {
        return centerHorizontal(true);
    }

}