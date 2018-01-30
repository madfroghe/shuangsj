package com.jflyfox.modules.admin.choucha.service;

import java.util.List;

import com.jflyfox.modules.admin.lingdui.model.TbZdyld;
import com.jflyfox.modules.admin.lvxingshe.model.TbZchoucha;
import com.jflyfox.modules.admin.lvxingshe.model.TbZlvxingshe;
import com.jflyfox.modules.admin.zhifa.model.TbZzhifa;
import com.jflyfox.util.NumberUtils;

public class ChouchaService {
	
	/*
	 * 定向抽查-旅行社主体
	 */
	public List<TbZlvxingshe> ZhutiDx(TbZchoucha tbZchoucha) {	

		String SqlWhere="";
		if(tbZchoucha.getChengliDi()!=null && !tbZchoucha.getChengliDi().equals("")){
			SqlWhere+=" and cl_time >"+tbZchoucha.getChengliDi()+" ";
		}
		if(tbZchoucha.getChengliGao()!=null && !tbZchoucha.getChengliGao().equals("")){
			SqlWhere+=" and cl_time <"+tbZchoucha.getChengliGao()+" ";
		}
		if(tbZchoucha.getZibenDi()!=null && !tbZchoucha.getZibenDi().equals("")){
			SqlWhere+=" and cl_money >"+tbZchoucha.getZibenDi()+" ";
		}
		if(tbZchoucha.getZibenGao()!=null && !tbZchoucha.getZibenGao().equals("")){
			SqlWhere+=" and cl_money <"+tbZchoucha.getZibenGao()+" ";
		}
		if(tbZchoucha.getGuimoDi()!=null && !tbZchoucha.getGuimoDi().equals("")){
			SqlWhere+=" and jingyinggm >"+tbZchoucha.getGuimoDi()+" ";
		}
		if(tbZchoucha.getGuimoGao()!=null && !tbZchoucha.getGuimoGao().equals("")){
			SqlWhere+=" and jingyinggm <"+tbZchoucha.getGuimoGao()+" ";
		}
		if(tbZchoucha.getFanwei()!=null && !tbZchoucha.getFanwei().equals("")){
			SqlWhere+=" and lxs_business in("+tbZchoucha.getFanwei()+")";
		}
		if(tbZchoucha.getLeixing()!=null && !tbZchoucha.getLeixing().equals("")){
			SqlWhere+=" and money_type in("+tbZchoucha.getLeixing()+")";
		}
		if(tbZchoucha.getZhucedi()!=null && !tbZchoucha.getZhucedi().equals("")){
			SqlWhere+=" and qiye_quyu in("+tbZchoucha.getZhucedi()+")";
		}
		if(tbZchoucha.getBangong()!=null && !tbZchoucha.getBangong().equals("")){
			SqlWhere+=" and qiye_bgquyu in("+tbZchoucha.getBangong()+")";
		}
		
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zlvxingshe where 1=1 "+SqlWhere+" ORDER BY random ";
		List<TbZlvxingshe> list = TbZlvxingshe.dao.find(sqlSelect);
		return list;
	}
	
