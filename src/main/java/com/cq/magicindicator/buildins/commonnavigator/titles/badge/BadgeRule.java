package com.cq.magicindicator.buildins.commonnavigator.titles.badge;

/**
  * @Package:        com.cq.magicindicator.buildins.commonnavigator.titles.badge
  * @ClassName:      BadgeRule
  * @Description:    角标的定位规则
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:52 PM
 */
public class BadgeRule {
    private BadgeAnchor mAnchor;
    private int mOffset;

    public BadgeRule(BadgeAnchor anchor, int offset) {
        mAnchor = anchor;
        mOffset = offset;
    }

    public BadgeAnchor getAnchor() {
        return mAnchor;
    }

    public void setAnchor(BadgeAnchor anchor) {
        mAnchor = anchor;
    }

    public int getOffset() {
        return mOffset;
    }

    public void setOffset(int offset) {
        mOffset = offset;
    }
}
