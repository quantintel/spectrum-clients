package org.quantintel.spectrum;

public class SingleLongValue {
  private Long value = null;
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleLongValue {\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

