package com.cts.datamigration.controller;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.datamigration.model.Event;
import com.cts.datamigration.model.Summary;
import com.cts.datamigration.repository.EventRepository;
import com.cts.datamigration.repository.SummaryRepository;

@RestController
@RequestMapping("/upload")
public class ExcelDataController {

	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	SummaryRepository summaryRepository;
	
	@GetMapping("/event")
	public String importEvents() throws EncryptedDocumentException, IOException,InvalidFormatException {
	
		File excelFile = new File("C:\\Users\\student\\event.xlsx");
		Workbook excelWorkbook = WorkbookFactory.create(excelFile);
		Sheet excelSheet = excelWorkbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		
		int index = 0;
		
		for(Row row : excelSheet) {
			if(index != 0) {
				String eventNo = dataFormatter.formatCellValue(row.getCell(0));
				String eventId = dataFormatter.formatCellValue(row.getCell(1));
				String baseLocation = dataFormatter.formatCellValue(row.getCell(2));
				String beneficiaryName = dataFormatter.formatCellValue(row.getCell(3));
				String councilName = dataFormatter.formatCellValue(row.getCell(4));
				String eventName = dataFormatter.formatCellValue(row.getCell(5));
				String eventDescription = dataFormatter.formatCellValue(row.getCell(6));
				String eventDate = dataFormatter.formatCellValue(row.getCell(7));
				String empId = dataFormatter.formatCellValue(row.getCell(8));
				String empName = dataFormatter.formatCellValue(row.getCell(9));
				String volunteerHours = dataFormatter.formatCellValue(row.getCell(10));
				String travelHours = dataFormatter.formatCellValue(row.getCell(11));
				String livesImpacted = dataFormatter.formatCellValue(row.getCell(12));
				String businessUnit = dataFormatter.formatCellValue(row.getCell(13));
				String status = dataFormatter.formatCellValue(row.getCell(14));
				String iiepCategory = dataFormatter.formatCellValue(row.getCell(15));
				String summaryId = dataFormatter.formatCellValue(row.getCell(16));
				
				Event event = eventRepository.findByEventId(eventId);
				
				if(event == null) {
					event = new Event();
					event.setEventId(eventId);
					event.setBaseLocation(baseLocation);
					event.setBeneficiaryName(beneficiaryName);
					event.setCouncilName(councilName);
					event.setEventName(eventName);
					event.setEventDescription(eventDescription);
					event.setEventDate(eventDate);
					event.setEmpId(empId);
					event.setEmpName(empName);
					event.setVolunteerHours(volunteerHours);
					event.setTravelHours(travelHours);
					event.setLivesImpacted(livesImpacted);
					event.setBusinessUnit(businessUnit);
					event.setStatus(status);
					event.setIiepCategory(iiepCategory);
					event.setSummaryId(summaryId);
					
					eventRepository.save(event);
				}
			}
			index++;
		}
		
		excelWorkbook.close();
		return "uploaded events successfully !";
	}
	
	
	
	@GetMapping("/summary")
	public String importSummary() throws EncryptedDocumentException, IOException,InvalidFormatException {
	
		File excelFile = new File("C:\\Users\\student\\summary.xlsx");
		Workbook excelWorkbook = WorkbookFactory.create(excelFile);
		Sheet excelSheet = excelWorkbook.getSheetAt(0);
		DataFormatter dataFormatter = new DataFormatter();
		
		int index = 0;
		
		for(Row row : excelSheet) {
			if(index != 0) {
				String summaryId = dataFormatter.formatCellValue(row.getCell(0));
				String eventId = dataFormatter.formatCellValue(row.getCell(1));
				String month = dataFormatter.formatCellValue(row.getCell(2));
				String baseLocation = dataFormatter.formatCellValue(row.getCell(3));
				String beneficiaryName = dataFormatter.formatCellValue(row.getCell(4));
				String venueAddress = dataFormatter.formatCellValue(row.getCell(5));
				String councilName = dataFormatter.formatCellValue(row.getCell(6));
				String project = dataFormatter.formatCellValue(row.getCell(7));
				String category = dataFormatter.formatCellValue(row.getCell(8));
				String eventName = dataFormatter.formatCellValue(row.getCell(9));
				String eventDescription = dataFormatter.formatCellValue(row.getCell(10));
				String eventDate = dataFormatter.formatCellValue(row.getCell(11));
				String totalVolunteers = dataFormatter.formatCellValue(row.getCell(12));
				String totalVolunteerHours = dataFormatter.formatCellValue(row.getCell(13));
				String totalTravelHours = dataFormatter.formatCellValue(row.getCell(14));
				String overallHours = dataFormatter.formatCellValue(row.getCell(15));
				String livesImpacted = dataFormatter.formatCellValue(row.getCell(16));
				String activityType = dataFormatter.formatCellValue(row.getCell(17));
				String status = dataFormatter.formatCellValue(row.getCell(18));
				String pocId = dataFormatter.formatCellValue(row.getCell(19));
				String pocName = dataFormatter.formatCellValue(row.getCell(20));
				String pocContact = dataFormatter.formatCellValue(row.getCell(21));
				
				Summary summary = summaryRepository.findByEventId(eventId);
				
				if(summary == null) {
					summary = new Summary();
					summary.setEventId(eventId);
					summary.setMonth(month);
					summary.setBaseLocation(baseLocation);
					summary.setBeneficiaryName(beneficiaryName);
					summary.setVenueAddress(venueAddress);
					summary.setCouncilName(councilName);
					summary.setProject(project);
					summary.setCategory(category);
					summary.setEventName(eventName);
					summary.setEventDescription(eventDescription);
					summary.setEventDate(eventDate);
					summary.setTotalVolunteers(totalVolunteers);
					summary.setTotalVolunteerHours(totalVolunteerHours);
					summary.setTotalTravelHours(totalTravelHours);
					summary.setOverallHours(overallHours);
					summary.setLivesImpacted(livesImpacted);
					summary.setActivityType(activityType);
					summary.setStatus(status);
					summary.setPocId(pocId);
					summary.setPocName(pocName);
					summary.setPocContact(pocContact);
					
					summaryRepository.save(summary);
				}
			}
			index++;
		}
		
		excelWorkbook.close();
		return "uploaded eventSummary successfully !";
	}
}
