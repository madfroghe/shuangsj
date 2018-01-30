package com.jflyfox.system.role;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jflyfox.jfinal.base.BaseService;
import com.jflyfox.system.rolemenu.SysRoleMenu;
import com.jflyfox.util.DateUtils;
import com.jflyfox.util.NumberUtils;
import com.jflyfox.util.StrUtils;

public class RoleSvc extends BaseService {

	/**
	 * 获取角色授权的菜单
	 * 
	 * 2015年4月28日 下午5:01:54 flyfox 369191470@qq.com
	 * 
	 * @param roleid
	 * @return
	 */
	public String getMemus(int roleid) {
		String sql = " select menuid from sys_role_menu where roleid = ?";
		List<Record> record_list = Db.find(sql, roleid);
		List<String> list = new ArrayList<String>(); 
		for(Record record:record_list){
			list.add(record.getInt("menuid").toString());
		}
		String menus =  StringUtils.join(list, ",");
		return menus;
	}

	/**
	 * 保存授权信息
	 * 
	 * 2015年4月28日 下午5:00:30 flyfox 369191470@qq.com
	 * 
	 * @param roleid
	 * @param menus
	 */
	public void saveAuth(int roleid, String menus, int update_id) {
		// 删除原有数据库
		Db.update("delete from sys_role_menu where roleid = ? ", roleid);

		if (StrUtils.isNotEmpty(menus)) {
			String[] arr = menus.split(",");
			for (String menuid : arr) {
				SysRoleMenu roleMenu = new SysRoleMenu();
				roleMenu.set("roleid", roleid);
				roleMenu.set("menuid", NumberUtils.parseInt(menuid));

				// 日志添加
				roleMenu.put("update_id", update_id);
				roleMenu.put("update_time", DateUtils.getNow(DateUtils.DEFAULT_REGEX_YYYY_MM_DD_HH_MIN_SS));
				roleMenu.save();
			}
		}
	}

}
