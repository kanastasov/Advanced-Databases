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
public class Customer extends administration.proxies.Account
{
	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.Customer";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Customerkey("Customerkey"),
		Title("Title"),
		FirstName("FirstName"),
		MiddleName("MiddleName"),
		LastName("LastName"),
		NameStyle("NameStyle"),
		BirthDate("BirthDate"),
		MaritalStatus("MaritalStatus"),
		Suffix("Suffix"),
		Gender("Gender"),
		EmailAddress("EmailAddress"),
		YearlyIncome("YearlyIncome"),
		TotalChildren("TotalChildren"),
		NumberChildrenAtHome("NumberChildrenAtHome"),
		EnglishEducation("EnglishEducation"),
		SpanishEducation("SpanishEducation"),
		FrenchEducation("FrenchEducation"),
		EnglishOccupation("EnglishOccupation"),
		SpanishOccupation("SpanishOccupation"),
		FrenchOccupation("FrenchOccupation"),
		HouseOwnerFlag("HouseOwnerFlag"),
		NumberCarsOwned("NumberCarsOwned"),
		AddressLine1("AddressLine1"),
		AddressLine2("AddressLine2"),
		Phone("Phone"),
		DateFirstPurchase("DateFirstPurchase"),
		CommuteDistance("CommuteDistance"),
		Customer_Geography("MyFirstModule.Customer_Geography");

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

	public Customer(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.Customer"));
	}

	protected Customer(IContext context, IMendixObject customerMendixObject)
	{
		super(context, customerMendixObject);
		if (!Core.isSubClassOf("MyFirstModule.Customer", customerMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.Customer");
	}

	/**
	 * @deprecated Use 'new Customer(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Customer create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.Customer");
		return new myfirstmodule.proxies.Customer(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Customer.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Customer initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.Customer.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Customer initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Customer(context, mendixObject);
	}

	public static myfirstmodule.proxies.Customer load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Customer.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Customer> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.Customer> result = new java.util.ArrayList<myfirstmodule.proxies.Customer>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.Customer" + xpathConstraint))
			result.add(myfirstmodule.proxies.Customer.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of Customerkey
	 */
	public final Long getCustomerkey()
	{
		return getCustomerkey(getContext());
	}

	/**
	 * @param context
	 * @return value of Customerkey
	 */
	public final Long getCustomerkey(IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.Customerkey.toString());
	}

	/**
	 * Set value of Customerkey
	 * @param customerkey
	 */
	public final void setCustomerkey(Long customerkey)
	{
		setCustomerkey(getContext(), customerkey);
	}

	/**
	 * Set value of Customerkey
	 * @param context
	 * @param customerkey
	 */
	public final void setCustomerkey(IContext context, Long customerkey)
	{
		getMendixObject().setValue(context, MemberNames.Customerkey.toString(), customerkey);
	}

	/**
	 * @return value of Title
	 */
	public final String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final String getTitle(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(IContext context, String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of FirstName
	 */
	public final String getFirstName()
	{
		return getFirstName(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName
	 */
	public final String getFirstName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FirstName.toString());
	}

	/**
	 * Set value of FirstName
	 * @param firstname
	 */
	public final void setFirstName(String firstname)
	{
		setFirstName(getContext(), firstname);
	}

	/**
	 * Set value of FirstName
	 * @param context
	 * @param firstname
	 */
	public final void setFirstName(IContext context, String firstname)
	{
		getMendixObject().setValue(context, MemberNames.FirstName.toString(), firstname);
	}

	/**
	 * @return value of MiddleName
	 */
	public final String getMiddleName()
	{
		return getMiddleName(getContext());
	}

	/**
	 * @param context
	 * @return value of MiddleName
	 */
	public final String getMiddleName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.MiddleName.toString());
	}

	/**
	 * Set value of MiddleName
	 * @param middlename
	 */
	public final void setMiddleName(String middlename)
	{
		setMiddleName(getContext(), middlename);
	}

	/**
	 * Set value of MiddleName
	 * @param context
	 * @param middlename
	 */
	public final void setMiddleName(IContext context, String middlename)
	{
		getMendixObject().setValue(context, MemberNames.MiddleName.toString(), middlename);
	}

	/**
	 * @return value of LastName
	 */
	public final String getLastName()
	{
		return getLastName(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName
	 */
	public final String getLastName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.LastName.toString());
	}

	/**
	 * Set value of LastName
	 * @param lastname
	 */
	public final void setLastName(String lastname)
	{
		setLastName(getContext(), lastname);
	}

	/**
	 * Set value of LastName
	 * @param context
	 * @param lastname
	 */
	public final void setLastName(IContext context, String lastname)
	{
		getMendixObject().setValue(context, MemberNames.LastName.toString(), lastname);
	}

	/**
	 * @return value of NameStyle
	 */
	public final Boolean getNameStyle()
	{
		return getNameStyle(getContext());
	}

	/**
	 * @param context
	 * @return value of NameStyle
	 */
	public final Boolean getNameStyle(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.NameStyle.toString());
	}

