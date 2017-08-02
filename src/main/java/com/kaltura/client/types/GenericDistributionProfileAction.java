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
import com.kaltura.client.enums.DistributionProtocol;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class GenericDistributionProfileAction extends ObjectBase {

    private DistributionProtocol protocol;
    private String serverUrl;
    private String serverPath;
    private String username;
    private String password;
    private Boolean ftpPassiveMode;
    private String httpFieldName;
    private String httpFileName;

    // protocol:
    public DistributionProtocol getProtocol(){
        return this.protocol;
    }
    public void setProtocol(DistributionProtocol protocol){
        this.protocol = protocol;
    }

    // serverUrl:
    public String getServerUrl(){
        return this.serverUrl;
    }
    public void setServerUrl(String serverUrl){
        this.serverUrl = serverUrl;
    }

    // serverPath:
    public String getServerPath(){
        return this.serverPath;
    }
    public void setServerPath(String serverPath){
        this.serverPath = serverPath;
    }

    // username:
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // password:
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // ftpPassiveMode:
    public Boolean getFtpPassiveMode(){
        return this.ftpPassiveMode;
    }
    public void setFtpPassiveMode(Boolean ftpPassiveMode){
        this.ftpPassiveMode = ftpPassiveMode;
    }

    // httpFieldName:
    public String getHttpFieldName(){
        return this.httpFieldName;
    }
    public void setHttpFieldName(String httpFieldName){
        this.httpFieldName = httpFieldName;
    }

    // httpFileName:
    public String getHttpFileName(){
        return this.httpFileName;
    }
    public void setHttpFileName(String httpFileName){
        this.httpFileName = httpFileName;
    }


    public GenericDistributionProfileAction() {
       super();
    }

    public GenericDistributionProfileAction(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
        serverUrl = GsonParser.parseString(jsonObject.get("serverUrl"));
        serverPath = GsonParser.parseString(jsonObject.get("serverPath"));
        username = GsonParser.parseString(jsonObject.get("username"));
        password = GsonParser.parseString(jsonObject.get("password"));
        ftpPassiveMode = GsonParser.parseBoolean(jsonObject.get("ftpPassiveMode"));
        httpFieldName = GsonParser.parseString(jsonObject.get("httpFieldName"));
        httpFileName = GsonParser.parseString(jsonObject.get("httpFileName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaGenericDistributionProfileAction");
        kparams.add("protocol", this.protocol);
        kparams.add("serverUrl", this.serverUrl);
        kparams.add("serverPath", this.serverPath);
        kparams.add("username", this.username);
        kparams.add("password", this.password);
        kparams.add("ftpPassiveMode", this.ftpPassiveMode);
        kparams.add("httpFieldName", this.httpFieldName);
        kparams.add("httpFileName", this.httpFileName);
        return kparams;
    }

}

