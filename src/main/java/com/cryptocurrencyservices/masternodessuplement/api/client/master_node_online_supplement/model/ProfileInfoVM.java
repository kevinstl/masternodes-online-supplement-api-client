package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProfileInfoVM
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-18T11:02:13.290-05:00")

public class ProfileInfoVM   {
  @JsonProperty("activeProfiles")
  private List<String> activeProfiles = new ArrayList<String>();

  @JsonProperty("ribbonEnv")
  private String ribbonEnv = null;

  public ProfileInfoVM activeProfiles(List<String> activeProfiles) {
    this.activeProfiles = activeProfiles;
    return this;
  }

  public ProfileInfoVM addActiveProfilesItem(String activeProfilesItem) {
    this.activeProfiles.add(activeProfilesItem);
    return this;
  }

   /**
   * Get activeProfiles
   * @return activeProfiles
  **/
  @ApiModelProperty(value = "")
  public List<String> getActiveProfiles() {
    return activeProfiles;
  }

  public void setActiveProfiles(List<String> activeProfiles) {
    this.activeProfiles = activeProfiles;
  }

  public ProfileInfoVM ribbonEnv(String ribbonEnv) {
    this.ribbonEnv = ribbonEnv;
    return this;
  }

   /**
   * Get ribbonEnv
   * @return ribbonEnv
  **/
  @ApiModelProperty(value = "")
  public String getRibbonEnv() {
    return ribbonEnv;
  }

  public void setRibbonEnv(String ribbonEnv) {
    this.ribbonEnv = ribbonEnv;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileInfoVM profileInfoVM = (ProfileInfoVM) o;
    return Objects.equals(this.activeProfiles, profileInfoVM.activeProfiles) &&
        Objects.equals(this.ribbonEnv, profileInfoVM.ribbonEnv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeProfiles, ribbonEnv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileInfoVM {\n");

    sb.append("    activeProfiles: ").append(toIndentedString(activeProfiles)).append("\n");
    sb.append("    ribbonEnv: ").append(toIndentedString(ribbonEnv)).append("\n");
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

