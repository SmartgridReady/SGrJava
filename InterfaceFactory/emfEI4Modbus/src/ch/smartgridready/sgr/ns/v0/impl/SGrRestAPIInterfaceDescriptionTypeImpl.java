/**
 */
package ch.smartgridready.sgr.ns.v0.impl;

import ch.smartgridready.sgr.ns.v0.SGRrestAPIBearerType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIAuthenticationEnumMethodType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceDescriptionType;
import ch.smartgridready.sgr.ns.v0.SGrRestAPIInterfaceSelectiontype;
import ch.smartgridready.sgr.ns.v0.SGrRestBasicType;
import ch.smartgridready.sgr.ns.v0.TPipV4genAddrType;
import ch.smartgridready.sgr.ns.v0.TPipV6genAddrType;
import ch.smartgridready.sgr.ns.v0.V0Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SGr Rest API Interface Description Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getRestAPIInterfaceSelection <em>Rest API Interface Selection</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getTrspSrvRestTCPV4outOfBox <em>Trsp Srv Rest TCPV 4out Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getTrspSrvRestTCPV6outOfBox <em>Trsp Srv Rest TCPV 6out Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getTrspSrvRestURIoutOfBox <em>Trsp Srv Rest UR Iout Of Box</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getRestAPIAuthenticationMethod <em>Rest API Authentication Method</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getRestAPIBearer <em>Rest API Bearer</em>}</li>
 *   <li>{@link ch.smartgridready.sgr.ns.v0.impl.SGrRestAPIInterfaceDescriptionTypeImpl#getRestAPIBasic <em>Rest API Basic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SGrRestAPIInterfaceDescriptionTypeImpl extends MinimalEObjectImpl.Container implements SGrRestAPIInterfaceDescriptionType {
	/**
	 * The default value of the '{@link #getRestAPIInterfaceSelection() <em>Rest API Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIInterfaceSelection()
	 * @generated
	 * @ordered
	 */
	protected static final SGrRestAPIInterfaceSelectiontype REST_API_INTERFACE_SELECTION_EDEFAULT = SGrRestAPIInterfaceSelectiontype.TRSP_SRV_REST_TCPV4;

	/**
	 * The cached value of the '{@link #getRestAPIInterfaceSelection() <em>Rest API Interface Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIInterfaceSelection()
	 * @generated
	 * @ordered
	 */
	protected SGrRestAPIInterfaceSelectiontype restAPIInterfaceSelection = REST_API_INTERFACE_SELECTION_EDEFAULT;

	/**
	 * This is true if the Rest API Interface Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restAPIInterfaceSelectionESet;

	/**
	 * The cached value of the '{@link #getTrspSrvRestTCPV4outOfBox() <em>Trsp Srv Rest TCPV 4out Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvRestTCPV4outOfBox()
	 * @generated
	 * @ordered
	 */
	protected TPipV4genAddrType trspSrvRestTCPV4outOfBox;

	/**
	 * The cached value of the '{@link #getTrspSrvRestTCPV6outOfBox() <em>Trsp Srv Rest TCPV 6out Of Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvRestTCPV6outOfBox()
	 * @generated
	 * @ordered
	 */
	protected TPipV6genAddrType trspSrvRestTCPV6outOfBox;

	/**
	 * The default value of the '{@link #getTrspSrvRestURIoutOfBox() <em>Trsp Srv Rest UR Iout Of Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvRestURIoutOfBox()
	 * @generated
	 * @ordered
	 */
	protected static final String TRSP_SRV_REST_UR_IOUT_OF_BOX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrspSrvRestURIoutOfBox() <em>Trsp Srv Rest UR Iout Of Box</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrspSrvRestURIoutOfBox()
	 * @generated
	 * @ordered
	 */
	protected String trspSrvRestURIoutOfBox = TRSP_SRV_REST_UR_IOUT_OF_BOX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestAPIAuthenticationMethod() <em>Rest API Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final SGrRestAPIAuthenticationEnumMethodType REST_API_AUTHENTICATION_METHOD_EDEFAULT = SGrRestAPIAuthenticationEnumMethodType.NO_SECURITY_SCHEME;

	/**
	 * The cached value of the '{@link #getRestAPIAuthenticationMethod() <em>Rest API Authentication Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIAuthenticationMethod()
	 * @generated
	 * @ordered
	 */
	protected SGrRestAPIAuthenticationEnumMethodType restAPIAuthenticationMethod = REST_API_AUTHENTICATION_METHOD_EDEFAULT;

	/**
	 * This is true if the Rest API Authentication Method attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean restAPIAuthenticationMethodESet;

	/**
	 * The cached value of the '{@link #getRestAPIBearer() <em>Rest API Bearer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIBearer()
	 * @generated
	 * @ordered
	 */
	protected SGRrestAPIBearerType restAPIBearer;

	/**
	 * The cached value of the '{@link #getRestAPIBasic() <em>Rest API Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestAPIBasic()
	 * @generated
	 * @ordered
	 */
	protected SGrRestBasicType restAPIBasic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SGrRestAPIInterfaceDescriptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V0Package.eINSTANCE.getSGrRestAPIInterfaceDescriptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestAPIInterfaceSelectiontype getRestAPIInterfaceSelection() {
		return restAPIInterfaceSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIInterfaceSelection(SGrRestAPIInterfaceSelectiontype newRestAPIInterfaceSelection) {
		SGrRestAPIInterfaceSelectiontype oldRestAPIInterfaceSelection = restAPIInterfaceSelection;
		restAPIInterfaceSelection = newRestAPIInterfaceSelection == null ? REST_API_INTERFACE_SELECTION_EDEFAULT : newRestAPIInterfaceSelection;
		boolean oldRestAPIInterfaceSelectionESet = restAPIInterfaceSelectionESet;
		restAPIInterfaceSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION, oldRestAPIInterfaceSelection, restAPIInterfaceSelection, !oldRestAPIInterfaceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRestAPIInterfaceSelection() {
		SGrRestAPIInterfaceSelectiontype oldRestAPIInterfaceSelection = restAPIInterfaceSelection;
		boolean oldRestAPIInterfaceSelectionESet = restAPIInterfaceSelectionESet;
		restAPIInterfaceSelection = REST_API_INTERFACE_SELECTION_EDEFAULT;
		restAPIInterfaceSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION, oldRestAPIInterfaceSelection, REST_API_INTERFACE_SELECTION_EDEFAULT, oldRestAPIInterfaceSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRestAPIInterfaceSelection() {
		return restAPIInterfaceSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPipV4genAddrType getTrspSrvRestTCPV4outOfBox() {
		return trspSrvRestTCPV4outOfBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrspSrvRestTCPV4outOfBox(TPipV4genAddrType newTrspSrvRestTCPV4outOfBox, NotificationChain msgs) {
		TPipV4genAddrType oldTrspSrvRestTCPV4outOfBox = trspSrvRestTCPV4outOfBox;
		trspSrvRestTCPV4outOfBox = newTrspSrvRestTCPV4outOfBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX, oldTrspSrvRestTCPV4outOfBox, newTrspSrvRestTCPV4outOfBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrspSrvRestTCPV4outOfBox(TPipV4genAddrType newTrspSrvRestTCPV4outOfBox) {
		if (newTrspSrvRestTCPV4outOfBox != trspSrvRestTCPV4outOfBox) {
			NotificationChain msgs = null;
			if (trspSrvRestTCPV4outOfBox != null)
				msgs = ((InternalEObject)trspSrvRestTCPV4outOfBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX, null, msgs);
			if (newTrspSrvRestTCPV4outOfBox != null)
				msgs = ((InternalEObject)newTrspSrvRestTCPV4outOfBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX, null, msgs);
			msgs = basicSetTrspSrvRestTCPV4outOfBox(newTrspSrvRestTCPV4outOfBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX, newTrspSrvRestTCPV4outOfBox, newTrspSrvRestTCPV4outOfBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPipV6genAddrType getTrspSrvRestTCPV6outOfBox() {
		return trspSrvRestTCPV6outOfBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrspSrvRestTCPV6outOfBox(TPipV6genAddrType newTrspSrvRestTCPV6outOfBox, NotificationChain msgs) {
		TPipV6genAddrType oldTrspSrvRestTCPV6outOfBox = trspSrvRestTCPV6outOfBox;
		trspSrvRestTCPV6outOfBox = newTrspSrvRestTCPV6outOfBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX, oldTrspSrvRestTCPV6outOfBox, newTrspSrvRestTCPV6outOfBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrspSrvRestTCPV6outOfBox(TPipV6genAddrType newTrspSrvRestTCPV6outOfBox) {
		if (newTrspSrvRestTCPV6outOfBox != trspSrvRestTCPV6outOfBox) {
			NotificationChain msgs = null;
			if (trspSrvRestTCPV6outOfBox != null)
				msgs = ((InternalEObject)trspSrvRestTCPV6outOfBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX, null, msgs);
			if (newTrspSrvRestTCPV6outOfBox != null)
				msgs = ((InternalEObject)newTrspSrvRestTCPV6outOfBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX, null, msgs);
			msgs = basicSetTrspSrvRestTCPV6outOfBox(newTrspSrvRestTCPV6outOfBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX, newTrspSrvRestTCPV6outOfBox, newTrspSrvRestTCPV6outOfBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrspSrvRestURIoutOfBox() {
		return trspSrvRestURIoutOfBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrspSrvRestURIoutOfBox(String newTrspSrvRestURIoutOfBox) {
		String oldTrspSrvRestURIoutOfBox = trspSrvRestURIoutOfBox;
		trspSrvRestURIoutOfBox = newTrspSrvRestURIoutOfBox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX, oldTrspSrvRestURIoutOfBox, trspSrvRestURIoutOfBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestAPIAuthenticationEnumMethodType getRestAPIAuthenticationMethod() {
		return restAPIAuthenticationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIAuthenticationMethod(SGrRestAPIAuthenticationEnumMethodType newRestAPIAuthenticationMethod) {
		SGrRestAPIAuthenticationEnumMethodType oldRestAPIAuthenticationMethod = restAPIAuthenticationMethod;
		restAPIAuthenticationMethod = newRestAPIAuthenticationMethod == null ? REST_API_AUTHENTICATION_METHOD_EDEFAULT : newRestAPIAuthenticationMethod;
		boolean oldRestAPIAuthenticationMethodESet = restAPIAuthenticationMethodESet;
		restAPIAuthenticationMethodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD, oldRestAPIAuthenticationMethod, restAPIAuthenticationMethod, !oldRestAPIAuthenticationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRestAPIAuthenticationMethod() {
		SGrRestAPIAuthenticationEnumMethodType oldRestAPIAuthenticationMethod = restAPIAuthenticationMethod;
		boolean oldRestAPIAuthenticationMethodESet = restAPIAuthenticationMethodESet;
		restAPIAuthenticationMethod = REST_API_AUTHENTICATION_METHOD_EDEFAULT;
		restAPIAuthenticationMethodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD, oldRestAPIAuthenticationMethod, REST_API_AUTHENTICATION_METHOD_EDEFAULT, oldRestAPIAuthenticationMethodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRestAPIAuthenticationMethod() {
		return restAPIAuthenticationMethodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGRrestAPIBearerType getRestAPIBearer() {
		return restAPIBearer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestAPIBearer(SGRrestAPIBearerType newRestAPIBearer, NotificationChain msgs) {
		SGRrestAPIBearerType oldRestAPIBearer = restAPIBearer;
		restAPIBearer = newRestAPIBearer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER, oldRestAPIBearer, newRestAPIBearer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIBearer(SGRrestAPIBearerType newRestAPIBearer) {
		if (newRestAPIBearer != restAPIBearer) {
			NotificationChain msgs = null;
			if (restAPIBearer != null)
				msgs = ((InternalEObject)restAPIBearer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER, null, msgs);
			if (newRestAPIBearer != null)
				msgs = ((InternalEObject)newRestAPIBearer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER, null, msgs);
			msgs = basicSetRestAPIBearer(newRestAPIBearer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER, newRestAPIBearer, newRestAPIBearer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SGrRestBasicType getRestAPIBasic() {
		return restAPIBasic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestAPIBasic(SGrRestBasicType newRestAPIBasic, NotificationChain msgs) {
		SGrRestBasicType oldRestAPIBasic = restAPIBasic;
		restAPIBasic = newRestAPIBasic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC, oldRestAPIBasic, newRestAPIBasic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestAPIBasic(SGrRestBasicType newRestAPIBasic) {
		if (newRestAPIBasic != restAPIBasic) {
			NotificationChain msgs = null;
			if (restAPIBasic != null)
				msgs = ((InternalEObject)restAPIBasic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC, null, msgs);
			if (newRestAPIBasic != null)
				msgs = ((InternalEObject)newRestAPIBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC, null, msgs);
			msgs = basicSetRestAPIBasic(newRestAPIBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC, newRestAPIBasic, newRestAPIBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX:
				return basicSetTrspSrvRestTCPV4outOfBox(null, msgs);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX:
				return basicSetTrspSrvRestTCPV6outOfBox(null, msgs);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER:
				return basicSetRestAPIBearer(null, msgs);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC:
				return basicSetRestAPIBasic(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION:
				return getRestAPIInterfaceSelection();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX:
				return getTrspSrvRestTCPV4outOfBox();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX:
				return getTrspSrvRestTCPV6outOfBox();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX:
				return getTrspSrvRestURIoutOfBox();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD:
				return getRestAPIAuthenticationMethod();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER:
				return getRestAPIBearer();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC:
				return getRestAPIBasic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION:
				setRestAPIInterfaceSelection((SGrRestAPIInterfaceSelectiontype)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX:
				setTrspSrvRestTCPV4outOfBox((TPipV4genAddrType)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX:
				setTrspSrvRestTCPV6outOfBox((TPipV6genAddrType)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX:
				setTrspSrvRestURIoutOfBox((String)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD:
				setRestAPIAuthenticationMethod((SGrRestAPIAuthenticationEnumMethodType)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER:
				setRestAPIBearer((SGRrestAPIBearerType)newValue);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC:
				setRestAPIBasic((SGrRestBasicType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION:
				unsetRestAPIInterfaceSelection();
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX:
				setTrspSrvRestTCPV4outOfBox((TPipV4genAddrType)null);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX:
				setTrspSrvRestTCPV6outOfBox((TPipV6genAddrType)null);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX:
				setTrspSrvRestURIoutOfBox(TRSP_SRV_REST_UR_IOUT_OF_BOX_EDEFAULT);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD:
				unsetRestAPIAuthenticationMethod();
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER:
				setRestAPIBearer((SGRrestAPIBearerType)null);
				return;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC:
				setRestAPIBasic((SGrRestBasicType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_INTERFACE_SELECTION:
				return isSetRestAPIInterfaceSelection();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_4OUT_OF_BOX:
				return trspSrvRestTCPV4outOfBox != null;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_TCPV_6OUT_OF_BOX:
				return trspSrvRestTCPV6outOfBox != null;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__TRSP_SRV_REST_UR_IOUT_OF_BOX:
				return TRSP_SRV_REST_UR_IOUT_OF_BOX_EDEFAULT == null ? trspSrvRestURIoutOfBox != null : !TRSP_SRV_REST_UR_IOUT_OF_BOX_EDEFAULT.equals(trspSrvRestURIoutOfBox);
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_AUTHENTICATION_METHOD:
				return isSetRestAPIAuthenticationMethod();
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BEARER:
				return restAPIBearer != null;
			case V0Package.SGR_REST_API_INTERFACE_DESCRIPTION_TYPE__REST_API_BASIC:
				return restAPIBasic != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (restAPIInterfaceSelection: ");
		if (restAPIInterfaceSelectionESet) result.append(restAPIInterfaceSelection); else result.append("<unset>");
		result.append(", trspSrvRestURIoutOfBox: ");
		result.append(trspSrvRestURIoutOfBox);
		result.append(", restAPIAuthenticationMethod: ");
		if (restAPIAuthenticationMethodESet) result.append(restAPIAuthenticationMethod); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SGrRestAPIInterfaceDescriptionTypeImpl
