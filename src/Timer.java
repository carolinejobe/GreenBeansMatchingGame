import java.util.Date;
import java.util.TimerTask;

public class Timer {

	/**
	 * @param args
	 */
	

		static long startTime = System.currentTimeMillis();
		static long elapsedTime = System.currentTimeMillis() - startTime;
		long elapsedSeconds = elapsedTime / 1000;
		long secondsDisplay = elapsedSeconds % 60;
		long elapsedMinutes = elapsedSeconds / 60; {
		
		// put here code to format and display the values

		//while (elapsedTime < 2 * 60 * 1000) {
			//elapsedTime = (new Date()).getTime() - startTime;}
		}


			void timer() {
			System.out.println(startTime);
			}
	}
