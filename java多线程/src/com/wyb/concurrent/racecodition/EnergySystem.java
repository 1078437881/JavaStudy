package com.wyb.concurrent.racecodition;

public class EnergySystem {

	private final double[] energyBoxes;

	private final Object lockObj = new Object();

	/**
	 * 
	 * @param n
	 *            能量盒子的数量
	 * @param initialEnergy
	 *            每个能量盒子初始含有的能量值
	 */
	public EnergySystem(int n, double initialEnergy) {
		energyBoxes = new double[n];
		for (int i = 0; i < energyBoxes.length; i++) {
			energyBoxes[i] = initialEnergy;
		}
	}

	/**
	 * 能量的转移,从一个盒子到另一个盒子
	 * 
	 * @param from
	 * @param to
	 * @param amount
	 */
	public void transfer(int from, int to, double amount) {

		synchronized (lockObj) {
			// if (energyBoxes[from] < amount) {
			// return;
			// }
			// while循环保证条件不满足时任务都会被条件阻挡
			// 而不是继续竞争CPU资源
			//Wait set
			while (energyBoxes[from] < amount) {
				try {
					lockObj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName());
			energyBoxes[from] -= amount;
			System.out.printf("从%d转移%10.2f单位能量到%d", from, amount, to);
			energyBoxes[to] += amount;
			System.out.printf("能量总和:%10.2f%n", getTotalEnergies());
			lockObj.notifyAll();
		}
	}

	private double getTotalEnergies() {
		double sum = 0;
		for (double amount : energyBoxes) {
			sum += amount;
		}
		return sum;
	}

	/**
	 * 
	 * @return 返回能量盒子的长度
	 */
	public int getBoxAmount() {
		return energyBoxes.length;
	}
}
