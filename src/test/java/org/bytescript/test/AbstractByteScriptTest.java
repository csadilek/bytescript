package org.bytescript.test;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.Before;

public abstract class AbstractByteScriptTest {

  protected StringWriter result;
  protected PrintWriter writer;

  @Before
  public void setup() {
    result = new StringWriter();
    writer = new PrintWriter(result);
  }
 
}
