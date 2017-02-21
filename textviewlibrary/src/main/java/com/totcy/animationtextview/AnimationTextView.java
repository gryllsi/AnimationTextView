package com.totcy.animationtextview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

/**
 * Description 带动画的数字显示textview
 * Author: tu
 * Date: 2017-02-21
 * Time: 11:21
 */

public class AnimationTextView extends TextView {

    private int num = 0;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        this.setText(num + "");
        invalidate();
    }

    public AnimationTextView(Context context) {
        this(context, null);
    }

    public AnimationTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AnimationTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 提供设置数值的方法
     * @param Num
     */
    public void setMaxNum(int Num) {
        ObjectAnimator o = ObjectAnimator.ofInt(this, "num", 0, Num);
        o.setDuration(2000);
        o.setInterpolator(new DecelerateInterpolator());
        o.start();
    }
}
