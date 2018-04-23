package com.knowledge.mnlin.viewutilmixed.drawable;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;

/**
 * Created on 2018/1/5
 * function : 圆角矩形drawable
 *
 * @author ACChain
 */

public class RoundRectShapeDrawable extends ShapeDrawable {
    public RoundRectShapeDrawable() {
    }

    public RoundRectShapeDrawable(Shape s) {
        super(s);
    }

    /**
     * 通过宽高来实现一个drawable
     */
    public RoundRectShapeDrawable(int width, int height,@Nullable @ColorInt int color) {
        super(new RoundRectShape(new float[]{height, height, height, height, height, height, height, height}, null, null));
        getPaint().setColor(color);
    }
}
