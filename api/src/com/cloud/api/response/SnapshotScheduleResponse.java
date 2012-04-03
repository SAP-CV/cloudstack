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
package com.cloud.api.response;

import java.util.Date;

import com.cloud.api.IdentityProxy;
import com.cloud.serializer.Param;
import com.google.gson.annotations.SerializedName;

public class SnapshotScheduleResponse extends BaseResponse {
    @SerializedName("id") @Param(description="the ID of the snapshot schedule")
    private IdentityProxy id = new IdentityProxy("snapshot_schedule");

    @SerializedName("volumeid") @Param(description="the volume ID the snapshot schedule applied for")
    private IdentityProxy volumeId = new IdentityProxy("volumes");

    @SerializedName("snapshotpolicyid") @Param(description="the snapshot policy ID used by the snapshot schedule")
    private IdentityProxy snapshotPolicyId = new IdentityProxy("snapshot_policy");

    @SerializedName("scheduled") @Param(description="time the snapshot is scheduled to be taken")
    private Date scheduled;

    public Long getId() {
        return id.getValue();
    }

    public void setId(Long id) {
        this.id.setValue(id);
    }

    public Long getVolumeId() {
        return volumeId.getValue();
    }

    public void setVolumeId(Long volumeId) {
        this.volumeId.setValue(volumeId);
    }

    public Long getSnapshotPolicyId() {
        return snapshotPolicyId.getValue();
    }

    public void setSnapshotPolicyId(Long snapshotPolicyId) {
        this.snapshotPolicyId.setValue(snapshotPolicyId);
    }

    public Date getScheduled() {
        return scheduled;
    }

    public void setScheduled(Date scheduled) {
        this.scheduled = scheduled;
    }
}
