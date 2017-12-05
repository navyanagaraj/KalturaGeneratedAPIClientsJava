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
import com.kaltura.client.enums.CuePointType;
import com.kaltura.client.enums.ESearchCuePointFieldName;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchCuePointItem.Tokenizer.class)
public class ESearchCuePointItem extends ESearchItem {
	
	public interface Tokenizer extends ESearchItem.Tokenizer {
		String fieldName();
		String cuePointType();
	}

	private ESearchCuePointFieldName fieldName;
	private CuePointType cuePointType;

	// fieldName:
	public ESearchCuePointFieldName getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(ESearchCuePointFieldName fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// cuePointType:
	public CuePointType getCuePointType(){
		return this.cuePointType;
	}
	public void setCuePointType(CuePointType cuePointType){
		this.cuePointType = cuePointType;
	}

	public void cuePointType(String multirequestToken){
		setToken("cuePointType", multirequestToken);
	}


	public ESearchCuePointItem() {
		super();
	}

	public ESearchCuePointItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = ESearchCuePointFieldName.get(GsonParser.parseString(jsonObject.get("fieldName")));
		cuePointType = CuePointType.get(GsonParser.parseString(jsonObject.get("cuePointType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchCuePointItem");
		kparams.add("fieldName", this.fieldName);
		kparams.add("cuePointType", this.cuePointType);
		return kparams;
	}

}

