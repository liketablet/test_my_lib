package ktown_admin.heykorean.com.testlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Hey.Hung on 8/6/2016.
 */
public class MyView extends LinearLayout {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private void initialize(Context context) {
        inflate(context, R.layout.my_view, this);
    }
}
