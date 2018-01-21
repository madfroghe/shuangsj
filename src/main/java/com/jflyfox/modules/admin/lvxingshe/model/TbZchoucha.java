package com.jflyfox.modules.admin.lvxingshe.model;

import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zchoucha")
public class TbZchoucha extends BaseModel<TbZchoucha> {

	private static final long serialVersionUID = 1L;
	public static final TbZchoucha dao = new TbZchoucha();

    //columns START
    private String ID = "id";  // 抽查id
    private String NAME = "name";  // 任务名称
    private String CHOUCHA_BEGIN = "choucha_begin";  // 抽查开始时间
    private String CHOUCHA_END = "choucha_end";  // 抽查结束时间
    private String JIANJIE = "jianjie";  // 任务简介
    private String ZUSHU = "zushu";  // 抽查组数
    private String DXZS = "dxzs";  // 被查对象总数
    private String CHOUCHA_TYPE = "choucha_type";  // 抽查方式
    private String CHOUCHA_STATUS = "choucha_status";  // 任务状态
    private String RESULT = "result";  // 检查结果
    private String CHOUCHA_DUIXIANG = "choucha_duixiang";  // 抽取被查对象
    private String CHENGLI_DI = "chengli_di";  // 成立时间-低
    private String CHENGLI_GAO = "chengli_gao";  // 成立时间-高
    private String ZIBEN_DI = "ziben_di";  // 注册资本-低
    private String ZIBEN_GAO = "ziben_gao";  // 注册资本-高
    private String GUIMO_DI = "guimo_di";  // 企业规模-低
    private String GUIMO_GAO = "guimo_gao";  // 企业规模-高
    private String FANWEI = "fanwei";  // 经营类别
    private String LEIXING = "leixing";  // 企业类型
    private String ZHUCEDI = "zhucedi";  // 注册地所在
    private String BANGONG = "bangong";  // 办公地所在
    private String JIESHOUJC_DI = "jieshoujc_di";  // 检查次数-低
    private String JIESHOUJC_GAO = "jieshoujc_gao";  // 检查次数-高
    private String YICHANG = "yichang";  // 异常情况
    private String CHULI_DI = "chuli_di";  // 处理日期-低
    private String CHULI_GAO = "chuli_gao";  // 处理日期-高
    private String JC_FANWEI = "jc_fanwei";  // 所属区域
    private String JC_BUMEN = "jc_bumen";  // 部门
    private String JC_SEX = "jc_sex";  // 性别
    private String JC_ZHIWU = "jc_zhiwu";  // 职务
    private String JC_ZUSHU = "jc_zushu";  // 检查组数
    private String JC_DXZS = "jc_dxzs";  // 每组检查人数
    private String CHOUCHA_ZHUTI = "choucha_zhuti";  // 
    private String CHOUCHA_ZHIFA = "choucha_zhifa";  // 
    private String JC_FANGSHI = "jc_fangshi";  // 
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
    public TbZchoucha setName(String value) {
        set(NAME, value);
        return this;
    }

