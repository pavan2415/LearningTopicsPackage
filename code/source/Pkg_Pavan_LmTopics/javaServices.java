package Pkg_Pavan_LmTopics;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaServices

{
	// ---( internal utility methods )---

	final static javaServices _instance = new javaServices();

	static javaServices _newInstance() { return new javaServices(); }

	static javaServices _cast(Object o) { return (javaServices)o; }

	// ---( server methods )---




	public static final void documentService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(documentService)>> ---
		// @sigtype java 3.5
		// [i] record:0:required demoDoc
		// [i] - field:0:required name
		// [i] - field:0:required id
		// [o] record:0:required studentlist
		// [o] - field:0:required studentname
		// [o] - field:0:required studentId
		IDataCursor cursorDoc=pipeline.getCursor();
		
		IData demoDoc=IDataUtil.getIData(cursorDoc,"demoDoc");
		
		IDataCursor demoDocCursor=demoDoc.getCursor();
		
		String name=IDataUtil.getString(demoDocCursor,"name");
		String id=IDataUtil.getString(demoDocCursor,"id");
		
		
				IData studentlistDoc=IDataFactory.create(); 
				
				IDataCursor cursorDoc1=studentlistDoc.getCursor();
				
				IDataUtil.put(cursorDoc1, "studentname",name);
				IDataUtil.put(cursorDoc1, "studentid",id);
		
				
			IDataUtil.put(cursorDoc, "studentlist",studentlistDoc);
		// --- <<IS-END>> ---

                
	}



	public static final void stringService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stringService)>> ---
		// @sigtype java 3.5
		// [i] field:0:required firstname
		// [i] field:0:required lastname
		// [o] field:0:required result
		IDataCursor cursorconcat=pipeline.getCursor();
		
		String firstname= IDataUtil.getString(cursorconcat,"firstname");
		
		String lastname=IDataUtil.getString(cursorconcat,"lastname");
		
		IDataUtil.put(cursorconcat, "result",firstname+lastname);
		
			cursorconcat.destroy();
		// --- <<IS-END>> ---

                
	}
}

