package com.crawljax.core.plugin;

/**
 * Interface that adds a setOutputFolder and getOutputFolder method to allow the user to set the
 * directory this plugin should use for its output. Note that the output path should be used as an
 * absolute path.
 * 
 * @author Frank Groeneveld <frankgroeneveld+crawljax@gmail.com>
 * @version $Id: GeneratesOutput.java 165 2010-01-27 15:38:31Z frankgroeneveld $
 */
public interface GeneratesOutput extends Plugin {

	/**
	 * Sets the absolute output directory that should be used by this plugin.
	 * 
	 * @param absolutePath
	 *            The path to the output directory to use.
	 */
	void setOutputFolder(String absolutePath);

	/**
	 * Get the absolute path of the output directory that was specified by the user.
	 * 
	 * @return The path to use for writing files to.
	 */
	String getOutputFolder();
}
