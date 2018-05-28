package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Test1
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-18T11:02:13.290-05:00")

public class Test1   {
  @JsonProperty("column1")
  private String column1 = null;

  @JsonProperty("id")
  private String id = null;

  public Test1 column1(String column1) {
    this.column1 = column1;
    return this;
  }

   /**
   * Get column1
   * @return column1
  **/
  @ApiModelProperty(value = "")
  public String getColumn1() {
    return column1;
  }

  public void setColumn1(String column1) {
    this.column1 = column1;
  }

  public Test1 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Test1 test1 = (Test1) o;
    return Objects.equals(this.column1, test1.column1) &&
        Objects.equals(this.id, test1.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column1, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Test1 {\n");

    sb.append("    column1: ").append(toIndentedString(column1)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

