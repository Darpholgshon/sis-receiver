package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.XupCommand;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 11/12/2014 09:56
 * <p>
 * ****************************************************************************************
 */
public class XupCommandBuilder {
  protected String select;
  List<Object> target;

  private XupCommandBuilder() {
  }

  public static XupCommandBuilder aXupCommand() {
    return new XupCommandBuilder();
  }

  public XupCommandBuilder withTarget(List<Object> target) {
    this.target = target;
    return this;
  }

  public XupCommandBuilder withSelect(String select) {
    this.select = select;
    return this;
  }

  public XupCommandBuilder but() {
    return aXupCommand()
            .withTarget(target)
            .withSelect(select);
  }

  public void buildCollection(java.util.Collection<XupCommand> collection) {
    collection.add(build());
  }

  public XupCommand build() {
    XupCommand xupCommand = new XupCommand();
    xupCommand.setTarget(target);
    xupCommand.setSelect(select);
    return xupCommand;
  }
}
