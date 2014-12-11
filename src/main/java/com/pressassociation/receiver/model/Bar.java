package com.pressassociation.receiver.model;

import com.google.common.base.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 11:43
 * <p>
 * ****************************************************************************************
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bar {
  @XmlElement
  private List<Price> priceList;

  public List<Price> getPriceList() {
    return priceList;
  }

  public void setPriceList(List<Price> priceList) {
    this.priceList = priceList;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this)
                  .add("priceList", priceList)
                  .omitNullValues()
                  .toString();
  }
}
