package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.*;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 12:44
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.satelliteinfo.co.uk/feed/update")
public class At {
  @XmlAttribute
  private String name;

  @XmlValue
  private String value;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("name", name)
                  .add("value", value)
                  .omitNullValues()
                  .toString();
  }
}
