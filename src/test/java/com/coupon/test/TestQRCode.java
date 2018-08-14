/**
 * 功能描述：
 * @Package: com.chao.test 
 * @author: luffy 
 * @date: 2018年8月14日 上午9:59:42 
 */
package com.coupon.test;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.coupon.entity.Coupon;
import com.coupon.utils.QRCode;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
* @ClassName: TestQRCode.java
* @Description: 测试二维码工具类
*
* @author: luffy
* @date: 2018年8月14日 上午9:59:42
*/
public class TestQRCode {
	
	public static void main(String[] args) throws ParseException {
		
		 //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         Date create_time = new Date();
         Date expiry_time = getChangeDate(create_time,1,0,0);
		 System.out.println("时间:" + create_time);
		 Coupon coupon = new Coupon("E8642735","女神优惠券","899",null,null,null,"优惠券使用版本解释");
		
		 JSONObject jsonObject = JSONObject.fromObject(coupon);
		 
		 //生成二维码
		 String imgPath = "F:/qrcode/qrCode.png";
		 
		 String encoderContent = String.valueOf(jsonObject);
		 
		 QRCode.encoderQRCode(encoderContent, imgPath, "png");
		 System.out.println("encoder success!!!");
		 
		 //解析二维码
		 String imgPath2 = "F:/qrcode/qrCode.png";
		 String qrCon = QRCode.decoderQRCode(imgPath2);
		 System.out.println("decoder success!!!");
		 System.out.println("二维码内容为:" + qrCon);
	}
	
	private static Date getChangeDate(Date time,int year,int month,int day){
		
			//获取时间加一年或加一月或加一天
		    Calendar cal = Calendar.getInstance();
		    cal.setTime(time);//设置起时间
		    //System.out.println("111111111::::"+cal.getTime());
		    cal.add(Calendar.YEAR, year);//增加年数
		    cal.add(Calendar.DATE,day);//增加天数
		    //cd.add(Calendar.DATE, -10);//减10天  
		    cal.add(Calendar.MONTH,month);//增加月份
		    
			return time;
	}
	
	 /**
	   * 获取现在时间
	   *
	   * @return 返回时间类型 yyyy-MM-dd HH:mm:ss
	   */
	  public static Date getNowDate() {
	    Date currentTime = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String dateString = formatter.format(currentTime);
	    ParsePosition pos = new ParsePosition(0);
	    Date createTime = formatter.parse(dateString, pos);
	    return createTime;
	  }


}
