/**
 * 
 */
package eightQueens;

/**
 * @author Sergio_González_Guerra
 *
 */
public class Clock {
		
	private long timeStart_;
	private long timeEnd_;
	
	public void start() {
		timeStart_ = System.currentTimeMillis();
	}
	
	public void stop() {
		timeEnd_ = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		if(timeEnd_==0) {
			return System.currentTimeMillis();
		}else {
			return timeEnd_ - timeStart_;
		}
	}
}
