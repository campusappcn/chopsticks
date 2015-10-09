package cn.campusapp.chopsticks;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

/**
 * Help to layout views
 * Created by nius on 15-9-29.
 */
@SuppressWarnings("unused")
public abstract class Chopstick<T extends Chopstick<T>> {

    final static String TAG = "Chop";

    static boolean IS_DEBUG = false;

    public static void setDebug(boolean isDebug){
        IS_DEBUG = isDebug;
    }

    public static ChopsticksFactory view(@NonNull View view){
        return new ChopsticksFactory(view);
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
