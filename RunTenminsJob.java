package com.pingan.horae.demo.job;

import org.springframework.stereotype.Component;

import com.pingan.horae.job.executor.unpafa.AbstractHoraeJavaJob;
import com.vip.saturn.job.SaturnJobExecutionContext;
import com.vip.saturn.job.SaturnJobReturn;

@Component
public class RunTenminsJob extends AbstractHoraeJavaJob {

	@Override
	public SaturnJobReturn handleJavaJob(String jobName, Integer shardItem, String shardParam,
			SaturnJobExecutionContext shardingContext) throws InterruptedException {
		long start = System.currentTimeMillis();
		System.out.println(jobName + " start : " + start);
		Thread.sleep(600000);
		long end = System.currentTimeMillis();
		System.out.println(jobName + " end : " + end + "执行时间：" + (end - start) + "ms...");
		return new SaturnJobReturn("我是分片" + shardItem + "的处理结果");
	}

}
