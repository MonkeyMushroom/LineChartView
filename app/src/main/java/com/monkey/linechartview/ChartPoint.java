package com.monkey.linechartview;

/**
 * 坐标点
 */
public class ChartPoint {

    /**
     * x轴坐标
     */
    private int x;
    /**
     * y轴坐标
     */
    private int y;
    /**
     * x轴坐标所对应的数据
     */
    private int xData;
    /**
     * y轴坐标所对应的数据
     */
    private int yData;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxData() {
        return xData;
    }

    public void setxData(int xData) {
        this.xData = xData;
    }

    public int getyData() {
        return yData;
    }

    public void setyData(int yData) {
        this.yData = yData;
    }

    @Override
    public String toString() {
        return "ChartPoint{" +
                "x=" + x +
                ", y=" + y +
                ", xData=" + xData +
                ", yData=" + yData +
                '}';
    }
}
