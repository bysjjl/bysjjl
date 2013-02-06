package bysjjl.test;

import java.sql.SQLException;

import com.bysjjl.constant.ISysConst;
import com.bysjjl.model.BbsInfoMstr;
import com.bysjjl.model.BbsInfoMstrModel;
import com.bysjjl.service.IBbsInfoMstrService;
import com.bysjjl.service.impl.BbsInfoMstrService;
import com.bysjjl.tools.DateTool;

public class BbsInfoMstrServiceTest {
	private static IBbsInfoMstrService bbsInfoMstrService = new BbsInfoMstrService();
	
	public static void fuzzySearch(){
		BbsInfoMstrModel model = null;
		try {
			model = bbsInfoMstrService.fuzzySearch("%用%", 6, 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------"+model.getTotal());
		if(model.getBbsList() != null && model.getBbsList().size()>0){
			for(BbsInfoMstr bbsInfo : model.getBbsList()){
				System.out.println(bbsInfo.getLogonName());
				System.out.println(bbsInfo.getTitle());
				System.out.println(bbsInfo.getContent());
			}
		}
	}
	
	public static void searchByLogonName(){
		BbsInfoMstrModel model = null;
		try {
			model = bbsInfoMstrService.searchByLogonName("wu_nai2010", 2, 2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------"+model.getTotal());
		if(model.getBbsList() != null && model.getBbsList().size()>0){
			for(BbsInfoMstr bbsInfo : model.getBbsList()){
				System.out.println(bbsInfo.getLogonName());
				System.out.println(bbsInfo.getTitle());
				System.out.println(bbsInfo.getContent());
			}
		}
	}
	
	public static void searchByTime(){
		BbsInfoMstrModel model = null;
		try {
			model = bbsInfoMstrService.searchByTime(DateTool.string2formatDate("2012-03-01"), DateTool.string2formatDate("2013-01-30"), "wu_nai2010", 6, 1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------"+model.getTotal());
		if(model.getBbsList() != null && model.getBbsList().size()>0){
			for(BbsInfoMstr bbsInfo : model.getBbsList()){
				System.out.println(bbsInfo.getLogonName());
				System.out.println(bbsInfo.getTitle());
				System.out.println(bbsInfo.getContent());
			}
		}
	}
	
	
	public static void searchByType(){
		BbsInfoMstrModel model = null;
		try {
			model = bbsInfoMstrService.searchByType(ISysConst.TYPE_WEB, 1, 3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("---------------------"+model.getTotal());
		if(model.getBbsList() != null && model.getBbsList().size()>0){
			for(BbsInfoMstr bbsInfo : model.getBbsList()){
				System.out.println(bbsInfo.getLogonName());
				System.out.println(bbsInfo.getTitle());
				System.out.println(bbsInfo.getContent());
			}
		}
	}
	
	public static void searchByParentId(){
		BbsInfoMstrModel model = null;		
		try {
			model = bbsInfoMstrService.searchByParentId(0, 1, 2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(model.getTotal());
		if(model.getBbsList() != null && model.getBbsList().size()>0){
			for(BbsInfoMstr bbsInfo : model.getBbsList()){
				System.out.println(bbsInfo.getLogonName());
				System.out.println(bbsInfo.getTitle());
				System.out.println(bbsInfo.getContent());
			}
		}
	}
	
	public static void add(){
		BbsInfoMstr bbsInfo = new BbsInfoMstr();
		bbsInfo.setComtime(DateTool.string2formatDate("2013-1-30"));
		String content ="mysql的分页比较简单用limit限制就好了，没有top这类的关键字。/t/n 比如 size 为每页的大小，current为当前页，select * from XXXX limit (current-1)*size, current * size";
		bbsInfo.setContent(content);
		bbsInfo.setParentId(2);
		bbsInfo.setLogonName("wu_nai2010");
		bbsInfo.setType(ISysConst.TYPE_WEB);
		System.out.println(content.length());
		try {
			bbsInfoMstrService.add(bbsInfo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(){
		
	}
	
	public static void main(String[] args) {
//		add();
//		searchByParentId();
//		searchByType();
//		searchByTime();
//		searchByLogonName();
		fuzzySearch();
	}

}
