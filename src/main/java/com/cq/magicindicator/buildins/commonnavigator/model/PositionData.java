package com.cq.magicindicator.buildins.commonnavigator.model;

/**
  * @Package:        com.cq.magicindicator.buildins.commonnavigator.model
  * @ClassName:      PositionData
  * @Description:    保存指示器标题的坐标
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:52 PM
 */
public class PositionData {
    public int mLeft;
    public int mTop;
    public int mRight;
    public int mBottom;
    public int mContentLeft;
    public int mContentTop;
    public int mContentRight;
    public int mContentBottom;

    public int width() {
        return mRight - mLeft;
    }

    public int height() {
        return mBottom - mTop;
    }

    public int contentWidth() {
        return mContentRight - mContentLeft;
    }

    public int contentHeight() {
        return mContentBottom - mContentTop;
    }

    public int horizontalCenter() {
        return mLeft + width() / 2;
    }

    public int verticalCenter() {
        return mTop + height() / 2;
    }
}
