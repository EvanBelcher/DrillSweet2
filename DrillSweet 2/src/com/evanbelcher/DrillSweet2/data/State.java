
package com.evanbelcher.DrillSweet2.data;

/**
 * Holds information about the current state of the application
 * 
 * @author Evan Belcher
 * @version 1.0
 * @since 1.0
 */
public class State {
	
	private final static boolean DEBUG_MODE = false;
	private int currentPage;
	private boolean showGrid = true;
	private boolean showNames = true;
	private String currentFileName;
	
	/**
	 * Literally just here for the loading from json
	 * 
	 * @since 1.0
	 */
	public State() {
		
	}
	
	/**
	 * Constructs the object with given current page.
	 * 
	 * @param currentPage
	 *            the current page number
	 * @since 1.0
	 */
	public State(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/**
	 * @return debug mode?
	 * @since 1.0
	 */
	public static boolean isDebugMode() {
		return DEBUG_MODE;
	}
	
	/**
	 * @return current page number
	 * @since 1.0
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	
	/**
	 * Sets current page number
	 * 
	 * @param currentPage
	 *            the current page number
	 * @since 1.0
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	/**
	 * @return show grid?
	 * @since 1.0
	 */
	public boolean isShowGrid() {
		return showGrid;
	}
	
	/**
	 * Sets showGrid
	 * 
	 * @param showGrid
	 *            whether the grid should be shown
	 * @since 1.0
	 */
	public void setShowGrid(boolean showGrid) {
		this.showGrid = showGrid;
	}
	
	/**
	 * @return show names?
	 * @since 1.0
	 */
	public boolean isShowNames() {
		return showNames;
	}
	
	/**
	 * Sets showNames
	 * 
	 * @param showNames
	 *            whether the names should be shown
	 * @since 1.0
	 */
	public void setShowNames(boolean showNames) {
		this.showNames = showNames;
	}
	
	/**
	 * @return currentFileName
	 * @since 1.0
	 */
	public String getCurrentFileName() {
		return currentFileName;
	}
	
	/**
	 * Sets currentFileName
	 * 
	 * @param currentFileName
	 *            the new current file name
	 * @since 1.0
	 */
	public void setCurrentFileName(String currentFileName) {
		this.currentFileName = currentFileName;
	}
	
	/**
	 * Default toString
	 * 
	 * @return this object as a String
	 * @since 1.0
	 */
	@Override
	public String toString() {
		return "State [currentPage=" + currentPage + ", showGrid=" + showGrid + ", showNames=" + showNames + ", currentFileName=" + currentFileName + "]";
	}
	
	/**
	 * Prints objects to console if debug mode is true
	 * 
	 * @param objects
	 *            the object or objects to be printed (varargs)
	 * @since 1.0
	 */
	public static void print(Object... objects) {
		if (DEBUG_MODE) {
			for (Object o : objects)
				System.out.println(o);
		}
	}
	
}
