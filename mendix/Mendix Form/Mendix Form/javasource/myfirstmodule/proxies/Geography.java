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
public class Geography
{
	private final IMendixObject geographyMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.Geography";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		GeographyKey("GeographyKey"),
		City("City"),
		StateProvinceCode("StateProvinceCode"),
		StateProvinceName("StateProvinceName"),
		CountryRegionCode("CountryRegionCode"),
		EnglishCountryRegionName("EnglishCountryRegionName"),
		SpanishCountryRegionName("SpanishCountryRegionName"),
		FrenchCountryRegionName("FrenchCountryRegionName"),
		PostalCode("PostalCode"),
		IpAddressLocator("IpAddressLocator"),
		Geography_SalesTerritory("MyFirstModule.Geography_SalesTerritory");

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

	public Geography(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.Geography"));
	}

	protected Geography(IContext context, IMendixObject geographyMendixObject)
	{
		if (geographyMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.Geography", geographyMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.Geography");

		this.geographyMendixObject = geographyMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new Geography(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Geography create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.Geography");
		return new myfirstmodule.proxies.Geography(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Geography.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Geography initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.Geography.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Geography initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Geography(context, mendixObject);
	}

	public static myfirstmodule.proxies.Geography load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Geography.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Geography> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.Geography> result = new java.util.ArrayList<myfirstmodule.proxies.Geography>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.Geography" + xpathConstraint))
			result.add(myfirstmodule.proxies.Geography.initialize(context, obj));
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
	 * @return value of GeographyKey
	 */
	public final Integer getGeographyKey()
	{
		return getGeographyKey(getContext());
	}

	/**
	 * @param context
	 * @return value of GeographyKey
	 */
	public final Integer getGeographyKey(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.GeographyKey.toString());
	}

	/**
	 * Set value of GeographyKey
	 * @param geographykey
	 */
	public final void setGeographyKey(Integer geographykey)
	{
		setGeographyKey(getContext(), geographykey);
	}

	/**
	 * Set value of GeographyKey
	 * @param context
	 * @param geographykey
	 */
	public final void setGeographyKey(IContext context, Integer geographykey)
	{
		getMendixObject().setValue(context, MemberNames.GeographyKey.toString(), geographykey);
	}

	/**
	 * @return value of City
	 */
	public final String getCity()
	{
		return getCity(getContext());
	}

	/**
	 * @param context
	 * @return value of City
	 */
	public final String getCity(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.City.toString());
	}

	/**
	 * Set value of City
	 * @param city
	 */
	public final void setCity(String city)
	{
		setCity(getContext(), city);
	}

	/**
	 * Set value of City
	 * @param context
	 * @param city
	 */
	public final void setCity(IContext context, String city)
	{
		getMendixObject().setValue(context, MemberNames.City.toString(), city);
	}

	/**
	 * @return value of StateProvinceCode
	 */
	public final String getStateProvinceCode()
	{
		return getStateProvinceCode(getContext());
	}

