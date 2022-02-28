package bridgelabz.stopwatch;

import java.util.Scanner;

public class SimulateStopWatch {
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	public static void main(String[] args) {

		SimulateStopWatch sw = new SimulateStopWatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 's' for start the stopwatch!!!!");
		String isStart = sc.nextLine();

		while (!(isStart.length() == 1 && isStart.equals("s"))) {
			System.out.println("Please enter the valid input for starting the stopwatch!!!!");
			isStart = sc.nextLine();
		}
		sw.start();

		System.out.println("Stopwatch started now, Enter 'e' to end the stopwatch!!!!");
		String isEnd = sc.nextLine();
		while (!(isEnd.length() == 1 && isEnd.equals("e"))) {
			System.out.println("Please enter the valid input for ending the stopwatch!!!!");
			isEnd = sc.nextLine();
		}
		sw.stop();

		long l = sw.getElapsedTime();
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");
	}

	private long getElapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	private void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);

	}

	private void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

}
