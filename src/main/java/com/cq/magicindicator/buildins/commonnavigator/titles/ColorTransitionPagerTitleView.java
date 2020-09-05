package com.cq.magicindicator.buildins.commonnavigator.titles;

import android.content.Context;
import android.graphics.Typeface;

import com.cq.magicindicator.buildins.ArgbEvaluatorHolder;

/**
  * @Package:        com.cq.magicindicator.buildins.commonnavigator.titles
  * @ClassName:      ColorTransitionPagerTitleView
  * @Description:    两种颜色过渡的指示器标题
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:51 PM
 */
public class ColorTransitionPagerTitleView extends SimplePagerTitleView {

    public ColorTransitionPagerTitleView(Context context) {
        super(context);
    }

    @Override
    public void onLeave(int index, int totalCount, float leavePercent, boolean leftToRight) {
        int color = ArgbEvaluatorHolder.eval(leavePercent, mSelectedColor, mNormalColor);
        setTextColor(color);
    }

    @Override
    public void onEnter(int index, int totalCount, float enterPercent, boolean leftToRight) {
        int color = ArgbEvaluatorHolder.eval(enterPercent, mNormalColor, mSelectedColor);
        setTextColor(color);
    }

    @Override
    public void onSelected(int index, int totalCount) {
//        setFakeBoldText
        setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override
    public void onDeselected(int index, int totalCount) {
        setTypeface(Typeface.DEFAULT);
    }
}
