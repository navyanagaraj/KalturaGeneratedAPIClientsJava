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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.VirusFoundAction;
import com.kaltura.client.enums.VirusScanEngineType;
import com.kaltura.client.enums.VirusScanProfileStatus;
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class VirusScanProfile extends ObjectBase {

    private Integer id;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer partnerId;
    private String name;
    private VirusScanProfileStatus status;
    private VirusScanEngineType engineType;
    private BaseEntryFilter entryFilter;
    private VirusFoundAction actionIfInfected;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // status:
    public VirusScanProfileStatus getStatus(){
        return this.status;
    }
    public void setStatus(VirusScanProfileStatus status){
        this.status = status;
    }

    // engineType:
    public VirusScanEngineType getEngineType(){
        return this.engineType;
    }
    public void setEngineType(VirusScanEngineType engineType){
        this.engineType = engineType;
    }

    // entryFilter:
    public BaseEntryFilter getEntryFilter(){
        return this.entryFilter;
    }
    public void setEntryFilter(BaseEntryFilter entryFilter){
        this.entryFilter = entryFilter;
    }

    // actionIfInfected:
    public VirusFoundAction getActionIfInfected(){
        return this.actionIfInfected;
    }
    public void setActionIfInfected(VirusFoundAction actionIfInfected){
        this.actionIfInfected = actionIfInfected;
    }


    public VirusScanProfile() {
       super();
    }

    public VirusScanProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        status = VirusScanProfileStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        engineType = VirusScanEngineType.get(GsonParser.parseString(jsonObject.get("engineType")));
        entryFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("entryFilter"), BaseEntryFilter.class);
        actionIfInfected = VirusFoundAction.get(GsonParser.parseInt(jsonObject.get("actionIfInfected")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaVirusScanProfile");
        kparams.add("name", this.name);
        kparams.add("status", this.status);
        kparams.add("engineType", this.engineType);
        kparams.add("entryFilter", this.entryFilter);
        kparams.add("actionIfInfected", this.actionIfInfected);
        return kparams;
    }

}