	/**
	 * Set value of NameStyle
	 * @param namestyle
	 */
	public final void setNameStyle(Boolean namestyle)
	{
		setNameStyle(getContext(), namestyle);
	}

	/**
	 * Set value of NameStyle
	 * @param context
	 * @param namestyle
	 */
	public final void setNameStyle(IContext context, Boolean namestyle)
	{
		getMendixObject().setValue(context, MemberNames.NameStyle.toString(), namestyle);
	}

	/**
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate()
	{
		return getBirthDate(getContext());
	}

	/**
	 * @param context
	 * @return value of BirthDate
	 */
	public final java.util.Date getBirthDate(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.BirthDate.toString());
	}

	/**
	 * Set value of BirthDate
	 * @param birthdate
	 */
	public final void setBirthDate(java.util.Date birthdate)
	{
		setBirthDate(getContext(), birthdate);
	}

	/**
	 * Set value of BirthDate
	 * @param context
	 * @param birthdate
	 */
	public final void setBirthDate(IContext context, java.util.Date birthdate)
	{
		getMendixObject().setValue(context, MemberNames.BirthDate.toString(), birthdate);
	}

	/**
	 * @return value of MaritalStatus
	 */
	public final String getMaritalStatus()
	{
		return getMaritalStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of MaritalStatus
	 */
	public final String getMaritalStatus(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.MaritalStatus.toString());
	}

	/**
	 * Set value of MaritalStatus
	 * @param maritalstatus
	 */
	public final void setMaritalStatus(String maritalstatus)
	{
		setMaritalStatus(getContext(), maritalstatus);
	}

	/**
	 * Set value of MaritalStatus
	 * @param context
	 * @param maritalstatus
	 */
	public final void setMaritalStatus(IContext context, String maritalstatus)
	{
		getMendixObject().setValue(context, MemberNames.MaritalStatus.toString(), maritalstatus);
	}

	/**
	 * @return value of Suffix
	 */
	public final String getSuffix()
	{
		return getSuffix(getContext());
	}

	/**
	 * @param context
	 * @return value of Suffix
	 */
	public final String getSuffix(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Suffix.toString());
	}

	/**
	 * Set value of Suffix
	 * @param suffix
	 */
	public final void setSuffix(String suffix)
	{
		setSuffix(getContext(), suffix);
	}

	/**
	 * Set value of Suffix
	 * @param context
	 * @param suffix
	 */
	public final void setSuffix(IContext context, String suffix)
	{
		getMendixObject().setValue(context, MemberNames.Suffix.toString(), suffix);
	}

	/**
	 * @return value of Gender
	 */
	public final String getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final String getGender(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Gender.toString());
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(String gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(IContext context, String gender)
	{
		getMendixObject().setValue(context, MemberNames.Gender.toString(), gender);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final String getEmailAddress(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(IContext context, String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return value of YearlyIncome
	 */
	public final Double getYearlyIncome()
	{
		return getYearlyIncome(getContext());
	}

	/**
	 * @param context
	 * @return value of YearlyIncome
	 */
	public final Double getYearlyIncome(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.YearlyIncome.toString());
	}

	/**
	 * Set value of YearlyIncome
	 * @param yearlyincome
	 */
	public final void setYearlyIncome(Double yearlyincome)
	{
		setYearlyIncome(getContext(), yearlyincome);
	}

	/**
	 * Set value of YearlyIncome
	 * @param context
	 * @param yearlyincome
	 */
	public final void setYearlyIncome(IContext context, Double yearlyincome)
	{
		getMendixObject().setValue(context, MemberNames.YearlyIncome.toString(), yearlyincome);
	}

	/**
	 * @return value of TotalChildren
	 */
	public final Integer getTotalChildren()
	{
		return getTotalChildren(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalChildren
	 */
	public final Integer getTotalChildren(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.TotalChildren.toString());
	}

	/**
	 * Set value of TotalChildren
	 * @param totalchildren
	 */
	public final void setTotalChildren(Integer totalchildren)
	{
		setTotalChildren(getContext(), totalchildren);
	}

	/**
	 * Set value of TotalChildren
	 * @param context
	 * @param totalchildren
	 */
	public final void setTotalChildren(IContext context, Integer totalchildren)
	{
		getMendixObject().setValue(context, MemberNames.TotalChildren.toString(), totalchildren);
	}

	/**
	 * @return value of NumberChildrenAtHome
	 */
	public final Integer getNumberChildrenAtHome()
	{
		return getNumberChildrenAtHome(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberChildrenAtHome
	 */
	public final Integer getNumberChildrenAtHome(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.NumberChildrenAtHome.toString());
	}

	/**
	 * Set value of NumberChildrenAtHome
	 * @param numberchildrenathome
	 */
	public final void setNumberChildrenAtHome(Integer numberchildrenathome)
	{
		setNumberChildrenAtHome(getContext(), numberchildrenathome);
	}

	/**
	 * Set value of NumberChildrenAtHome
	 * @param context
	 * @param numberchildrenathome
	 */
	public final void setNumberChildrenAtHome(IContext context, Integer numberchildrenathome)
	{
		getMendixObject().setValue(context, MemberNames.NumberChildrenAtHome.toString(), numberchildrenathome);
	}

	/**
	 * @return value of EnglishEducation
	 */
	public final String getEnglishEducation()
	{
		return getEnglishEducation(getContext());
	}

	/**
	 * @param context
	 * @return value of EnglishEducation
	 */
	public final String getEnglishEducation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.EnglishEducation.toString());
	}

	/**
	 * Set value of EnglishEducation
	 * @param englisheducation
	 */
	public final void setEnglishEducation(String englisheducation)
	{
		setEnglishEducation(getContext(), englisheducation);
	}

	/**
	 * Set value of EnglishEducation
	 * @param context
	 * @param englisheducation
	 */
	public final void setEnglishEducation(IContext context, String englisheducation)
	{
		getMendixObject().setValue(context, MemberNames.EnglishEducation.toString(), englisheducation);
	}

	/**
	 * @return value of SpanishEducation
	 */
	public final String getSpanishEducation()
	{
		return getSpanishEducation(getContext());
	}

	/**
	 * @param context
	 * @return value of SpanishEducation
	 */
	public final String getSpanishEducation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SpanishEducation.toString());
	}

	/**
	 * Set value of SpanishEducation
	 * @param spanisheducation
	 */
	public final void setSpanishEducation(String spanisheducation)
	{
		setSpanishEducation(getContext(), spanisheducation);
	}

	/**
	 * Set value of SpanishEducation
	 * @param context
	 * @param spanisheducation
	 */
	public final void setSpanishEducation(IContext context, String spanisheducation)
	{
		getMendixObject().setValue(context, MemberNames.SpanishEducation.toString(), spanisheducation);
	}

	/**
	 * @return value of FrenchEducation
	 */
	public final String getFrenchEducation()
	{
		return getFrenchEducation(getContext());
	}

	/**
	 * @param context
	 * @return value of FrenchEducation
	 */
	public final String getFrenchEducation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FrenchEducation.toString());
	}

	/**
	 * Set value of FrenchEducation
	 * @param frencheducation
	 */
	public final void setFrenchEducation(String frencheducation)
	{
		setFrenchEducation(getContext(), frencheducation);
	}

	/**
	 * Set value of FrenchEducation
	 * @param context
	 * @param frencheducation
	 */
	public final void setFrenchEducation(IContext context, String frencheducation)
	{
		getMendixObject().setValue(context, MemberNames.FrenchEducation.toString(), frencheducation);
	}

	/**
	 * @return value of EnglishOccupation
	 */
	public final String getEnglishOccupation()
	{
		return getEnglishOccupation(getContext());
	}

	/**
	 * @param context
	 * @return value of EnglishOccupation
	 */
	public final String getEnglishOccupation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.EnglishOccupation.toString());
	}

	/**
	 * Set value of EnglishOccupation
	 * @param englishoccupation
	 */
	public final void setEnglishOccupation(String englishoccupation)
	{
		setEnglishOccupation(getContext(), englishoccupation);
	}

	/**
	 * Set value of EnglishOccupation
	 * @param context
	 * @param englishoccupation
	 */
	public final void setEnglishOccupation(IContext context, String englishoccupation)
	{
		getMendixObject().setValue(context, MemberNames.EnglishOccupation.toString(), englishoccupation);
	}

	/**
	 * @return value of SpanishOccupation
	 */
	public final String getSpanishOccupation()
	{
		return getSpanishOccupation(getContext());
	}

	/**
	 * @param context
	 * @return value of SpanishOccupation
	 */
	public final String getSpanishOccupation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SpanishOccupation.toString());
	}

	/**
	 * Set value of SpanishOccupation
	 * @param spanishoccupation
	 */
	public final void setSpanishOccupation(String spanishoccupation)
	{
		setSpanishOccupation(getContext(), spanishoccupation);
	}

	/**
	 * Set value of SpanishOccupation
	 * @param context
	 * @param spanishoccupation
	 */
	public final void setSpanishOccupation(IContext context, String spanishoccupation)
	{
		getMendixObject().setValue(context, MemberNames.SpanishOccupation.toString(), spanishoccupation);
	}

	/**
	 * @return value of FrenchOccupation
	 */
	public final String getFrenchOccupation()
	{
		return getFrenchOccupation(getContext());
	}

	/**
	 * @param context
	 * @return value of FrenchOccupation
	 */
	public final String getFrenchOccupation(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.FrenchOccupation.toString());
	}

	/**
	 * Set value of FrenchOccupation
	 * @param frenchoccupation
	 */
	public final void setFrenchOccupation(String frenchoccupation)
	{
		setFrenchOccupation(getContext(), frenchoccupation);
	}

	/**
	 * Set value of FrenchOccupation
	 * @param context
	 * @param frenchoccupation
	 */
	public final void setFrenchOccupation(IContext context, String frenchoccupation)
	{
		getMendixObject().setValue(context, MemberNames.FrenchOccupation.toString(), frenchoccupation);
	}

	/**
	 * @return value of HouseOwnerFlag
	 */
	public final String getHouseOwnerFlag()
	{
		return getHouseOwnerFlag(getContext());
	}

	/**
	 * @param context
	 * @return value of HouseOwnerFlag
	 */
	public final String getHouseOwnerFlag(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.HouseOwnerFlag.toString());
	}

	/**
	 * Set value of HouseOwnerFlag
	 * @param houseownerflag
	 */
	public final void setHouseOwnerFlag(String houseownerflag)
	{
		setHouseOwnerFlag(getContext(), houseownerflag);
	}

	/**
	 * Set value of HouseOwnerFlag
	 * @param context
	 * @param houseownerflag
	 */
	public final void setHouseOwnerFlag(IContext context, String houseownerflag)
	{
		getMendixObject().setValue(context, MemberNames.HouseOwnerFlag.toString(), houseownerflag);
	}

	/**
	 * @return value of NumberCarsOwned
	 */
	public final Integer getNumberCarsOwned()
	{
		return getNumberCarsOwned(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberCarsOwned
	 */
	public final Integer getNumberCarsOwned(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.NumberCarsOwned.toString());
	}

	/**
	 * Set value of NumberCarsOwned
	 * @param numbercarsowned
	 */
	public final void setNumberCarsOwned(Integer numbercarsowned)
	{
		setNumberCarsOwned(getContext(), numbercarsowned);
	}

	/**
	 * Set value of NumberCarsOwned
	 * @param context
	 * @param numbercarsowned
	 */
	public final void setNumberCarsOwned(IContext context, Integer numbercarsowned)
	{
		getMendixObject().setValue(context, MemberNames.NumberCarsOwned.toString(), numbercarsowned);
	}

	/**
	 * @return value of AddressLine1
	 */
	public final String getAddressLine1()
	{
		return getAddressLine1(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressLine1
	 */
	public final String getAddressLine1(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.AddressLine1.toString());
	}

	/**
	 * Set value of AddressLine1
	 * @param addressline1
	 */
	public final void setAddressLine1(String addressline1)
	{
		setAddressLine1(getContext(), addressline1);
	}

	/**
	 * Set value of AddressLine1
	 * @param context
	 * @param addressline1
	 */
	public final void setAddressLine1(IContext context, String addressline1)
	{
		getMendixObject().setValue(context, MemberNames.AddressLine1.toString(), addressline1);
	}

	/**
	 * @return value of AddressLine2
	 */
	public final String getAddressLine2()
	{
		return getAddressLine2(getContext());
	}

	/**
	 * @param context
	 * @return value of AddressLine2
	 */
	public final String getAddressLine2(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.AddressLine2.toString());
	}

	/**
	 * Set value of AddressLine2
	 * @param addressline2
	 */
	public final void setAddressLine2(String addressline2)
	{
		setAddressLine2(getContext(), addressline2);
	}

	/**
	 * Set value of AddressLine2
	 * @param context
	 * @param addressline2
	 */
	public final void setAddressLine2(IContext context, String addressline2)
	{
		getMendixObject().setValue(context, MemberNames.AddressLine2.toString(), addressline2);
	}

	/**
	 * @return value of Phone
	 */
	public final String getPhone()
	{
		return getPhone(getContext());
	}

	/**
	 * @param context
	 * @return value of Phone
	 */
	public final String getPhone(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Phone.toString());
	}

	/**
	 * Set value of Phone
	 * @param phone
	 */
	public final void setPhone(String phone)
	{
		setPhone(getContext(), phone);
	}

	/**
	 * Set value of Phone
	 * @param context
	 * @param phone
	 */
	public final void setPhone(IContext context, String phone)
	{
		getMendixObject().setValue(context, MemberNames.Phone.toString(), phone);
	}

	/**
	 * @return value of DateFirstPurchase
	 */
	public final java.util.Date getDateFirstPurchase()
	{
		return getDateFirstPurchase(getContext());
	}

	/**
	 * @param context
	 * @return value of DateFirstPurchase
	 */
	public final java.util.Date getDateFirstPurchase(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateFirstPurchase.toString());
	}

	/**
	 * Set value of DateFirstPurchase
	 * @param datefirstpurchase
	 */
	public final void setDateFirstPurchase(java.util.Date datefirstpurchase)
	{
		setDateFirstPurchase(getContext(), datefirstpurchase);
	}

	/**
	 * Set value of DateFirstPurchase
	 * @param context
	 * @param datefirstpurchase
	 */
	public final void setDateFirstPurchase(IContext context, java.util.Date datefirstpurchase)
	{
		getMendixObject().setValue(context, MemberNames.DateFirstPurchase.toString(), datefirstpurchase);
	}

	/**
	 * @return value of CommuteDistance
	 */
	public final String getCommuteDistance()
	{
		return getCommuteDistance(getContext());
	}

	/**
	 * @param context
	 * @return value of CommuteDistance
	 */
	public final String getCommuteDistance(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CommuteDistance.toString());
	}

	/**
	 * Set value of CommuteDistance
	 * @param commutedistance
	 */
	public final void setCommuteDistance(String commutedistance)
	{
		setCommuteDistance(getContext(), commutedistance);
	}

	/**
	 * Set value of CommuteDistance
	 * @param context
	 * @param commutedistance
	 */
	public final void setCommuteDistance(IContext context, String commutedistance)
	{
		getMendixObject().setValue(context, MemberNames.CommuteDistance.toString(), commutedistance);
	}

	/**
	 * @return value of Customer_Geography
	 */
	public final myfirstmodule.proxies.Geography getCustomer_Geography() throws CoreException
	{
		return getCustomer_Geography(getContext());
	}

	/**
	 * @param context
	 * @return value of Customer_Geography
	 */
	public final myfirstmodule.proxies.Geography getCustomer_Geography(IContext context) throws CoreException
	{
		myfirstmodule.proxies.Geography result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Customer_Geography.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Geography.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Customer_Geography
	 * @param customer_geography
	 */
	public final void setCustomer_Geography(myfirstmodule.proxies.Geography customer_geography)
	{
		setCustomer_Geography(getContext(), customer_geography);
	}

	/**
	 * Set value of Customer_Geography
	 * @param context
	 * @param customer_geography
	 */
	public final void setCustomer_Geography(IContext context, myfirstmodule.proxies.Geography customer_geography)
	{
		if (customer_geography == null)
			getMendixObject().setValue(context, MemberNames.Customer_Geography.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Customer_Geography.toString(), customer_geography.getMendixObject().getId());
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Customer that = (myfirstmodule.proxies.Customer) obj;
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
		return "MyFirstModule.Customer";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().getGuid();
	}
}
