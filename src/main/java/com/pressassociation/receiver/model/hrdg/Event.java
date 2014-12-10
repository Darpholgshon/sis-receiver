package com.pressassociation.receiver.model.hrdg;

import com.google.common.base.Objects;
import org.simpleframework.xml.*;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 11:31
 * <p>
 * ****************************************************************************************
 */
@Root
public class Event implements HrdgElement{
  @Attribute
  private Integer id;

  @Attribute
  private String name;

  @Attribute
  private String distance;

  @Attribute
  private Integer num;

  @Attribute
  private Integer placesExpected;

  @Attribute
  private Integer eachWayPlaces;

  @Attribute
  private String time; // { xsd:time },

  @Attribute(required = false)
  private String pmsg;

  @Attribute(required = false)
  private String status;

  @Attribute(required = false)
  private String progressCode;

  @Attribute(required = false)
  private String going;

  @Attribute(required = false)
  private String offTime; // { xsd:time }?,

  @Attribute(required = false)
  private String courseType; // { coursetype-enumeration }?,

  @Attribute(required = false)
  private String surface; // { surface-enumeration }?,

  @Attribute(required = false)
  private String handicap; // { bool-enumeration }?,

  @Attribute(required = false)
  private String coverageCode;

  @Attribute(required = false)
  private String grade;

  @Attribute(required = false)
  private Integer runners;

  @Attribute(required = false)
  private String sourceId;

  @ElementList(inline = true)
  private List<Selection> selection;

  @Element(name = "bar")
  private Bar bar;

  @Element(name = "result")
  private Result result;

  @ElementList(inline = true)
  List<Racebet> racebetList;

  @ElementList(inline = true, required = false)
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
