package com.jflyfox.modules.admin.lvxingshe.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zcczu")
public class TbZcczu extends BaseModel<TbZcczu> {

	private static final long serialVersionUID = 1L;
	public static final TbZcczu dao = new TbZcczu();

    //columns START
    private String ID = "id";  // 抽查id
    private String ZHUTI_ORDER = "zhuti_order";  // 订单号
    private String ZHUTI_NAME = "zhuti_name";  // 主体名称
    private String ZHUTI_ADDRESS = "zhuti_address";  // 主体地址
    private String ZHUTI_ID = "zhuti_id";  // 主体ID
    private String ZHIFA_NAME = "zhifa_name";  // 执法人员名单
    private String ZHIFA_ID = "zhifa_id";  // 执法人员ID
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZcczu setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZcczu setZhutiOrder(String value) {
        set(ZHUTI_ORDER, value);
        return this;
    }

	public String getZhutiOrder() {
		return get(ZHUTI_ORDER);
	}
    public TbZcczu setZhutiName(String value) {
        set(ZHUTI_NAME, value);
        return this;
    }

	public String getZhutiName() {
		return get(ZHUTI_NAME);
	}
    public TbZcczu setZhutiAddress(String value) {
        set(ZHUTI_ADDRESS, value);
        return this;
    }

	public String getZhutiAddress() {
		return get(ZHUTI_ADDRESS);
	}
    public TbZcczu setZhutiId(String value) {
        set(ZHUTI_ID, value);
        return this;
    }

	public String getZhutiId() {
		return get(ZHUTI_ID);
	}
    public TbZcczu setZhifaName(String value) {
        set(ZHIFA_NAME, value);
        return this;
    }

	public String getZhifaName() {
		return get(ZHIFA_NAME);
	}
    public TbZcczu setZhifaId(String value) {
        set(ZHIFA_ID, value);
        return this;
    }

	public String getZhifaId() {
		return get(ZHIFA_ID);
	}
    public TbZcczu setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZcczu setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZcczu setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZcczu setCreateId(Integer value) {
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
		log += "[zhutiOrder:" + getZhutiOrder() + "]";
		log += "[zhutiName:" + getZhutiName() + "]";
		log += "[zhutiAddress:" + getZhutiAddress() + "]";
		log += "[zhutiId:" + getZhutiId() + "]";
		log += "[zhifaName:" + getZhifaName() + "]";
		log += "[zhifaId:" + getZhifaId() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}