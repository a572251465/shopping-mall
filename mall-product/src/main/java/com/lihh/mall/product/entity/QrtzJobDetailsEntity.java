package com.lihh.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@Data
@TableName("QRTZ_JOB_DETAILS")
public class QrtzJobDetailsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String jobName;
	/**
	 * 
	 */
	private String jobGroup;
	/**
	 * 
	 */
	private String description;
	/**
	 * 
	 */
	private String jobClassName;
	/**
	 * 
	 */
	private String isDurable;
	/**
	 * 
	 */
	private String isNonconcurrent;
	/**
	 * 
	 */
	private String isUpdateData;
	/**
	 * 
	 */
	private String requestsRecovery;
	/**
	 * 
	 */
	private String jobData;

}
