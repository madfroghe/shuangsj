package com.jflyfox.modules.admin.zhifa.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;
import com.jflyfox.modules.admin.lingdui.model.TbZdyld;

@ModelBind(table = "tb_zzhifa")
public class TbZzhifa extends BaseModel<TbZzhifa> {

	private static final long serialVersionUID = 1L;
	public static final TbZzhifa dao = new TbZzhifa();

    //columns START
    private String ID = "id";  // 执法人员id
    private String NAME = "name";  // 姓名
    private String SEX = "sex";  // 性别
    private String QUYU = "quyu";  // 所属区域
    private String BUMEN = "bumen";  // 所属部门
    private String ZHIWU = "zhiwu";  // 职务
    private String SFZHENG = "sfzheng";  // 身份证号
    private String ZFZHENG = "zfzheng";  // 执法证号
    private String PHONE = "phone";  // 联系电话
    private String BEIZHU = "beizhu";  // 备注
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZzhifa setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZzhifa setName(String value) {
        set(NAME, value);
        return this;
    }

	public String getName() {
		return get(NAME);
	}
    public TbZzhifa setSex(String value) {
        set(SEX, value);
        return this;
    }

	public String getSex() {
		return get(SEX);
	}
    public TbZzhifa setQuyu(String value) {
        set(QUYU, value);
        return this;
    }

	public String getQuyu() {
		return get(QUYU);
	}
    public TbZzhifa setBumen(String value) {
        set(BUMEN, value);
        return this;
    }

	public String getBumen() {
		return get(BUMEN);
	}
    public TbZzhifa setZhiwu(String value) {
        set(ZHIWU, value);
        return this;
    }

	public String getZhiwu() {
		return get(ZHIWU);
	}
    public TbZzhifa setSfzheng(String value) {
        set(SFZHENG, value);
        return this;
    }

	public String getSfzheng() {
		return get(SFZHENG);
	}
    public TbZzhifa setZfzheng(String value) {
        set(ZFZHENG, value);
        return this;
    }

	public String getZfzheng() {
		return get(ZFZHENG);
	}
    public TbZzhifa setPhone(String value) {
        set(PHONE, value);
        return this;
    }

	public String getPhone() {
		return get(PHONE);
	}
    public TbZzhifa setBeizhu(String value) {
        set(BEIZHU, value);
        return this;
    }

	public String getBeizhu() {
		return get(BEIZHU);
	}
    public TbZzhifa setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZzhifa setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZzhifa setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZzhifa setCreateId(Integer value) {
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
		log += "[quyu:" + getQuyu() + "]";
		log += "[bumen:" + getBumen() + "]";
		log += "[zhiwu:" + getZhiwu() + "]";
		log += "[sfzheng:" + getSfzheng() + "]";
		log += "[zfzheng:" + getZfzheng() + "]";
		log += "[phone:" + getPhone() + "]";
		log += "[beizhu:" + getBeizhu() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}