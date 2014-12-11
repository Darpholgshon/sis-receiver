package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 11:42
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Selection extends HrdgElement{

  @XmlAttribute
  private Integer id;

  @XmlAttribute
  private String name;

  @XmlAttribute
  private Integer num;

  @XmlAttribute
  private String status;

  @XmlAttribute(required = false)
  private String jockey;

  @XmlAttribute(required = false)
  private String reservename;

  @XmlAttribute(required = false)
  private String claiming;

  @XmlAttribute(required = false)
  private String sourceId;

  @XmlAttribute(required = false)
  private Integer weightStones;

  @XmlAttribute(required = false)
  private Integer weightPounds;

  @XmlAttribute(required = false)
  private String coupled;

  @XmlAttribute(required = false)
  private String drawn;

  @XmlAttribute(required = false)
  private String uniqueId;

  @XmlAttribute(required = false)
  private String wide;// bool-enumeration }?,

  @XmlAttribute(required = false)
  private Integer age;

  @XmlAttribute(required = false)
  private String trainer;

  @XmlAttribute(required = false)
  private String lastRuns;

  @XmlAttribute(required = false)
  private String silk;

  @XmlAttribute(required = false)
  private String silkFile;

  @XmlElement(required = false)
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
