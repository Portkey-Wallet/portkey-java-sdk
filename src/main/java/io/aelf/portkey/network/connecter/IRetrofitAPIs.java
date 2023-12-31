package io.aelf.portkey.network.connecter;

import io.aelf.portkey.network.slice.account.AccountNetworkAPISlice;
import io.aelf.portkey.network.slice.common.CommonNetworkAPISlice;

/**
 * This interface is just a representation of all the API interfaces.
 * <p>
 * See those interfaces that this class has extended for more details.
 */
public interface IRetrofitAPIs extends AccountNetworkAPISlice, CommonNetworkAPISlice {
}
