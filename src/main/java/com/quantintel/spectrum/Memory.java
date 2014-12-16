package com.quantintel.spectrum;

public class Memory {
  private Long allocated = null;
  private Long max = null;
  private Long free = null;
  private Long used = null;
  private Double percentUsed = null;
  public Long getAllocated() {
    return allocated;
  }
  public void setAllocated(Long allocated) {
    this.allocated = allocated;
  }

  public Long getMax() {
    return max;
  }
  public void setMax(Long max) {
    this.max = max;
  }

  public Long getFree() {
    return free;
  }
  public void setFree(Long free) {
    this.free = free;
  }

  public Long getUsed() {
    return used;
  }
  public void setUsed(Long used) {
    this.used = used;
  }

  public Double getPercentUsed() {
    return percentUsed;
  }
  public void setPercentUsed(Double percentUsed) {
    this.percentUsed = percentUsed;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memory {\n");
    sb.append("  allocated: ").append(allocated).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  free: ").append(free).append("\n");
    sb.append("  used: ").append(used).append("\n");
    sb.append("  percentUsed: ").append(percentUsed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