	public String getName() {
		return get(NAME);
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
    public TbZchoucha setJianjie(String value) {
        set(JIANJIE, value);
        return this;
    }

	public String getJianjie() {
		return get(JIANJIE);
	}
    public TbZchoucha setZushu(String value) {
        set(ZUSHU, value);
        return this;
    }

	public String getZushu() {
		return get(ZUSHU);
	}
    public TbZchoucha setDxzs(String value) {
        set(DXZS, value);
        return this;
    }

	public String getDxzs() {
		return get(DXZS);
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
    public TbZchoucha setResult(String value) {
        set(RESULT, value);
        return this;
    }

	public String getResult() {
		return get(RESULT);
	}
    public TbZchoucha setChouchaDuixiang(String value) {
        set(CHOUCHA_DUIXIANG, value);
        return this;
    }

	public String getChouchaDuixiang() {
		return get(CHOUCHA_DUIXIANG);
	}
    public TbZchoucha setChengliDi(String value) {
        set(CHENGLI_DI, value);
        return this;
    }

	public String getChengliDi() {
		return get(CHENGLI_DI);
	}
    public TbZchoucha setChengliGao(String value) {
        set(CHENGLI_GAO, value);
        return this;
    }

	public String getChengliGao() {
		return get(CHENGLI_GAO);
	}
    public TbZchoucha setZibenDi(String value) {
        set(ZIBEN_DI, value);
        return this;
    }

	public String getZibenDi() {
		return get(ZIBEN_DI);
	}
    public TbZchoucha setZibenGao(String value) {
        set(ZIBEN_GAO, value);
        return this;
    }

	public String getZibenGao() {
		return get(ZIBEN_GAO);
	}
    public TbZchoucha setGuimoDi(String value) {
        set(GUIMO_DI, value);
        return this;
    }

	public String getGuimoDi() {
		return get(GUIMO_DI);
	}
    public TbZchoucha setGuimoGao(String value) {
        set(GUIMO_GAO, value);
        return this;
    }

	public String getGuimoGao() {
		return get(GUIMO_GAO);
	}
    public TbZchoucha setFanwei(String value) {
        set(FANWEI, value);
        return this;
    }

	public String getFanwei() {
		return get(FANWEI);
	}
    public TbZchoucha setLeixing(String value) {
        set(LEIXING, value);
        return this;
    }

	public String getLeixing() {
		return get(LEIXING);
	}
    public TbZchoucha setZhucedi(String value) {
        set(ZHUCEDI, value);
        return this;
    }

	public String getZhucedi() {
		return get(ZHUCEDI);
	}
    public TbZchoucha setBangong(String value) {
        set(BANGONG, value);
        return this;
    }

	public String getBangong() {
		return get(BANGONG);
	}
    public TbZchoucha setJieshoujcDi(String value) {
        set(JIESHOUJC_DI, value);
        return this;
    }

	public String getJieshoujcDi() {
		return get(JIESHOUJC_DI);
	}
    public TbZchoucha setJieshoujcGao(String value) {
        set(JIESHOUJC_GAO, value);
        return this;
    }

	public String getJieshoujcGao() {
		return get(JIESHOUJC_GAO);
	}
    public TbZchoucha setYichang(String value) {
        set(YICHANG, value);
        return this;
    }

	public String getYichang() {
		return get(YICHANG);
	}
    public TbZchoucha setChuliDi(String value) {
        set(CHULI_DI, value);
        return this;
    }

	public String getChuliDi() {
		return get(CHULI_DI);
	}
    public TbZchoucha setChuliGao(String value) {
        set(CHULI_GAO, value);
        return this;
    }

	public String getChuliGao() {
		return get(CHULI_GAO);
	}
    public TbZchoucha setJcFanwei(String value) {
        set(JC_FANWEI, value);
        return this;
    }

	public String getJcFanwei() {
		return get(JC_FANWEI);
	}
    public TbZchoucha setJcBumen(String value) {
        set(JC_BUMEN, value);
        return this;
    }

	public String getJcBumen() {
		return get(JC_BUMEN);
	}
    public TbZchoucha setJcSex(String value) {
        set(JC_SEX, value);
        return this;
    }

	public String getJcSex() {
		return get(JC_SEX);
	}
    public TbZchoucha setJcZhiwu(String value) {
        set(JC_ZHIWU, value);
        return this;
    }

	public String getJcZhiwu() {
		return get(JC_ZHIWU);
	}
    public TbZchoucha setJcZushu(String value) {
        set(JC_ZUSHU, value);
        return this;
    }

	public String getJcZushu() {
		return get(JC_ZUSHU);
	}
    public TbZchoucha setJcDxzs(String value) {
        set(JC_DXZS, value);
        return this;
    }

	public String getJcDxzs() {
		return get(JC_DXZS);
	}
    public TbZchoucha setChouchaZhuti(String value) {
        set(CHOUCHA_ZHUTI, value);
        return this;
    }

	public String getChouchaZhuti() {
		return get(CHOUCHA_ZHUTI);
	}
    public TbZchoucha setChouchaZhifa(String value) {
        set(CHOUCHA_ZHIFA, value);
        return this;
    }

	public String getChouchaZhifa() {
		return get(CHOUCHA_ZHIFA);
	}
    public TbZchoucha setJcFangshi(String value) {
        set(JC_FANGSHI, value);
        return this;
    }

	public String getJcFangshi() {
		return get(JC_FANGSHI);
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
		log += "[name:" + getName() + "]";
		log += "[chouchaBegin:" + getChouchaBegin() + "]";
		log += "[chouchaEnd:" + getChouchaEnd() + "]";
		log += "[jianjie:" + getJianjie() + "]";
		log += "[zushu:" + getZushu() + "]";
		log += "[dxzs:" + getDxzs() + "]";
		log += "[chouchaType:" + getChouchaType() + "]";
		log += "[chouchaStatus:" + getChouchaStatus() + "]";
		log += "[result:" + getResult() + "]";
		log += "[chouchaDuixiang:" + getChouchaDuixiang() + "]";
		log += "[chengliDi:" + getChengliDi() + "]";
		log += "[chengliGao:" + getChengliGao() + "]";
		log += "[zibenDi:" + getZibenDi() + "]";
		log += "[zibenGao:" + getZibenGao() + "]";
		log += "[guimoDi:" + getGuimoDi() + "]";
		log += "[guimoGao:" + getGuimoGao() + "]";
		log += "[fanwei:" + getFanwei() + "]";
		log += "[leixing:" + getLeixing() + "]";
		log += "[zhucedi:" + getZhucedi() + "]";
		log += "[bangong:" + getBangong() + "]";
		log += "[jieshoujcDi:" + getJieshoujcDi() + "]";
		log += "[jieshoujcGao:" + getJieshoujcGao() + "]";
		log += "[yichang:" + getYichang() + "]";
		log += "[chuliDi:" + getChuliDi() + "]";
		log += "[chuliGao:" + getChuliGao() + "]";
		log += "[jcFanwei:" + getJcFanwei() + "]";
		log += "[jcBumen:" + getJcBumen() + "]";
		log += "[jcSex:" + getJcSex() + "]";
		log += "[jcZhiwu:" + getJcZhiwu() + "]";
		log += "[jcZushu:" + getJcZushu() + "]";
		log += "[jcDxzs:" + getJcDxzs() + "]";
		log += "[chouchaZhuti:" + getChouchaZhuti() + "]";
		log += "[chouchaZhifa:" + getChouchaZhifa() + "]";
		log += "[jcFangshi:" + getJcFangshi() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}