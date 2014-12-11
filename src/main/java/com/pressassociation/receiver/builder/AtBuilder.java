package com.pressassociation.receiver.builder;

import com.pressassociation.receiver.model.At;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 16:50
 * <p>
 * ****************************************************************************************
 */
public class AtBuilder {
  private String name;
  private String value;

  private AtBuilder() {
  }

  public static AtBuilder anAt() {
    return new AtBuilder();
  }

  public AtBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public AtBuilder withValue(String value) {
    this.value = value;
    return this;
  }

  public AtBuilder but() {
    return anAt()
            .withName(name)
            .withValue(value);
  }

  public void buildCollection(java.util.Collection<At> collection) {
    collection.add(build());
  }

  public At build() {
    At at = new At();
    at.setName(name);
    at.setValue(value);
    return at;
  }
}
