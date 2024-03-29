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
public class InternetSales
{
	private final IMendixObject internetSalesMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.InternetSales";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SakesOrderNumber("SakesOrderNumber"),
		SalesOrderLineNumber("SalesOrderLineNumber"),
		RevisionNumber("RevisionNumber"),
		OrderQuantity("OrderQuantity"),
		UnitPrice("UnitPrice"),
		ExtendedAmount("ExtendedAmount"),
		UnitPriceDiscountPct("UnitPriceDiscountPct"),
		DiscountAmount("DiscountAmount"),
		ProductStandardCost("ProductStandardCost"),
		TotalProductCost("TotalProductCost"),
		SalesAmount("SalesAmount"),
		TaxAmt("TaxAmt"),
		Freight("Freight"),
		CarrierTrackingNumber("CarrierTrackingNumber"),
		CustomerPONumber("CustomerPONumber"),
		OrderDate("OrderDate"),
		DueDate("DueDate"),
		ShipDate("ShipDate"),
		InternetSales_SalesTerritory("MyFirstModule.InternetSales_SalesTerritory"),
		InternetSales_Currency("MyFirstModule.InternetSales_Currency"),
		InternetSales_Customer("MyFirstModule.InternetSales_Customer"),
		InternetSales_Product("MyFirstModule.InternetSales_Product");

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

	public InternetSales(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.InternetSales"));
	}

