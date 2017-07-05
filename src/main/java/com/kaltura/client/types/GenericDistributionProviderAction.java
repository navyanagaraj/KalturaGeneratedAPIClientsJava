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
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.enums.GenericDistributionProviderStatus;
import com.kaltura.client.enums.GenericDistributionProviderParser;
import com.kaltura.client.enums.DistributionProtocol;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class GenericDistributionProviderAction extends ObjectBase {

	/**  Auto generated  */
    private Integer id;
	/**  Generic distribution provider action creation date as Unix timestamp (In
	  seconds)  */
    private Integer createdAt;
	/**  Generic distribution provider action last update date as Unix timestamp (In
	  seconds)  */
    private Integer updatedAt;
    private Integer genericDistributionProviderId;
    private DistributionAction action;
    private GenericDistributionProviderStatus status;
    private GenericDistributionProviderParser resultsParser;
    private DistributionProtocol protocol;
    private String serverAddress;
    private String remotePath;
    private String remoteUsername;
    private String remotePassword;
    private String editableFields;
    private String mandatoryFields;
    private String mrssTransformer;
    private String mrssValidator;
    private String resultsTransformer;

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

    // genericDistributionProviderId:
    public Integer getGenericDistributionProviderId(){
        return this.genericDistributionProviderId;
    }
    public void setGenericDistributionProviderId(Integer genericDistributionProviderId){
        this.genericDistributionProviderId = genericDistributionProviderId;
    }

    // action:
    public DistributionAction getAction(){
        return this.action;
    }
    public void setAction(DistributionAction action){
        this.action = action;
    }

    // status:
    public GenericDistributionProviderStatus getStatus(){
        return this.status;
    }
    public void setStatus(GenericDistributionProviderStatus status){
        this.status = status;
    }

    // resultsParser:
    public GenericDistributionProviderParser getResultsParser(){
        return this.resultsParser;
    }
    public void setResultsParser(GenericDistributionProviderParser resultsParser){
        this.resultsParser = resultsParser;
    }

    // protocol:
    public DistributionProtocol getProtocol(){
        return this.protocol;
    }
    public void setProtocol(DistributionProtocol protocol){
        this.protocol = protocol;
    }

    // serverAddress:
    public String getServerAddress(){
        return this.serverAddress;
    }
    public void setServerAddress(String serverAddress){
        this.serverAddress = serverAddress;
    }

    // remotePath:
    public String getRemotePath(){
        return this.remotePath;
    }
    public void setRemotePath(String remotePath){
        this.remotePath = remotePath;
    }

    // remoteUsername:
    public String getRemoteUsername(){
        return this.remoteUsername;
    }
    public void setRemoteUsername(String remoteUsername){
        this.remoteUsername = remoteUsername;
    }

    // remotePassword:
    public String getRemotePassword(){
        return this.remotePassword;
    }
    public void setRemotePassword(String remotePassword){
        this.remotePassword = remotePassword;
    }

    // editableFields:
    public String getEditableFields(){
        return this.editableFields;
    }
    public void setEditableFields(String editableFields){
        this.editableFields = editableFields;
    }

    // mandatoryFields:
    public String getMandatoryFields(){
        return this.mandatoryFields;
    }
    public void setMandatoryFields(String mandatoryFields){
        this.mandatoryFields = mandatoryFields;
    }

    // mrssTransformer:
    public String getMrssTransformer(){
        return this.mrssTransformer;
    }
    public void setMrssTransformer(String mrssTransformer){
        this.mrssTransformer = mrssTransformer;
    }

    // mrssValidator:
    public String getMrssValidator(){
        return this.mrssValidator;
    }
    public void setMrssValidator(String mrssValidator){
        this.mrssValidator = mrssValidator;
    }

    // resultsTransformer:
    public String getResultsTransformer(){
        return this.resultsTransformer;
    }
    public void setResultsTransformer(String resultsTransformer){
        this.resultsTransformer = resultsTransformer;
    }


    public GenericDistributionProviderAction() {
       super();
    }

    public GenericDistributionProviderAction(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        genericDistributionProviderId = GsonParser.parseInt(jsonObject.get("genericDistributionProviderId"));
        action = DistributionAction.get(GsonParser.parseInt(jsonObject.get("action")));
        status = GenericDistributionProviderStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        resultsParser = GenericDistributionProviderParser.get(GsonParser.parseInt(jsonObject.get("resultsParser")));
        protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
        serverAddress = GsonParser.parseString(jsonObject.get("serverAddress"));
        remotePath = GsonParser.parseString(jsonObject.get("remotePath"));
        remoteUsername = GsonParser.parseString(jsonObject.get("remoteUsername"));
        remotePassword = GsonParser.parseString(jsonObject.get("remotePassword"));
        editableFields = GsonParser.parseString(jsonObject.get("editableFields"));
        mandatoryFields = GsonParser.parseString(jsonObject.get("mandatoryFields"));
        mrssTransformer = GsonParser.parseString(jsonObject.get("mrssTransformer"));
        mrssValidator = GsonParser.parseString(jsonObject.get("mrssValidator"));
        resultsTransformer = GsonParser.parseString(jsonObject.get("resultsTransformer"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaGenericDistributionProviderAction");
        kparams.add("genericDistributionProviderId", this.genericDistributionProviderId);
        kparams.add("action", this.action);
        kparams.add("resultsParser", this.resultsParser);
        kparams.add("protocol", this.protocol);
        kparams.add("serverAddress", this.serverAddress);
        kparams.add("remotePath", this.remotePath);
        kparams.add("remoteUsername", this.remoteUsername);
        kparams.add("remotePassword", this.remotePassword);
        kparams.add("editableFields", this.editableFields);
        kparams.add("mandatoryFields", this.mandatoryFields);
        return kparams;
    }

}

