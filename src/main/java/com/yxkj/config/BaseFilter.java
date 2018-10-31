package com.yxkj.config;

import javax.servlet.annotation.WebFilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

@WebFilter
public class BaseFilter extends ZuulFilter{

	@Override
	public Object run() throws ZuulException {
		System.out.println("run");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 100;
	}

	@Override
	public String filterType() {
		return "ACD";
	}

}
