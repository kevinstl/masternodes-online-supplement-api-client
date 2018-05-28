package com.cryptocurrencyservices.masternodessuplement.api.client.master_node_online_supplement.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * MasternodesOnlineSupplement
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-04-18T11:02:13.290-05:00")

public class MasternodesOnlineSupplement   {
  @JsonProperty("change")
  private String change = null;

  @JsonProperty("coin")
  private String coin = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("githubCommits")
  private Integer githubCommits = null;

  @JsonProperty("githubUrl")
  private String githubUrl = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("marketcap")
  private String marketcap = null;

  @JsonProperty("masternodesOnlineUrl")
  private String masternodesOnlineUrl = null;

  @JsonProperty("minimumWorth")
  private String minimumWorth = null;

  @JsonProperty("nodes")
  private String nodes = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("numberRequired")
  private String numberRequired = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("projectOrigin")
  private String projectOrigin = null;

  @JsonProperty("pushedAt")
  private OffsetDateTime pushedAt = null;

  @JsonProperty("roi")
  private String roi = null;

  @JsonProperty("volume")
  private String volume = null;

  public MasternodesOnlineSupplement change(String change) {
    this.change = change;
    return this;
  }

   /**
   * Get change
   * @return change
  **/
  @ApiModelProperty(value = "")
  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }

  public MasternodesOnlineSupplement coin(String coin) {
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @ApiModelProperty(value = "")
  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }

  public MasternodesOnlineSupplement createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public MasternodesOnlineSupplement githubCommits(Integer githubCommits) {
    this.githubCommits = githubCommits;
    return this;
  }

   /**
   * Get githubCommits
   * @return githubCommits
  **/
  @ApiModelProperty(value = "")
  public Integer getGithubCommits() {
    return githubCommits;
  }

  public void setGithubCommits(Integer githubCommits) {
    this.githubCommits = githubCommits;
  }


  public MasternodesOnlineSupplement githubUrl(String githubUrl) {
    this.githubUrl = githubUrl;
    return this;
  }

   /**
   * Get githubUrl
   * @return githubUrl
  **/
  @ApiModelProperty(value = "")
  public String getGithubUrl() {
    return githubUrl;
  }

  public void setGithubUrl(String githubUrl) {
    this.githubUrl = githubUrl;
  }

  public MasternodesOnlineSupplement id(String id) {
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

  public MasternodesOnlineSupplement marketcap(String marketcap) {
    this.marketcap = marketcap;
    return this;
  }

   /**
   * Get marketcap
   * @return marketcap
  **/
  @ApiModelProperty(value = "")
  public String getMarketcap() {
    return marketcap;
  }

  public void setMarketcap(String marketcap) {
    this.marketcap = marketcap;
  }

  public MasternodesOnlineSupplement masternodesOnlineUrl(String masternodesOnlineUrl) {
    this.masternodesOnlineUrl = masternodesOnlineUrl;
    return this;
  }

   /**
   * Get masternodesOnlineUrl
   * @return masternodesOnlineUrl
  **/
  @ApiModelProperty(value = "")
  public String getMasternodesOnlineUrl() {
    return masternodesOnlineUrl;
  }

  public void setMasternodesOnlineUrl(String masternodesOnlineUrl) {
    this.masternodesOnlineUrl = masternodesOnlineUrl;
  }

  public MasternodesOnlineSupplement minimumWorth(String minimumWorth) {
    this.minimumWorth = minimumWorth;
    return this;
  }

   /**
   * Get minimumWorth
   * @return minimumWorth
  **/
  @ApiModelProperty(value = "")
  public String getMinimumWorth() {
    return minimumWorth;
  }

  public void setMinimumWorth(String minimumWorth) {
    this.minimumWorth = minimumWorth;
  }

  public MasternodesOnlineSupplement nodes(String nodes) {
    this.nodes = nodes;
    return this;
  }

   /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(value = "")
  public String getNodes() {
    return nodes;
  }

  public void setNodes(String nodes) {
    this.nodes = nodes;
  }

  public MasternodesOnlineSupplement notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public MasternodesOnlineSupplement numberRequired(String numberRequired) {
    this.numberRequired = numberRequired;
    return this;
  }

   /**
   * Get numberRequired
   * @return numberRequired
  **/
  @ApiModelProperty(value = "")
  public String getNumberRequired() {
    return numberRequired;
  }

  public void setNumberRequired(String numberRequired) {
    this.numberRequired = numberRequired;
  }

  public MasternodesOnlineSupplement price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public MasternodesOnlineSupplement projectOrigin(String projectOrigin) {
    this.projectOrigin = projectOrigin;
    return this;
  }

   /**
   * Get projectOrigin
   * @return projectOrigin
  **/
  @ApiModelProperty(value = "")
  public String getProjectOrigin() {
    return projectOrigin;
  }

  public void setProjectOrigin(String projectOrigin) {
    this.projectOrigin = projectOrigin;
  }

  public MasternodesOnlineSupplement pushedAt(OffsetDateTime pushedAt) {
    this.pushedAt = pushedAt;
    return this;
  }

   /**
   * Get pushedAt
   * @return pushedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getPushedAt() {
    return pushedAt;
  }

  public void setPushedAt(OffsetDateTime pushedAt) {
    this.pushedAt = pushedAt;
  }

  public MasternodesOnlineSupplement roi(String roi) {
    this.roi = roi;
    return this;
  }

   /**
   * Get roi
   * @return roi
  **/
  @ApiModelProperty(value = "")
  public String getRoi() {
    return roi;
  }

  public void setRoi(String roi) {
    this.roi = roi;
  }

  public MasternodesOnlineSupplement volume(String volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasternodesOnlineSupplement masternodesOnlineSupplement = (MasternodesOnlineSupplement) o;
    return Objects.equals(this.change, masternodesOnlineSupplement.change) &&
        Objects.equals(this.coin, masternodesOnlineSupplement.coin) &&
        Objects.equals(this.createdAt, masternodesOnlineSupplement.createdAt) &&
        Objects.equals(this.githubCommits, masternodesOnlineSupplement.githubCommits) &&
        Objects.equals(this.githubUrl, masternodesOnlineSupplement.githubUrl) &&
        Objects.equals(this.id, masternodesOnlineSupplement.id) &&
        Objects.equals(this.marketcap, masternodesOnlineSupplement.marketcap) &&
        Objects.equals(this.masternodesOnlineUrl, masternodesOnlineSupplement.masternodesOnlineUrl) &&
        Objects.equals(this.minimumWorth, masternodesOnlineSupplement.minimumWorth) &&
        Objects.equals(this.nodes, masternodesOnlineSupplement.nodes) &&
        Objects.equals(this.notes, masternodesOnlineSupplement.notes) &&
        Objects.equals(this.numberRequired, masternodesOnlineSupplement.numberRequired) &&
        Objects.equals(this.price, masternodesOnlineSupplement.price) &&
        Objects.equals(this.projectOrigin, masternodesOnlineSupplement.projectOrigin) &&
        Objects.equals(this.pushedAt, masternodesOnlineSupplement.pushedAt) &&
        Objects.equals(this.roi, masternodesOnlineSupplement.roi) &&
        Objects.equals(this.volume, masternodesOnlineSupplement.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(change, coin, createdAt, githubCommits, githubUrl, id, marketcap, masternodesOnlineUrl, minimumWorth, nodes, notes, numberRequired, price, projectOrigin, pushedAt, roi, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasternodesOnlineSupplement {\n");

    sb.append("    change: ").append(toIndentedString(change)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    githubCommits: ").append(toIndentedString(githubCommits)).append("\n");
    sb.append("    githubUrl: ").append(toIndentedString(githubUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    marketcap: ").append(toIndentedString(marketcap)).append("\n");
    sb.append("    masternodesOnlineUrl: ").append(toIndentedString(masternodesOnlineUrl)).append("\n");
    sb.append("    minimumWorth: ").append(toIndentedString(minimumWorth)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numberRequired: ").append(toIndentedString(numberRequired)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    projectOrigin: ").append(toIndentedString(projectOrigin)).append("\n");
    sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
    sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

