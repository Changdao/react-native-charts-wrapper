package com.github.wuxudong.rncharts.charts;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarEntry;
//import com.github.wuxudong.rncharts.data.VolumeEntry;
//import com.github.wuxudong.rncharts.charts.VolumeChart;
import com.github.wuxudong.rncharts.data.VolumeDataExtract;
import com.github.wuxudong.rncharts.data.DataExtract;
import com.github.wuxudong.rncharts.listener.RNOnChartGestureListener;
import com.github.wuxudong.rncharts.listener.RNOnChartValueSelectedListener;

public class VolumeChartManager extends BarLineChartBaseManager<BarChart, BarEntry> {

    @Override
    public String getName() {
        return "RNVolumeChart";
    }

    @Override
    protected BarChart createViewInstance(ThemedReactContext reactContext) {
        BarChart volumeChart = new BarChart(reactContext);
        volumeChart.setOnChartValueSelectedListener(new RNOnChartValueSelectedListener(volumeChart));
        volumeChart.setOnChartGestureListener(new RNOnChartGestureListener(volumeChart));
        return volumeChart;
    }

    @Override
    DataExtract getDataExtract() {
        return new VolumeDataExtract();
    }

    @ReactProp(name = "drawValueAboveBar")
    public void setDrawValueAboveBar(BarChart chart, boolean enabled) {
        chart.setDrawValueAboveBar(enabled);
    }

    @ReactProp(name = "drawBarShadow")
    public void setDrawBarShadow(BarChart chart, boolean enabled) {
        chart.setDrawBarShadow(enabled);
    }

    @ReactProp(name = "highlightFullBarEnabled")
    public void setHighlightFullBarEnabled(BarChart chart, boolean enabled) {
        chart.setHighlightFullBarEnabled(enabled);
    }
}
