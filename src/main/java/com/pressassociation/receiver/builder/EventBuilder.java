package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.*;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 13:03
 * <p>
 * ****************************************************************************************
 */
public class EventBuilder {
  List<Racebet> racebetList;
  List<Market> marketList;
  private Integer id;
  private String name;
  private String distance;
  private Integer num;
  private Integer placesExpected;
  private Integer eachWayPlaces;
  private String time; // { xsd:time },
  private String pmsg;
  private String status;
  private String progressCode;
  private String going;
  private String offTime; // { xsd:time }?,
  private String courseType; // { coursetype-enumeration }?,
  private String surface; // { surface-enumeration }?,
  private String handicap; // { bool-enumeration }?,
  private String coverageCode;
  private String grade;
  private Integer runners;
  private String sourceId;
  private List<Selection> selection;
  private Bar bar;
  private Result result;

  private EventBuilder() {
  }

  public static EventBuilder anEvent() {
    return new EventBuilder();
  }

  public EventBuilder withId(Integer id) {
    this.id = id;
    return this;
  }

  public EventBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public EventBuilder withDistance(String distance) {
    this.distance = distance;
    return this;
  }

  public EventBuilder withNum(Integer num) {
    this.num = num;
    return this;
  }

  public EventBuilder withPlacesExpected(Integer placesExpected) {
    this.placesExpected = placesExpected;
    return this;
  }

  public EventBuilder withEachWayPlaces(Integer eachWayPlaces) {
    this.eachWayPlaces = eachWayPlaces;
    return this;
  }

  public EventBuilder withTime(String time) {
    this.time = time;
    return this;
  }

  public EventBuilder withPmsg(String pmsg) {
    this.pmsg = pmsg;
    return this;
  }

  public EventBuilder withStatus(String status) {
    this.status = status;
    return this;
  }

  public EventBuilder withProgressCode(String progressCode) {
    this.progressCode = progressCode;
    return this;
  }

  public EventBuilder withGoing(String going) {
    this.going = going;
    return this;
  }

  public EventBuilder withOffTime(String offTime) {
    this.offTime = offTime;
    return this;
  }

  public EventBuilder withCourseType(String courseType) {
    this.courseType = courseType;
    return this;
  }

  public EventBuilder withSurface(String surface) {
    this.surface = surface;
    return this;
  }

  public EventBuilder withHandicap(String handicap) {
    this.handicap = handicap;
    return this;
  }

  public EventBuilder withCoverageCode(String coverageCode) {
    this.coverageCode = coverageCode;
    return this;
  }

  public EventBuilder withGrade(String grade) {
    this.grade = grade;
    return this;
  }

  public EventBuilder withRunners(Integer runners) {
    this.runners = runners;
    return this;
  }

  public EventBuilder withSourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  public EventBuilder withSelection(List<Selection> selection) {
    this.selection = selection;
    return this;
  }

  public EventBuilder withBar(Bar bar) {
    this.bar = bar;
    return this;
  }

  public EventBuilder withResult(Result result) {
    this.result = result;
    return this;
  }

  public EventBuilder withRacebetList(List<Racebet> racebetList) {
    this.racebetList = racebetList;
    return this;
  }

  public EventBuilder withMarketList(List<Market> marketList) {
    this.marketList = marketList;
    return this;
  }

  public EventBuilder but() {
    return anEvent()
            .withId(id)
            .withName(name)
            .withDistance(distance)
            .withNum(num)
            .withPlacesExpected(placesExpected)
            .withEachWayPlaces(eachWayPlaces)
            .withTime(time)
            .withPmsg(pmsg)
            .withStatus(status)
            .withProgressCode(progressCode)
            .withGoing(going)
            .withOffTime(offTime)
            .withCourseType(courseType)
            .withSurface(surface)
            .withHandicap(handicap)
            .withCoverageCode(coverageCode)
            .withGrade(grade)
            .withRunners(runners)
            .withSourceId(sourceId)
            .withSelection(selection)
            .withBar(bar)
            .withResult(result)
            .withRacebetList(racebetList)
            .withMarketList(marketList);
  }

  public void buildCollection(java.util.Collection<Event> collection) {
    collection.add(build());
  }

  public Event build() {
    Event event = new Event();
    event.setId(id);
    event.setName(name);
    event.setDistance(distance);
    event.setNum(num);
    event.setPlacesExpected(placesExpected);
    event.setEachWayPlaces(eachWayPlaces);
    event.setTime(time);
    event.setPmsg(pmsg);
    event.setStatus(status);
    event.setProgressCode(progressCode);
    event.setGoing(going);
    event.setOffTime(offTime);
    event.setCourseType(courseType);
    event.setSurface(surface);
    event.setHandicap(handicap);
    event.setCoverageCode(coverageCode);
    event.setGrade(grade);
    event.setRunners(runners);
    event.setSourceId(sourceId);
    event.setSelection(selection);
    event.setBar(bar);
    event.setResult(result);
    event.setRacebetList(racebetList);
    event.setMarketList(marketList);
    return event;
  }
}
