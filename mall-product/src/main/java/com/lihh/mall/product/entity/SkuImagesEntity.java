package com.lihh.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * skuͼƬ
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-10 15:39:01
 */
@Data
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * ͼƬ��ַ
	 */
	private String imgUrl;
	/**
	 * ����
	 */
	private Integer imgSort;
	/**
	 * Ĭ��ͼ[0 - ����Ĭ��ͼ��1 - ��Ĭ��ͼ]
	 */
	private Integer defaultImg;

}
