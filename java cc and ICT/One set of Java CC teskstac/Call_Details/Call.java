package java_lc_cc.Call_Details;

public class Call {
	
	private int callId;
	private long calledNumber;
	private float duration;
	
	public Call() {
		
	}
	
	public Call(int callId, long calledNumber, float duration) {
		this.callId = callId;
		this.calledNumber = calledNumber;
		this.duration = duration;
	}

	public int getCallId() {
		return callId;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public long getCalledNumber() {
		return calledNumber;
	}

	public void setCalledNumber(long calledNumber) {
		this.calledNumber = calledNumber;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public void parseData(String data) {
		this.callId = Integer.parseInt(data.split(":")[0]);
		this.calledNumber = Long.parseLong(data.split(":")[1]);
		this.duration = Float.parseFloat(data.split(":")[2]);
	}
	
}
