package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;
import net.masterthought.cucumber.ReportBuilder;
/**
 * 
 * @author JAGADESWARAN
 * @see Reporting class used to generate jvm report  
 * @date 27/12/2022
 */
public class Reporting extends BaseClass
{
	/**
	 * @see Method to generate JVM report
	 * @param jsonFile
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void generateJVMReport(String jsonFile) throws FileNotFoundException, IOException
	{
		File file = new File(getProjectPath()+getPropertyFileValue("jvmPath"));
		
		net.masterthought.cucumber.Configuration configuration = new net.masterthought.cucumber.Configuration(file, "OMRBranchAdactinAutomation"); 
		
		configuration.addClassifications("Browse", "Chrome");
		configuration.addClassifications("Version", "108");
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("SPRINT", "27");
		
		List<String> jsonFiles =new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
	}

}
