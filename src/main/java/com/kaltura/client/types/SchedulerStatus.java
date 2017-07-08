// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.BatchJobType;
import com.kaltura.client.enums.SchedulerStatusType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SchedulerStatus extends ObjectBase {

	/**  The id of the Category  */
    private Integer id;
	/**  The configured id of the scheduler  */
    private Integer schedulerConfiguredId;
	/**  The configured id of the job worker  */
    private Integer workerConfiguredId;
	/**  The type of the job worker.  */
    private BatchJobType workerType;
	/**  The status type  */
    private SchedulerStatusType type;
	/**  The status value  */
    private Integer value;
	/**  The id of the scheduler  */
    private Integer schedulerId;
	/**  The id of the worker  */
    private Integer workerId;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // schedulerConfiguredId:
    public Integer getSchedulerConfiguredId(){
        return this.schedulerConfiguredId;
    }
    public void setSchedulerConfiguredId(Integer schedulerConfiguredId){
        this.schedulerConfiguredId = schedulerConfiguredId;
    }

    // workerConfiguredId:
    public Integer getWorkerConfiguredId(){
        return this.workerConfiguredId;
    }
    public void setWorkerConfiguredId(Integer workerConfiguredId){
        this.workerConfiguredId = workerConfiguredId;
    }

    // workerType:
    public BatchJobType getWorkerType(){
        return this.workerType;
    }
    public void setWorkerType(BatchJobType workerType){
        this.workerType = workerType;
    }

    // type:
    public SchedulerStatusType getType(){
        return this.type;
    }
    public void setType(SchedulerStatusType type){
        this.type = type;
    }

    // value:
    public Integer getValue(){
        return this.value;
    }
    public void setValue(Integer value){
        this.value = value;
    }

    // schedulerId:
    public Integer getSchedulerId(){
        return this.schedulerId;
    }
    public void setSchedulerId(Integer schedulerId){
        this.schedulerId = schedulerId;
    }

    // workerId:
    public Integer getWorkerId(){
        return this.workerId;
    }
    public void setWorkerId(Integer workerId){
        this.workerId = workerId;
    }


    public SchedulerStatus() {
       super();
    }

    public SchedulerStatus(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        schedulerConfiguredId = GsonParser.parseInt(jsonObject.get("schedulerConfiguredId"));
        workerConfiguredId = GsonParser.parseInt(jsonObject.get("workerConfiguredId"));
        workerType = BatchJobType.get(GsonParser.parseString(jsonObject.get("workerType")));
        type = SchedulerStatusType.get(GsonParser.parseInt(jsonObject.get("type")));
        value = GsonParser.parseInt(jsonObject.get("value"));
        schedulerId = GsonParser.parseInt(jsonObject.get("schedulerId"));
        workerId = GsonParser.parseInt(jsonObject.get("workerId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSchedulerStatus");
        kparams.add("schedulerConfiguredId", this.schedulerConfiguredId);
        kparams.add("workerConfiguredId", this.workerConfiguredId);
        kparams.add("workerType", this.workerType);
        kparams.add("type", this.type);
        kparams.add("value", this.value);
        return kparams;
    }

}
