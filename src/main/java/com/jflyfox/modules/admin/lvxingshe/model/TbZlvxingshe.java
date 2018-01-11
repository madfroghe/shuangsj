package com.jflyfox.modules.admin.lvxingshe.model;

import com.jflyfox.component.base.BaseProjectModel;
import com.jflyfox.jfinal.base.BaseModel;
import com.jflyfox.jfinal.component.annotation.ModelBind;

@ModelBind(table = "tb_zlvxingshe")
public class TbZlvxingshe extends BaseProjectModel<TbZlvxingshe> {

	private static final long serialVersionUID = 1L;
	public static final TbZlvxingshe dao = new TbZlvxingshe();

    //columns START
    private String ID = "id";  // 旅行社id
    private String NAME = "name";  // 名称
    private String EN_NAME = "en_name";  // 英文名称
    private String CODE = "code";  // 经营许可证号
    private String FAREN = "faren";  // 法定代表人姓名
    private String QIYE_DIZHI = "qiye_dizhi";  // 公司注册地址
    private String QIYE_YOUBIAN = "qiye_youbian";  // 邮编
    private String PHONE_F = "phone_f";  // 联系电话1
    private String PHONE_S = "phone_s";  // 联系电话2
    private String QIYE_CHUANZHEN = "qiye_chuanzhen";  // 传真
    private String QIYE_EMAIL = "qiye_email";  // 邮箱
    private String LXS_TYPE = "lxs_type";  // 单位类型(法人单位、分社)
    private String LXS_LEVEL = "lxs_level";  // 旅行社等级(五星、四星、三星、二星、一星、无星)
    private String LXS_BUSINESS = "lxs_business";  // 经营类别(国内社、出境社、赴台社)
    private String SHENFZ = "shenfz";  // 法定代表人身份证号
    private String CL_TIME = "cl_time";  // 成立日期
    private String CL_MONEY = "cl_money";  // 注册资本(以万元为单位)
    private String MONEY_TYPE = "money_type";  // 出资类型(内资、外资独资、中外合资)
    private String QIYE_TYPE = "qiye_type";  // 企业类型(根据工商的分类)
    private String QIYE_CODE = "qiye_code";  // 统一社会信用代码(18位的代码)
    private String QIYE_GONGSHANG = "qiye_gongshang";  // 工商注册登记号(15位的注册号)
    private String QIYE_ZUZHI = "qiye_zuzhi";  // 组织机构代码(10位的代码)
    private String QIYE_QUYU = "qiye_quyu";  // 注册地所属区域
    private String QIYE_BGDIZHI = "qiye_bgdizhi";  // 公司办公地址
    private String QIYE_BGQUYU = "qiye_bgquyu";  // 办公地所属区域
    private String QIYE_RENSHU = "qiye_renshu";  // 员工人数
    private String QIYE_HTRENSHU = "qiye_htrenshu";  // 签订劳动合同员工人数
    private String QIYE_DYRENSHU = "qiye_dyrenshu";  // 导游人数
    private String QIYE_HTDYRENSHU = "qiye_htdyrenshu";  // 签订劳动合同导游人数
    private String QIYE_LDRENSHU = "qiye_ldrenshu";  // 领队人数
    private String QIYE_HTLDRENSHU = "qiye_htldrenshu";  // 签订劳动合同领队人数
    private String BEIZHU = "beizhu";  // 备注
    private String JIANCHA = "jiancha";  // 曾接受检查情况
    private String JINGYINGGM = "jingyinggm";  // 历年经营规模
    private String YICHANG = "yichang";  // 异常情况记录
    private String UPDATE_TIME = "update_time";  // 更新时间
    private String UPDATE_ID = "update_id";  // 更新人
    private String CREATE_TIME = "create_time";  // 创建时间
    private String CREATE_ID = "create_id";  // 创建者
    
    public TbZlvxingshe setId(Integer value) {
        set(ID, value);
        return this;
    }

	public Integer getId() {
		return get(ID);
	}
    public TbZlvxingshe setName(String value) {
        set(NAME, value);
        return this;
    }

	public String getName() {
		return get(NAME);
	}
    public TbZlvxingshe setEnName(String value) {
        set(EN_NAME, value);
        return this;
    }

	public String getEnName() {
		return get(EN_NAME);
	}
    public TbZlvxingshe setCode(String value) {
        set(CODE, value);
        return this;
    }

	public String getCode() {
		return get(CODE);
	}
    public TbZlvxingshe setFaren(String value) {
        set(FAREN, value);
        return this;
    }

	public String getFaren() {
		return get(FAREN);
	}
    public TbZlvxingshe setQiyeDizhi(String value) {
        set(QIYE_DIZHI, value);
        return this;
    }

