package com.github.wuxudong.rncharts.data;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.List;
import java.util.HashMap;
import android.util.Log;

public class VolumeDataSet extends BarDataSet {
    public VolumeDataSet(List<BarEntry> yVals, String label) {
        super(yVals, label);
    }

    @Override
    public int getColor(int index) {
        HashMap data= (HashMap)(getEntryForIndex(index).getData());
        if(data!=null) // less than 95 green
        {
            Integer colorIndex=(Integer)data.get("colorIndex");
            if(colorIndex!=null)
                return mColors.get(colorIndex);
            else return super.getColor(index);
        }
            
        else return super.getColor(index);
    }
}