package com.web.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_EMPTY)
public class Response<T> {

	String message;
	
	Integer status;
	
	T data;
	
	

	public Response() {
		super();
	}

	public Response(String message) {
		super();
		this.message = message;
	}
	

	public Response(String message, Integer status, T data) {
		super();
		this.message = message;
		this.status = status;
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