	protected InternetSales(IContext context, IMendixObject internetSalesMendixObject)
	{
		if (internetSalesMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.InternetSales", internetSalesMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.InternetSales");

		this.internetSalesMendixObject = internetSalesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new InternetSales(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.InternetSales create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.InternetSales");
		return new myfirstmodule.proxies.InternetSales(context, mendixObject);
	}

	/**
	 * @deprecated Use 'InternetSales.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.InternetSales initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.InternetSales.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.InternetSales initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.InternetSales(context, mendixObject);
	}

	public static myfirstmodule.proxies.InternetSales load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.InternetSales.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.InternetSales> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.InternetSales> result = new java.util.ArrayList<myfirstmodule.proxies.InternetSales>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.InternetSales" + xpathConstraint))
			result.add(myfirstmodule.proxies.InternetSales.initialize(context, obj));
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
	 * @return value of SakesOrderNumber
	 */
	public final String getSakesOrderNumber()
	{
		return getSakesOrderNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of SakesOrderNumber
	 */
	public final String getSakesOrderNumber(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SakesOrderNumber.toString());
	}

	/**
	 * Set value of SakesOrderNumber
	 * @param sakesordernumber
	 */
	public final void setSakesOrderNumber(String sakesordernumber)
	{
		setSakesOrderNumber(getContext(), sakesordernumber);
	}

	/**
	 * Set value of SakesOrderNumber
	 * @param context
	 * @param sakesordernumber
	 */
	public final void setSakesOrderNumber(IContext context, String sakesordernumber)
	{
		getMendixObject().setValue(context, MemberNames.SakesOrderNumber.toString(), sakesordernumber);
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
	 * @return value of RevisionNumber
	 */
	public final Integer getRevisionNumber()
	{
		return getRevisionNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of RevisionNumber
	 */
	public final Integer getRevisionNumber(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.RevisionNumber.toString());
	}

	/**
	 * Set value of RevisionNumber
	 * @param revisionnumber
	 */
	public final void setRevisionNumber(Integer revisionnumber)
	{
		setRevisionNumber(getContext(), revisionnumber);
	}

	/**
	 * Set value of RevisionNumber
	 * @param context
	 * @param revisionnumber
	 */
	public final void setRevisionNumber(IContext context, Integer revisionnumber)
	{
		getMendixObject().setValue(context, MemberNames.RevisionNumber.toString(), revisionnumber);
	}

	/**
	 * @return value of OrderQuantity
	 */
	public final Integer getOrderQuantity()
	{
		return getOrderQuantity(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderQuantity
	 */
	public final Integer getOrderQuantity(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.OrderQuantity.toString());
	}

	/**
	 * Set value of OrderQuantity
	 * @param orderquantity
	 */
	public final void setOrderQuantity(Integer orderquantity)
	{
		setOrderQuantity(getContext(), orderquantity);
	}

	/**
	 * Set value of OrderQuantity
	 * @param context
	 * @param orderquantity
	 */
	public final void setOrderQuantity(IContext context, Integer orderquantity)
	{
		getMendixObject().setValue(context, MemberNames.OrderQuantity.toString(), orderquantity);
	}

	/**
	 * @return value of UnitPrice
	 */
	public final Double getUnitPrice()
	{
		return getUnitPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of UnitPrice
	 */
	public final Double getUnitPrice(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.UnitPrice.toString());
	}

	/**
	 * Set value of UnitPrice
	 * @param unitprice
	 */
	public final void setUnitPrice(Double unitprice)
	{
		setUnitPrice(getContext(), unitprice);
	}

	/**
	 * Set value of UnitPrice
	 * @param context
	 * @param unitprice
	 */
	public final void setUnitPrice(IContext context, Double unitprice)
	{
		getMendixObject().setValue(context, MemberNames.UnitPrice.toString(), unitprice);
	}

	/**
	 * @return value of ExtendedAmount
	 */
	public final Double getExtendedAmount()
	{
		return getExtendedAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of ExtendedAmount
	 */
	public final Double getExtendedAmount(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.ExtendedAmount.toString());
	}

	/**
	 * Set value of ExtendedAmount
	 * @param extendedamount
	 */
	public final void setExtendedAmount(Double extendedamount)
	{
		setExtendedAmount(getContext(), extendedamount);
	}

	/**
	 * Set value of ExtendedAmount
	 * @param context
	 * @param extendedamount
	 */
	public final void setExtendedAmount(IContext context, Double extendedamount)
	{
		getMendixObject().setValue(context, MemberNames.ExtendedAmount.toString(), extendedamount);
	}

	/**
	 * @return value of UnitPriceDiscountPct
	 */
	public final Double getUnitPriceDiscountPct()
	{
		return getUnitPriceDiscountPct(getContext());
	}

	/**
	 * @param context
	 * @return value of UnitPriceDiscountPct
	 */
	public final Double getUnitPriceDiscountPct(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.UnitPriceDiscountPct.toString());
	}

	/**
	 * Set value of UnitPriceDiscountPct
	 * @param unitpricediscountpct
	 */
	public final void setUnitPriceDiscountPct(Double unitpricediscountpct)
	{
		setUnitPriceDiscountPct(getContext(), unitpricediscountpct);
	}

	/**
	 * Set value of UnitPriceDiscountPct
	 * @param context
	 * @param unitpricediscountpct
	 */
	public final void setUnitPriceDiscountPct(IContext context, Double unitpricediscountpct)
	{
		getMendixObject().setValue(context, MemberNames.UnitPriceDiscountPct.toString(), unitpricediscountpct);
	}

	/**
	 * @return value of DiscountAmount
	 */
	public final Double getDiscountAmount()
	{
		return getDiscountAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of DiscountAmount
	 */
	public final Double getDiscountAmount(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.DiscountAmount.toString());
	}

	/**
	 * Set value of DiscountAmount
	 * @param discountamount
	 */
	public final void setDiscountAmount(Double discountamount)
	{
		setDiscountAmount(getContext(), discountamount);
	}

	/**
	 * Set value of DiscountAmount
	 * @param context
	 * @param discountamount
	 */
	public final void setDiscountAmount(IContext context, Double discountamount)
	{
		getMendixObject().setValue(context, MemberNames.DiscountAmount.toString(), discountamount);
	}

	/**
	 * @return value of ProductStandardCost
	 */
	public final Double getProductStandardCost()
	{
		return getProductStandardCost(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductStandardCost
	 */
	public final Double getProductStandardCost(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.ProductStandardCost.toString());
	}

	/**
	 * Set value of ProductStandardCost
	 * @param productstandardcost
	 */
	public final void setProductStandardCost(Double productstandardcost)
	{
		setProductStandardCost(getContext(), productstandardcost);
	}

	/**
	 * Set value of ProductStandardCost
	 * @param context
	 * @param productstandardcost
	 */
	public final void setProductStandardCost(IContext context, Double productstandardcost)
	{
		getMendixObject().setValue(context, MemberNames.ProductStandardCost.toString(), productstandardcost);
	}

	/**
	 * @return value of TotalProductCost
	 */
	public final Double getTotalProductCost()
	{
		return getTotalProductCost(getContext());
	}

	/**
	 * @param context
	 * @return value of TotalProductCost
	 */
	public final Double getTotalProductCost(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.TotalProductCost.toString());
	}

	/**
	 * Set value of TotalProductCost
	 * @param totalproductcost
	 */
	public final void setTotalProductCost(Double totalproductcost)
	{
		setTotalProductCost(getContext(), totalproductcost);
	}

	/**
	 * Set value of TotalProductCost
	 * @param context
	 * @param totalproductcost
	 */
	public final void setTotalProductCost(IContext context, Double totalproductcost)
	{
		getMendixObject().setValue(context, MemberNames.TotalProductCost.toString(), totalproductcost);
	}

	/**
	 * @return value of SalesAmount
	 */
	public final Double getSalesAmount()
	{
		return getSalesAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of SalesAmount
	 */
	public final Double getSalesAmount(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.SalesAmount.toString());
	}

	/**
	 * Set value of SalesAmount
	 * @param salesamount
	 */
	public final void setSalesAmount(Double salesamount)
	{
		setSalesAmount(getContext(), salesamount);
	}

	/**
	 * Set value of SalesAmount
	 * @param context
	 * @param salesamount
	 */
	public final void setSalesAmount(IContext context, Double salesamount)
	{
		getMendixObject().setValue(context, MemberNames.SalesAmount.toString(), salesamount);
	}

	/**
	 * @return value of TaxAmt
	 */
	public final Double getTaxAmt()
	{
		return getTaxAmt(getContext());
	}

	/**
	 * @param context
	 * @return value of TaxAmt
	 */
	public final Double getTaxAmt(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.TaxAmt.toString());
	}

	/**
	 * Set value of TaxAmt
	 * @param taxamt
	 */
	public final void setTaxAmt(Double taxamt)
	{
		setTaxAmt(getContext(), taxamt);
	}

	/**
	 * Set value of TaxAmt
	 * @param context
	 * @param taxamt
	 */
	public final void setTaxAmt(IContext context, Double taxamt)
	{
		getMendixObject().setValue(context, MemberNames.TaxAmt.toString(), taxamt);
	}

	/**
	 * @return value of Freight
	 */
	public final Double getFreight()
	{
		return getFreight(getContext());
	}

	/**
	 * @param context
	 * @return value of Freight
	 */
	public final Double getFreight(IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.Freight.toString());
	}

