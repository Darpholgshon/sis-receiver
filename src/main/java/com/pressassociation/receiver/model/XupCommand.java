package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 11/12/2014 09:46
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://www.satelliteinfo.co.uk/feed/update")
public class XupCommand extends XupDeleteCommand {
  public static final String NS_HRDG = "http://www.satelliteinfo.co.uk/feed/master/hrdg";

  @XmlElements(value = {
          @XmlElement(namespace=NS_HRDG, name="meeting", type=Meeting.class),
          @XmlElement(namespace=NS_HRDG, name="event",   type=Event.class),
          @XmlElement(namespace=NS_HRDG, name="selection", type=Selection.class),
          @XmlElement(namespace=NS_HRDG, name="result", type=Result.class),
          @XmlElement(namespace=NS_HRDG, name="racebet", type=Racebet.class),
          @XmlElement(namespace=NS_HRDG, name="price", type=Price.class),
          @XmlElement(namespace=NS_HRDG, name="position", type=Position.class),
          @XmlElement(namespace=NS_HRDG, name="market", type=Position.class),
          @XmlElement(name="text", type=String.class)
  })
  List<Object> target;

  public List<Object> getTarget() {
    return target;
  }

  public void setTarget(List<Object> target) {
    this.target = target;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("select", select)
                  .add("target", target)
                  .omitNullValues()
                  .toString();
  }
}
