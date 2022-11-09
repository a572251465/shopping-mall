package com.lihh.shopping.mallproduct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author lihh
 * @email 2495041749@qq.com
 * @date 2022-11-09 16:47:15
 */
@Data
@TableName("QRTZ_LOCKS")
public class QrtzLocksEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String schedName;
	/**
	 * 
	 */
	private String lockName;

}
