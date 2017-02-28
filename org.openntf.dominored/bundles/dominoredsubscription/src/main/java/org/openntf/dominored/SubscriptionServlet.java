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

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openntf.domino.AutoMime;
import org.openntf.domino.ext.Session.Fixes;
import org.openntf.domino.utils.Factory;
import org.openntf.domino.utils.Factory.SessionType;
import org.openntf.domino.utils.Factory.ThreadConfig;
import org.openntf.domino.xsp.ODAPlatform;
import org.openntf.domino.xsp.session.DasCurrentSessionFactory;

import com.ibm.domino.services.AbstractRestServlet;

/**
 * @author stw
 *
 */
public class SubscriptionServlet extends AbstractRestServlet {

}
