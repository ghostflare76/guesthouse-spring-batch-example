package com.cowboy76.guesthouse.batch;

import org.springframework.batch.item.ItemProcessor;

import com.cowboy76.guesthouse.batch.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(final Report report) throws Exception {

		final String stffName = report.getStaffName().toUpperCase();
		final Report transForm = new Report();

		transForm.setStaffName(stffName);
		transForm.setDate(report.getDate());
		transForm.setId(report.getId());
		transForm.setQty(report.getQty());
		transForm.setSales(report.getSales());

		System.out.println("Converting ( " + report + ") into (" + transForm + ")");

		return transForm;

	}

}
