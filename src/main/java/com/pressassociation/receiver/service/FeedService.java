package com.pressassociation.receiver.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

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
    LOG.info(body);
  }
}