	/**
	 * Set value of Freight
	 * @param freight
	 */
	public final void setFreight(Double freight)
	{
		setFreight(getContext(), freight);
	}

	/**
	 * Set value of Freight
	 * @param context
	 * @param freight
	 */
	public final void setFreight(IContext context, Double freight)
	{
		getMendixObject().setValue(context, MemberNames.Freight.toString(), freight);
	}

	/**
	 * @return value of CarrierTrackingNumber
	 */
	public final String getCarrierTrackingNumber()
	{
		return getCarrierTrackingNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of CarrierTrackingNumber
	 */
	public final String getCarrierTrackingNumber(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CarrierTrackingNumber.toString());
	}

	/**
	 * Set value of CarrierTrackingNumber
	 * @param carriertrackingnumber
	 */
	public final void setCarrierTrackingNumber(String carriertrackingnumber)
	{
		setCarrierTrackingNumber(getContext(), carriertrackingnumber);
	}

	/**
	 * Set value of CarrierTrackingNumber
	 * @param context
	 * @param carriertrackingnumber
	 */
	public final void setCarrierTrackingNumber(IContext context, String carriertrackingnumber)
	{
		getMendixObject().setValue(context, MemberNames.CarrierTrackingNumber.toString(), carriertrackingnumber);
	}

