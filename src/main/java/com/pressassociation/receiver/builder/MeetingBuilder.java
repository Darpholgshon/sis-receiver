package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.Event;
import com.pressassociation.receiver.model.Meeting;

import java.util.Date;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 13:03
 * <p>
 * ****************************************************************************************
 */
public class MeetingBuilder {
  List<Event> eventList;
  private String name;
  private String code;
  private String country; // { country-enumeration },
  private Date date;
  private String coverageCode;
  private String going;
  private String status;
  private String sportcode;
  private String subcode;
  private String sourceId;

  private MeetingBuilder() {
  }

  public static MeetingBuilder aMeeting() {
    return new MeetingBuilder();
  }

  public MeetingBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public MeetingBuilder withCode(String code) {
    this.code = code;
    return this;
  }

  public MeetingBuilder withCountry(String country) {
    this.country = country;
    return this;
  }

  public MeetingBuilder withDate(Date date) {
    this.date = date;
    return this;
  }

  public MeetingBuilder withCoverageCode(String coverageCode) {
    this.coverageCode = coverageCode;
    return this;
  }

  public MeetingBuilder withGoing(String going) {
    this.going = going;
    return this;
  }

  public MeetingBuilder withStatus(String status) {
    this.status = status;
    return this;
  }

  public MeetingBuilder withSportcode(String sportcode) {
    this.sportcode = sportcode;
    return this;
  }

  public MeetingBuilder withSubcode(String subcode) {
    this.subcode = subcode;
    return this;
  }

  public MeetingBuilder withSourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  public MeetingBuilder withEventList(List<Event> eventList) {
    this.eventList = eventList;
    return this;
  }

  public MeetingBuilder but() {
    return aMeeting()
            .withName(name)
            .withCode(code)
            .withCountry(country)
            .withDate(date)
            .withCoverageCode(coverageCode)
            .withGoing(going)
            .withStatus(status)
            .withSportcode(sportcode)
            .withSubcode(subcode)
            .withSourceId(sourceId)
            .withEventList(eventList);
  }

  public void buildCollection(java.util.Collection<Meeting> collection) {
    collection.add(build());
  }

  public Meeting build() {
    Meeting meeting = new Meeting();
    meeting.setName(name);
    meeting.setCode(code);
    meeting.setCountry(country);
    meeting.setDate(date);
    meeting.setCoverageCode(coverageCode);
    meeting.setGoing(going);
    meeting.setStatus(status);
    meeting.setSportcode(sportcode);
    meeting.setSubcode(subcode);
    meeting.setSourceId(sourceId);
    meeting.setEventList(eventList);
    return meeting;
  }
}
