package com.x.processplatform.assemble.bam.jaxrs.period;

import com.x.base.core.http.ActionResult;
import com.x.processplatform.assemble.bam.ThisApplication;
import com.x.processplatform.assemble.bam.stub.ApplicationStubs;

class ActionListCompletedWorkApplicationStubs extends ActionBase {

	ActionResult<ApplicationStubs> execute() throws Exception {
		ActionResult<ApplicationStubs> result = new ActionResult<>();
		result.setData(ThisApplication.period.getCompletedWorkApplicationStubs());
		return result;
	}

}