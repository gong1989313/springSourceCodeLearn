package com.gxq.learn.spring.bean.factory;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {
	private String format = "yyyy-mm-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	public void setAsText(String text) {
		System.out.println("loading text: "+text);
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date d = sdf.parse(text);
			this.setValue(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
