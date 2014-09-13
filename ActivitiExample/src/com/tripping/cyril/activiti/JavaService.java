package com.tripping.cyril.activiti;

import org.activiti.engine.impl.delegate.JavaDelegateInvocation;

public class JavaService extends JavaDelegateInvocation {
	@Override
	public void execute(DelegateExecuting arg0) throws Exception
	{
		arg0.setVariable("rsult",1);
	}
}
