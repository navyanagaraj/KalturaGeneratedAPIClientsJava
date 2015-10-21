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
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaSessionType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaInternalToolsSession extends KalturaObjectBase {
    public int partner_id = Integer.MIN_VALUE;
    public int valid_until = Integer.MIN_VALUE;
    public String partner_pattern;
    public KalturaSessionType type;
    public String error;
    public int rand = Integer.MIN_VALUE;
    public String user;
    public String privileges;

    public KalturaInternalToolsSession() {
    }

    public KalturaInternalToolsSession(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("partner_id")) {
                this.partner_id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("valid_until")) {
                this.valid_until = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partner_pattern")) {
                this.partner_pattern = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("type")) {
                this.type = KalturaSessionType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("error")) {
                this.error = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("rand")) {
                this.rand = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("user")) {
                this.user = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("privileges")) {
                this.privileges = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() throws KalturaApiException {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaInternalToolsSession");
        kparams.add("partner_id", this.partner_id);
        kparams.add("valid_until", this.valid_until);
        kparams.add("partner_pattern", this.partner_pattern);
        kparams.add("type", this.type);
        kparams.add("error", this.error);
        kparams.add("rand", this.rand);
        kparams.add("user", this.user);
        kparams.add("privileges", this.privileges);
        return kparams;
    }

}

