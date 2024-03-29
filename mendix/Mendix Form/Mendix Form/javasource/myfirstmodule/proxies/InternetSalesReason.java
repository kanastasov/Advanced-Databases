// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class InternetSalesReason
{
	private final IMendixObject internetSalesReasonMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.InternetSalesReason";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SalesOrderNumber("SalesOrderNumber"),
		SalesOrderLineNumber("SalesOrderLineNumber"),
		SalesReasonKey("SalesReasonKey"),
		InternetSalesReason_InternetSales("MyFirstModule.InternetSalesReason_InternetSales");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public InternetSalesReason(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.InternetSalesReason"));
	}

	protected InternetSalesReason(IContext context, IMendixObject internetSalesReasonMendixObject)
	{
		if (internetSalesReasonMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.InternetSalesReason", internetSalesReasonMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.InternetSalesReason");

		this.internetSalesReasonMendixObject = internetSalesReasonMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new InternetSalesReason(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.InternetSalesReason create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.InternetSalesReason");
		return new myfirstmodule.proxies.InternetSalesReason(context, mendixObject);
	}

	/**
	 * @deprecated Use 'InternetSalesReason.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.InternetSalesReason initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.InternetSalesReason.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.InternetSalesReason initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.InternetSalesReason(context, mendixObject);
	}

	public static myfirstmodule.proxies.InternetSalesReason load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.InternetSalesReason.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.InternetSalesReason> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.InternetSalesReason> result = new java.util.ArrayList<myfirstmodule.proxies.InternetSalesReason>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.InternetSalesReason" + xpathConstraint))
			result.add(myfirstmodule.proxies.InternetSalesReason.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of SalesOrderNumber
	 */
	public final String getSalesOrderNumber()
	{
		return getSalesOrderNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesOrderNumber
	 */
	public final String getSalesOrderNumber(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SalesOrderNumber.toString());
	}

	/**
	 * Set value of SalesOrderNumber
	 * @param salesordernumber
	 */
	public final void setSalesOrderNumber(String salesordernumber)
	{
		setSalesOrderNumber(getContext(), salesordernumber);
	}

	/**
	 * Set value of SalesOrderNumber
	 * @param context
	 * @param salesordernumber
	 */
	public final void setSalesOrderNumber(IContext context, String salesordernumber)
	{
		getMendixObject().setValue(context, MemberNames.SalesOrderNumber.toString(), salesordernumber);
	}

	/**
	 * @return value of SalesOrderLineNumber
	 */
	public final Integer getSalesOrderLineNumber()
	{
		return getSalesOrderLineNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesOrderLineNumber
	 */
	public final Integer getSalesOrderLineNumber(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.SalesOrderLineNumber.toString());
	}

	/**
	 * Set value of SalesOrderLineNumber
	 * @param salesorderlinenumber
	 */
	public final void setSalesOrderLineNumber(Integer salesorderlinenumber)
	{
		setSalesOrderLineNumber(getContext(), salesorderlinenumber);
	}

	/**
	 * Set value of SalesOrderLineNumber
	 * @param context
	 * @param salesorderlinenumber
	 */
	public final void setSalesOrderLineNumber(IContext context, Integer salesorderlinenumber)
	{
		getMendixObject().setValue(context, MemberNames.SalesOrderLineNumber.toString(), salesorderlinenumber);
	}

	/**
	 * @return value of SalesReasonKey
	 */
	public final Integer getSalesReasonKey()
	{
		return getSalesReasonKey(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesReasonKey
	 */
	public final Integer getSalesReasonKey(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.SalesReasonKey.toString());
	}

	/**
	 * Set value of SalesReasonKey
	 * @param salesreasonkey
	 */
	public final void setSalesReasonKey(Integer salesreasonkey)
	{
		setSalesReasonKey(getContext(), salesreasonkey);
	}

	/**
	 * Set value of SalesReasonKey
	 * @param context
	 * @param salesreasonkey
	 */
	public final void setSalesReasonKey(IContext context, Integer salesreasonkey)
	{
		getMendixObject().setValue(context, MemberNames.SalesReasonKey.toString(), salesreasonkey);
	}

	/**
	 * @return value of InternetSalesReason_InternetSales
	 */
	public final myfirstmodule.proxies.InternetSales getInternetSalesReason_InternetSales() throws CoreException
	{
		return getInternetSalesReason_InternetSales(getContext());
	}

	/**
	 * @param context
	 * @return value of InternetSalesReason_InternetSales
	 */
	public final myfirstmodule.proxies.InternetSales getInternetSalesReason_InternetSales(IContext context) throws CoreException
	{
		myfirstmodule.proxies.InternetSales result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InternetSalesReason_InternetSales.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.InternetSales.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InternetSalesReason_InternetSales
	 * @param internetsalesreason_internetsales
	 */
	public final void setInternetSalesReason_InternetSales(myfirstmodule.proxies.InternetSales internetsalesreason_internetsales)
	{
		setInternetSalesReason_InternetSales(getContext(), internetsalesreason_internetsales);
	}

	/**
	 * Set value of InternetSalesReason_InternetSales
	 * @param context
	 * @param internetsalesreason_internetsales
	 */
	public final void setInternetSalesReason_InternetSales(IContext context, myfirstmodule.proxies.InternetSales internetsalesreason_internetsales)
	{
		if (internetsalesreason_internetsales == null)
			getMendixObject().setValue(context, MemberNames.InternetSalesReason_InternetSales.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InternetSalesReason_InternetSales.toString(), internetsalesreason_internetsales.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return internetSalesReasonMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.InternetSalesReason that = (myfirstmodule.proxies.InternetSalesReason) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "MyFirstModule.InternetSalesReason";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().getGuid();
	}
}
