package com.pressassociation.receiver.model.hrdg;

import com.google.common.base.Objects;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 11:42
 * <p>
 * ****************************************************************************************
 */
public class Selection implements HrdgElement{

  @Attribute
  private Integer id;

  @Attribute
  private String name;

  @Attribute
  private Integer num;

  @Attribute
  private String status;

  @Attribute(required = false)
  private String jockey;

  @Attribute(required = false)
  private String reservename;

  @Attribute(required = false)
  private String claiming;

  @Attribute(required = false)
  private String sourceId;

  @Attribute(required = false)
  private Integer weightStones;

  @Attribute(required = false)
  private Integer weightPounds;

  @Attribute(required = false)
  private String coupled;

  @Attribute(required = false)
  private String drawn;

  @Attribute(required = false)
  private String uniqueId;

  @Attribute(required = false)
  private String wide;// bool-enumeration }?,

  @Attribute(required = false)
  private Integer age;

  @Attribute(required = false)
  private String trainer;

  @Attribute(required = false)
  private String lastRuns;

  @Attribute(required = false)
  private String silk;

  @Attribute(required = false)
  private String silkFile;

  @ElementList(inline = true, required = false)
  List<Price> priceList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getJockey() {
    return jockey;
  }

  public void setJockey(String jockey) {
    this.jockey = jockey;
  }

  public String getReservename() {
    return reservename;
  }

  public void setReservename(String reservename) {
    this.reservename = reservename;
  }

  public String getClaiming() {
    return claiming;
  }

  public void setClaiming(String claiming) {
    this.claiming = claiming;
  }

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public Integer getWeightStones() {
    return weightStones;
  }

  public void setWeightStones(Integer weightStones) {
    this.weightStones = weightStones;
  }

  public Integer getWeightPounds() {
    return weightPounds;
  }

  public void setWeightPounds(Integer weightPounds) {
    this.weightPounds = weightPounds;
  }

  public String getCoupled() {
    return coupled;
  }

  public void setCoupled(String coupled) {
    this.coupled = coupled;
  }

  public String getDrawn() {
    return drawn;
  }

  public void setDrawn(String drawn) {
    this.drawn = drawn;
  }

  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public String getWide() {
    return wide;
  }

  public void setWide(String wide) {
    this.wide = wide;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getTrainer() {
    return trainer;
  }

  public void setTrainer(String trainer) {
    this.trainer = trainer;
  }

  public String getLastRuns() {
    return lastRuns;
  }

  public void setLastRuns(String lastRuns) {
    this.lastRuns = lastRuns;
  }

  public String getSilk() {
    return silk;
  }

  public void setSilk(String silk) {
    this.silk = silk;
  }

  public String getSilkFile() {
    return silkFile;
  }

  public void setSilkFile(String silkFile) {
    this.silkFile = silkFile;
  }

  public List<Price> getPriceList() {
    return priceList;
  }

  public void setPriceList(List<Price> priceList) {
    this.priceList = priceList;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("id", id)
                  .add("name", name)
                  .add("num", num)
                  .add("status", status)
                  .add("jockey", jockey)
                  .add("reservename", reservename)
                  .add("claiming", claiming)
                  .add("sourceId", sourceId)
                  .add("weightStones", weightStones)
                  .add("weightPounds", weightPounds)
                  .add("coupled", coupled)
                  .add("drawn", drawn)
                  .add("uniqueId", uniqueId)
                  .add("wide", wide)
                  .add("age", age)
                  .add("trainer", trainer)
                  .add("lastRuns", lastRuns)
                  .add("silk", silk)
                  .add("silkFile", silkFile)
                  .add("priceList", priceList)
                  .omitNullValues()
                  .toString();
  }
}
