// This file was generated by Mendix Business Modeler 4.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class User
{
	private final IMendixObject userMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "System.User";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Password("Password"),
		LastLogin("LastLogin"),
		Blocked("Blocked"),
		Active("Active"),
		FailedLogins("FailedLogins"),
		WebServiceUser("WebServiceUser"),
		IsAnonymous("IsAnonymous"),
		UserRoles("System.UserRoles"),
		User_Language("System.User_Language"),
		User_TimeZone("System.User_TimeZone");

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

	public User(IContext context)
	{
		this(context, Core.instantiate(context, "System.User"));
	}

	protected User(IContext context, IMendixObject userMendixObject)
	{
		if (userMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("System.User", userMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a System.User");

		this.userMendixObject = userMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new User(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static system.proxies.User create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "System.User");
		return new system.proxies.User(context, mendixObject);
	}

	/**
	 * @deprecated Use 'User.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static system.proxies.User initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return system.proxies.User.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static system.proxies.User initialize(IContext context, IMendixObject mendixObject)
	{
		if (Core.isSubClassOf("Administration.Account", mendixObject.getType()))
			return administration.proxies.Account.initialize(context, mendixObject);

		return new system.proxies.User(context, mendixObject);
	}

	public static system.proxies.User load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return system.proxies.User.initialize(context, mendixObject);
	}

	public static java.util.List<? extends system.proxies.User> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<system.proxies.User> result = new java.util.ArrayList<system.proxies.User>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//System.User" + xpathConstraint))
			result.add(system.proxies.User.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * Set value of Password
	 * @param password
	 */
	public final void setPassword(String password)
	{
		setPassword(getContext(), password);
	}

	/**
	 * Set value of Password
	 * @param context
	 * @param password
	 */
	public final void setPassword(IContext context, String password)
	{
		getMendixObject().setValue(context, MemberNames.Password.toString(), password);
	}

	/**
	 * @return value of LastLogin
	 */
	public final java.util.Date getLastLogin()
	{
		return getLastLogin(getContext());
	}

	/**
	 * @param context
	 * @return value of LastLogin
	 */
	public final java.util.Date getLastLogin(IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastLogin.toString());
	}

	/**
	 * Set value of LastLogin
	 * @param lastlogin
	 */
	public final void setLastLogin(java.util.Date lastlogin)
	{
		setLastLogin(getContext(), lastlogin);
	}

	/**
	 * Set value of LastLogin
	 * @param context
	 * @param lastlogin
	 */
	public final void setLastLogin(IContext context, java.util.Date lastlogin)
	{
		getMendixObject().setValue(context, MemberNames.LastLogin.toString(), lastlogin);
	}

	/**
	 * @return value of Blocked
	 */
	public final Boolean getBlocked()
	{
		return getBlocked(getContext());
	}

	/**
	 * @param context
	 * @return value of Blocked
	 */
	public final Boolean getBlocked(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Blocked.toString());
	}

	/**
	 * Set value of Blocked
	 * @param blocked
	 */
	public final void setBlocked(Boolean blocked)
	{
		setBlocked(getContext(), blocked);
	}

	/**
	 * Set value of Blocked
	 * @param context
	 * @param blocked
	 */
	public final void setBlocked(IContext context, Boolean blocked)
	{
		getMendixObject().setValue(context, MemberNames.Blocked.toString(), blocked);
	}

	/**
	 * @return value of Active
	 */
	public final Boolean getActive()
	{
		return getActive(getContext());
	}

	/**
	 * @param context
	 * @return value of Active
	 */
	public final Boolean getActive(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.Active.toString());
	}

	/**
	 * Set value of Active
	 * @param active
	 */
	public final void setActive(Boolean active)
	{
		setActive(getContext(), active);
	}

	/**
	 * Set value of Active
	 * @param context
	 * @param active
	 */
	public final void setActive(IContext context, Boolean active)
	{
		getMendixObject().setValue(context, MemberNames.Active.toString(), active);
	}

	/**
	 * @return value of FailedLogins
	 */
	public final Integer getFailedLogins()
	{
		return getFailedLogins(getContext());
	}

	/**
	 * @param context
	 * @return value of FailedLogins
	 */
	public final Integer getFailedLogins(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.FailedLogins.toString());
	}

	/**
	 * Set value of FailedLogins
	 * @param failedlogins
	 */
	public final void setFailedLogins(Integer failedlogins)
	{
		setFailedLogins(getContext(), failedlogins);
	}

	/**
	 * Set value of FailedLogins
	 * @param context
	 * @param failedlogins
	 */
	public final void setFailedLogins(IContext context, Integer failedlogins)
	{
		getMendixObject().setValue(context, MemberNames.FailedLogins.toString(), failedlogins);
	}

	/**
	 * @return value of WebServiceUser
	 */
	public final Boolean getWebServiceUser()
	{
		return getWebServiceUser(getContext());
	}

	/**
	 * @param context
	 * @return value of WebServiceUser
	 */
	public final Boolean getWebServiceUser(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.WebServiceUser.toString());
	}

	/**
	 * Set value of WebServiceUser
	 * @param webserviceuser
	 */
	public final void setWebServiceUser(Boolean webserviceuser)
	{
		setWebServiceUser(getContext(), webserviceuser);
	}

	/**
	 * Set value of WebServiceUser
	 * @param context
	 * @param webserviceuser
	 */
	public final void setWebServiceUser(IContext context, Boolean webserviceuser)
	{
		getMendixObject().setValue(context, MemberNames.WebServiceUser.toString(), webserviceuser);
	}

	/**
	 * @return value of IsAnonymous
	 */
	public final Boolean getIsAnonymous()
	{
		return getIsAnonymous(getContext());
	}

	/**
	 * @param context
	 * @return value of IsAnonymous
	 */
	public final Boolean getIsAnonymous(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IsAnonymous.toString());
	}

	/**
	 * Set value of IsAnonymous
	 * @param isanonymous
	 */
	public final void setIsAnonymous(Boolean isanonymous)
	{
		setIsAnonymous(getContext(), isanonymous);
	}

	/**
	 * Set value of IsAnonymous
	 * @param context
	 * @param isanonymous
	 */
	public final void setIsAnonymous(IContext context, Boolean isanonymous)
	{
		getMendixObject().setValue(context, MemberNames.IsAnonymous.toString(), isanonymous);
	}

	/**
	 * @return value of UserRoles
	 */
	public final java.util.List<system.proxies.UserRole> getUserRoles() throws CoreException
	{
		return getUserRoles(getContext());
	}

	/**
	 * @param context
	 * @return value of UserRoles
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<system.proxies.UserRole> getUserRoles(IContext context) throws CoreException
	{
		java.util.List<system.proxies.UserRole> result = new java.util.ArrayList<system.proxies.UserRole>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.UserRoles.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(system.proxies.UserRole.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of UserRoles
	 * @param userroles
	 */
	public final void setUserRoles(java.util.List<system.proxies.UserRole> userroles)
	{
		setUserRoles(getContext(), userroles);
	}

	/**
	 * Set value of UserRoles
	 * @param context
	 * @param userroles
	 */
	public final void setUserRoles(IContext context, java.util.List<system.proxies.UserRole> userroles)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (system.proxies.UserRole proxyObject : userroles)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.UserRoles.toString(), identifiers);
	}

	/**
	 * @return value of User_Language
	 */
	public final system.proxies.Language getUser_Language() throws CoreException
	{
		return getUser_Language(getContext());
	}

	/**
	 * @param context
	 * @return value of User_Language
	 */
	public final system.proxies.Language getUser_Language(IContext context) throws CoreException
	{
		system.proxies.Language result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.User_Language.toString());
		if (identifier != null)
			result = system.proxies.Language.load(context, identifier);
		return result;
	}

	/**
	 * Set value of User_Language
	 * @param user_language
	 */
	public final void setUser_Language(system.proxies.Language user_language)
	{
		setUser_Language(getContext(), user_language);
	}

	/**
	 * Set value of User_Language
	 * @param context
	 * @param user_language
	 */
	public final void setUser_Language(IContext context, system.proxies.Language user_language)
	{
		if (user_language == null)
			getMendixObject().setValue(context, MemberNames.User_Language.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.User_Language.toString(), user_language.getMendixObject().getId());
	}

	/**
	 * @return value of User_TimeZone
	 */
	public final system.proxies.TimeZone getUser_TimeZone() throws CoreException
	{
		return getUser_TimeZone(getContext());
	}

	/**
	 * @param context
	 * @return value of User_TimeZone
	 */
	public final system.proxies.TimeZone getUser_TimeZone(IContext context) throws CoreException
	{
		system.proxies.TimeZone result = null;
		IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.User_TimeZone.toString());
		if (identifier != null)
			result = system.proxies.TimeZone.load(context, identifier);
		return result;
	}

	/**
	 * Set value of User_TimeZone
	 * @param user_timezone
	 */
	public final void setUser_TimeZone(system.proxies.TimeZone user_timezone)
	{
		setUser_TimeZone(getContext(), user_timezone);
	}

	/**
	 * Set value of User_TimeZone
	 * @param context
	 * @param user_timezone
	 */
	public final void setUser_TimeZone(IContext context, system.proxies.TimeZone user_timezone)
	{
		if (user_timezone == null)
			getMendixObject().setValue(context, MemberNames.User_TimeZone.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.User_TimeZone.toString(), user_timezone.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return userMendixObject;
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
			final system.proxies.User that = (system.proxies.User) obj;
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
		return "System.User";
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
