package com.lihh.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import lombok.Data;

/**
 * Ʒ��
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 15:39:01
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ��id
	 */
	@TableId
	private Long brandId;
	/**
	 * Ʒ����
	 */
	private String name;
	/**
	 * Ʒ��logo��ַ
	 */
	private String logo;
	/**
	 * ����
	 */
	private String descript;
	/**
	 * ��ʾ״̬[0-����ʾ��1-��ʾ]
	 */
	private Integer showStatus;
	/**
	 * ��������ĸ
	 */
	private String firstLetter;
	/**
	 * ����
	 */
	private Integer sort;

}
