package org.bytescript.test.pojo;

import static org.apache.bcel.Repository.lookupClass;

import org.bytescript.JavaScriptConverter;
import org.bytescript.test.AbstractByteScriptTest;
import org.junit.Test;

public class PojoTest extends AbstractByteScriptTest {

  @Test
  public void convertClass() throws Exception {
    final JavaScriptConverter converter = new JavaScriptConverter();
    converter.convert(lookupClass(StringPojo.class), writer);

    System.out.println(result.toString());
  }
 
}
