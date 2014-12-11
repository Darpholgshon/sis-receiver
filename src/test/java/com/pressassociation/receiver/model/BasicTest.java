package com.pressassociation.receiver.model;

import com.pressassociation.receiver.builder.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import javax.xml.bind.JAXB;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Date;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 12:45
 * <p>
 * ****************************************************************************************
 */
public class BasicTest {
  protected static final Log LOG = LogFactory.getLog(BasicTest.class);

  @Test
  public void hrdgTest()
          throws Exception {
    StringWriter sw = new StringWriter();

    JAXB.marshal(buildDocument(), sw);

    LOG.debug(sw);
  }

  @Test
  public void xupTest()
          throws Exception {
    StringWriter sw = new StringWriter();

    Data data = buildDocument();
    data.setMeetingList(null);
    data.setCommand(buildUpsert());

    JAXB.marshal(data, sw);

    LOG.debug(sw);

    LOG.debug(JAXB.unmarshal(ClassLoader.getSystemResourceAsStream("hrdg/xup-upsert-command.xml"), Data.class));
  }

  private XupDeleteCommand buildUpsert() {
    return XupUpsertCommandBuilder
            .aXupUpsertCommand()
            .withSelect("/hrdg:data/event/result")
            .withList(Collections.singletonList(
                    AtBuilder.anAt().withName("status").withValue("R").build()
            ))
            .build();
  }

  private Event buildEvent() {
    return EventBuilder
            .anEvent()
            .withId(1010)
            .withName("Race 1")
            .withNum(1)
            .withOffTime("13:10:00")
            .withPlacesExpected(3)
            .withEachWayPlaces(3)
            .withProgressCode("O")
            .withPmsg("Off 13:11:03")
            .build();
  }

  private Meeting buildMeeting() {
    return MeetingBuilder
            .aMeeting()
            .withCode("ABCD")
            .withCountry("UK")
            .withDate(new Date())
            .withSportcode("AA")
            .withEventList(Collections.singletonList(buildEvent()))
            .build();
  }

  private Data buildDocument() {
    return DataBuilder
            .aData()
            .withName("event")
            .withId("test-id")
            .withOdec("yes")
            .withBook("SD")
            .withCategory("HR")
            .withCountry("UK")
            .withDate(new Date())
            .withLastUpdate(new Date())
            .withSource("SportsData")
            .withType("master")
            .withMnem("ES")
            .withVersion("1.0.0.1")
            .withMeetingList(Collections.singletonList(buildMeeting()))
            .build();
  }

}
