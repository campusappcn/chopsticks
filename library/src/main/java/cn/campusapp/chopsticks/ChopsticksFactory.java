package cn.campusapp.chopsticks;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Factory to get the builder should be used according to parent layout type
 *
 * Created by nius on 10/9/15.
 */
@SuppressWarnings({"ConstantConditions", "unused"})
public class ChopsticksFactory {

    @NonNull
    private final View mView;

    ChopsticksFactory(@NonNull View childView) {
        this.mView = childView;
    }

    /**
     * To get a helper for a view in relative layout
     * The view in the factory should HAS default layout param, usually inflated from xml
     *
     * @return helper to layout isInRelative layout
     */
    public RelativeLayoutStick isInRelative() {
        return (RelativeLayoutStick) isInLayout(RelativeLayout.LayoutParams.class, true, 0, 0);
    }

    /**
     * To get a helper for a view in relative layout
     * The view in the factory should HAS NO default layout param, usually instantiated programmatically
     *
     * @param width  mostly the {@link ViewGroup.LayoutParams#WRAP_CONTENT} or {@link ViewGroup.LayoutParams#MATCH_PARENT}
     * @param height mostly the {@link ViewGroup.LayoutParams#WRAP_CONTENT} or {@link ViewGroup.LayoutParams#MATCH_PARENT}
     * @return helper to layout isInRelative layout
     */
    public RelativeLayoutStick isInRelative(int width, int height){
        return (RelativeLayoutStick) isInLayout(RelativeLayout.LayoutParams.class, false, width, height);
    }

    public LinearLayoutStick isInLinear(){
        return (LinearLayoutStick) isInLayout(LinearLayout.LayoutParams.class, true, 0, 0);
    }

    public LinearLayoutStick isInLinear(int width, int height){
        return (LinearLayoutStick) isInLayout(LinearLayout.LayoutParams.class, false, width, height);
    }

    /**
     * Choose the right builder stick according to layout params type
     *
     * @param layoutParamsType say {@link android.widget.LinearLayout.LayoutParams}
     * @param useExistingLayoutParams if true, no LayoutParams will be instantiated
     * @param width if not useExistingLayoutParams, new LayoutParams will use this as its width
     * @param height if not useExistingLayoutParams, new LayoutParams will use this as its height
     * @param <LP> the LayoutParam generic type
     * @return the corresponding builder stick
     */
    private <LP extends ViewGroup.LayoutParams> Chopstick isInLayout(Class<LP> layoutParamsType, boolean useExistingLayoutParams,
                                                             int width, int height){
        LP lp = useExistingLayoutParams
                ? useExistingLayoutParams(layoutParamsType)
                : useNewLayoutParams(layoutParamsType, width, height);

        if (RelativeLayout.LayoutParams.class.equals(layoutParamsType)) {
            return new RelativeLayoutStick((RelativeLayout.LayoutParams) lp, mView);
        }
        else if(LinearLayout.LayoutParams.class.equals(layoutParamsType)){
            return new LinearLayoutStick((LinearLayout.LayoutParams)lp, mView);
        }

        throw new UnsupportedOperationException("This Layout is not currently supported. A PR is welcome!");
    }

    @Nullable
    private <LP extends ViewGroup.LayoutParams> LP useExistingLayoutParams(Class<LP> layoutParamsType) {
        if (mView == null) {
            throw new IllegalArgumentException("View should not be null");
        }

        @SuppressWarnings("unchecked")
        LP lp = (LP) mView.getLayoutParams();

        if (lp == null) {
            if (Chopstick.IS_DEBUG) {
                throw new IllegalArgumentException("The view has no layout param, You should use isInRelative(width, height)");
            }
            Log.e(Chopstick.TAG, "The view has no layout param, You should use isInRelative(width, height)");
            try {
                lp = layoutParamsType.getConstructor(Integer.TYPE, Integer.TYPE).newInstance(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            } catch (Exception e) {
                throw new RuntimeException("instantiate layout param fail", e);
            }
        }
        return lp;
    }

    @SuppressWarnings("unchecked")
    public <LP extends ViewGroup.LayoutParams> LP useNewLayoutParams(Class<LP> layoutParamsType, int width, int height) {
        if (mView == null) {
            throw new IllegalArgumentException("View should not be null");
        }

        LP lp = (LP) mView.getLayoutParams();
        if (lp != null) {
            Log.w(Chopstick.TAG, "The view's original layout param will be replaced");
        }
        try {
            lp = layoutParamsType.getDeclaredConstructor(Integer.TYPE, Integer.TYPE).newInstance(width, height);
        } catch (Exception e){
            throw new RuntimeException("instantiate layout param fail", e);
        }

        return lp;
    }

}
