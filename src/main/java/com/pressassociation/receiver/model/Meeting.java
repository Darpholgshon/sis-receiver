package com.pressassociation.receiver.model;

import com.google.common.base.Objects;
import com.pressassociation.receiver.util.DateOnlyAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlAccessorType(XmlAccessType.FIELD)
public class Meeting extends HrdgElement{
  @XmlAttribute
  private String name;

  @XmlAttribute
  private String code;

  @XmlAttribute
  private String country; // { country-enumeration },

  @XmlAttribute
  @XmlJavaTypeAdapter(DateOnlyAdapter.class)
  private Date date;

  @XmlAttribute(required = false)
  private String coverageCode;

  @XmlAttribute(required = false)
  private String going;

  @XmlAttribute(required = false)
  private String status;

  @XmlAttribute(required = false)
  private String sportcode;

  @XmlAttribute(required = false)
  private String subcode;

  @XmlAttribute(required = false)
  private String sourceId;

  @XmlElement(required = false)
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
