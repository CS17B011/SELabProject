package com.crawljax.oraclecomparator.comparators;

import java.util.Arrays;

/**
 * Oracle comparators that supports dates.
 * 
 * @author dannyroest@gmail.com (Danny Roest)
 * @version $Id: DateComparator.java 66 2010-01-13 14:27:36Z frankgroeneveld $
 */
public class DateComparator extends RegexComparator {

	// NOTE: the ordering is important
	private String[] patterns =
	        {
	        /* with days */
	        "[a-zA-Z]{3,} [0-9]{1,2} [a-zA-Z]{3,} [0-9]{4}",
	                "[a-zA-Z]{3,} [0-9]{1,2} [a-zA-Z]{3,} '[0-9]{2}",
	                "[a-zA-Z]{3,} [0-9]{1,2} [a-zA-Z]{3,}",

	                /* only numeric */
	                "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}", "[0-9]{4}\\.[0-9]{1,2}\\.[0-9]{1,2}",
	                "[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}",

	                "[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}", "[0-9]{1,2}\\.[0-9]{1,2}\\.[0-9]{4}",
	                "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}",

	                "[0-9]{1,2}-[0-9]{1,2}-'[0-9]{2}", "[0-9]{1,2}\\.[0-9]{1,2}\\.'[0-9]{2}",
	                "[0-9]{1,2}/[0-9]{1,2}/'[0-9]{2}",

	                "[0-9]{1,2}-[0-9]{1,2}-[0-9]{2}", "[0-9]{1,2}\\.[0-9]{1,2}\\.[0-9]{2}",
	                "[0-9]{1,2}/[0-9]{1,2}/[0-9]{2}",

	                /* long months */
	                "[0-9]{1,2} [a-zA-Z]{3,} [0-9]{4}", "[0-9]{1,2}th [a-zA-Z]{3,} [0-9]{4}",
	                "[0-9]{1,2}th [a-zA-Z]{3,}",

	                "[0-9]{4} [a-zA-Z]{3,} [0-9]{1,2}", "[0-9]{4}[a-zA-Z]{3,}[0-9]{1,2}",

	                "[a-zA-Z]{3,} [0-9]{4}", "[a-zA-Z]{3,} '[0-9]{2}",

	                "[a-zA-Z]{3,} [0-9]{1,2} [0-9]{4}", "[a-zA-Z]{3,} [0-9]{1,2}, [0-9]{4}",
	                "[a-zA-Z]{3,} [0-9]{1,2} '[0-9]{2}", "[a-zA-Z]{3,} [0-9]{1,2}, '[0-9]{2}",

	                /* Times */
	                "[0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}( )?(pm|PM|am|AM)",
	                "[0-9]{1,2}:[0-9]{1,2}( )?(pm|PM|am|AM)",

	                "[0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}", "[0-9]{1,2}:[0-9]{1,2}",

	        };

	/**
	 * Default Constructor.
	 */
	public DateComparator() {
		super();
		addRegularExpressions(Arrays.asList(this.patterns));
	}

}
