package org.quantintel.spectrum

case class Memory (
  allocated: Long,
  max: Long,
  free: Long,
  used: Long,
  percentUsed: Double)