	public String getQiyeDizhi() {
		return get(QIYE_DIZHI);
	}
    public TbZlvxingshe setQiyeYoubian(String value) {
        set(QIYE_YOUBIAN, value);
        return this;
    }

	public String getQiyeYoubian() {
		return get(QIYE_YOUBIAN);
	}
    public TbZlvxingshe setPhoneF(String value) {
        set(PHONE_F, value);
        return this;
    }

	public String getPhoneF() {
		return get(PHONE_F);
	}
    public TbZlvxingshe setPhoneS(String value) {
        set(PHONE_S, value);
        return this;
    }

	public String getPhoneS() {
		return get(PHONE_S);
	}
    public TbZlvxingshe setQiyeChuanzhen(String value) {
        set(QIYE_CHUANZHEN, value);
        return this;
    }

	public String getQiyeChuanzhen() {
		return get(QIYE_CHUANZHEN);
	}
    public TbZlvxingshe setQiyeEmail(String value) {
        set(QIYE_EMAIL, value);
        return this;
    }

	public String getQiyeEmail() {
		return get(QIYE_EMAIL);
	}
    public TbZlvxingshe setLxsType(String value) {
        set(LXS_TYPE, value);
        return this;
    }

	public String getLxsType() {
		return get(LXS_TYPE);
	}
    public TbZlvxingshe setLxsLevel(String value) {
        set(LXS_LEVEL, value);
        return this;
    }

	public String getLxsLevel() {
		return get(LXS_LEVEL);
	}
    public TbZlvxingshe setLxsBusiness(String value) {
        set(LXS_BUSINESS, value);
        return this;
    }

	public String getLxsBusiness() {
		return get(LXS_BUSINESS);
	}
    public TbZlvxingshe setShenfz(String value) {
        set(SHENFZ, value);
        return this;
    }

	public String getShenfz() {
		return get(SHENFZ);
	}
    public TbZlvxingshe setClTime(String value) {
        set(CL_TIME, value);
        return this;
    }

	public String getClTime() {
		return get(CL_TIME);
	}
    public TbZlvxingshe setClMoney(String value) {
        set(CL_MONEY, value);
        return this;
    }

	public String getClMoney() {
		return get(CL_MONEY);
	}
    public TbZlvxingshe setMoneyType(String value) {
        set(MONEY_TYPE, value);
        return this;
    }

	public String getMoneyType() {
		return get(MONEY_TYPE);
	}
    public TbZlvxingshe setQiyeType(String value) {
        set(QIYE_TYPE, value);
        return this;
    }

	public String getQiyeType() {
		return get(QIYE_TYPE);
	}
    public TbZlvxingshe setQiyeCode(String value) {
        set(QIYE_CODE, value);
        return this;
    }

	public String getQiyeCode() {
		return get(QIYE_CODE);
	}
    public TbZlvxingshe setQiyeGongshang(String value) {
        set(QIYE_GONGSHANG, value);
        return this;
    }

	public String getQiyeGongshang() {
		return get(QIYE_GONGSHANG);
	}
    public TbZlvxingshe setQiyeZuzhi(String value) {
        set(QIYE_ZUZHI, value);
        return this;
    }

	public String getQiyeZuzhi() {
		return get(QIYE_ZUZHI);
	}
    public TbZlvxingshe setQiyeQuyu(String value) {
        set(QIYE_QUYU, value);
        return this;
    }

	public String getQiyeQuyu() {
		return get(QIYE_QUYU);
	}
    public TbZlvxingshe setQiyeBgdizhi(String value) {
        set(QIYE_BGDIZHI, value);
        return this;
    }

	public String getQiyeBgdizhi() {
		return get(QIYE_BGDIZHI);
	}
    public TbZlvxingshe setQiyeBgquyu(String value) {
        set(QIYE_BGQUYU, value);
        return this;
    }

	public String getQiyeBgquyu() {
		return get(QIYE_BGQUYU);
	}
    public TbZlvxingshe setQiyeRenshu(String value) {
        set(QIYE_RENSHU, value);
        return this;
    }

	public String getQiyeRenshu() {
		return get(QIYE_RENSHU);
	}
    public TbZlvxingshe setQiyeHtrenshu(String value) {
        set(QIYE_HTRENSHU, value);
        return this;
    }

	public String getQiyeHtrenshu() {
		return get(QIYE_HTRENSHU);
	}
    public TbZlvxingshe setQiyeDyrenshu(String value) {
        set(QIYE_DYRENSHU, value);
        return this;
    }