	/*
	 * 不定向抽查-旅行社主体
	 */
	public List<TbZlvxingshe> ZhutiBDx(TbZchoucha tbZchoucha) {
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zlvxingshe ORDER BY random ";
		List<TbZlvxingshe> list = TbZlvxingshe.dao.find(sqlSelect);
		return list;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 * 定向抽查-导游
	 */
	public List<TbZdyld> DaoyouDx(TbZchoucha tbZchoucha) {
		
		String SqlWhere="";
		if(!tbZchoucha.getChengliDi().equals("")){
			SqlWhere+=" and lxs.cl_time >"+tbZchoucha.getChengliDi()+" ";
		}
		if(!tbZchoucha.getChengliGao().equals("")){
			SqlWhere+=" and lxs.cl_time <"+tbZchoucha.getChengliGao()+" ";
		}
		if(!tbZchoucha.getZibenDi().equals("")){
			SqlWhere+=" and lxs.cl_money >"+tbZchoucha.getZibenDi()+" ";
		}
		if(!tbZchoucha.getZibenGao().equals("")){
			SqlWhere+=" and lxs.cl_money <"+tbZchoucha.getZibenGao()+" ";
		}
		if(!tbZchoucha.getGuimoDi().equals("")){
			SqlWhere+=" and lxs.jingyinggm >"+tbZchoucha.getGuimoDi()+" ";
		}
		if(!tbZchoucha.getGuimoGao().equals("")){
			SqlWhere+=" and lxs.jingyinggm <"+tbZchoucha.getGuimoGao()+" ";
		}
		if(!tbZchoucha.getFanwei().equals("")){
			SqlWhere+=" and lxs.lxs_business in("+tbZchoucha.getFanwei()+")";
		}
		if(!tbZchoucha.getLeixing().equals("")){
			SqlWhere+=" and lxs.money_type in("+tbZchoucha.getLeixing()+")";
		}
		if(!tbZchoucha.getZhucedi().equals("")){
			SqlWhere+=" and lxs.qiye_quyu in("+tbZchoucha.getZhucedi()+")";
		}
		if(!tbZchoucha.getBangong().equals("")){
			SqlWhere+=" and lxs.qiye_bgquyu in("+tbZchoucha.getBangong()+")";
		}
		
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld as dyld left join tb_zlvxingshe as lxs on dyld.dy_lxs=lxs.name  where 1=1 "+SqlWhere+" ORDER BY random ";
		List<TbZdyld> list = TbZdyld.dao.find(sqlSelect);
		return list;
	}
	
	/*
	 * 不定向抽查-导游
	 */
	public List<TbZdyld> DaoyouBDx(TbZchoucha tbZchoucha) {
		
		String SqlWhere="";
		if(!tbZchoucha.getChengliDi().equals("")){
			SqlWhere+=" and lxs.cl_time >"+tbZchoucha.getChengliDi()+" ";
		}
		if(!tbZchoucha.getChengliGao().equals("")){
			SqlWhere+=" and lxs.cl_time <"+tbZchoucha.getChengliGao()+" ";
		}
		if(!tbZchoucha.getZibenDi().equals("")){
			SqlWhere+=" and lxs.cl_money >"+tbZchoucha.getZibenDi()+" ";
		}
		if(!tbZchoucha.getZibenGao().equals("")){
			SqlWhere+=" and lxs.cl_money <"+tbZchoucha.getZibenGao()+" ";
		}
		if(!tbZchoucha.getGuimoDi().equals("")){
			SqlWhere+=" and lxs.jingyinggm >"+tbZchoucha.getGuimoDi()+" ";
		}
		if(!tbZchoucha.getGuimoGao().equals("")){
			SqlWhere+=" and lxs.jingyinggm <"+tbZchoucha.getGuimoGao()+" ";
		}
		if(!tbZchoucha.getFanwei().equals("")){
			SqlWhere+=" and lxs.lxs_business in("+tbZchoucha.getFanwei()+")";
		}
		if(!tbZchoucha.getLeixing().equals("")){
			SqlWhere+=" and lxs.money_type in("+tbZchoucha.getLeixing()+")";
		}
		if(!tbZchoucha.getZhucedi().equals("")){
			SqlWhere+=" and lxs.qiye_quyu in("+tbZchoucha.getZhucedi()+")";
		}
		if(!tbZchoucha.getBangong().equals("")){
			SqlWhere+=" and lxs.qiye_bgquyu in("+tbZchoucha.getBangong()+")";
		}
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld as dyld left join tb_zlvxingshe as lxs on dyld.dy_lxs=lxs.name  where 1=1 "+SqlWhere+" ORDER BY random ";
		List<TbZdyld> list = TbZdyld.dao.find(sqlSelect);
		return list;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 * 定向抽查-领队
	 */
	public List<TbZdyld> LingduiDx(TbZchoucha tbZchoucha) {
		
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld where dy_lingdui='是' ORDER BY random ";
		List<TbZdyld> list = TbZdyld.dao.find(sqlSelect);
		return list;
	}
	
	/*
	 * 不定向抽查-领队
	 */
	public List<TbZdyld> LingduiBDx(TbZchoucha tbZchoucha) {
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld where dy_lingdui='是' ORDER BY random ";
		List<TbZdyld> list = TbZdyld.dao.find(sqlSelect);
		return list;
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 * 定向抽查-人员
	 */
	public List<TbZzhifa> RenyuanDx(TbZchoucha tbZchoucha) {
		//model.jc_fanwei
		//model.jc_bumen
		//model.jc_sex
		//model.jc_zhiwu
		String SqlWhere="";
		if(!tbZchoucha.getJcFanwei().equals("")){
			SqlWhere+=" and quyu in("+tbZchoucha.getJcFanwei()+")";
		}
		if(!tbZchoucha.getJcBumen().equals("")){
			SqlWhere+=" and bumen in("+tbZchoucha.getJcBumen()+")";
		}
		if(!tbZchoucha.getJcSex().equals("")){
			SqlWhere+=" and sex in("+tbZchoucha.getJcSex()+")";
		}
		if(!tbZchoucha.getJcZhiwu().equals("")){
			SqlWhere+=" and zhiwu in("+tbZchoucha.getJcFanwei()+")";
		}
		int num_total=NumberUtils.parseInt(tbZchoucha.getJcDxzs())*NumberUtils.parseInt(tbZchoucha.getZushu());
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zzhifa where 1=1 "+SqlWhere+" ORDER BY random ";
		List<TbZzhifa> list = TbZzhifa.dao.find(sqlSelect);
		return list;
	}
	
	/*
	 * 不定向抽查-人员
	 */
	public List<TbZzhifa> RenyuanBDx(TbZchoucha tbZchoucha) {

		int num_total=NumberUtils.parseInt(tbZchoucha.getJcDxzs())*NumberUtils.parseInt(tbZchoucha.getZushu());
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zzhifa ORDER BY random ";
		List<TbZzhifa> list = TbZzhifa.dao.find(sqlSelect);
		return list;
	}
	
}
