package com.jflyfox.modules.admin.lvxingshe.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zyichang")
public class TbZyichang extends BaseModel<TbZyichang> {

	private static final long serialVersionUID = 1L;
	public static final TbZyichang dao = new TbZyichang();

    //columns START
    private String ID = "id";  // 异常记录id
    private String YICHANG_ID_TYPE = "yichang_id_type";  // 异常类型-ID
    private String YICHANG_TYPE = "yichang_type";  // 异常类型
    private String YICHANG_TIME = "yichang_time";  // 处理时间
    private String YICHANG_BUMEN = "yichang_bumen";  // 处理部门
    private String YICHANG_NEIRONG = "yichang_neirong";  // 处理内容
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZyichang setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZyichang setYichangIdType(String value) {
        set(YICHANG_ID_TYPE, value);
        return this;
    }

	public String getYichangIdType() {
		return get(YICHANG_ID_TYPE);
	}
    public TbZyichang setYichangType(String value) {
        set(YICHANG_TYPE, value);
        return this;
    }

	public String getYichangType() {
		return get(YICHANG_TYPE);
	}
    public TbZyichang setYichangTime(String value) {
        set(YICHANG_TIME, value);
        return this;
    }

	public String getYichangTime() {
		return get(YICHANG_TIME);
	}
    public TbZyichang setYichangBumen(String value) {
        set(YICHANG_BUMEN, value);
        return this;
    }

	public String getYichangBumen() {
		return get(YICHANG_BUMEN);
	}
    public TbZyichang setYichangNeirong(String value) {
        set(YICHANG_NEIRONG, value);
        return this;
    }

	public String getYichangNeirong() {
		return get(YICHANG_NEIRONG);
	}
    public TbZyichang setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZyichang setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZyichang setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZyichang setCreateId(Integer value) {
        set(CREATE_ID, value);
        return this;
    }

	public Integer getCreateId() {
		return get(CREATE_ID);
	}
	
	@Override
	public String toString() {
		String log = ""; 
		log += "[id:" + getId() + "]";
		log += "[yichangIdType:" + getYichangIdType() + "]";
		log += "[yichangType:" + getYichangType() + "]";
		log += "[yichangTime:" + getYichangTime() + "]";
		log += "[yichangBumen:" + getYichangBumen() + "]";
		log += "[yichangNeirong:" + getYichangNeirong() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}