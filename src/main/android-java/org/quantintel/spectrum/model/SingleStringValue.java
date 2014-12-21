package org.quantintel.spectrum.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SingleStringValue {
  @JsonProperty("value")
  private String value = null;
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleStringValue {\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

