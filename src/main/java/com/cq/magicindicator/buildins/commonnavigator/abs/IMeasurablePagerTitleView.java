package com.cq.magicindicator.buildins.commonnavigator.abs;

/**
  * @Package:        com.cq.magicindicator.buildins.commonnavigator.abs
  * @ClassName:      IMeasurablePagerTitleView
  * @Description:    可测量内容区域的指示器标题
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:53 PM
 */
public interface IMeasurablePagerTitleView extends IPagerTitleView {
    int getContentLeft();

    int getContentTop();

    int getContentRight();

    int getContentBottom();
}
