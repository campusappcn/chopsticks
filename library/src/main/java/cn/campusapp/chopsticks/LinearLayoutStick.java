package cn.campusapp.chopsticks;

import android.support.annotation.NonNull;
import android.widget.LinearLayout;

/**
 * layout helper for a view in linear layout
 * <p/>
 * Created by nius on 10/9/15.
 */
@SuppressWarnings("unused")
public class LinearLayoutStick extends MarginStick<LinearLayoutStick> {

    @NonNull
    final private LinearLayout.LayoutParams mLp;

    @NonNull
    final private LinearLayout mLinearLayout;

    LinearLayoutStick(@NonNull LinearLayout.LayoutParams lp, @NonNull LinearLayout linearLayout) {
        super(linearLayout);
        mLp = lp;
        mLinearLayout = linearLayout;
    }

    @Override
    protected LinearLayout.LayoutParams lp() {
        return mLp;
    }

    @Override
    protected LinearLayoutStick getThis() {
        return this;
    }


//  TODO these APIs are for the parent views. the layoutStick is for the children.
//    public LinearLayoutStick orientVertical() {
//        mLinearLayout.setOrientation(LinearLayout.VERTICAL);
//        return this;
//    }
//
//    public LinearLayoutStick orientHorizontal() {
//        mLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        return this;
//    }
//
//    /**
//     * @param orientation {@link LinearLayout#HORIZONTAL } or {@link LinearLayout#VERTICAL}
//     * @return this
//     */
//    public LinearLayoutStick orientation(int orientation) {
//        mLinearLayout.setOrientation(orientation);
//        return this;
//    }

    /**
     * @param gravities can be one or more in: <br/>
     *                  {@link android.view.Gravity#TOP}<br/>
     *                  {@link android.view.Gravity#BOTTOM}<br/>
     *                  {@link android.view.Gravity#CENTER}<br/>
     *                  {@link android.view.Gravity#CENTER_VERTICAL}<br/>
     *                  {@link android.view.Gravity#CENTER_HORIZONTAL}<br/>
     *                  {@link android.view.Gravity#LEFT}<br/>
     *                  {@link android.view.Gravity#RIGHT}<br/>
     *                  {@link android.view.Gravity#START}<br/>
     *                  {@link android.view.Gravity#END}<br/>
     *                  {@link android.view.Gravity#FILL}<br/>
     *                  {@link android.view.Gravity#FILL_HORIZONTAL}<br/>
     *                  {@link android.view.Gravity#FILL_VERTICAL}<br/>
     *                  {@link android.view.Gravity#CLIP_HORIZONTAL}<br/>
     *                  {@link android.view.Gravity#CLIP_VERTICAL}<br/>
     *                  {@link android.view.Gravity#NO_GRAVITY}<br/>
     * @return this
     * @see <a href="http://developer.android.com/reference/android/widget/LinearLayout.html#attr_android:gravity">android:gravity</a>
     */
    public LinearLayoutStick gravity(int... gravities) {
        int gravity = 0;
        for (int g : gravities) {
            gravity |= g;
        }
        //noinspection ResourceType
        lp().gravity = gravity;
        return this;
    }

    public LinearLayoutStick weight(float weight) {
        lp().weight = weight;
        return this;
    }


}
