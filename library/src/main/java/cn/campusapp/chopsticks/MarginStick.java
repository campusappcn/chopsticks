package cn.campusapp.chopsticks;

import android.view.View;
import android.view.ViewGroup;

/**
 * layout helper for layout that has margins
 *
 * Created by nius on 10/9/15.
 */
@SuppressWarnings("unused")
public abstract class MarginStick<T extends MarginStick<T>> extends Chopstick<T> {

    public MarginStick(View targetView) {
        super(targetView);
    }

    @Override
    protected abstract ViewGroup.MarginLayoutParams lp();

    public T marginLeft(int marginLeft) {
        lp().setMargins(marginLeft, lp().topMargin, lp().rightMargin, lp().bottomMargin);
        return getThis();
    }

    public T marginRight(int marginRight) {
        lp().setMargins(lp().leftMargin, lp().topMargin, marginRight, lp().bottomMargin);
        return getThis();
    }

    public T marginBottom(int marginBottom) {
        lp().setMargins(lp().leftMargin, lp().topMargin, lp().rightMargin, marginBottom);
        return getThis();
    }

    public T marginTop(int marginTop) {
        lp().setMargins(lp().leftMargin, marginTop, lp().rightMargin, lp().bottomMargin);
        return getThis();
    }

}
