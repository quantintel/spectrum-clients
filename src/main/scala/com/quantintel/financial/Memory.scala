package com.quantintel.financial

case class Memory (
  allocated: Long,
  max: Long,
  free: Long,
  used: Long,
  percentUsed: Double)

