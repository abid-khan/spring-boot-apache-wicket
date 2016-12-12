package com.abid.wicket.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

/**
 * Created by abidkhan on 09/12/16.
 */
public class Home extends WebPage {
	
	public Home(){
		this.add(new Label("label", Model.of("Hello")));

	}
}
