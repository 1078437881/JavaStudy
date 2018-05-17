package com.callback.example;

public class Tome implements Student {

	@Override
	public void resolveQuestion(Callback callback) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		callback.tellAnswer("这个一个不错的问题,答案3");
	}

}
