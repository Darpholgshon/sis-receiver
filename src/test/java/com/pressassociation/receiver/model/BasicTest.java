package com.pressassociation.receiver.model;

import com.pressassociation.receiver.builder.hrdg.DataBuilder;
import com.pressassociation.receiver.model.hrdg.Data;
import org.junit.Test;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.StringWriter;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * ****************************************************************************************
 *
 * @author <a href="ralph.hodgson@pressassociation.com">Ralph Hodgson</a>
 * @since 10/12/2014 12:45
 * <p>
 * ****************************************************************************************
 */
public class BasicTest {

  @Test
  public void basicTest()
          throws Exception {
    DataBuilder builder = DataBuilder
            .aData()
            .withName("event")
            .withId("test-id")
            .withOdec("yes")
            .withBook("SD")
            .withCategory("HR")
            .withCountry("UK")
            .withDate(new Date())
            .withLastUpdate(System.currentTimeMillis())
            .withSource("SportsData")
            .withType("master")
            .withMnem("ES")
            .withVersion("1.0.0.1");

    StringWriter sw = new StringWriter();

    Serializer serializer = new Persister();
    serializer.write(builder.build(), sw);

    String fromObject = sw.toString();

    Data data = serializer.read(Data.class, ClassLoader.getSystemResourceAsStream("hrdg/data-attributes-only.xml"));

    serializer.write(data, sw = new StringWriter());

    String fromFile = sw.toString();

    assertEquals(fromObject, fromFile);
  }
}
