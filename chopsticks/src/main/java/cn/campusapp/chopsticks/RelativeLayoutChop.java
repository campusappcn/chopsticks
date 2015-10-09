package cn.campusapp.chopsticks;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.widget.RelativeLayout;

/**
 * Layout helper for relative layout
 * <p/>
 * Created by nius on 10/9/15.
 */
@SuppressWarnings("unused")
public class RelativeLayoutChop extends MarginChop<RelativeLayoutChop> {

    private static final int FALSE = 0;
    @NonNull
    RelativeLayout.LayoutParams mLp;
    @NonNull
    Context mContext;

    public RelativeLayoutChop(@NonNull RelativeLayout.LayoutParams lp, @NonNull Context context) {
        this.mLp = lp;
        mContext = context;
    }

    @Override
    protected RelativeLayoutChop getThis() {
        return this;
    }

    @NonNull
    @Override
    protected RelativeLayout.LayoutParams lp() {
        return mLp;
    }

    public RelativeLayoutChop alignTop(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_TOP, id);
        return this;
    }

    public RelativeLayoutChop alignBottom(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_BOTTOM, id);
        return this;
    }

    public RelativeLayoutChop alignLeft(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_LEFT);
        return this;
    }

    public RelativeLayoutChop alignRight(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_RIGHT);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignEnd(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_END, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignStart(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_START, id);
        return this;
    }

    public RelativeLayoutChop alignBaseLine(@IdRes int id) {
        lp().addRule(RelativeLayout.ALIGN_BASELINE, id);
        return this;
    }


    public RelativeLayoutChop toRightOf(@IdRes int id) {
        lp().addRule(RelativeLayout.RIGHT_OF, id);
        return this;
    }

    public RelativeLayoutChop toLeftOf(@IdRes int id) {
        lp().addRule(RelativeLayout.LEFT_OF, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop toStartOf(@IdRes int id) {
        lp().addRule(RelativeLayout.START_OF, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop toEndOf(@IdRes int id) {
        lp().addRule(RelativeLayout.END_OF, id);
        return this;
    }


    public RelativeLayoutChop above(@IdRes int id) {
        lp().addRule(RelativeLayout.ABOVE, id);
        return this;
    }

    public RelativeLayoutChop below(@IdRes int id) {
        lp().addRule(RelativeLayout.BELOW, id);
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignParentStart(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_START);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_START, FALSE);
        }
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignParentStart() {
        return alignParentStart(true);
    }

    public RelativeLayoutChop alignParentLeft(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_LEFT, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop alignParentLeft() {
        return alignParentLeft(true);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignParentEnd(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_END);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_END, FALSE);
        }
        return this;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    public RelativeLayoutChop alignParentEnd() {
        return alignParentEnd(true);
    }

    public RelativeLayoutChop alignParentRight(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_RIGHT, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop alignParentRight() {
        return alignParentRight(true);
    }

    public RelativeLayoutChop alignParentTop(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_TOP);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_TOP, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop alignParentTop() {
        return alignParentTop(true);
    }

    public RelativeLayoutChop alignParentBottom(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        } else {
            lp().addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop alignParentBottom() {
        return alignParentBottom(true);
    }

    public RelativeLayoutChop centerInParent(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_IN_PARENT);
        } else {
            lp().addRule(RelativeLayout.CENTER_IN_PARENT, 0);
        }
        return this;
    }

    public RelativeLayoutChop centerInParent() {
        return centerInParent(true);
    }

    public RelativeLayoutChop centerVertical(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_VERTICAL);
        } else {
            lp().addRule(RelativeLayout.CENTER_VERTICAL, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop centerHorizontal(boolean b) {
        if (b) {
            lp().addRule(RelativeLayout.CENTER_HORIZONTAL);
        } else {
            lp().addRule(RelativeLayout.CENTER_HORIZONTAL, FALSE);
        }
        return this;
    }

    public RelativeLayoutChop centerHorizontal() {
        return centerHorizontal(true);
    }

}