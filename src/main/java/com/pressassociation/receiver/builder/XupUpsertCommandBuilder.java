package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.At;
import com.pressassociation.receiver.model.XupUpsertCommand;

import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 11/12/2014 09:56
 * <p>
 * ****************************************************************************************
 */
public class XupUpsertCommandBuilder {
  protected String select;
  private List<At> list;

  private XupUpsertCommandBuilder() {
  }

  public static XupUpsertCommandBuilder aXupUpsertCommand() {
    return new XupUpsertCommandBuilder();
  }

  public XupUpsertCommandBuilder withList(List<At> list) {
    this.list = list;
    return this;
  }

  public XupUpsertCommandBuilder withSelect(String select) {
    this.select = select;
    return this;
  }

  public XupUpsertCommandBuilder but() {
    return aXupUpsertCommand()
            .withList(list)
            .withSelect(select);
  }

  public void buildCollection(java.util.Collection<XupUpsertCommand> collection) {
    collection.add(build());
  }

  public XupUpsertCommand build() {
    XupUpsertCommand xupUpsertCommand = new XupUpsertCommand();
    xupUpsertCommand.setList(list);
    xupUpsertCommand.setSelect(select);
    return xupUpsertCommand;
  }
}
