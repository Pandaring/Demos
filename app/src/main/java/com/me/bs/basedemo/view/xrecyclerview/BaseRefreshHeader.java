package com.me.bs.basedemo.view.xrecyclerview;

/**
 * 作者: Panda8
 * 日期: 2018/5/7 11:07.
 */
interface BaseRefreshHeader {
    int STATE_NORMAL = 0;
    int STATE_RELEASE_TO_REFRESH = 1;
    int STATE_REFRESHING = 2;
    int STATE_DONE = 3;

    void onMove(float delta);

    boolean releaseAction();

    void refreshComplate();

    int getVisiableHeight();
}
