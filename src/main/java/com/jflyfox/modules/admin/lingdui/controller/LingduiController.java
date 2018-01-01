package com.jflyfox.modules.admin.lingdui.controller;

import java.io.File;
import java.util.List;

import org.wuwz.poi.ExcelKit;
import org.wuwz.poi.hanlder.ReadHandler;

import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.base.BaseController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.lingdui.model.TbZdyld;
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
@ControllerBind(controllerKey = "/admin/lingdui")
public class LingduiController extends BaseProjectController {

	private static final String path = "/pages/admin/lingdui/lingdui_";

	public void list() {
		TbZdyld model = getModelByAttr(TbZdyld.class);

		SQLUtils sql = new SQLUtils(" from tb_zdyld t where 1=1 ");
		if (model.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
			sql.whereLike("name", model.getStr("name"));
		}
		sql.whereEquals("dy_lingdui", "108");

		Page<TbZdyld> page = TbZdyld.dao.paginate(getPaginator(), "select t.* ", //
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
	
	
	public void ldEximport() {
	
		TbSite site = getBackSite();
		UploadFile uploadExcel = getFile("uploadFile", FileUploadUtils.getUploadTmpPath(site), FileUploadUtils.UPLOAD_MAX);
		String fileUrl = uploadHandler(site, uploadExcel.getFile(), "excel");
		
		String backupPath = ConfigCache.getValue("backup.filemanger.path");
		
		File storeFile = new File(backupPath+"\\"+fileUrl);
		
		// 执行excel文件导入
        ExcelKit.$Import().readExcel(storeFile, new ReadHandler() {
			
			@Override
			public void handler(int sheetIndex, int rowIndex, List<String> row) {
				if(rowIndex != 0) { //排除第一行
//					User user = new User()
//							.setUid(Integer.parseInt(row.get(0)))
//							.setUsername(row.get(1))
//							.setPassword(row.get(2))
//							.setSex(Integer.parseInt(row.get(3)))
//							.setGradeId(Integer.parseInt(row.get(4)));
//					Db.addUser(user);
				}
				
			}
		});
        if(storeFile.exists()) {
        	storeFile.delete();
        }
        renderMessage("导入成功");
	}
	
}
