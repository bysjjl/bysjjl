package bysjjl.userMstrService;

import java.sql.SQLException;
import java.util.Date;

import com.bysjjl.model.UserMstr;
import com.bysjjl.service.IUserMstrService;
import com.bysjjl.service.impl.UserMstrService;
import com.bysjjl.tools.DateTool;

public class UserMstrServiceTest {
	
	private static IUserMstrService userMstrService = new UserMstrService();
	
	// ²âÊÔÖØ¸´ÐÔ
	public static void testCheckNameRepeat(){
		try {
			boolean isRepeat = userMstrService.checkNameRepeat("wu_nai2010");
			System.out.println("testCheckNameRepeat:"+isRepeat);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// µÇÂ¼²âÊÔ
	public static void testLogon(){
		UserMstr userMstr = new UserMstr();
		userMstr.setLogonName("wu_nai2010");
		userMstr.setPword("jiezi37426");
		try {
			UserMstr  um =  userMstrService.logon(userMstr);
			if(um != null){
				System.out.println("µÇÂ¼³É¹¦");
			}else{
				System.out.println("µÇÂ¼Ê§°Ü");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//  ×¢²á²âÊÔ
	public static void testRegist(){
		UserMstr userMstr = new UserMstr();
		userMstr.setEmail("876595041@qq.com");
		userMstr.setLimitPower(9);
		userMstr.setPword("jiezi37426");
		userMstr.setQqNo("876595041");
		userMstr.setRegisTime(DateTool.dateTime2formatDate(new Date()));
		userMstr.setLogonName("wu_nai");
		userMstr.setPhoneNo("15821579173");
		try {
			userMstr = userMstrService.registr(userMstr);
			System.out.println(userMstr.getId());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[]args){
//		testCheckNameRepeat();
//		testLogon();
		testRegist();
	}
}
