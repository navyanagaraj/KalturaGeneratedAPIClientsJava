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
public class FeedDropFolderFile extends DropFolderFile {

	/**  MD5 or Sha1 encrypted string  */
    private String hash;
	/**  Path of the original Feed content XML  */
    private String feedXmlPath;

    // hash:
    public String getHash(){
        return this.hash;
    }
    public void setHash(String hash){
        this.hash = hash;
    }

    // feedXmlPath:
    public String getFeedXmlPath(){
        return this.feedXmlPath;
    }
    public void setFeedXmlPath(String feedXmlPath){
        this.feedXmlPath = feedXmlPath;
    }


    public FeedDropFolderFile() {
       super();
    }

    public FeedDropFolderFile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        hash = GsonParser.parseString(jsonObject.get("hash"));
        feedXmlPath = GsonParser.parseString(jsonObject.get("feedXmlPath"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFeedDropFolderFile");
        kparams.add("hash", this.hash);
        kparams.add("feedXmlPath", this.feedXmlPath);
        return kparams;
    }

}
