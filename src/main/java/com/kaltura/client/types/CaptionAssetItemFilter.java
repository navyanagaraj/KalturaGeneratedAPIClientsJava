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
import com.kaltura.client.enums.Language;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class CaptionAssetItemFilter extends CaptionAssetFilter {

    private String contentLike;
    private String contentMultiLikeOr;
    private String contentMultiLikeAnd;
    private String partnerDescriptionLike;
    private String partnerDescriptionMultiLikeOr;
    private String partnerDescriptionMultiLikeAnd;
    private Language languageEqual;
    private String languageIn;
    private String labelEqual;
    private String labelIn;
    private Integer startTimeGreaterThanOrEqual;
    private Integer startTimeLessThanOrEqual;
    private Integer endTimeGreaterThanOrEqual;
    private Integer endTimeLessThanOrEqual;

    // contentLike:
    public String getContentLike(){
        return this.contentLike;
    }
    public void setContentLike(String contentLike){
        this.contentLike = contentLike;
    }

    // contentMultiLikeOr:
    public String getContentMultiLikeOr(){
        return this.contentMultiLikeOr;
    }
    public void setContentMultiLikeOr(String contentMultiLikeOr){
        this.contentMultiLikeOr = contentMultiLikeOr;
    }

    // contentMultiLikeAnd:
    public String getContentMultiLikeAnd(){
        return this.contentMultiLikeAnd;
    }
    public void setContentMultiLikeAnd(String contentMultiLikeAnd){
        this.contentMultiLikeAnd = contentMultiLikeAnd;
    }

    // partnerDescriptionLike:
    public String getPartnerDescriptionLike(){
        return this.partnerDescriptionLike;
    }
    public void setPartnerDescriptionLike(String partnerDescriptionLike){
        this.partnerDescriptionLike = partnerDescriptionLike;
    }

    // partnerDescriptionMultiLikeOr:
    public String getPartnerDescriptionMultiLikeOr(){
        return this.partnerDescriptionMultiLikeOr;
    }
    public void setPartnerDescriptionMultiLikeOr(String partnerDescriptionMultiLikeOr){
        this.partnerDescriptionMultiLikeOr = partnerDescriptionMultiLikeOr;
    }

    // partnerDescriptionMultiLikeAnd:
    public String getPartnerDescriptionMultiLikeAnd(){
        return this.partnerDescriptionMultiLikeAnd;
    }
    public void setPartnerDescriptionMultiLikeAnd(String partnerDescriptionMultiLikeAnd){
        this.partnerDescriptionMultiLikeAnd = partnerDescriptionMultiLikeAnd;
    }

    // languageEqual:
    public Language getLanguageEqual(){
        return this.languageEqual;
    }
    public void setLanguageEqual(Language languageEqual){
        this.languageEqual = languageEqual;
    }

    // languageIn:
    public String getLanguageIn(){
        return this.languageIn;
    }
    public void setLanguageIn(String languageIn){
        this.languageIn = languageIn;
    }

    // labelEqual:
    public String getLabelEqual(){
        return this.labelEqual;
    }
    public void setLabelEqual(String labelEqual){
        this.labelEqual = labelEqual;
    }

    // labelIn:
    public String getLabelIn(){
        return this.labelIn;
    }
    public void setLabelIn(String labelIn){
        this.labelIn = labelIn;
    }

    // startTimeGreaterThanOrEqual:
    public Integer getStartTimeGreaterThanOrEqual(){
        return this.startTimeGreaterThanOrEqual;
    }
    public void setStartTimeGreaterThanOrEqual(Integer startTimeGreaterThanOrEqual){
        this.startTimeGreaterThanOrEqual = startTimeGreaterThanOrEqual;
    }

    // startTimeLessThanOrEqual:
    public Integer getStartTimeLessThanOrEqual(){
        return this.startTimeLessThanOrEqual;
    }
    public void setStartTimeLessThanOrEqual(Integer startTimeLessThanOrEqual){
        this.startTimeLessThanOrEqual = startTimeLessThanOrEqual;
    }

    // endTimeGreaterThanOrEqual:
    public Integer getEndTimeGreaterThanOrEqual(){
        return this.endTimeGreaterThanOrEqual;
    }
    public void setEndTimeGreaterThanOrEqual(Integer endTimeGreaterThanOrEqual){
        this.endTimeGreaterThanOrEqual = endTimeGreaterThanOrEqual;
    }

    // endTimeLessThanOrEqual:
    public Integer getEndTimeLessThanOrEqual(){
        return this.endTimeLessThanOrEqual;
    }
    public void setEndTimeLessThanOrEqual(Integer endTimeLessThanOrEqual){
        this.endTimeLessThanOrEqual = endTimeLessThanOrEqual;
    }


    public CaptionAssetItemFilter() {
       super();
    }

    public CaptionAssetItemFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        contentLike = GsonParser.parseString(jsonObject.get("contentLike"));
        contentMultiLikeOr = GsonParser.parseString(jsonObject.get("contentMultiLikeOr"));
        contentMultiLikeAnd = GsonParser.parseString(jsonObject.get("contentMultiLikeAnd"));
        partnerDescriptionLike = GsonParser.parseString(jsonObject.get("partnerDescriptionLike"));
        partnerDescriptionMultiLikeOr = GsonParser.parseString(jsonObject.get("partnerDescriptionMultiLikeOr"));
        partnerDescriptionMultiLikeAnd = GsonParser.parseString(jsonObject.get("partnerDescriptionMultiLikeAnd"));
        languageEqual = Language.get(GsonParser.parseString(jsonObject.get("languageEqual")));
        languageIn = GsonParser.parseString(jsonObject.get("languageIn"));
        labelEqual = GsonParser.parseString(jsonObject.get("labelEqual"));
        labelIn = GsonParser.parseString(jsonObject.get("labelIn"));
        startTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("startTimeGreaterThanOrEqual"));
        startTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("startTimeLessThanOrEqual"));
        endTimeGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeGreaterThanOrEqual"));
        endTimeLessThanOrEqual = GsonParser.parseInt(jsonObject.get("endTimeLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCaptionAssetItemFilter");
        kparams.add("contentLike", this.contentLike);
        kparams.add("contentMultiLikeOr", this.contentMultiLikeOr);
        kparams.add("contentMultiLikeAnd", this.contentMultiLikeAnd);
        kparams.add("partnerDescriptionLike", this.partnerDescriptionLike);
        kparams.add("partnerDescriptionMultiLikeOr", this.partnerDescriptionMultiLikeOr);
        kparams.add("partnerDescriptionMultiLikeAnd", this.partnerDescriptionMultiLikeAnd);
        kparams.add("languageEqual", this.languageEqual);
        kparams.add("languageIn", this.languageIn);
        kparams.add("labelEqual", this.labelEqual);
        kparams.add("labelIn", this.labelIn);
        kparams.add("startTimeGreaterThanOrEqual", this.startTimeGreaterThanOrEqual);
        kparams.add("startTimeLessThanOrEqual", this.startTimeLessThanOrEqual);
        kparams.add("endTimeGreaterThanOrEqual", this.endTimeGreaterThanOrEqual);
        kparams.add("endTimeLessThanOrEqual", this.endTimeLessThanOrEqual);
        return kparams;
    }

}

