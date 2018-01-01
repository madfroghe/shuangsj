package com.jflyfox.modules.admin.choucha.controller;

import com.jfinal.plugin.activerecord.Page;
import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.lvxingshe.model.TbZchoucha;
import com.jflyfox.util.DateUtils;


/**
 * 
 * 
 * @author hechao 2017-12-20
 */
@ControllerBind(controllerKey = "/admin/choucha")
public class ChouchaController extends BaseProjectController {

	private static final String path = "/pages/admin/choucha/choucha_";

	public void index() {
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		render(path + "choucha.html");
	}
	
	public void list() {
		TbZchoucha model = getModelByAttr(TbZchoucha.class);

		SQLUtils sql = new SQLUtils(" from tb_zchoucha t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
			sql.whereLike("name", model.getStr("name"));
		}

		Page<TbZchoucha> page = TbZchoucha.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		// 下拉框
		setAttr("page", page);
		setAttr("attr", model);
		render(path + "list.html");
	}

	public void add() {
		render(path + "add.html");
	}

	public void view() {
		TbZchoucha model = TbZchoucha.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "view.html");
	}

	public void delete() {
		TbZchoucha.dao.deleteById(getParaToInt());
		list();
	}

	public void edit() {
		TbZchoucha model = TbZchoucha.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "edit.html");
	}

	public void save() {
		Integer pid = getParaToInt();
		TbZchoucha model = getModel(TbZchoucha.class);
		if (pid != null && pid > 0) { // 更新
			model.update();
		} else { // 新增
			model.remove("id");
			model.put("create_id", getSessionUser().getUserid());
			model.put("create_time", getNow());
			model.save();
		}
		renderMessage("保存成功");
	}
	
	public void duixiang() {
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		render(path + "duixiang.html");
	}
	
	public void renyuan() {
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		render(path + "renyuan.html");
	}
	
	public void zhixing() {
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		render(path + "zhixing.html");
	}
	
}
