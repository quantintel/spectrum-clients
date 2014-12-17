package org.quantintel.spectrum;

import org.quantintel.spectrum.Memory;
public class Health {
  private Integer liveThreadCount = null;
  private Integer peakThreadCount = null;
  private Long startedThreadCount = null;
  private Integer daemonThreadCount = null;
  private Memory memory = null;
  public Integer getLiveThreadCount() {
    return liveThreadCount;
  }
  public void setLiveThreadCount(Integer liveThreadCount) {
    this.liveThreadCount = liveThreadCount;
  }

  public Integer getPeakThreadCount() {
    return peakThreadCount;
  }
  public void setPeakThreadCount(Integer peakThreadCount) {
    this.peakThreadCount = peakThreadCount;
  }

  public Long getStartedThreadCount() {
    return startedThreadCount;
  }
  public void setStartedThreadCount(Long startedThreadCount) {
    this.startedThreadCount = startedThreadCount;
  }

  public Integer getDaemonThreadCount() {
    return daemonThreadCount;
  }
  public void setDaemonThreadCount(Integer daemonThreadCount) {
    this.daemonThreadCount = daemonThreadCount;
  }

  public Memory getMemory() {
    return memory;
  }
  public void setMemory(Memory memory) {
    this.memory = memory;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    sb.append("  liveThreadCount: ").append(liveThreadCount).append("\n");
    sb.append("  peakThreadCount: ").append(peakThreadCount).append("\n");
    sb.append("  startedThreadCount: ").append(startedThreadCount).append("\n");
    sb.append("  daemonThreadCount: ").append(daemonThreadCount).append("\n");
    sb.append("  memory: ").append(memory).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

