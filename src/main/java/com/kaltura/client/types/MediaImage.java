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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Image details  */
@SuppressWarnings("serial")
public class MediaImage extends ObjectBase {

	/**  Image aspect ratio  */
    private String ratio;
	/**  Image width  */
    private Integer width;
	/**  Image height  */
    private Integer height;
	/**  Image URL  */
    private String url;
	/**  Image Version  */
    private Integer version;
	/**  Image ID  */
    private String id;
	/**  Determined whether image was taken from default configuration or not  */
    private Boolean isDefault;

    // ratio:
    public String getRatio(){
        return this.ratio;
    }
    public void setRatio(String ratio){
        this.ratio = ratio;
    }

    // width:
    public Integer getWidth(){
        return this.width;
    }
    public void setWidth(Integer width){
        this.width = width;
    }

    // height:
    public Integer getHeight(){
        return this.height;
    }
    public void setHeight(Integer height){
        this.height = height;
    }

    // url:
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    // version:
    public Integer getVersion(){
        return this.version;
    }
    public void setVersion(Integer version){
        this.version = version;
    }

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // isDefault:
    public Boolean getIsDefault(){
        return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault){
        this.isDefault = isDefault;
    }


    public MediaImage() {
       super();
    }

    public MediaImage(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        ratio = GsonParser.parseString(jsonObject.get("ratio"));
        width = GsonParser.parseInt(jsonObject.get("width"));
        height = GsonParser.parseInt(jsonObject.get("height"));
        url = GsonParser.parseString(jsonObject.get("url"));
        version = GsonParser.parseInt(jsonObject.get("version"));
        id = GsonParser.parseString(jsonObject.get("id"));
        isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaImage");
        kparams.add("ratio", this.ratio);
        kparams.add("width", this.width);
        kparams.add("height", this.height);
        kparams.add("url", this.url);
        kparams.add("version", this.version);
        kparams.add("isDefault", this.isDefault);
        return kparams;
    }

}