	public String getQiyeDyrenshu() {
		return get(QIYE_DYRENSHU);
	}
    public TbZlvxingshe setQiyeHtdyrenshu(String value) {
        set(QIYE_HTDYRENSHU, value);
        return this;
    }

	public String getQiyeHtdyrenshu() {
		return get(QIYE_HTDYRENSHU);
	}
    public TbZlvxingshe setQiyeLdrenshu(String value) {
        set(QIYE_LDRENSHU, value);
        return this;
    }

	public String getQiyeLdrenshu() {
		return get(QIYE_LDRENSHU);
	}
    public TbZlvxingshe setQiyeHtldrenshu(String value) {
        set(QIYE_HTLDRENSHU, value);
        return this;
    }

	public String getQiyeHtldrenshu() {
		return get(QIYE_HTLDRENSHU);
	}
    public TbZlvxingshe setBeizhu(String value) {
        set(BEIZHU, value);
        return this;
    }

	public String getBeizhu() {
		return get(BEIZHU);
	}
    public TbZlvxingshe setJiancha(String value) {
        set(JIANCHA, value);
        return this;
    }

	public String getJiancha() {
		return get(JIANCHA);
	}
    public TbZlvxingshe setJingyinggm(String value) {
        set(JINGYINGGM, value);
        return this;
    }

	public String getJingyinggm() {
		return get(JINGYINGGM);
	}
    public TbZlvxingshe setYichang(String value) {
        set(YICHANG, value);
        return this;
    }

	public String getYichang() {
		return get(YICHANG);
	}
    public TbZlvxingshe setUpdateTime(String value) {
        set(UPDATE_TIME, value);
        return this;
    }

	public String getUpdateTime() {
		return get(UPDATE_TIME);
	}
    public TbZlvxingshe setUpdateId(Integer value) {
        set(UPDATE_ID, value);
        return this;
    }

	public Integer getUpdateId() {
		return get(UPDATE_ID);
	}
    public TbZlvxingshe setCreateTime(String value) {
        set(CREATE_TIME, value);
        return this;
    }

	public String getCreateTime() {
		return get(CREATE_TIME);
	}
    public TbZlvxingshe setCreateId(Integer value) {
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
		log += "[enName:" + getEnName() + "]";
		log += "[code:" + getCode() + "]";
		log += "[faren:" + getFaren() + "]";
		log += "[qiyeDizhi:" + getQiyeDizhi() + "]";
		log += "[qiyeYoubian:" + getQiyeYoubian() + "]";
		log += "[phoneF:" + getPhoneF() + "]";
		log += "[phoneS:" + getPhoneS() + "]";
		log += "[qiyeChuanzhen:" + getQiyeChuanzhen() + "]";
		log += "[qiyeEmail:" + getQiyeEmail() + "]";
		log += "[lxsType:" + getLxsType() + "]";
		log += "[lxsLevel:" + getLxsLevel() + "]";
		log += "[lxsBusiness:" + getLxsBusiness() + "]";
		log += "[shenfz:" + getShenfz() + "]";
		log += "[clTime:" + getClTime() + "]";
		log += "[clMoney:" + getClMoney() + "]";
		log += "[moneyType:" + getMoneyType() + "]";
		log += "[qiyeType:" + getQiyeType() + "]";
		log += "[qiyeCode:" + getQiyeCode() + "]";
		log += "[qiyeGongshang:" + getQiyeGongshang() + "]";
		log += "[qiyeZuzhi:" + getQiyeZuzhi() + "]";
		log += "[qiyeQuyu:" + getQiyeQuyu() + "]";
		log += "[qiyeBgdizhi:" + getQiyeBgdizhi() + "]";
		log += "[qiyeBgquyu:" + getQiyeBgquyu() + "]";
		log += "[qiyeRenshu:" + getQiyeRenshu() + "]";
		log += "[qiyeHtrenshu:" + getQiyeHtrenshu() + "]";
		log += "[qiyeDyrenshu:" + getQiyeDyrenshu() + "]";
		log += "[qiyeHtdyrenshu:" + getQiyeHtdyrenshu() + "]";
		log += "[qiyeLdrenshu:" + getQiyeLdrenshu() + "]";
		log += "[qiyeHtldrenshu:" + getQiyeHtldrenshu() + "]";
		log += "[beizhu:" + getBeizhu() + "]";
		log += "[jiancha:" + getJiancha() + "]";
		log += "[jingyinggm:" + getJingyinggm() + "]";
		log += "[yichang:" + getYichang() + "]";
		log += "[updateTime:" + getUpdateTime() + "]";
		log += "[updateId:" + getUpdateId() + "]";
		log += "[createTime:" + getCreateTime() + "]";
		log += "[createId:" + getCreateId() + "]";
		return log;
	}
}