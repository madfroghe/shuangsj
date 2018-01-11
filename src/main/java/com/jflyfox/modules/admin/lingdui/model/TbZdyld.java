package com.jflyfox.modules.admin.lingdui.model;

import com.jflyfox.component.base.BaseProjectModel;
import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zdyld")
public class TbZdyld extends BaseProjectModel<TbZdyld> {

	private static final long serialVersionUID = 1L;
	public static final TbZdyld dao = new TbZdyld();

    //columns START
    private String ID = "id";  // 旅行社id
    private String NAME = "name";  // 姓名
    private String SEX = "sex";  // 性别
    private String LANGUAGE = "language";  // 语种（普通话、粤语、闽南语、英语、日语、韩语、泰语、越南语、法语、意大利语、西班牙语、其他（可输入））
    private String DY_CODE = "dy_code";  // 电子导游证号
    private String DY_LEVEL = "dy_level";  // 级别(初级、中级、高级、特级)
    private String DY_LINGDUI = "dy_lingdui";  // 是否备案领队(是/否，如果是，则在领队中显示)
    private String LD_TYPE = "ld_type";  // 领队类别(出境、赴台)
    private String DY_PHONE = "dy_phone";  // 联系电话
    private String DY_LXS = "dy_lxs";  // 所在旅行社
    private String DY_BEIZHU = "dy_beizhu";  // 备注
    private String DY_YICHANG = "dy_yichang";  // 异常情况
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZdyld setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZdyld setName(String value) {
        set(NAME, value);
        return this;
    }

	public String getName() {
		return get(NAME);
	}
    public TbZdyld setSex(String value) {
        set(SEX, value);
        return this;
    }

	public String getSex() {
		return get(SEX);
	}
    public TbZdyld setLanguage(String value) {
        set(LANGUAGE, value);
        return this;
    }

	public String getLanguage() {
		return get(LANGUAGE);
	}
    public TbZdyld setDyCode(String value) {
        set(DY_CODE, value);
        return this;
    }

	public String getDyCode() {
		return get(DY_CODE);
	}
    public TbZdyld setDyLevel(String value) {
        set(DY_LEVEL, value);
        return this;
    }

	public String getDyLevel() {
		return get(DY_LEVEL);
	}
    public TbZdyld setDyLingdui(String value) {
        set(DY_LINGDUI, value);
        return this;
    }

	public String getDyLingdui() {
		return get(DY_LINGDUI);
	}
    public TbZdyld setLdType(String value) {
        set(LD_TYPE, value);
        return this;
    }

	public String getLdType() {
		return get(LD_TYPE);
	}
    public TbZdyld setDyPhone(String value) {
        set(DY_PHONE, value);
        return this;
    }

	public String getDyPhone() {
		return get(DY_PHONE);
	}
    public TbZdyld setDyLxs(String value) {
        set(DY_LXS, value);
        return this;
    }

	public String getDyLxs() {
		return get(DY_LXS);
	}
    public TbZdyld setDyBeizhu(String value) {
        set(DY_BEIZHU, value);
        return this;
    }

	public String getDyBeizhu() {
		return get(DY_BEIZHU);
	}
    public TbZdyld setDyYichang(String value) {
        set(DY_YICHANG, value);
        return this;
    }

	public String getDyYichang() {
		return get(DY_YICHANG);
	}
    public TbZdyld setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZdyld setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZdyld setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZdyld setCreateId(Integer value) {
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
		log += "[name:" + getName() + "]";
		log += "[sex:" + getSex() + "]";
		log += "[language:" + getLanguage() + "]";
		log += "[dyCode:" + getDyCode() + "]";
		log += "[dyLevel:" + getDyLevel() + "]";
		log += "[dyLingdui:" + getDyLingdui() + "]";
		log += "[ldType:" + getLdType() + "]";
		log += "[dyPhone:" + getDyPhone() + "]";
		log += "[dyLxs:" + getDyLxs() + "]";
		log += "[dyBeizhu:" + getDyBeizhu() + "]";
		log += "[dyYichang:" + getDyYichang() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}