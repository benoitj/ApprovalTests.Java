package com.spun.util.filters.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.spun.util.filters.FilterUtils;

import junit.framework.TestCase;

public class MethodFilterTest extends TestCase
{
  public void testDate() throws Exception
  {
    SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
    Date dates[] = {dateParser.parse("2006-01-01"), dateParser.parse("2006-12-01")};
    Date date = dateParser.parse("2006-06-01");
    List<Date> results = FilterUtils.retainExtracted(dates, d -> date.getTime() >= d.getTime());
    assertEquals(dates[0], results.get(0));
    assertEquals(1, results.size());
  }
}
