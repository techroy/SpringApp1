package com.app1.beans;

public class MessageWriter {

	private IMessageProducer iMessageProducer;

	/*
	 * public MessageWriter(IMessageProducer iMessageProducer) { super();
	 * this.iMessageProducer = iMessageProducer; }
	 */

	public void setiMessageProducer(IMessageProducer iMessageProducer) {
		this.iMessageProducer = iMessageProducer;
	}

	public void writeMessage(String message) {

		if (iMessageProducer != null) {
			String producedMessage = iMessageProducer.produceMessage(message);
			System.out.println(producedMessage);
		}

	}

}
