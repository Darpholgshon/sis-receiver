package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 12:40
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.satelliteinfo.co.uk/feed/update")
public class XupDeleteCommand {
  @XmlAttribute
  protected String select;

  public String getSelect() {
    return select;
  }

  public void setSelect(String select) {
    this.select = select;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("select", select)
                  .omitNullValues()
                  .toString();
  }
}
