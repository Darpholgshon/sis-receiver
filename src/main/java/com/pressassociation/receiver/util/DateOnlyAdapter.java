package com.pressassociation.receiver.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 14:58
 * <p>
 * ****************************************************************************************
 */
public class DateOnlyAdapter extends XmlAdapter<String, Date> {
  @Override
  public Date unmarshal(String input)
          throws Exception {
    return Optional.ofNullable(input).map(value -> {
      try {
        return new SimpleDateFormat("yyyy-MM-dd").parse(value);
      } catch (ParseException e) {
        return null;
      }
    }).orElse(null);
  }

  @Override
  public String marshal(Date input)
          throws Exception {
    return Optional.ofNullable(input).map(value -> new SimpleDateFormat("yyyy-MM-dd").format(value)).orElse(null);
  }
}
