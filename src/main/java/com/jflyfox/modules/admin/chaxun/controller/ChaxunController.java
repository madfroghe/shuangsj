package com.jflyfox.modules.admin.chaxun.controller;


import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;


/**
 * 
 * 
 * @author hechao 2017-12-20
 */
@ControllerBind(controllerKey = "/admin/chaxun")
public class ChaxunController extends BaseProjectController {

	private static final String path = "/pages/admin/chaxun/chaxun_";

	public void index() {

		render(path + "chaxun.html");
	}
	
}
