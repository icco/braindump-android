package com.devcloud.braindump;

import android.net.Uri;
import android.provider.BaseColumns;


/**
 * Notes table contract
 */
public final class Notes implements BaseColumns {

	public static final String AUTHORITY = "com.devcloud.provider.BrainDump";

	// This class cannot be instantiated
	private Notes() {}

	/**
	 * The table name offered by this provider
	 */
	public static final String TABLE_NAME = "notes";

	/*
	 * URI definitions
	 */

	/**
	 * The scheme part for this provider's URI
	 */
	private static final String SCHEME = "content://";

	/**
	 * Path parts for the URIs
	 */

	/**
	 * Path part for the Notes URI
	 */
	private static final String PATH_NOTES = "/notes";

	/**
	 * Path part for the Note ID URI
	 */
	private static final String PATH_NOTE_ID = "/notes/";

	/**
	 * 0-relative position of a note ID segment in the path part of a note ID URI
	 */
	public static final int NOTE_ID_PATH_POSITION = 1;

	/**
	 * Path part for the Live Folder URI
	 */
	private static final String PATH_LIVE_FOLDER = "/live_folders/notes";

	/**
	 * The content:// style URL for this table
	 */
	public static final Uri CONTENT_URI =  Uri.parse(SCHEME + AUTHORITY + PATH_NOTES);

	/**
	 * The content URI base for a single note. Callers must
	 * append a numeric note id to this Uri to retrieve a note
	 */
	public static final Uri CONTENT_ID_URI_BASE
	= Uri.parse(SCHEME + AUTHORITY + PATH_NOTE_ID);

	/**
	 * The content URI match pattern for a single note, specified by its ID. Use this to match
	 * incoming URIs or to construct an Intent.
	 */
	public static final Uri CONTENT_ID_URI_PATTERN
	= Uri.parse(SCHEME + AUTHORITY + PATH_NOTE_ID + "/#");

	/**
	 * The content Uri pattern for a notes listing for live folders
	 */
	public static final Uri LIVE_FOLDER_URI
	= Uri.parse(SCHEME + AUTHORITY + PATH_LIVE_FOLDER);

	/*
	 * MIME type definitions
	 */

	/**
	 * The MIME type of {@link #CONTENT_URI} providing a directory of notes.
	 */
	public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.note";

	/**
	 * The MIME type of a {@link #CONTENT_URI} sub-directory of a single
	 * note.
	 */
	public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.note";

	/**
	 * The default sort order for this table
	 */
	public static final String DEFAULT_SORT_ORDER = "modified DESC";

	/*
	 * Column definitions
	 */

	/**
	 * Column name for the title of the note
	 * <P>Type: TEXT</P>
	 */
	public static final String COLUMN_NAME_TITLE = "title";

	/**
	 * Column name of the note content
	 * <P>Type: TEXT</P>
	 */
	public static final String COLUMN_NAME_NOTE = "note";

	/**
	 * Column name for the creation timestamp
	 * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
	 */
	public static final String COLUMN_NAME_CREATE_DATE = "created";

	/**
	 * Column name for the modification timestamp
	 * <P>Type: INTEGER (long from System.curentTimeMillis())</P>
	 */
	public static final String COLUMN_NAME_MODIFICATION_DATE = "modified";
}
