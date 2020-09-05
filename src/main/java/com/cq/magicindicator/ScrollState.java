package com.cq.magicindicator;

/**
  * @Package:        com.cq.magicindicator
  * @ClassName:      ScrollState
  * @Description:    自定义滚动状态，消除对ViewPager的依赖
  * @Author:         CQ
  * @CreateDate:     2020/9/5 5:49 PM
 */
public interface ScrollState {
    int SCROLL_STATE_IDLE = 0;
    int SCROLL_STATE_DRAGGING = 1;
    int SCROLL_STATE_SETTLING = 2;
}
