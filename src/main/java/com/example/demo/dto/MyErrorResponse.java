package com.example.demo.dto;

import java.time.LocalDateTime;

public class MyErrorResponse {

	private String msg;
	private LocalDateTime time;
	private Exception e;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Exception getE() {
		return e;
	}
	public void setE(Exception e) {
		this.e = e;
	}
	public MyErrorResponse(String msg, LocalDateTime time, Exception e) {
		super();
		this.msg = msg;
		this.time = time;
		this.e = e;
	}
	@Override
	public String toString() {
		return "MyErrorResponse [msg=" + msg + ", time=" + time + ", e=" + e + "]";
	}
}
