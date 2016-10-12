package com.qxcwl.jeewl.common.page.utils;

public class PageUtils {
	/**
	 * 
	 * @Title isDisabledPage
	 * @author 曲修成
	 * @date 2016年6月29日 下午8:07:12
	 * @param pageStr 当前页码
	 * @param paginatorPageStr 分页大小
	 * @param paginatorTotalPagesStr 分页总数
	 */
	public static boolean isDisabledPage(String paginatorTotalPagesStr, String paginatorPageStr, String pageStr) {
		int page = Integer.valueOf(pageStr);
		int paginatorTotalPages = Integer.valueOf(paginatorTotalPagesStr);
		int paginatorPage = Integer.valueOf(paginatorPageStr);
		System.out.println("当前页码:"+pageStr);
		return ((page < 1) || (page > paginatorTotalPages) || (page == paginatorPage));
	}
}
