package com.cq.magicindicator.buildins.commonnavigator.abs;


import com.cq.magicindicator.buildins.commonnavigator.model.PositionData;

import java.util.List;

/**
  * @Package:        com.cq.magicindicator.buildins.commonnavigator.abs
  * @ClassName:      IPagerIndicator
  * @Description:    抽象的viewpager指示器，适用于CommonNavigator
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:54 PM
 */
public interface IPagerIndicator {
    void onPageScrolled(int position, float positionOffset, int positionOffsetPixels);

    void onPageSelected(int position);

    void onPageScrollStateChanged(int state);

    void onPositionDataProvide(List<PositionData> dataList);
}