	/**
	 * @param context
	 * @return value of StateProvinceCode
	 */
	public final String getStateProvinceCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.StateProvinceCode.toString());
	}

	/**
	 * Set value of StateProvinceCode
	 * @param stateprovincecode
	 */
	public final void setStateProvinceCode(String stateprovincecode)
	{
		setStateProvinceCode(getContext(), stateprovincecode);
	}

	/**
	 * Set value of StateProvinceCode
	 * @param context
	 * @param stateprovincecode
	 */
	public final void setStateProvinceCode(IContext context, String stateprovincecode)
	{
		getMendixObject().setValue(context, MemberNames.StateProvinceCode.toString(), stateprovincecode);
	}

	/**
	 * @return value of StateProvinceName
	 */
	public final String getStateProvinceName()
	{
		return getStateProvinceName(getContext());
	}

	/**
	 * @param context
	 * @return value of StateProvinceName
	 */
	public final String getStateProvinceName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.StateProvinceName.toString());
	}

	/**
	 * Set value of StateProvinceName
	 * @param stateprovincename
	 */
	public final void setStateProvinceName(String stateprovincename)
	{
		setStateProvinceName(getContext(), stateprovincename);
	}

	/**
	 * Set value of StateProvinceName
	 * @param context
	 * @param stateprovincename
	 */
	public final void setStateProvinceName(IContext context, String stateprovincename)
	{
		getMendixObject().setValue(context, MemberNames.StateProvinceName.toString(), stateprovincename);
	}

	/**
	 * @return value of CountryRegionCode
	 */
	public final String getCountryRegionCode()
	{
		return getCountryRegionCode(getContext());
	}

	/**
	 * @param context
	 * @return value of CountryRegionCode
	 */
	public final String getCountryRegionCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CountryRegionCode.toString());
	}

	/**
	 * Set value of CountryRegionCode
	 * @param countryregioncode
	 */
	public final void setCountryRegionCode(String countryregioncode)
	{
		setCountryRegionCode(getContext(), countryregioncode);
	}

	/**
	 * Set value of CountryRegionCode
	 * @param context
	 * @param countryregioncode
	 */
	public final void setCountryRegionCode(IContext context, String countryregioncode)
	{
		getMendixObject().setValue(context, MemberNames.CountryRegionCode.toString(), countryregioncode);
	}

	/**
	 * @return value of EnglishCountryRegionName
	 */
	public final String getEnglishCountryRegionName()
	{
		return getEnglishCountryRegionName(getContext());
	}

	/**
	 * @param context
	 * @return value of EnglishCountryRegionName
	 */
	public final String getEnglishCountryRegionName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.EnglishCountryRegionName.toString());
	}

	/**
	 * Set value of EnglishCountryRegionName
	 * @param englishcountryregionname
	 */
	public final void setEnglishCountryRegionName(String englishcountryregionname)
	{
		setEnglishCountryRegionName(getContext(), englishcountryregionname);
	}

	/**
	 * Set value of EnglishCountryRegionName
	 * @param context
	 * @param englishcountryregionname
	 */
	public final void setEnglishCountryRegionName(IContext context, String englishcountryregionname)
	{
		getMendixObject().setValue(context, MemberNames.EnglishCountryRegionName.toString(), englishcountryregionname);
	}

	/**
	 * @return value of SpanishCountryRegionName
	 */
	public final String getSpanishCountryRegionName()
	{
		return getSpanishCountryRegionName(getContext());
	}

	/**
	 * @param context
	 * @return value of SpanishCountryRegionName
	 */
	public final String getSpanishCountryRegionName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SpanishCountryRegionName.toString());
	}

	/**
	 * Set value of SpanishCountryRegionName
	 * @param spanishcountryregionname
	 */
	public final void setSpanishCountryRegionName(String spanishcountryregionname)
	{
		setSpanishCountryRegionName(getContext(), spanishcountryregionname);
	}

	/**
	 * Set value of SpanishCountryRegionName
	 * @param context
	 * @param spanishcountryregionname
	 */
	public final void setSpanishCountryRegionName(IContext context, String spanishcountryregionname)
	{
		getMendixObject().setValue(context, MemberNames.SpanishCountryRegionName.toString(), spanishcountryregionname);
	}

	/**
	 * @return value of FrenchCountryRegionName
	 */
	public final String getFrenchCountryRegionName()
	{
		return getFrenchCountryRegionName(getContext());
	}

	/**
	 * @param context
	 * @return value of FrenchCountryRegionName
	 */
	public final String getFrenchCountryRegionName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FrenchCountryRegionName.toString());
	}

	/**
	 * Set value of FrenchCountryRegionName
	 * @param frenchcountryregionname
	 */
	public final void setFrenchCountryRegionName(String frenchcountryregionname)
	{
		setFrenchCountryRegionName(getContext(), frenchcountryregionname);
	}

	/**
	 * Set value of FrenchCountryRegionName
	 * @param context
	 * @param frenchcountryregionname
	 */
	public final void setFrenchCountryRegionName(IContext context, String frenchcountryregionname)
	{
		getMendixObject().setValue(context, MemberNames.FrenchCountryRegionName.toString(), frenchcountryregionname);
	}

	/**
	 * @return value of PostalCode
	 */
	public final String getPostalCode()
	{
		return getPostalCode(getContext());
	}

	/**
	 * @param context
	 * @return value of PostalCode
	 */
	public final String getPostalCode(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.PostalCode.toString());
	}

	/**
	 * Set value of PostalCode
	 * @param postalcode
	 */
	public final void setPostalCode(String postalcode)
	{
		setPostalCode(getContext(), postalcode);
	}

	/**
	 * Set value of PostalCode
	 * @param context
	 * @param postalcode
	 */
	public final void setPostalCode(IContext context, String postalcode)
	{
		getMendixObject().setValue(context, MemberNames.PostalCode.toString(), postalcode);
	}

	/**
	 * @return value of IpAddressLocator
	 */
	public final String getIpAddressLocator()
	{
		return getIpAddressLocator(getContext());
	}

	/**
	 * @param context
	 * @return value of IpAddressLocator
	 */
	public final String getIpAddressLocator(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.IpAddressLocator.toString());
	}

	/**
	 * Set value of IpAddressLocator
	 * @param ipaddresslocator
	 */
	public final void setIpAddressLocator(String ipaddresslocator)
	{
		setIpAddressLocator(getContext(), ipaddresslocator);
	}

	/**
	 * Set value of IpAddressLocator
	 * @param context
	 * @param ipaddresslocator
	 */
	public final void setIpAddressLocator(IContext context, String ipaddresslocator)
	{
		getMendixObject().setValue(context, MemberNames.IpAddressLocator.toString(), ipaddresslocator);
	}

	/**
	 * @return value of Geography_SalesTerritory
	 */
	public final myfirstmodule.proxies.SalesTerritory getGeography_SalesTerritory() throws CoreException
	{
		return getGeography_SalesTerritory(getContext());
	}

	/**
	 * @param context
	 * @return value of Geography_SalesTerritory
	 */
	public final myfirstmodule.proxies.SalesTerritory getGeography_SalesTerritory(IContext context) throws CoreException
	{
		myfirstmodule.proxies.SalesTerritory result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Geography_SalesTerritory.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.SalesTerritory.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Geography_SalesTerritory
	 * @param geography_salesterritory
	 */
	public final void setGeography_SalesTerritory(myfirstmodule.proxies.SalesTerritory geography_salesterritory)
	{
		setGeography_SalesTerritory(getContext(), geography_salesterritory);
	}

	/**
	 * Set value of Geography_SalesTerritory
	 * @param context
	 * @param geography_salesterritory
	 */
	public final void setGeography_SalesTerritory(IContext context, myfirstmodule.proxies.SalesTerritory geography_salesterritory)
	{
		if (geography_salesterritory == null)
			getMendixObject().setValue(context, MemberNames.Geography_SalesTerritory.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Geography_SalesTerritory.toString(), geography_salesterritory.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return geographyMendixObject;
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
			final myfirstmodule.proxies.Geography that = (myfirstmodule.proxies.Geography) obj;
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
		return "MyFirstModule.Geography";
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
