package assignments;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class AcceptZone{
	
		public void zone(String zoneId)
		{
			ZonedDateTime date=ZonedDateTime.now(ZoneId.of(zoneId));
			System.out.println(date);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcceptZone acceptzone=new AcceptZone();
		acceptzone.zone("America/New_York");
		acceptzone.zone("Europe/London");
		acceptzone.zone("Asia/Tokyo");
		acceptzone.zone("US/Pacific");
		acceptzone.zone("Africa/Cairo");
		acceptzone.zone("Australia/Sydney");
	}

}
