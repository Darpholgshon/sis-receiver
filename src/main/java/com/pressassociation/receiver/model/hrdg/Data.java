package com.pressassociation.receiver.model.hrdg;

import com.google.common.base.Objects;
import com.pressassociation.receiver.model.xup.XupCommand;
import org.simpleframework.xml.*;

import java.util.Date;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:53
 * <p>
 * ****************************************************************************************
 */
@Root
@NamespaceList({
        @Namespace(reference = "http://www.satelliteinfo.co.uk/feed/master/hrdg"),
        @Namespace(reference = "http://www.satelliteinfo.co.uk/feed/update", prefix = "xu")
})
public class Data {
  @ElementList(inline = true, required = false)
  List<Meeting> meetingList;

  @Element(type = XupCommand.class, required = false)
  @Namespace(reference = "http://www.satelliteinfo.co.uk/feed/update")
  XupCommand command;

  @Attribute
  private String id; // e.g. "UKHRES4G5ZO1"

  @Attribute(required = false)
  private String book;

  @Attribute
  private String category; // category-enum: HR, DG

  @Attribute
  private String country; // country-enum: e.g. "UK"

  @Attribute
  private Date date; // date e.g. "2014-12-04"

  @Attribute(required = false)
  private Date expiry; // date-time e.g. "2024-12-11T16:15:00"

  @Attribute(required = false)
  private String group;

  @Attribute(required = false)
  private Long lastUpdate; // time as millis since 01/01/1970, e.g. "1417718750230"

  @Attribute
  private String mnem; // mnemonic-enum: "ES", "EI", "EX", "MI", "RS", "JC", "NR"

  @Attribute
  private String name;

  @Attribute
  private String odec; // boolean flag Y or N

  @Attribute(required = false)
  private String refresh; // boolean string "yes" or "no"

  @Attribute(required = false)
  private String route; // e.g. "4D41494E"

  @Attribute
  private String source;

  @Attribute(required = false)
  private String sportcode; // 2-digit SIS code

  @Attribute(required = false)
  private Long timestamp; // time as millis since 01/01/1970 e.g. "1417671004271"

  @Attribute
  private String type; // Usually "master"

  @Attribute(required = false)
  private String antePost; // boolean string "yes" or "no"

  @Attribute
  private String version; //="1.2.15"

  public List<Meeting> getMeetingList() {
    return meetingList;
  }

  public void setMeetingList(List<Meeting> meetingList) {
    this.meetingList = meetingList;
  }

  public XupCommand getCommand() {
    return command;
  }

  public void setCommand(XupCommand command) {
    this.command = command;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBook() {
    return book;
  }

  public void setBook(String book) {
    this.book = book;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getExpiry() {
    return expiry;
  }

  public void setExpiry(Date expiry) {
    this.expiry = expiry;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public Long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public String getMnem() {
    return mnem;
  }

  public void setMnem(String mnem) {
    this.mnem = mnem;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOdec() {
    return odec;
  }

  public void setOdec(String odec) {
    this.odec = odec;
  }

  public String getRefresh() {
    return refresh;
  }

  public void setRefresh(String refresh) {
    this.refresh = refresh;
  }

  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getSportcode() {
    return sportcode;
  }

  public void setSportcode(String sportcode) {
    this.sportcode = sportcode;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getAntePost() {
    return antePost;
  }

  public void setAntePost(String antePost) {
    this.antePost = antePost;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("meetingList", meetingList)
                  .add("command", command)
                  .add("id", id)
                  .add("book", book)
                  .add("category", category)
                  .add("country", country)
                  .add("date", date)
                  .add("expiry", expiry)
                  .add("group", group)
                  .add("lastUpdate", lastUpdate)
                  .add("mnem", mnem)
                  .add("name", name)
                  .add("odec", odec)
                  .add("refresh", refresh)
                  .add("route", route)
                  .add("source", source)
                  .add("sportcode", sportcode)
                  .add("timestamp", timestamp)
                  .add("type", type)
                  .add("antePost", antePost)
                  .add("version", version)
                  .omitNullValues()
                  .toString();
  }
}
