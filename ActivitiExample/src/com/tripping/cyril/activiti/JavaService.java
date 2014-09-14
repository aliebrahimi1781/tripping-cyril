package com.tripping.cyril.activiti;

import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.delegate.DelegateExecution;

public class JavaService implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution arg0) throws Exception
	{
		arg0.setVariable("rsult",1);
	}
}
