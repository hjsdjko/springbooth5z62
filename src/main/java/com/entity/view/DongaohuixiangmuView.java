package com.entity.view;

import com.entity.DongaohuixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 冬奥会项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 20:33:59
 */
@TableName("dongaohuixiangmu")
public class DongaohuixiangmuView  extends DongaohuixiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongaohuixiangmuView(){
	}
 
 	public DongaohuixiangmuView(DongaohuixiangmuEntity dongaohuixiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, dongaohuixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
