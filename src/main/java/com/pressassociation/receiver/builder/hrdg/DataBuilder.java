package com.pressassociation.receiver.builder.hrdg;

import com.pressassociation.receiver.model.hrdg.Data;
import com.pressassociation.receiver.model.hrdg.Meeting;
import com.pressassociation.receiver.model.xup.XupCommand;

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
public class DataBuilder {
  List<Meeting> meetingList;
  XupCommand command;
  private String id; // e.g. "UKHRES4G5ZO1"
  private String book;
  private String category; // category-enum: HR, DG
  private String country; // country-enum: e.g. "UK"
  private Date date; // date e.g. "2014-12-04"
  private Date expiry; // date-time e.g. "2024-12-11T16:15:00"
  private String group;
  private Long lastUpdate; // time as millis since 01/01/1970, e.g. "1417718750230"
  private String mnem; // mnemonic-enum: "ES", "EI", "EX", "MI", "RS", "JC", "NR"
  private String name;
  private String odec; // boolean flag Y or N
  private String refresh; // boolean string "yes" or "no"
  private String route; // e.g. "4D41494E"
  private String source;
  private String sportcode; // 2-digit SIS code
  private Long timestamp; // time as millis since 01/01/1970 e.g. "1417671004271"
  private String type; // Usually "master"
  private String antePost; // boolean string "yes" or "no"
  private String version; //="1.2.15"

  private DataBuilder() {
  }

  public static DataBuilder aData() {
    return new DataBuilder();
  }

  public DataBuilder withMeetingList(List<Meeting> meetingList) {
    this.meetingList = meetingList;
    return this;
  }

  public DataBuilder withCommand(XupCommand command) {
    this.command = command;
    return this;
  }

  public DataBuilder withId(String id) {
    this.id = id;
    return this;
  }

  public DataBuilder withBook(String book) {
    this.book = book;
    return this;
  }

  public DataBuilder withCategory(String category) {
    this.category = category;
    return this;
  }

  public DataBuilder withCountry(String country) {
    this.country = country;
    return this;
  }

  public DataBuilder withDate(Date date) {
    this.date = date;
    return this;
  }

  public DataBuilder withExpiry(Date expiry) {
    this.expiry = expiry;
    return this;
  }

  public DataBuilder withGroup(String group) {
    this.group = group;
    return this;
  }

  public DataBuilder withLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  public DataBuilder withMnem(String mnem) {
    this.mnem = mnem;
    return this;
  }

  public DataBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public DataBuilder withOdec(String odec) {
    this.odec = odec;
    return this;
  }

  public DataBuilder withRefresh(String refresh) {
    this.refresh = refresh;
    return this;
  }

  public DataBuilder withRoute(String route) {
    this.route = route;
    return this;
  }

  public DataBuilder withSource(String source) {
    this.source = source;
    return this;
  }

  public DataBuilder withSportcode(String sportcode) {
    this.sportcode = sportcode;
    return this;
  }

  public DataBuilder withTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public DataBuilder withType(String type) {
    this.type = type;
    return this;
  }

  public DataBuilder withAntePost(String antePost) {
    this.antePost = antePost;
    return this;
  }

  public DataBuilder withVersion(String version) {
    this.version = version;
    return this;
  }

  public DataBuilder but() {
    return aData()
            .withMeetingList(meetingList)
            .withCommand(command)
            .withId(id)
            .withBook(book)
            .withCategory(category)
            .withCountry(country)
            .withDate(date)
            .withExpiry(expiry)
            .withGroup(group)
            .withLastUpdate(lastUpdate)
            .withMnem(mnem)
            .withName(name)
            .withOdec(odec)
            .withRefresh(refresh)
            .withRoute(route)
            .withSource(source)
            .withSportcode(sportcode)
            .withTimestamp(timestamp)
            .withType(type)
            .withAntePost(antePost)
            .withVersion(version);
  }

  public void buildCollection(java.util.Collection<Data> collection) {
    collection.add(build());
  }

  public Data build() {
    Data data = new Data();
    data.setMeetingList(meetingList);
    data.setCommand(command);
    data.setId(id);
    data.setBook(book);
    data.setCategory(category);
    data.setCountry(country);
    data.setDate(date);
    data.setExpiry(expiry);
    data.setGroup(group);
    data.setLastUpdate(lastUpdate);
    data.setMnem(mnem);
    data.setName(name);
    data.setOdec(odec);
    data.setRefresh(refresh);
    data.setRoute(route);
    data.setSource(source);
    data.setSportcode(sportcode);
    data.setTimestamp(timestamp);
    data.setType(type);
    data.setAntePost(antePost);
    data.setVersion(version);
    return data;
  }
}
