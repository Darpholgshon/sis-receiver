package com.pressassociation.receiver.model.xup;

import com.google.common.base.Objects;
import com.pressassociation.receiver.model.hrdg.HrdgElement;
import org.simpleframework.xml.*;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:58
 * <p>
 * ****************************************************************************************
 */
public class Append implements XupCommand{
  @Attribute
  private String select;

  @ElementList(inline = true, required = false)
  @Namespace(reference = "http://www.satelliteinfo.co.uk/feed/master/hrdg")
  List<HrdgElement> target;

  @Text(required = false)
  private String value;

  public String getSelect() {
    return select;
  }

  public void setSelect(String select) {
    this.select = select;
  }

  public List<HrdgElement> getTarget() {
    return target;
  }

  public void setTarget(List<HrdgElement> target) {
    this.target = target;
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
                  .add("select", select)
                  .add("target", target)
                  .add("value", value)
                  .omitNullValues()
                  .toString();
  }
}
