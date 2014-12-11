package com.pressassociation.receiver.model;

import com.google.common.base.Objects;
import com.pressassociation.receiver.util.DateOnlyAdapter;
import com.pressassociation.receiver.util.TimestampAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlRootElement(name = "data")
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {

  @XmlElement(name = "meeting")
  List<Meeting> meetingList;

  @XmlElements(value = {
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="append", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="ins-pre", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="ins-post", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="update", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="del", type=XupDeleteCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="ins", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="munge", type=XupCommand.class),
          @XmlElement(namespace="http://www.satelliteinfo.co.uk/feed/update", name="ups-at", type=XupUpsertCommand.class),
  })
  Object command;

  @XmlAttribute
  private String id; // e.g. "UKHRES4G5ZO1"

  @XmlAttribute(required = false)
  private String book;

  @XmlAttribute
  private String category; // category-enum: HR, DG

  @XmlAttribute
  private String country; // country-enum: e.g. "UK"

  @XmlAttribute
  @XmlJavaTypeAdapter(DateOnlyAdapter.class)
  private Date date; // date e.g. "2014-12-04"

  @XmlAttribute(required = false)
  private Date expiry; // date-time e.g. "2024-12-11T16:15:00"

  @XmlAttribute(required = false)
  private String group;

  @XmlAttribute(required = false)
  @XmlJavaTypeAdapter(TimestampAdapter.class)
  private Date lastUpdate; // time as millis since 01/01/1970, e.g. "1417718750230"

  @XmlAttribute
  private String mnem; // mnemonic-enum: "ES", "EI", "EX", "MI", "RS", "JC", "NR"

  @XmlAttribute
  private String name;

  @XmlAttribute
  private String odec; // boolean flag Y or N

  @XmlAttribute(required = false)
  private String refresh; // boolean string "yes" or "no"

  @XmlAttribute(required = false)
  private String route; // e.g. "4D41494E"

  @XmlAttribute
  private String source;

  @XmlAttribute(required = false)
  private String sportcode; // 2-digit SIS code

  @XmlAttribute(required = false)
  @XmlJavaTypeAdapter(TimestampAdapter.class)
  private Date timestamp; // time as millis since 01/01/1970 e.g. "1417671004271"

  @XmlAttribute
  private String type; // Usually "master"

  @XmlAttribute(required = false)
  private String antePost; // boolean string "yes" or "no"

  @XmlAttribute
  private String version; //="1.2.15"

  public List<Meeting> getMeetingList() {
    return meetingList;
  }

  public void setMeetingList(List<Meeting> meetingList) {
    this.meetingList = meetingList;
  }

  public Object getCommand() {
    return command;
  }

  public void setCommand(Object command) {
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

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
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

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
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
