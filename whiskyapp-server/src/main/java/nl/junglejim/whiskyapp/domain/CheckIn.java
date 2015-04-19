package nl.junglejim.whiskyapp.domain;

import java.time.Clock;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.util.Assert;

public class CheckIn {
	
	@Id
	private Long id;
	
	@Transient
	@Autowired
	private Clock clock;
	
	private ZonedDateTime timestamp;
	
	@Autowired
	public CheckIn(Clock clock) {
		Assert.notNull(clock);
		
		this.timestamp = ZonedDateTime.now(clock);
	}
	
	public ZonedDateTime getTimestamp() {
		return this.timestamp;
	}
	
	@Override
	public String toString() {
		return String.format("CheckIn[id=%d, timestamp='%s'");
	}

}
