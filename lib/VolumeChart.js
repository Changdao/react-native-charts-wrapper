import PropTypes from 'prop-types';
import React, {Component} from 'react';
import {
  requireNativeComponent,
  View
} from 'react-native';

import BarLineChartBase from './BarLineChartBase';
import {volumeData} from './ChartDataConfig';
import MoveEnhancer from './MoveEnhancer'
import ScaleEnhancer from "./ScaleEnhancer";
import HighlightEnhancer from "./HighlightEnhancer";
import ScrollEnhancer from "./ScrollEnhancer";

class VolumeChart extends React.Component {
  getNativeComponentName() {
    return 'RNVolumeChart'
  }

  getNativeComponentRef() {
    return this.nativeComponentRef
  }

  render() {
    return <RNVolumeChart {...this.props} ref={ref => this.nativeComponentRef = ref} />;
  }
}

VolumeChart.propTypes = {
  ...BarLineChartBase.propTypes,

  drawValueAboveBar: PropTypes.bool,
  drawBarShadow: PropTypes.bool,
  highlightFullBarEnabled: PropTypes.bool,

  data: volumeData
}

var RNVolumeChart = requireNativeComponent('RNVolumeChart', VolumeChart, {
  nativeOnly: {onSelect: true, onChange: true}
})

export default ScrollEnhancer(HighlightEnhancer(ScaleEnhancer(MoveEnhancer(VolumeChart))))
