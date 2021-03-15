/**
 * SchemaType.java
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

import java.io.Serializable;


public interface SchemaType extends Cloneable, Comparable, Serializable {
  // set
  public void parse( String newvalue );
  public void setNull();
  public void setEmpty();

  // get
  public boolean booleanValue(); // returns the value as boolean if possible, otherwise false.
  public boolean isEmpty();
  public boolean isNull();		// indicates if the element is not existing

  // get as string
  public String toString(); // serializes the value as string
  public int length();

}
