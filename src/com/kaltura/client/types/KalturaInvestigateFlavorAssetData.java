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
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 07 Jul 15 06:26:05 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaInvestigateFlavorAssetData extends KalturaObjectBase {
    public KalturaFlavorAsset flavorAsset;
    public KalturaFileSyncListResponse fileSyncs;
    public KalturaMediaInfoListResponse mediaInfos;
    public KalturaFlavorParams flavorParams;
    public KalturaFlavorParamsOutputListResponse flavorParamsOutputs;

    public KalturaInvestigateFlavorAssetData() {
    }

    public KalturaInvestigateFlavorAssetData(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            if (nodeName.equals("flavorAsset")) {
                this.flavorAsset = ParseUtils.parseObject(KalturaFlavorAsset.class, aNode);
                continue;
            } else if (nodeName.equals("fileSyncs")) {
                this.fileSyncs = ParseUtils.parseObject(KalturaFileSyncListResponse.class, aNode);
                continue;
            } else if (nodeName.equals("mediaInfos")) {
                this.mediaInfos = ParseUtils.parseObject(KalturaMediaInfoListResponse.class, aNode);
                continue;
            } else if (nodeName.equals("flavorParams")) {
                this.flavorParams = ParseUtils.parseObject(KalturaFlavorParams.class, aNode);
                continue;
            } else if (nodeName.equals("flavorParamsOutputs")) {
                this.flavorParamsOutputs = ParseUtils.parseObject(KalturaFlavorParamsOutputListResponse.class, aNode);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaInvestigateFlavorAssetData");
        return kparams;
    }

}
