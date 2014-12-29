package org.quantintel.spectrum;

public class SingleDoubleValue {
  private Double value = null;
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleDoubleValue {\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

