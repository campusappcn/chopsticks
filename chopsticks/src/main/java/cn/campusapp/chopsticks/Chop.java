package cn.campusapp.chopsticks;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Help to layout views
 * Created by nius on 15-9-29.
 */
public abstract class Chop<T extends Chop<T>> {

    private final static String TAG = "Chop";

    /**
     * To get a chop helper for releative layout
     *
     * @param view the view that has default layout param, usually inflated from xml
     * @return helper to layout relative layout
     */
    public static RelativeLayoutChop relative(View view) {

        if (view == null) {
            throw new IllegalArgumentException("View should not be null");
        }

        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();

        if (lp == null) {
            throw new IllegalArgumentException("You should use relative(View, width, height)");
        }

        return new RelativeLayoutChop(lp, view.getContext());
    }

    /**
     * To get a chop helper for relative layout
     *
     * @param view the view that has NO default layout param, usually instantiated by Java codes
     * @return helper to layout relative layout
     */
    public static RelativeLayoutChop relative(View view, int width, int height) {
        if (view == null) {
            throw new IllegalArgumentException("View should not be null");
        }

        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (lp != null) {
            Log.w(TAG, "The view's original layout param will be replaced");
        }
        lp = new RelativeLayout.LayoutParams(width, height);

        return new RelativeLayoutChop(lp, view.getContext());
    }

    /**
     * @return current editing LayoutParams
     */
    protected abstract ViewGroup.LayoutParams lp();

    /**
     * Generic type util to get a subclass instance
     *
     * @return this with subclass type
     */
    protected abstract T getThis();

    /**
     * set height in px
     *
     * @param height height in px
     * @return this
     */
    public T height(int height) {
        lp().height = height;
        return getThis();
    }

    /**
     * set width in px
     *
     * @param width width in px
     * @return this
     */
    public T width(int width) {
        lp().width = width;
        return getThis();
    }



}
