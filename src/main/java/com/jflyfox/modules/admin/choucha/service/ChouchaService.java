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
		
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zlvxingshe ORDER BY random ";
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
		
		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld ORDER BY random ";
		List<TbZdyld> list = TbZdyld.dao.find(sqlSelect);
		return list;
	}
	
	/*
	 * 不定向抽查-导游
	 */
	public List<TbZdyld> DaoyouBDx(TbZchoucha tbZchoucha) {

		String num_total=tbZchoucha.getDxzs();
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zdyld ORDER BY random ";
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

		int num_total=NumberUtils.parseInt(tbZchoucha.getJcDxzs())*NumberUtils.parseInt(tbZchoucha.getZushu());
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zzhifa ORDER BY random ";
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
