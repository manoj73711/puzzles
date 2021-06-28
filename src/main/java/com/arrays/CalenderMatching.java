package com.arrays;

import java.util.*;

public class CalenderMatching {

	public static List<StringMeeting> calendarMatching(List<StringMeeting> calender1, StringMeeting dailyBounds1,
			List<StringMeeting> calender2, StringMeeting dailyBounds2, int meetingDuration) {

		List<Meeting> updatedCalender1 = updateCalender(calender1, dailyBounds1);
		List<Meeting> updatedCalender2 = updateCalender(calender2, dailyBounds2);
		List<Meeting> mergedCalander = mergeCalander(updatedCalender1, updatedCalender2);
		List<Meeting> flattenedCalender = flatternCalender(mergedCalander);

		return getMatchingAvailabilities(flattenedCalender, meetingDuration);
	}

	public static List<Meeting> updateCalender(List<StringMeeting> calendar, StringMeeting dailyBounds) {

		List<StringMeeting> updateCalender = new ArrayList<StringMeeting>();
		updateCalender.add(new StringMeeting("0:00", dailyBounds.start));
		updateCalender.addAll(calendar);
		updateCalender.add(new StringMeeting(dailyBounds.end, "23:59"));
		List<Meeting> calenderInMinutes = new ArrayList<Meeting>();

		for (int i = 0; i < updateCalender.size(); i++) {

			calenderInMinutes.add(
					new Meeting(timeToMinutes(updateCalender.get(i).start), timeToMinutes(updateCalender.get(i).end)));
		}

		return calenderInMinutes;

	}

	public static List<Meeting> mergeCalander(List<Meeting> calender1, List<Meeting> calender2) {

		List<Meeting> merged = new ArrayList<Meeting>();

		int i = 0;
		int j = 0;

		while (i < calender1.size() && j < calender2.size()) {
			Meeting meeting1 = calender1.get(i);
			Meeting meeting2 = calender2.get(j);

			if (meeting1.start < meeting2.start) {
				merged.add(meeting1);
				i++;
			} else {
				merged.add(meeting2);
				j++;
			}
		}

		while (i < calender1.size())
			merged.add(calender1.get(i++));
		while (j < calender2.size())
			merged.add(calender2.get(j++));
		return merged;
	}

	public static List<Meeting> flatternCalender(List<Meeting> calender) {
		List<Meeting> flattened = new ArrayList<Meeting>();
		flattened.add(calender.get(0));

		for (int i = 1; i < calender.size(); i++) {
			Meeting currentMeeting = calender.get(i);
			Meeting previousMeeting = flattened.get(flattened.size() - 1);

			if (previousMeeting.end >= currentMeeting.start) {

				Meeting newPreviousMeeting = new Meeting(previousMeeting.start,
						Math.max(previousMeeting.end, currentMeeting.end));

				flattened.set(flattened.size() - 1, newPreviousMeeting);
			} else {
				flattened.add(currentMeeting);
			}
		}
		return flattened;
	}

	public static List<StringMeeting> getMatchingAvailabilities(

			List<Meeting> calender, int meetingDuration) {

		List<Meeting> matchingAvailabilities = new ArrayList<Meeting>();

		for (int i = 1; i < calender.size(); i++) {

			int start = calender.get(i - 1).end;
			int end = calender.get(i).start;

			int availabilityDuration = end - start;

			if (availabilityDuration >= meetingDuration) {
				matchingAvailabilities.add(new Meeting(start, end));
			}
		}

		List<StringMeeting> matchingAvailabilityInHours = new ArrayList<StringMeeting>();
		for (int i = 0; i < matchingAvailabilities.size(); i++) {
			matchingAvailabilityInHours.add(new StringMeeting(minutesToTime(matchingAvailabilities.get(i).start),
					minutesToTime(matchingAvailabilities.get(i).end)));
		}

		return matchingAvailabilityInHours;
	}

	static class StringMeeting {
		public String start;
		public String end;

		public StringMeeting(String start, String end) {
			this.start = start;
			this.end = end;
		}
	}

	public static int timeToMinutes(String time) {
		int delimiterPos = time.indexOf(":");
		int hours = Integer.parseInt(time.substring(0, delimiterPos));
		int minutes = Integer.parseInt(time.substring(delimiterPos + 1, time.length()));

		return (hours * 60) + minutes;

	}

	public static String minutesToTime(int minutes) {
		int hours = minutes / 60;
		int mins = minutes % 60;

		String hourstString = Integer.toString(hours);
		String minutesString = mins < 10 ? "0" + Integer.toString(mins) : Integer.toString(mins);
		return hourstString + ":" + minutesString;
	}

	static class Meeting {

		public int start;
		public int end;

		public Meeting(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
}
