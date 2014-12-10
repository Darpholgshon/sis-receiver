package com.pressassociation.receiver.model.xup;

import com.google.common.base.Objects;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:58
 * <p>
 * ****************************************************************************************
 */
public class Upsert implements XupCommand{
  @Attribute
  private String select;

  @ElementList(inline = true)
  private List<At> list;

  public String getSelect() {
    return select;
  }

  public void setSelect(String select) {
    this.select = select;
  }

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
