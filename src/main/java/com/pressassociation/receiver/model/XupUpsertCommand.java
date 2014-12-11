package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:58
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.satelliteinfo.co.uk/feed/update")
public class XupUpsertCommand extends XupDeleteCommand {

  @XmlElement(name="at", namespace = "http://www.satelliteinfo.co.uk/feed/update")
  private List<At> list;

  public List<At> getList() {
    return list;
  }

  public void setList(List<At> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("select", select)
                  .add("list", list)
                  .omitNullValues()
                  .toString();
  }
}
