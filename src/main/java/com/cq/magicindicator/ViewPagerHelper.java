package com.cq.magicindicator;

import androidx.viewpager.widget.ViewPager;
/**
  * @Package:        com.cq.magicindicator
  * @ClassName:      ViewPagerHelper
  * @Description:    简化和ViewPager绑定
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:49 PM
 */
public class ViewPagerHelper {
    public static void bind(final MagicIndicator magicIndicator, ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                magicIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                magicIndicator.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                magicIndicator.onPageScrollStateChanged(state);
            }
        });
    }
}
