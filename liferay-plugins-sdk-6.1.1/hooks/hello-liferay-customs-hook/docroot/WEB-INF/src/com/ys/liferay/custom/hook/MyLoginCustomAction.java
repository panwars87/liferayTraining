/**
 * 
 */
package com.ys.liferay.custom.hook;

import com.liferay.portal.kernel.events.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author AC70602
 *
 */
public class MyLoginCustomAction extends Action {
	public void run(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("## My custom login action");
	} 
}