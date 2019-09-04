package com.lienhongvu.javaconcurrent.reentrantlock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExecutionManager {


	private class BackgroundTask implements Callable {
		private String testId;
		private Callable myCallable;

		public BackgroundTask(String testId, Callable callable) {
			this.testId = testId;
			this.myCallable = callable;
		}

		@Override
		public Object call() {
			Object returnObj = null;
			try {
				returnObj = myCallable.call();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return returnObj;
		}
	}

	private String testId;

	private List<Future> futures = new ArrayList<>();

	private ExecutorService executorService = Executors.newCachedThreadPool();
	private ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);

	public TestExecutionManager(String testId) {
		this.testId = testId;
	}

	/**
	 * @return the testId
	 */
	public String getTestId() {
		return testId;
	}

	/**
	 * @return the futures
	 */
	public List<Future> getFutures() {
		return futures;
	}

	@SuppressWarnings("unchecked")
	public void runInBackground(Callable callable) {
		futures.add(executorCompletionService.submit(new BackgroundTask(testId, callable)));
	}


}
