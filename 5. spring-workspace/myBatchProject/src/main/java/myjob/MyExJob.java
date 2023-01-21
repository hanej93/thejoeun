package myjob;

import java.time.LocalDateTime;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class MyExJob extends QuartzJobBean{

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		
		String str = LocalDateTime.now().toString();
		System.out.println(str);
	}
	
}
