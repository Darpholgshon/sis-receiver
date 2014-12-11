package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 12:04
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Price extends HrdgElement{
	@XmlAttribute
	private Integer id;
  
	@XmlAttribute
	private Double dec;
  
	@XmlAttribute
	private String fract;
  
	@XmlAttribute
	private Integer mktnum;
  
	@XmlAttribute
	private String mkttype;
  
	@XmlAttribute
	private String time; // xsd:time
  
	@XmlAttribute
	private Long timestamp; // time in millis since 01/01/1970

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getDec() {
    return dec;
  }

  public void setDec(Double dec) {
    this.dec = dec;
  }

  public String getFract() {
    return fract;
  }

  public void setFract(String fract) {
    this.fract = fract;
  }

  public Integer getMktnum() {
    return mktnum;
  }

  public void setMktnum(Integer mktnum) {
    this.mktnum = mktnum;
  }

  public String getMkttype() {
    return mkttype;
  }

  public void setMkttype(String mkttype) {
    this.mkttype = mkttype;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("id", id)
                  .add("dec", dec)
                  .add("fract", fract)
                  .add("mktnum", mktnum)
                  .add("mkttype", mkttype)
                  .add("time", time)
                  .add("timestamp", timestamp)
                  .omitNullValues()
                  .toString();
  }
}