	/**
	 * @return value of CustomerPONumber
	 */
	public final String getCustomerPONumber()
	{
		return getCustomerPONumber(getContext());
	}

	/**
	 * @param context
	 * @return value of CustomerPONumber
	 */
	public final String getCustomerPONumber(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CustomerPONumber.toString());
	}

	/**
	 * Set value of CustomerPONumber
	 * @param customerponumber
	 */
	public final void setCustomerPONumber(String customerponumber)
	{
		setCustomerPONumber(getContext(), customerponumber);
	}

	/**
	 * Set value of CustomerPONumber
	 * @param context
	 * @param customerponumber
	 */
	public final void setCustomerPONumber(IContext context, String customerponumber)
	{
		getMendixObject().setValue(context, MemberNames.CustomerPONumber.toString(), customerponumber);
	}

	/**
	 * @return value of OrderDate
	 */
	public final java.util.Date getOrderDate()
	{
		return getOrderDate(getContext());
	}

	/**
	 * @param context
	 * @return value of OrderDate
	 */
	public final java.util.Date getOrderDate(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.OrderDate.toString());
	}

	/**
	 * Set value of OrderDate
	 * @param orderdate
	 */
	public final void setOrderDate(java.util.Date orderdate)
	{
		setOrderDate(getContext(), orderdate);
	}

	/**
	 * Set value of OrderDate
	 * @param context
	 * @param orderdate
	 */
	public final void setOrderDate(IContext context, java.util.Date orderdate)
	{
		getMendixObject().setValue(context, MemberNames.OrderDate.toString(), orderdate);
	}

	/**
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate()
	{
		return getDueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DueDate.toString());
	}

	/**
	 * Set value of DueDate
	 * @param duedate
	 */
	public final void setDueDate(java.util.Date duedate)
	{
		setDueDate(getContext(), duedate);
	}

	/**
	 * Set value of DueDate
	 * @param context
	 * @param duedate
	 */
	public final void setDueDate(IContext context, java.util.Date duedate)
	{
		getMendixObject().setValue(context, MemberNames.DueDate.toString(), duedate);
	}

	/**
	 * @return value of ShipDate
	 */
	public final java.util.Date getShipDate()
	{
		return getShipDate(getContext());
	}

	/**
	 * @param context
	 * @return value of ShipDate
	 */
	public final java.util.Date getShipDate(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.ShipDate.toString());
	}

	/**
	 * Set value of ShipDate
	 * @param shipdate
	 */
	public final void setShipDate(java.util.Date shipdate)
	{
		setShipDate(getContext(), shipdate);
	}

	/**
	 * Set value of ShipDate
	 * @param context
	 * @param shipdate
	 */
	public final void setShipDate(IContext context, java.util.Date shipdate)
	{
		getMendixObject().setValue(context, MemberNames.ShipDate.toString(), shipdate);
	}

	/**
	 * @return value of InternetSales_SalesTerritory
	 */
	public final myfirstmodule.proxies.SalesTerritory getInternetSales_SalesTerritory() throws CoreException
	{
		return getInternetSales_SalesTerritory(getContext());
	}

	/**
	 * @param context
	 * @return value of InternetSales_SalesTerritory
	 */
	public final myfirstmodule.proxies.SalesTerritory getInternetSales_SalesTerritory(IContext context) throws CoreException
	{
		myfirstmodule.proxies.SalesTerritory result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InternetSales_SalesTerritory.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.SalesTerritory.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InternetSales_SalesTerritory
	 * @param internetsales_salesterritory
	 */
	public final void setInternetSales_SalesTerritory(myfirstmodule.proxies.SalesTerritory internetsales_salesterritory)
	{
		setInternetSales_SalesTerritory(getContext(), internetsales_salesterritory);
	}

	/**
	 * Set value of InternetSales_SalesTerritory
	 * @param context
	 * @param internetsales_salesterritory
	 */
	public final void setInternetSales_SalesTerritory(IContext context, myfirstmodule.proxies.SalesTerritory internetsales_salesterritory)
	{
		if (internetsales_salesterritory == null)
			getMendixObject().setValue(context, MemberNames.InternetSales_SalesTerritory.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InternetSales_SalesTerritory.toString(), internetsales_salesterritory.getMendixObject().getId());
	}

	/**
	 * @return value of InternetSales_Currency
	 */
	public final myfirstmodule.proxies.Currency getInternetSales_Currency() throws CoreException
	{
		return getInternetSales_Currency(getContext());
	}

	/**
	 * @param context
	 * @return value of InternetSales_Currency
	 */
	public final myfirstmodule.proxies.Currency getInternetSales_Currency(IContext context) throws CoreException
	{
		myfirstmodule.proxies.Currency result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InternetSales_Currency.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Currency.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InternetSales_Currency
	 * @param internetsales_currency
	 */
	public final void setInternetSales_Currency(myfirstmodule.proxies.Currency internetsales_currency)
	{
		setInternetSales_Currency(getContext(), internetsales_currency);
	}

	/**
	 * Set value of InternetSales_Currency
	 * @param context
	 * @param internetsales_currency
	 */
	public final void setInternetSales_Currency(IContext context, myfirstmodule.proxies.Currency internetsales_currency)
	{
		if (internetsales_currency == null)
			getMendixObject().setValue(context, MemberNames.InternetSales_Currency.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InternetSales_Currency.toString(), internetsales_currency.getMendixObject().getId());
	}

	/**
	 * @return value of InternetSales_Customer
	 */
	public final myfirstmodule.proxies.Customer getInternetSales_Customer() throws CoreException
	{
		return getInternetSales_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of InternetSales_Customer
	 */
	public final myfirstmodule.proxies.Customer getInternetSales_Customer(IContext context) throws CoreException
	{
		myfirstmodule.proxies.Customer result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InternetSales_Customer.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InternetSales_Customer
	 * @param internetsales_customer
	 */
	public final void setInternetSales_Customer(myfirstmodule.proxies.Customer internetsales_customer)
	{
		setInternetSales_Customer(getContext(), internetsales_customer);
	}

	/**
	 * Set value of InternetSales_Customer
	 * @param context
	 * @param internetsales_customer
	 */
	public final void setInternetSales_Customer(IContext context, myfirstmodule.proxies.Customer internetsales_customer)
	{
		if (internetsales_customer == null)
			getMendixObject().setValue(context, MemberNames.InternetSales_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InternetSales_Customer.toString(), internetsales_customer.getMendixObject().getId());
	}

	/**
	 * @return value of InternetSales_Product
	 */
	public final myfirstmodule.proxies.Product getInternetSales_Product() throws CoreException
	{
		return getInternetSales_Product(getContext());
	}

	/**
	 * @param context
	 * @return value of InternetSales_Product
	 */
	public final myfirstmodule.proxies.Product getInternetSales_Product(IContext context) throws CoreException
	{
		myfirstmodule.proxies.Product result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.InternetSales_Product.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Product.load(context, identifier);
		return result;
	}

	/**
	 * Set value of InternetSales_Product
	 * @param internetsales_product
	 */
	public final void setInternetSales_Product(myfirstmodule.proxies.Product internetsales_product)
	{
		setInternetSales_Product(getContext(), internetsales_product);
	}

	/**
	 * Set value of InternetSales_Product
	 * @param context
	 * @param internetsales_product
	 */
	public final void setInternetSales_Product(IContext context, myfirstmodule.proxies.Product internetsales_product)
	{
		if (internetsales_product == null)
			getMendixObject().setValue(context, MemberNames.InternetSales_Product.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.InternetSales_Product.toString(), internetsales_product.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return internetSalesMendixObject;
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
			final myfirstmodule.proxies.InternetSales that = (myfirstmodule.proxies.InternetSales) obj;
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
		return "MyFirstModule.InternetSales";
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
