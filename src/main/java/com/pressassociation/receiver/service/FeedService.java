package com.pressassociation.receiver.service;

import com.pressassociation.receiver.model.Data;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringReader;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 10:49
 * <p>
 * ****************************************************************************************
 */
@Component
public class FeedService {
  protected static final Log LOG = LogFactory.getLog(FeedService.class);

  public void handleXML(String body){




    LOG.info(JAXB.unmarshal(new StringReader(body), Data.class));
  }
}
