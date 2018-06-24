package com.gxq.learn.jms;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Destination queueTextDestination;// �����ļ�applicationContext-jms-producer.xml��Ե��ı���Ϣbean��id

	/**
	 * �����ı���Ϣ
	 * 
	 * @param text
	 */
	public void sendTextMessage(final String text) {
		jmsTemplate.send(queueTextDestination, new MessageCreator() {

			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}

}
