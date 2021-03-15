/**
 * SchemaTypeCalendar.java
 *
 * This file was generated by XMLSpy 2006r3sp1 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */

package com.altova.types;

public interface SchemaTypeCalendar extends SchemaType {
  // constants for declaration of types which have an date/time/duration value
  public final int CALENDAR_VALUE_UNDEFINED = -1; // string may contain every type of calender value

  public final int CALENDAR_VALUE_DURATION = 0;
  public final int CALENDAR_VALUE_DATETIME = 1;
  public final int CALENDAR_VALUE_DATE = 2;
  public final int CALENDAR_VALUE_TIME = 3;

  public int calendarType();

  public SchemaDuration durationValue();
  public SchemaDateTime dateTimeValue();
  public SchemaDate dateValue();
  public SchemaTime timeValue();
}
