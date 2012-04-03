// Copyright 2012 Citrix Systems, Inc. Licensed under the
// Apache License, Version 2.0 (the "License"); you may not use this
// file except in compliance with the License.  Citrix Systems, Inc.
// reserves all rights not expressly granted by the License.
// You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.network;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cloud.domain.PartOf;

@Entity
@Table(name="domain_network_ref")
public class NetworkDomainVO implements PartOf {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    long id;
    
    @Column(name="domain_id")
    long domainId;
    
    @Column(name="network_id")
    long networkId;
    
    @Column(name="subdomain_access")
    Boolean subdomainAccess;

    protected NetworkDomainVO() {
    }
    
    public NetworkDomainVO(long networkId, long domainId, Boolean subdomainAccess) {
        this.networkId = networkId;
        this.domainId = domainId;
        this.subdomainAccess = subdomainAccess;
    }
    
    @Override
    public long getDomainId() {
        return domainId;
    }
    
    public long getNetworkId() {
        return networkId;
    }

	public Boolean isSubdomainAccess() {
		return subdomainAccess;
	}
}
