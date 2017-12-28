package com.jflyfox.modules.admin.home;

import com.jfinal.plugin.activerecord.Page;
import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.base.Paginator;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.modules.CommonController;
import com.jflyfox.modules.admin.article.TbArticle;
import com.jflyfox.modules.admin.comment.TbComment;
import com.jflyfox.modules.admin.pageview.TbPageView;
import com.jflyfox.system.user.SysUser;

@ControllerBind(controllerKey = "/admin/home")
public class AdminHomeController extends BaseProjectController {

	private static final String path = "/pages/admin/home/";

	public void index() {
		SysUser user = (SysUser) getSessionUser();
		if (user == null) {
			redirect(CommonController.firstPage);
			return;
		}
		setAttr("nowUser", user);
		
		
		render(path + "home.html");
	}
}
