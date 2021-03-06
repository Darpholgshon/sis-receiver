package com.pressassociation.receiver.model;

import com.google.common.base.Objects;
import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 11:31
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Event extends HrdgElement{
  @XmlAttribute
  private Integer id;

  @XmlAttribute
  private String name;

  @XmlAttribute
  private String distance;

  @XmlAttribute
  private Integer num;

  @XmlAttribute
  private Integer placesExpected;

  @XmlAttribute
  private Integer eachWayPlaces;

  @XmlAttribute
  private String time; // { xsd:time },

  @XmlAttribute(required = false)
  private String pmsg;

  @XmlAttribute(required = false)
  private String status;

  @XmlAttribute(required = false)
  private String progressCode;

  @XmlAttribute(required = false)
  private String going;

  @XmlAttribute(required = false)
  private String offTime; // { xsd:time }?,

  @XmlAttribute(required = false)
  private String courseType; // { coursetype-enumeration }?,

  @XmlAttribute(required = false)
  private String surface; // { surface-enumeration }?,

  @XmlAttribute(required = false)
  private String handicap; // { bool-enumeration }?,

  @XmlAttribute(required = false)
  private String coverageCode;

  @XmlAttribute(required = false)
  private String grade;

  @XmlAttribute(required = false)
  private Integer runners;

  @XmlAttribute(required = false)
  private String sourceId;

  @Element
  private List<Selection> selection;

  @Element
  private Bar bar;

  @Element
  private Result result;

  @Element
  List<Racebet> racebetList;

  @Element(required = false)
  List<Market> marketList;

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

  public String getDistance() {
    return distance;
  }

  public void setDistance(String distance) {
    this.distance = distance;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Integer getPlacesExpected() {
    return placesExpected;
  }

  public void setPlacesExpected(Integer placesExpected) {
    this.placesExpected = placesExpected;
  }

  public Integer getEachWayPlaces() {
    return eachWayPlaces;
  }

  public void setEachWayPlaces(Integer eachWayPlaces) {
    this.eachWayPlaces = eachWayPlaces;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getPmsg() {
    return pmsg;
  }

  public void setPmsg(String pmsg) {
    this.pmsg = pmsg;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getProgressCode() {
    return progressCode;
  }

  public void setProgressCode(String progressCode) {
    this.progressCode = progressCode;
  }

  public String getGoing() {
    return going;
  }

  public void setGoing(String going) {
    this.going = going;
  }

  public String getOffTime() {
    return offTime;
  }

  public void setOffTime(String offTime) {
    this.offTime = offTime;
  }

  public String getCourseType() {
    return courseType;
  }

  public void setCourseType(String courseType) {
    this.courseType = courseType;
  }

  public String getSurface() {
    return surface;
  }

  public void setSurface(String surface) {
    this.surface = surface;
  }

  public String getHandicap() {
    return handicap;
  }

  public void setHandicap(String handicap) {
    this.handicap = handicap;
  }

  public String getCoverageCode() {
    return coverageCode;
  }

  public void setCoverageCode(String coverageCode) {
    this.coverageCode = coverageCode;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Integer getRunners() {
    return runners;
  }

  public void setRunners(Integer runners) {
    this.runners = runners;
  }

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public List<Selection> getSelection() {
    return selection;
  }

  public void setSelection(List<Selection> selection) {
    this.selection = selection;
  }

  public Bar getBar() {
    return bar;
  }

  public void setBar(Bar bar) {
    this.bar = bar;
  }

  public Result getResult() {
    return result;
  }

  public void setResult(Result result) {
    this.result = result;
  }

  public List<Racebet> getRacebetList() {
    return racebetList;
  }

  public void setRacebetList(List<Racebet> racebetList) {
    this.racebetList = racebetList;
  }

  public List<Market> getMarketList() {
    return marketList;
  }

  public void setMarketList(List<Market> marketList) {
    this.marketList = marketList;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("id", id)
                  .add("name", name)
                  .add("distance", distance)
                  .add("num", num)
                  .add("placesExpected", placesExpected)
                  .add("eachWayPlaces", eachWayPlaces)
                  .add("time", time)
                  .add("pmsg", pmsg)
                  .add("status", status)
                  .add("progressCode", progressCode)
                  .add("going", going)
                  .add("offTime", offTime)
                  .add("courseType", courseType)
                  .add("surface", surface)
                  .add("handicap", handicap)
                  .add("coverageCode", coverageCode)
                  .add("grade", grade)
                  .add("runners", runners)
                  .add("sourceId", sourceId)
                  .add("selection", selection)
                  .add("bar", bar)
                  .add("result", result)
                  .add("racebetList", racebetList)
                  .add("marketList", marketList)
                  .omitNullValues()
                  .toString();
  }
}
