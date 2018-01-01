package com.jflyfox.modules.admin.lvxingshe.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zchoucha")
public class TbZchoucha extends BaseModel<TbZchoucha> {

	private static final long serialVersionUID = 1L;
	public static final TbZchoucha dao = new TbZchoucha();

    //columns START
    private String ID = "id";  // 抽查id
    private String CHOUCHA_BEGIN = "choucha_begin";  // 抽查开始时间
    private String CHOUCHA_END = "choucha_end";  // 抽查结束时间
    private String NAME = "name";  // 任务名称
    private String CHOUCHA_TYPE = "choucha_type";  // 抽查结束时间
    private String CHOUCHA_STATUS = "choucha_status";  // 抽查结束时间
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZchoucha setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZchoucha setChouchaBegin(String value) {
        set(CHOUCHA_BEGIN, value);
        return this;
    }

	public String getChouchaBegin() {
		return get(CHOUCHA_BEGIN);
	}
    public TbZchoucha setChouchaEnd(String value) {
        set(CHOUCHA_END, value);
        return this;
    }

	public String getChouchaEnd() {
		return get(CHOUCHA_END);
	}
    public TbZchoucha setName(String value) {
        set(NAME, value);
        return this;
    }

	public String getName() {
		return get(NAME);
	}
    public TbZchoucha setChouchaType(String value) {
        set(CHOUCHA_TYPE, value);
        return this;
    }

	public String getChouchaType() {
		return get(CHOUCHA_TYPE);
	}
    public TbZchoucha setChouchaStatus(String value) {
        set(CHOUCHA_STATUS, value);
        return this;
    }

	public String getChouchaStatus() {
		return get(CHOUCHA_STATUS);
	}
    public TbZchoucha setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZchoucha setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZchoucha setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZchoucha setCreateId(Integer value) {
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
		log += "[chouchaBegin:" + getChouchaBegin() + "]";
		log += "[chouchaEnd:" + getChouchaEnd() + "]";
		log += "[name:" + getName() + "]";
		log += "[chouchaType:" + getChouchaType() + "]";
		log += "[chouchaStatus:" + getChouchaStatus() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}