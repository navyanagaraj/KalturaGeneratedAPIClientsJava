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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.KalturaMetadataObjectType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sat, 30 May 15 00:16:51 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaExecuteMetadataXsltObjectTask extends KalturaObjectTask {
	/**  Metadata profile id to lookup the metadata object     */
    public int metadataProfileId = Integer.MIN_VALUE;
	/**  Metadata object type to lookup the metadata object     */
    public KalturaMetadataObjectType metadataObjectType;
	/**  The XSLT to execute     */
    public String xslt;

    public KalturaExecuteMetadataXsltObjectTask() {
    }

    public KalturaExecuteMetadataXsltObjectTask(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("metadataProfileId")) {
                this.metadataProfileId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("metadataObjectType")) {
                this.metadataObjectType = KalturaMetadataObjectType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("xslt")) {
                this.xslt = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaExecuteMetadataXsltObjectTask");
        kparams.add("metadataProfileId", this.metadataProfileId);
        kparams.add("metadataObjectType", this.metadataObjectType);
        kparams.add("xslt", this.xslt);
        return kparams;
    }

}

