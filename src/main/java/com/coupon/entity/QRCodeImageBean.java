/**
 * 功能描述：
 * @Package: com.coupon.entity 
 * @author: luffy 
 * @date: 2018年8月14日 上午9:20:46 
 */
package com.coupon.entity;

import java.awt.image.BufferedImage;

import jp.sourceforge.qrcode.data.QRCodeImage;

/**
* @ClassName: QRCodeImageBean.java
* @Description: 二维码生成实体bean对象
*
* @author: luffy
* @date: 2018年8月14日 上午9:20:46
*/
public class QRCodeImageBean implements QRCodeImage {

	BufferedImage bufImg; 
	
	public QRCodeImageBean(BufferedImage bufImg) {  
	        this.bufImg = bufImg;  
	} 
	
	/** 
	* @Function: QRCodeImageBean.java
	* @Description: 获取高度
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	* @date: 2018年8月14日 上午9:44:50 
	*/
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return bufImg.getHeight();
	}

	/** 
	* @Function: QRCodeImageBean.java
	* @Description: 获取像素
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	* @date: 2018年8月14日 上午9:44:50 
	*/
	@Override
	public int getPixel(int x, int y) {
		// TODO Auto-generated method stub
		return bufImg.getRGB(x, y);
	}

	/** 
	* @Function: QRCodeImageBean.java
	* @Description: 获取宽度
	*
	* @param:参数一
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @author: luffy
	* @date: 2018年8月14日 上午9:44:50 
	*/
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return bufImg.getWidth();
	}

}
