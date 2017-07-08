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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class AccessControlModifyRequestHostRegexAction extends RuleAction {

	/**  Request host regex pattern  */
    private String pattern;
	/**  Request host regex replacment  */
    private String replacement;
	/**  serverNodeId to generate replacment host from  */
    private Integer replacmenServerNodeId;

    // pattern:
    public String getPattern(){
        return this.pattern;
    }
    public void setPattern(String pattern){
        this.pattern = pattern;
    }

    // replacement:
    public String getReplacement(){
        return this.replacement;
    }
    public void setReplacement(String replacement){
        this.replacement = replacement;
    }

    // replacmenServerNodeId:
    public Integer getReplacmenServerNodeId(){
        return this.replacmenServerNodeId;
    }
    public void setReplacmenServerNodeId(Integer replacmenServerNodeId){
        this.replacmenServerNodeId = replacmenServerNodeId;
    }


    public AccessControlModifyRequestHostRegexAction() {
       super();
    }

    public AccessControlModifyRequestHostRegexAction(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        pattern = GsonParser.parseString(jsonObject.get("pattern"));
        replacement = GsonParser.parseString(jsonObject.get("replacement"));
        replacmenServerNodeId = GsonParser.parseInt(jsonObject.get("replacmenServerNodeId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAccessControlModifyRequestHostRegexAction");
        kparams.add("pattern", this.pattern);
        kparams.add("replacement", this.replacement);
        kparams.add("replacmenServerNodeId", this.replacmenServerNodeId);
        return kparams;
    }

}
