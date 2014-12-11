package com.pressassociation.receiver.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;
import java.util.TimeZone;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 15:07
 * <p>
 * ****************************************************************************************
 */
public class TimestampAdapter extends XmlAdapter<Long, Date> {
  @Override
  public Date unmarshal(Long input)
          throws Exception {
    return Optional.ofNullable(input).map(value -> {
      Calendar cal = Calendar.getInstance();
      cal.setTimeZone(TimeZone.getTimeZone("UTC"));
      cal.setTimeInMillis(value);

      return cal.getTime();
    } ).orElse(null);
  }

  @Override
  public Long marshal(Date input)
          throws Exception {
    return Optional.ofNullable(input).map(value -> input.getTime()).orElse(null);
  }
}
