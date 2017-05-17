package com.github.alexpfx;

public class TournmentBuilder {
    private String mType;
    private String mTitle;
    private int mSize;
    private int mFormat;
    private int mGroups;
    private int mWin_points;
    private int mDraw_points;
    private int mLoss_points;

    public TournmentBuilder setType(String type) {
        mType = type;
        return this;
    }

    public TournmentBuilder setTitle(String title) {
        mTitle = title;
        return this;
    }

    public TournmentBuilder setSize(int size) {
        mSize = size;
        return this;
    }

    public TournmentBuilder setFormat(int format) {
        mFormat = format;
        return this;
    }

    public TournmentBuilder setGroups(int groups) {
        mGroups = groups;
        return this;
    }

    public TournmentBuilder setWin_points(int win_points) {
        mWin_points = win_points;
        return this;
    }

    public TournmentBuilder setDraw_points(int draw_points) {
        mDraw_points = draw_points;
        return this;
    }

    public TournmentBuilder setLoss_points(int loss_points) {
        mLoss_points = loss_points;
        return this;
    }

    public Tournment createTournment() {
        return new Tournment(mType, mTitle, mSize, mFormat, mGroups, mWin_points, mDraw_points,
                mLoss_points);
    }
}