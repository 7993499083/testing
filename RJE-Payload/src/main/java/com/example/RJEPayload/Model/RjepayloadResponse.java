package com.example.RJEPayload.Model;

import com.example.RJEPayload.Entity.Rjepayload;

public class RjepayloadResponse {
	
	
	private int responseCode;
	private String responseMessage;
	private Rjepayload rjepayload;
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public Rjepayload getRjepayload() {
		return rjepayload;
	}
	public void setRjepayload(Rjepayload rjepayload) {
		this.rjepayload = rjepayload;
	}
	

}
