package com.jflyfox.modules.admin.zhifa.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zzhifa")
public class TbZzhifa extends BaseModel<TbZzhifa> {

	private static final long serialVersionUID = 1L;
	public static final TbZzhifa dao = new TbZzhifa();

    //columns START
    private String ID = "id";  // 执法人员id
    private String GONGHAO = "gonghao";  // 单位工号
    private String NAME = "name";  // 姓名
    private String SEX = "sex";  // 性别
    private String SFZHENG = "sfzheng";  // 身份证号
    private String PHONE = "phone";  // 联系电话
    private String XUELI = "xueli";  // 学历
    private String ZHUANYE = "zhuanye";  // 学历专业
    private String CONGSHIRIQI = "congshiriqi";  // 从事岗位起始日期
    private String FAWEI = "fawei";  // 执法事项范围
    private String DANGWEI = "dangwei";  // 工作单位
    private String QUYU = "quyu";  // 所属区域
    private String CENGJI = "cengji";  // 层级
    private String BUMEN = "bumen";  // 所属部门
    private String BUMEN_DETAIL = "bumen_detail";  // 所属部门_实际数据
    private String ZHIWU = "zhiwu";  // 职务
    private String ZHIWU_DETAIL = "zhiwu_detail";  // 具体职务
    private String ZFZHENG = "zfzheng";  // 执法证号
    private String YOUXIAOQI = "youxiaoqi";  // 执法证有效期
    private String FAZJIGUAN = "fazjiguan";  // 执法证发证机关
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
    public TbZzhifa setGonghao(String value) {
        set(GONGHAO, value);
        return this;
    }

	public String getGonghao() {
		return get(GONGHAO);
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
    public TbZzhifa setSfzheng(String value) {
        set(SFZHENG, value);
        return this;
    }

	public String getSfzheng() {
		return get(SFZHENG);
	}
    public TbZzhifa setPhone(String value) {
        set(PHONE, value);
        return this;
    }

	public String getPhone() {
		return get(PHONE);
	}
    public TbZzhifa setXueli(String value) {
        set(XUELI, value);
        return this;
    }

	public String getXueli() {
		return get(XUELI);
	}
    public TbZzhifa setZhuanye(String value) {
        set(ZHUANYE, value);
        return this;
    }

	public String getZhuanye() {
		return get(ZHUANYE);
	}
    public TbZzhifa setCongshiriqi(String value) {
        set(CONGSHIRIQI, value);
        return this;
    }

	public String getCongshiriqi() {
		return get(CONGSHIRIQI);
	}
    public TbZzhifa setFawei(String value) {
        set(FAWEI, value);
        return this;
    }

	public String getFawei() {
		return get(FAWEI);
	}
    public TbZzhifa setDangwei(String value) {
        set(DANGWEI, value);
        return this;
    }

	public String getDangwei() {
		return get(DANGWEI);
	}
    public TbZzhifa setQuyu(String value) {
        set(QUYU, value);
        return this;
    }

	public String getQuyu() {
		return get(QUYU);
	}
    public TbZzhifa setCengji(String value) {
        set(CENGJI, value);
        return this;
    }

	public String getCengji() {
		return get(CENGJI);
	}
    public TbZzhifa setBumen(String value) {
        set(BUMEN, value);
        return this;
    }

	public String getBumen() {
		return get(BUMEN);
	}
    public TbZzhifa setBumenDetail(String value) {
        set(BUMEN_DETAIL, value);
        return this;
    }

	public String getBumenDetail() {
		return get(BUMEN_DETAIL);
	}
    public TbZzhifa setZhiwu(String value) {
        set(ZHIWU, value);
        return this;
    }

	public String getZhiwu() {
		return get(ZHIWU);
	}
    public TbZzhifa setZhiwuDetail(String value) {
        set(ZHIWU_DETAIL, value);
        return this;
    }

	public String getZhiwuDetail() {
		return get(ZHIWU_DETAIL);
	}
    public TbZzhifa setZfzheng(String value) {
        set(ZFZHENG, value);
        return this;
    }

	public String getZfzheng() {
		return get(ZFZHENG);
	}
    public TbZzhifa setYouxiaoqi(String value) {
        set(YOUXIAOQI, value);
        return this;
    }

	public String getYouxiaoqi() {
		return get(YOUXIAOQI);
	}
    public TbZzhifa setFazjiguan(String value) {
        set(FAZJIGUAN, value);
        return this;
    }

	public String getFazjiguan() {
		return get(FAZJIGUAN);
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
		log += "[gonghao:" + getGonghao() + "]";
		log += "[name:" + getName() + "]";
		log += "[sex:" + getSex() + "]";
		log += "[sfzheng:" + getSfzheng() + "]";
		log += "[phone:" + getPhone() + "]";
		log += "[xueli:" + getXueli() + "]";
		log += "[zhuanye:" + getZhuanye() + "]";
		log += "[congshiriqi:" + getCongshiriqi() + "]";
		log += "[fawei:" + getFawei() + "]";
		log += "[dangwei:" + getDangwei() + "]";
		log += "[quyu:" + getQuyu() + "]";
		log += "[cengji:" + getCengji() + "]";
		log += "[bumen:" + getBumen() + "]";
		log += "[bumenDetail:" + getBumenDetail() + "]";
		log += "[zhiwu:" + getZhiwu() + "]";
		log += "[zhiwuDetail:" + getZhiwuDetail() + "]";
		log += "[zfzheng:" + getZfzheng() + "]";
		log += "[youxiaoqi:" + getYouxiaoqi() + "]";
		log += "[fazjiguan:" + getFazjiguan() + "]";
		log += "[beizhu:" + getBeizhu() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}