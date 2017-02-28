/** ========================================================================= *
 * Copyright (C)  2016 IBM Corporation ( http://www.ibm.com/ )                *
 *                            All rights reserved.                            *
 *                                                                            *
 *  @author     Stephan H. Wissel (stw) <st.wissel@sg.ibm.com>                *
 *                                       @notessensei                         *
 * @version     1.0                                                           *
 * ========================================================================== *
 *                                                                            *
 * Licensed under the  Apache License, Version 2.0  (the "License").  You may *
 * not use this file except in compliance with the License.  You may obtain a *
 * copy of the License at <http://www.apache.org/licenses/LICENSE-2.0>.       *
 *                                                                            *
 * Unless  required  by applicable  law or  agreed  to  in writing,  software *
 * distributed under the License is distributed on an  "AS IS" BASIS, WITHOUT *
 * WARRANTIES OR  CONDITIONS OF ANY KIND, either express or implied.  See the *
 * License for the  specific language  governing permissions  and limitations *
 * under the License.                                                         *
 *                                                                            *
 * ========================================================================== *
 */
package org.openntf.dominored;

import java.util.HashSet;
import java.util.Set;

import com.ibm.domino.das.service.RestService;

/**
 * @author stw
 *
 */
public class SubscriptionApplication extends RestService {
  /*
   * (non-Javadoc)
   *
   * @see org.apache.wink.common.WinkApplication#getClasses()
   */
  @Override
  public Set<Class<?>> getClasses() {
    System.out.println("Loading classes");
    final Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(SubscriptionResource.class);
    return classes;
  }

  /*
   * (non-Javadoc)
   *
   * @see javax.ws.rs.core.Application#getSingletons()
   */
  @Override
  public Set<Object> getSingletons() {
    final Set<Object> singletons = new HashSet<Object>();
    // Add any instances of classes to load as singletons here
    return singletons;
  }
}
