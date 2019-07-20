package com.github.wuxudong.rncharts.data;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;

public class VolumeDataSet extends BarDataSet {
    public VolumeDataSet(List<BarEntry> yVals, String label) {
        super(yVals, label);
    }

    @Override
    public int getColor(int index) {
        VolumeColorData data= (VolumeColorData) getEntryForIndex(index).getData();
        if(data!=null) // less than 95 green
            return mColors.get(data.getColorIndex());
        else return super.getColor(index);
    }
}