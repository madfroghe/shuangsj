package com.jflyfox.modules.admin.daoyou.controller;

import java.util.List;
import com.beetl.functions.ExcelUtilsImprove;
import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.lingdui.model.TbZdyld;
import com.jflyfox.modules.admin.lvxingshe.model.TbZyichang;
import com.jflyfox.modules.admin.site.TbSite;
import com.jflyfox.system.config.ConfigCache;
import com.jflyfox.system.file.util.FileUploadUtils;
import com.jflyfox.util.DateUtils;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.upload.UploadFile;

/**
 * 
 * 
 * @author hechao 2017-12-20
 */
@ControllerBind(controllerKey = "/admin/daoyou")
public class DaoyouController extends BaseProjectController {

	private static final String path = "/pages/admin/daoyou/daoyou_";

	public void list() {
		TbZdyld model = getModelByAttr(TbZdyld.class);

		SQLUtils sql = new SQLUtils(" from tb_zdyld t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
			sql.whereLike("name", model.getStr("name"));
		}
		sql.whereEquals("dy_lingdui", "否");

		Page<TbZdyld> page = TbZdyld.dao.paginate(getPaginator(),
				"select t.* ", //
				sql.toString().toString());

		String nowTime = DateUtils
				.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
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
		TbZdyld model = TbZdyld.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "view.html");
	}

	public void delete() {
		TbZdyld.dao.deleteById(getParaToInt());
		list();
	}

	public void edit() {
		TbZdyld model = TbZdyld.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "edit.html");
	}

	public void save() {
		Integer pid = getParaToInt();
		TbZdyld model = getModel(TbZdyld.class);
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

	public void yichang() {
		Integer yichang = getParaToInt();
		setAttr("yichang", "DA_" + yichang);
		render(path + "yichang.html");
	}

	public void dimport() {
		render(path + "import.html");
	}

	public void ycsave() {
		Integer pid = getParaToInt();
		TbZyichang model = getModel(TbZyichang.class);
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

	public void dyEximport() {

		TbSite site = getBackSite();
		UploadFile uploadExcel = getFile("uploadFile",
				FileUploadUtils.getUploadTmpPath(site),
				FileUploadUtils.UPLOAD_MAX);
		String fileUrl = uploadHandler(site, uploadExcel.getFile(), "excel");

		String backupPath = ConfigCache.getValue("backup.filemanger.path");

		try {
			List<List<String>> lists = ExcelUtilsImprove.getInstance()
					.readExcel2List(backupPath + "\\" + fileUrl, 1, 99999, 0);
			for (List<String> list : lists) {
				TbZdyld dyld_model = getModel(TbZdyld.class);
				dyld_model.remove("id");
				dyld_model.setName(list.get(0));
				dyld_model.setSex(list.get(1));
				dyld_model.setDyShenfz(list.get(2));
				dyld_model.setDyCode(list.get(3));
				dyld_model.setDyZigezh(list.get(4));
				dyld_model.setDyPhone(list.get(5));
				dyld_model.setLanguage(list.get(6));
				dyld_model.setLdType(list.get(7));
				dyld_model.setDyShenqing(list.get(8));
				dyld_model.setDyShenpi(list.get(9));
				dyld_model.setDyLxs(list.get(10));
				dyld_model.setDyLingdui("否");
				dyld_model.save();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		renderMessage("导入成功");
	}

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void yichanglist() {
		Integer pid = getParaToInt();

		TbZyichang model = getModel(TbZyichang.class);

		SQLUtils sql = new SQLUtils(" from tb_zyichang t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		sql.whereEquals("yichang_id_type", "DA_" + pid);

		Page<TbZyichang> page = TbZyichang.dao.paginate(getPaginator(),
				"select t.* ", sql.toString().toString());

		String nowTime = DateUtils
				.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);

		setAttr("zhuti", pid);

		// 下拉框
		setAttr("page", page);
		setAttr("attr", model);
		
		render(path + "yichanglist.html");
	}
	
	public void yichangview() {
		TbZyichang model = TbZyichang.dao.findById(getParaToInt());
		setAttr("model", model);
		render(path + "yichangview.html");
	}

}
