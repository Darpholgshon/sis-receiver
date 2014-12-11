package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.XupDeleteCommand;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 11/12/2014 09:56
 * <p>
 * ****************************************************************************************
 */
public class XupDeleteCommandBuilder {
  protected String select;

  private XupDeleteCommandBuilder() {
  }

  public static XupDeleteCommandBuilder aXupDeleteCommand() {
    return new XupDeleteCommandBuilder();
  }

  public XupDeleteCommandBuilder withSelect(String select) {
    this.select = select;
    return this;
  }

  public XupDeleteCommandBuilder but() {
    return aXupDeleteCommand()
            .withSelect(select);
  }

  public void buildCollection(java.util.Collection<XupDeleteCommand> collection) {
    collection.add(build());
  }

  public XupDeleteCommand build() {
    XupDeleteCommand xupDeleteCommand = new XupDeleteCommand();
    xupDeleteCommand.setSelect(select);
    return xupDeleteCommand;
  }
}
