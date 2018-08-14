/**
 * 功能描述：
 * @Package: com.coupon.entity 
 * @author: luffy 
 * @date: 2018年8月14日 上午10:57:55 
 */
package com.coupon.entity;

import java.util.Date;

/**
* @ClassName: Coupon.java
* @Description: 优惠券实体类
*
* @author: luffy
* @date: 2018年8月14日 上午10:57:55
*/
public class Coupon {
	
	
	
	/**   
	* @Function: Coupon.java
	* @Description: 无参构造
	*
	* @param:参数描述
	* @author: luffy
	* @date: 2018年8月14日 上午11:09:54 
	*/
	public Coupon() {}
	/**   
	* @Function: Coupon.java
	* @Description: 全参数构造
	*
	* @param:参数描述
	* @author: luffy
	* @date: 2018年8月14日 上午11:09:47 
	*/
	public Coupon(String number, String name, String price, Date create_time, Date use_time, Date expiry_time,
			String remarks) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.create_time = create_time;
		this.use_time = use_time;
		this.expiry_time = expiry_time;
		this.remarks = remarks;
	}
	
	
	/**
	 * 优惠券编号:唯一性
	 */
	private String number;
	
	/**
	 * 优惠券名称
	 */
	private String name;
	
	/**
	 * 优惠券价格
	 */
	private String price;
	/**
	 * 优惠券创建时间
	 */
	private Date create_time;
	/**
	 * 优惠券使用时间
	 */
	private Date use_time;
	/**
	 * 优惠券过期时间
	 */
	private Date expiry_time;
	/**
	 * 是否已经使用
	 */
	private String state;
	/**
	 * 备注
	 */
	private String remarks;
	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}
	/**
	 * @param create_time the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	/**
	 * @return the use_time
	 */
	public Date getUse_time() {
		return use_time;
	}
	/**
	 * @param use_time the use_time to set
	 */
	public void setUse_time(Date use_time) {
		this.use_time = use_time;
	}
	/**
	 * @return the expiry_time
	 */
	public Date getExpiry_time() {
		return expiry_time;
	}
	/**
	 * @param expiry_time the expiry_time to set
	 */
	public void setExpiry_time(Date expiry_time) {
		this.expiry_time = expiry_time;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	

}
