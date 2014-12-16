package com.quantintel.spectrum

import com.quantintel.spectrum.Memory
case class Health (
  liveThreadCount: Int,
  peakThreadCount: Int,
  startedThreadCount: Long,
  daemonThreadCount: Int,
  memory: Memory)

