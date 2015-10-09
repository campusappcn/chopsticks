package cn.campusapp.chopsticks.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static cn.campusapp.chopsticks.Chopstick.chop;

@SuppressLint("SetTextI18n")
public class RelativeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        View view = findViewById(R.id.top_right);
//        RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) view.getLayoutParams();
//        lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//
//        view.setLayoutParams(lp);

        chop(findViewById(R.id.top_right)).isInRelative()
                .alignParentTop()
                .alignParentRight()
                .stick();

        chop(findViewById(R.id.center)).isInRelative()
                .centerInParent()
                .stick();

        chop(findViewById(R.id.below_center_align_left)).isInRelative()
                .below(R.id.center)
                .alignLeft(R.id.center)
                .stick();


        chop(findViewById(R.id.center_left_align_top)).isInRelative()
                .toLeftOf(R.id.center)
                .alignTop(R.id.center)
                .stick();

        TextView textView = new TextView(this);
        textView.setText("BOTTOM CENTER HORIZONTAL");
        textView.setId(R.id.bottom_center_horizontal);
        chop(textView).isInRelative(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                .alignParentBottom()
                .centerHorizontal()
                .stick();

        RelativeLayout root = (RelativeLayout) findViewById(R.id.root_relative_view);
        root.addView(textView);


    }
}
