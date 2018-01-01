package com.jflyfox.modules.admin.choucha.controller;


import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;


/**
 * 
 * 
 * @author hechao 2017-12-20
 */
@ControllerBind(controllerKey = "/admin/choucha")
public class ChouchaController extends BaseProjectController {

	private static final String path = "/pages/admin/choucha/choucha_";

	public void index() {

		render(path + "choucha.html");
	}
	
}
