package com.jflyfox.modules.admin.zhifa.controller;

import com.jflyfox.jfinal.base.BaseController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.zhifa.model.TbZzhifa;
import com.jfinal.plugin.activerecord.Page;

/**
 * 
 * 
 * @author hechao 2017-12-20
 */
@ControllerBind(controllerKey = "/admin/zhifa")
public class ZhifaController extends BaseController {

	private static final String path = "/pages/admin/zhifa/zhifa_";

	public void list() {
		TbZzhifa model = getModelByAttr(TbZzhifa.class);

		SQLUtils sql = new SQLUtils(" from tb_zzhifa t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}

		Page<TbZzhifa> page = TbZzhifa.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());

		// 下拉框
		setAttr("page", page);
		setAttr("attr", model);
		render(path + "list.html");
	}

	public void add() {
		render(path + "add.html");
	}

	public void view() {
		TbZzhifa model = TbZzhifa.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "view.html");
	}

	public void delete() {
		TbZzhifa.dao.deleteById(getParaToInt());
		list();
	}

	public void edit() {
		TbZzhifa model = TbZzhifa.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "edit.html");
	}

	public void save() {
		Integer pid = getParaToInt();
		TbZzhifa model = getModel(TbZzhifa.class);
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
}
