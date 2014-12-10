package com.pressassociation.receiver.model.hrdg;

import com.google.common.base.Objects;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.Date;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:57
 * <p>
 * ****************************************************************************************
 */
public class Meeting implements HrdgElement{
  @Attribute
  private String name;

  @Attribute
  private String code;

  @Attribute
  private String country; // { country-enumeration },

  @Attribute
  private Date date;

  @Attribute(required = false)
  private String coverageCode;

  @Attribute(required = false)
  private String going;

  @Attribute(required = false)
  private String status;

  @Attribute(required = false)
  private String sportcode;

  @Attribute(required = false)
  private String subcode;

  @Attribute(required = false)
  private String sourceId;

  @ElementList(inline = true)
  List<Event> eventList;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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

  public String getCoverageCode() {
    return coverageCode;
  }

  public void setCoverageCode(String coverageCode) {
    this.coverageCode = coverageCode;
  }

  public String getGoing() {
    return going;
  }

  public void setGoing(String going) {
    this.going = going;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getSportcode() {
    return sportcode;
  }

  public void setSportcode(String sportcode) {
    this.sportcode = sportcode;
  }

  public String getSubcode() {
    return subcode;
  }

  public void setSubcode(String subcode) {
    this.subcode = subcode;
  }

  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public List<Event> getEventList() {
    return eventList;
  }

  public void setEventList(List<Event> eventList) {
    this.eventList = eventList;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("name", name)
                  .add("code", code)
                  .add("country", country)
                  .add("date", date)
                  .add("coverageCode", coverageCode)
                  .add("going", going)
                  .add("status", status)
                  .add("sportcode", sportcode)
                  .add("subcode", subcode)
                  .add("sourceId", sourceId)
                  .add("eventList", eventList)
                  .omitNullValues()
                  .toString();
  }
}
