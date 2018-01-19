package com.jflyfox.modules.admin.choucha.service;

import java.util.List;

import com.jflyfox.modules.admin.lvxingshe.model.TbZchoucha;
import com.jflyfox.modules.admin.lvxingshe.model.TbZlvxingshe;
import com.jflyfox.modules.admin.zhifa.model.TbZzhifa;
import com.jflyfox.util.NumberUtils;

public class ChouchaService {
	
	/*
	 * 定向抽查-旅行社主体
	 */
	public List<TbZlvxingshe> ZhutiDx(TbZchoucha tbZchoucha) {
		
		//tbZchoucha.getZushu();
		String num_total=tbZchoucha.getDxzs();
		//SELECT id FROM t_innodb_random ORDER BY RAND() LIMIT 5
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zlvxingshe ORDER BY random ";
		List<TbZlvxingshe> list = TbZlvxingshe.dao.find(sqlSelect);
		//for(TbZlvxingshe tbZlvxingshe : list){
		//	TbZcczu model = getModel(TbZchoucha.class);
		//}
		return list;
	}
	
	/*
	 * 不定向抽查-旅行社主体
	 */
	public List<TbZlvxingshe> ZhutiBDx(TbZchoucha tbZchoucha) {
		//tbZchoucha.getZushu();
		String num_total=tbZchoucha.getDxzs();
		//SELECT id FROM t_innodb_random ORDER BY RAND() LIMIT 5
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zlvxingshe ORDER BY random ";
		List<TbZlvxingshe> list = TbZlvxingshe.dao.find(sqlSelect);
		//for(TbZlvxingshe tbZlvxingshe : list){
		//	TbZcczu model = getModel(TbZchoucha.class);
		//}
		return list;
	}
	
	/*
	 * 定向抽查-人员
	 */
	public List<TbZzhifa> RenyuanDx(TbZchoucha tbZchoucha) {

		//tbZchoucha.getZushu();  jc_dxzs
		int num_total=NumberUtils.parseInt(tbZchoucha.getJcDxzs())*NumberUtils.parseInt(tbZchoucha.getZushu());
		//SELECT id FROM t_innodb_random ORDER BY RAND() LIMIT 5
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zzhifa ORDER BY random ";
		List<TbZzhifa> list = TbZzhifa.dao.find(sqlSelect);
		//for(TbZlvxingshe tbZlvxingshe : list){
		//	TbZcczu model = getModel(TbZchoucha.class);
		//}
		return list;
	}
	
	/*
	 * 不定向抽查-人员
	 */
	public List<TbZzhifa> RenyuanBDx(TbZchoucha tbZchoucha) {

		//tbZchoucha.getZushu();  jc_dxzs
		int num_total=NumberUtils.parseInt(tbZchoucha.getJcDxzs())*NumberUtils.parseInt(tbZchoucha.getZushu());
		//SELECT id FROM t_innodb_random ORDER BY RAND() LIMIT 5
		String sqlSelect = " SELECT top "+num_total+" *, NewID() as random FROM tb_zzhifa ORDER BY random ";
		List<TbZzhifa> list = TbZzhifa.dao.find(sqlSelect);
		//for(TbZlvxingshe tbZlvxingshe : list){
		//	TbZcczu model = getModel(TbZchoucha.class);
		//}
		return list;
	}
	
}
