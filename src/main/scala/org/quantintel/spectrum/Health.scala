package org.quantintel.spectrum

import org.quantintel.spectrum.Memory
case class Health (
  liveThreadCount: Int,
  peakThreadCount: Int,
  startedThreadCount: Long,
  daemonThreadCount: Int,
  memory: Memory)

