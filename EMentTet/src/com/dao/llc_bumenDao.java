package com.dao;

import com.entity.Lr_bumeng;

public interface llc_bumenDao {
	/**
	 * llc写的新增部门
	 * @return
	 */
	int addbumen(Lr_bumeng men);
	/**
	 * llc写的删除部门
	 * @param id
	 * @return
	 */
	int delbumen(int id);
}
