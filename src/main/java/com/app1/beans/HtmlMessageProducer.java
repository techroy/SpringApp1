package com.app1.beans;

public class HtmlMessageProducer implements IMessageProducer{

	public String produceMessage(String message) {

		return "<html>" + message + "</html>";
	}
}
