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
package com.cloud.utils.component;


import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.cloud.utils.mgmt.ManagementBean;

public interface ComponentLocatorMBean extends ManagementBean {

    /**
     * @return the list of adapters accessible by this component locator.
     **/
    Map<String, List<String>> getAdapterNames();

    /**
     * @return the list of managers accessible by this component locator.
     **/
    Collection<String> getManagerNames();
    
    /**
     * @return the list of DAOs accessible by this component locator.
     */
    Collection<String> getDaoNames();

}
