package com.jflyfox.modules.admin.zhifa.controller;

import java.util.List;

import com.beetl.functions.ExcelUtilsImprove;
import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.site.TbSite;
import com.jflyfox.modules.admin.zhifa.model.TbZzhifa;
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
@ControllerBind(controllerKey = "/admin/zhifa")
public class ZhifaController extends BaseProjectController {

	private static final String path = "/pages/admin/zhifa/zhifa_";

	public void list() {
		TbZzhifa model = getModelByAttr(TbZzhifa.class);

		SQLUtils sql = new SQLUtils(" from tb_zzhifa t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
			sql.whereLike("name", model.getStr("name"));
		}

		Page<TbZzhifa> page = TbZzhifa.dao.paginate(getPaginator(), "select t.* ", //
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
	
	public void dimport() {
		render(path + "import.html");
	}
	
	public void zfEximport() {
		
		TbSite site = getBackSite();
		UploadFile uploadExcel = getFile("uploadFile", FileUploadUtils.getUploadTmpPath(site), FileUploadUtils.UPLOAD_MAX);
		String fileUrl = uploadHandler(site, uploadExcel.getFile(), "excel");
		String backupPath = ConfigCache.getValue("backup.filemanger.path");
		
		try {
			List<List<String>> lists = ExcelUtilsImprove.getInstance().readExcel2List(backupPath+"\\"+fileUrl, 1, 99999, 0);
	        for (List<String> list : lists) {
	            System.out.println(list);
	            TbZzhifa zhifa_model = getModel(TbZzhifa.class);
				zhifa_model.remove("id");
				zhifa_model.setGonghao(list.get(0));
				zhifa_model.setName(list.get(1));
				zhifa_model.setSex(list.get(2));
				zhifa_model.setSfzheng(list.get(3));
				zhifa_model.setPhone(list.get(4));
				zhifa_model.setXueli(list.get(5));
				zhifa_model.setZhuanye(list.get(6));
				zhifa_model.setCongshiriqi(list.get(7));
				zhifa_model.setFawei(list.get(8));
				zhifa_model.setDangwei(list.get(9));
				zhifa_model.setQuyu(list.get(10));
				zhifa_model.setCengji(list.get(11));
				zhifa_model.setBumen(list.get(12));
				zhifa_model.setZhiwu(list.get(13));
				zhifa_model.setZhiwuDetail(list.get(14));
				zhifa_model.setZfzheng(list.get(15));
				zhifa_model.setYouxiaoqi(list.get(16));
				zhifa_model.setFazjiguan(list.get(17));			
				zhifa_model.save();
	        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        renderMessage("导入成功");
	}
	

}
