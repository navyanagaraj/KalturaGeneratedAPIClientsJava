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
package com.kaltura.client.enums;

import com.google.gson.annotations.SerializedName;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum HttpNotificationAuthenticationMethod implements EnumAsInt {
    ANYSAFE(-18),
    ANY(-17),
    BASIC(1),
    DIGEST(2),
    GSSNEGOTIATE(4),
    NTLM(8);

    private int value;

    HttpNotificationAuthenticationMethod(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static HttpNotificationAuthenticationMethod get(Integer value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over HttpNotificationAuthenticationMethod defined values and compare the inner value with the given one:
        for(HttpNotificationAuthenticationMethod item: values()) {
            if(item.getValue() == value) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return HttpNotificationAuthenticationMethod.values().length > 0 ? HttpNotificationAuthenticationMethod.values()[0]: null;
   }
}
