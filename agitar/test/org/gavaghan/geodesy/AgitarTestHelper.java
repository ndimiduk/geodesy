package org.gavaghan.geodesy;

import com.agitar.lib.TestHelper;

public class AgitarTestHelper implements TestHelper
{
   public static Ellipsoid createWGS84Ellipsoid()
   {
      return Ellipsoid.WGS84;
   }
}
