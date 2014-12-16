package com.quantintel.financial

import com.quantintel.financial.Memory
case class Health (
  liveThreadCount: Int,
  peakThreadCount: Int,
  startedThreadCount: Long,
  daemonThreadCount: Int,
  memory: Memory)

