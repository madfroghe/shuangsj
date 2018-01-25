package com.jflyfox.modules.admin.choucha.controller;

import java.util.List;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Page;
import com.jflyfox.component.base.BaseProjectController;
import com.jflyfox.jfinal.component.annotation.ControllerBind;
import com.jflyfox.jfinal.component.db.SQLUtils;
import com.jflyfox.modules.admin.choucha.service.ChouchaService;
import com.jflyfox.modules.admin.lingdui.model.TbZdyld;
import com.jflyfox.modules.admin.lvxingshe.model.TbZcczu;
import com.jflyfox.modules.admin.lvxingshe.model.TbZchoucha;
import com.jflyfox.modules.admin.lvxingshe.model.TbZlvxingshe;
import com.jflyfox.modules.admin.zhifa.model.TbZzhifa;
import com.jflyfox.util.DateUtils;
import com.jflyfox.util.NumberUtils;


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
		
		TbZchoucha model;
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
		}
		
		setAttr("model", model);
		
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
		render(path + "choucha.html");
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
	
	public void jichusave() {
		Integer pid = getParaToInt();
		TbZchoucha model = getModel(TbZchoucha.class);
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		if (pid != null && pid > 0) { // 更新
			model.update();
		} else { // 新增
			model.remove("id");
			model.put("choucha_status", "任务创建");
			model.put("choucha_zhuti", "NO");
			model.put("choucha_zhifa", "NO");
			model.put("create_id", getSessionUser().getUserid());
			model.put("create_time", getNow());
			model.save();
		}
		
		if(model.getId()!=null){
			 model = TbZchoucha.dao.findById(model.getId());
		}else{
			 model = TbZchoucha.dao.findById(0);
		}
		
		setAttr("model", model);
		
		render(path + "choucha.html");
	}
	
	/*
	 * 选择主体筛选
	 */
	public void duixiang_sx() {
		Integer pid = getParaToInt();
		TbZchoucha model = getModel(TbZchoucha.class);
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		if (pid != null && pid > 0) { // 更新
			model.put("choucha_zhuti", "YES");
			model.update();
		}
		if(model.getChouchaDuixiang().equals("旅行社")){
			List<TbZlvxingshe> lvxingshe_list = null;
			////////////////筛选begin//////////////////////////////////////////////		
			if(model.getChouchaType().equals("不定向抽查")){
				lvxingshe_list=new ChouchaService().ZhutiBDx(model);
			}else if(model.getChouchaType().equals("定向抽查")){
				lvxingshe_list=new ChouchaService().ZhutiDx(model);
			}
			////////////////筛选end////////////////////////////////////////////////
			
			//////////////插入数据begin//////////////////////////////////////////////////
			
			Db.update(" delete from tb_zcczu where zhuti_order = ?", "ORDER"+pid);
			
			for(TbZlvxingshe tbZlvxingshe:lvxingshe_list){
				TbZcczu model_tbzcczu = new TbZcczu();
				model_tbzcczu.remove("id");
				model_tbzcczu.put("zhuti_order", "ORDER"+pid);
				model_tbzcczu.put("zhuti_name", tbZlvxingshe.getName());
				model_tbzcczu.put("zhuti_address", tbZlvxingshe.getQiyeDizhi());
				model_tbzcczu.put("zhuti_id", tbZlvxingshe.getId());
				model_tbzcczu.put("create_id", getSessionUser().getUserid());
				model_tbzcczu.put("create_time", getNow());
				model_tbzcczu.save();
			}
			////////////////插入数据end////////////////////////////////////////////
		}else if(model.getChouchaDuixiang().equals("导游")){
			List<TbZdyld> daoyou_list = null;
			////////////////筛选begin//////////////////////////////////////////////		
			if(model.getChouchaType().equals("不定向抽查")){
				daoyou_list=new ChouchaService().DaoyouBDx(model);
			}else if(model.getChouchaType().equals("定向抽查")){
				daoyou_list=new ChouchaService().DaoyouDx(model);
			}
			////////////////筛选end////////////////////////////////////////////////
			
			//////////////插入数据begin//////////////////////////////////////////////////
			
			Db.update(" delete from tb_zcczu where zhuti_order = ?", "ORDER"+pid);
			
			for(TbZdyld tbZdyld:daoyou_list){
				TbZcczu model_tbzcczu = new TbZcczu();
				model_tbzcczu.remove("id");
				model_tbzcczu.put("zhuti_order", "ORDER"+pid);
				model_tbzcczu.put("zhuti_name", tbZdyld.getName());
				model_tbzcczu.put("zhuti_address", tbZdyld.getDyLxs());
				model_tbzcczu.put("zhuti_id", tbZdyld.getId());
				model_tbzcczu.put("create_id", getSessionUser().getUserid());
				model_tbzcczu.put("create_time", getNow());
				model_tbzcczu.save();
			}
			////////////////插入数据end////////////////////////////////////////////
		}else if(model.getChouchaDuixiang().equals("领队")){
			List<TbZdyld> lingdui_list = null;
			////////////////筛选begin//////////////////////////////////////////////		
			if(model.getChouchaType().equals("不定向抽查")){
				lingdui_list=new ChouchaService().LingduiDx(model);
			}else if(model.getChouchaType().equals("定向抽查")){
				lingdui_list=new ChouchaService().LingduiDx(model);
			}
			////////////////筛选end////////////////////////////////////////////////
			
			//////////////插入数据begin//////////////////////////////////////////////////
			
			Db.update(" delete from tb_zcczu where zhuti_order = ?", "ORDER"+pid);
			
			for(TbZdyld tbZdyld:lingdui_list){
				TbZcczu model_tbzcczu = new TbZcczu();
				model_tbzcczu.remove("id");
				model_tbzcczu.put("zhuti_order", "ORDER"+pid);
				model_tbzcczu.put("zhuti_name", tbZdyld.getName());
				model_tbzcczu.put("zhuti_address", tbZdyld.getDyLxs());
				model_tbzcczu.put("zhuti_id", tbZdyld.getId());
				model_tbzcczu.put("create_id", getSessionUser().getUserid());
				model_tbzcczu.put("create_time", getNow());
				model_tbzcczu.save();
			}
			////////////////插入数据end////////////////////////////////////////////
		}
		
		
		TbZcczu model_tbZcczu = getModelByAttr(TbZcczu.class);
		SQLUtils sql = new SQLUtils(" from tb_zcczu t where 1=1 ");
		
		if (model_tbZcczu.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
			 sql.whereEquals("zhuti_order", "ORDER"+getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
			 sql.whereEquals("zhuti_order", "ORDERALL");
		}
		Page<TbZcczu> page = TbZcczu.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		setAttr("page", page);
		setAttr("model", model);
		
		render(path + "duixiang.html");
	}
	
	/*
	 * 执法人员筛选
	 */
	public void renyuan_sx() {
		Integer pid = getParaToInt();
		TbZchoucha model = getModel(TbZchoucha.class);
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		if (pid != null && pid > 0) { // 更新
			model.put("choucha_zhifa", "YES");
			model.update();
		}
		
		List<TbZzhifa> zhifa_list = null;
		////////////////筛选begin//////////////////////////////////////////////		
		if(model.getChouchaType().equals("不定向抽查")){
			zhifa_list=new ChouchaService().RenyuanBDx(model);
		}else if(model.getChouchaType().equals("定向抽查")){
			zhifa_list=new ChouchaService().RenyuanDx(model);
		}
		////////////////筛选end////////////////////////////////////////////////
		
		//////////////插入数据begin//////////////////////////////////////////////////	
		
		int zhuti_zushu=NumberUtils.parseInt(model.getZushu());
		int zhuti_zongshu=NumberUtils.parseInt(model.getDxzs());
		int top_number=zhuti_zongshu/zhuti_zushu;
		int zhifa_number=zhifa_list.size();
		int zhifa_group_number=NumberUtils.parseInt(model.getJcDxzs());
		Db.update(" update tb_zcczu set zhifa_name='',zhifa_id='' where zhuti_order = ?", "ORDER"+pid);
		for(int j=0;j<zhuti_zushu;j++){
			String zhifa_name_temp="";
			String zhifa_id_temp="";
			for(int i=0;i<zhifa_number;i++){
				if((i/zhifa_group_number)==j){
					if(i%zhifa_group_number==0){
						zhifa_name_temp=zhifa_name_temp+zhifa_list.get(i).getName();
						zhifa_id_temp=zhifa_id_temp+zhifa_list.get(i).getId();
					}else{
						zhifa_name_temp=zhifa_name_temp+","+zhifa_list.get(i).getName();
						zhifa_id_temp=zhifa_id_temp+zhifa_list.get(i).getId();
					}
				}	
			}
			Db.update(" update top ("+top_number+") tb_zcczu set zhifa_name=zhifa_name+'"+zhifa_name_temp+"',zhifa_id='"+zhifa_id_temp+"' where zhuti_order = ? and zhifa_name='' ", "ORDER"+pid);
		}
		
		////////////////插入数据end////////////////////////////////////////////
		
		TbZcczu model_tbZcczu = getModelByAttr(TbZcczu.class);
		SQLUtils sql = new SQLUtils(" from tb_zcczu t where 1=1 ");
		
		if (model_tbZcczu.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
			 sql.whereEquals("zhuti_order", "ORDER"+getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
			 sql.whereEquals("zhuti_order", "ORDERALL");
		}
		Page<TbZcczu> page = TbZcczu.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		setAttr("page", page);
		setAttr("model", model);
		
		render(path + "renyuan.html");
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void duixiang() {
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);		
		
		TbZchoucha model;
		TbZcczu model_tbZcczu = getModelByAttr(TbZcczu.class);
		SQLUtils sql = new SQLUtils(" from tb_zcczu t where 1=1 ");
		
		if (model_tbZcczu.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
			 sql.whereEquals("zhuti_order", "ORDER"+getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
			 sql.whereEquals("zhuti_order", "ORDERALL");
		}
		Page<TbZcczu> page = TbZcczu.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		setAttr("page", page);
		
		setAttr("model", model);
		render(path + "duixiang.html");
	}
	
	public void renyuan() {
		
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		TbZchoucha model;
		TbZcczu model_tbZcczu = getModelByAttr(TbZcczu.class);
		SQLUtils sql = new SQLUtils(" from tb_zcczu t where 1=1 ");
		
		if (model_tbZcczu.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
			 sql.whereEquals("zhuti_order", "ORDER"+getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
			 sql.whereEquals("zhuti_order", "ORDERALL");
		}
		Page<TbZcczu> page = TbZcczu.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		setAttr("page", page);
		
		setAttr("model", model);
		render(path + "renyuan.html");
	}
	
	public void zhixing() {
		String nowTime = DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS);
		setAttr("nowTime", nowTime);
		String xingQi = DateUtils.getCurrenDayXingQi();
		setAttr("xingQi", xingQi);
		
		Integer pid = getParaToInt();
		TbZchoucha model = getModel(TbZchoucha.class);
		if (pid != null && pid > 0 && model.getChouchaZhuti().equals("YES")  && model.getChouchaZhifa().equals("YES")) { // 更新
			model.put("choucha_status", "任务执行");
			model.update();
		}
		
		TbZcczu model_tbZcczu = getModelByAttr(TbZcczu.class);
		SQLUtils sql = new SQLUtils(" from tb_zcczu t where 1=1 ");
		
		if (model_tbZcczu.getAttrValues().length != 0) {
			sql.setAlias("t");
			// 查询条件
		}
		if(getParaToInt()!=null){
			 model = TbZchoucha.dao.findById(getParaToInt());
			 sql.whereEquals("zhuti_order", "ORDER"+getParaToInt());
		}else{
			 model = TbZchoucha.dao.findById(0);
			 sql.whereEquals("zhuti_order", "ORDERALL");
		}
		Page<TbZcczu> page = TbZcczu.dao.paginate(getPaginator(), "select t.* ", //
				sql.toString().toString());
		setAttr("page", page);
		
		setAttr("model", model);
		
		render(path + "zhixing.html");
	}
	
}
