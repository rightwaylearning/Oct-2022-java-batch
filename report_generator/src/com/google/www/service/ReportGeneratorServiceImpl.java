package com.google.www.service;

import com.google.www.report.generator.ReportGenerator;

public class ReportGeneratorServiceImpl implements ReportGeneratorService {

	ReportGenerator reportGenerator;
	
	@Override
	public void generatReport() {
		reportGenerator.generator();
	}

	public ReportGenerator getReportGenerator() {
		return reportGenerator;
	}

	public void setReportGenerator(ReportGenerator reportGenerator) {
		this.reportGenerator = reportGenerator;
	}
	
	
}
