package com.github.wuxudong.rncharts.data;


import com.github.mikephil.charting.data.BarData;
import com.github.wuxudong.rncharts.data.VolumeDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;

import java.util.ArrayList;

//import android.util.Log;

/**
 * Created by xudong on 02/03/2017.
 */
public class VolumeDataExtract extends BarDataExtract {
    @Override
    IDataSet<BarEntry> createDataSet(ArrayList<BarEntry> entries, String label) {
        return new VolumeDataSet(entries, label);
    }
}
