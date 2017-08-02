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
import com.kaltura.client.enums.EntryDisplayInSearchType;
import com.kaltura.client.enums.EntryModerationStatus;
import com.kaltura.client.enums.EntryReplacementStatus;
import com.kaltura.client.enums.EntryStatus;
import com.kaltura.client.enums.EntryType;
import com.kaltura.client.enums.LicenseType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class BaseEntry extends ObjectBase {

	/**  Auto generated 10 characters alphanumeric string  */
    private String id;
	/**  Entry name (Min 1 chars)  */
    private String name;
	/**  Entry description  */
    private String description;
    private Integer partnerId;
	/**  The ID of the user who is the owner of this entry  */
    private String userId;
	/**  The ID of the user who created this entry  */
    private String creatorId;
	/**  Entry tags  */
    private String tags;
	/**  Entry admin tags can be updated only by administrators  */
    private String adminTags;
	/**  Comma separated list of full names of categories to which this entry belongs.
	  Only categories that don't have entitlement (privacy context) are listed, to
	  retrieve the full list of categories, use the categoryEntry.list action.  */
    private String categories;
	/**  Comma separated list of ids of categories to which this entry belongs. Only
	  categories that don't have entitlement (privacy context) are listed, to retrieve
	  the full list of categories, use the categoryEntry.list action.  */
    private String categoriesIds;
    private EntryStatus status;
	/**  Entry moderation status  */
    private EntryModerationStatus moderationStatus;
	/**  Number of moderation requests waiting for this entry  */
    private Integer moderationCount;
	/**  The type of the entry, this is auto filled by the derived entry object  */
    private EntryType type;
	/**  Entry creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Entry update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
	/**  The calculated average rank. rank = totalRank / votes  */
    private Double rank;
	/**  The sum of all rank values submitted to the baseEntry.anonymousRank action  */
    private Integer totalRank;
	/**  A count of all requests made to the baseEntry.anonymousRank action  */
    private Integer votes;
    private Integer groupId;
	/**  Can be used to store various partner related data as a string  */
    private String partnerData;
	/**  Download URL for the entry  */
    private String downloadUrl;
	/**  Indexed search text for full text search  */
    private String searchText;
	/**  License type used for this entry  */
    private LicenseType licenseType;
	/**  Version of the entry data  */
    private Integer version;
	/**  Thumbnail URL  */
    private String thumbnailUrl;
	/**  The Access Control ID assigned to this entry (null when not set, send -1 to
	  remove)  */
    private Integer accessControlId;
	/**  Entry scheduling start date (null when not set, send -1 to remove)  */
    private Integer startDate;
	/**  Entry scheduling end date (null when not set, send -1 to remove)  */
    private Integer endDate;
	/**  Entry external reference id  */
    private String referenceId;
	/**  ID of temporary entry that will replace this entry when it's approved and ready
	  for replacement  */
    private String replacingEntryId;
	/**  ID of the entry that will be replaced when the replacement approved and this
	  entry is ready  */
    private String replacedEntryId;
	/**  Status of the replacement readiness and approval  */
    private EntryReplacementStatus replacementStatus;
	/**  Can be used to store various partner related data as a numeric value  */
    private Integer partnerSortValue;
	/**  Override the default ingestion profile  */
    private Integer conversionProfileId;
	/**  IF not empty, points to an entry ID the should replace this current entry's id.  */
    private String redirectEntryId;
	/**  ID of source root entry, used for clipped, skipped and cropped entries that
	  created from another entry  */
    private String rootEntryId;
	/**  ID of source root entry, used for defining entires association  */
    private String parentEntryId;
	/**  clipping, skipping and cropping attributes that used to create this entry  */
    private List<OperationAttributes> operationAttributes;
	/**  list of user ids that are entitled to edit the entry (no server enforcement) The
	  difference between entitledUsersEdit and entitledUsersPublish is applicative
	  only  */
    private String entitledUsersEdit;
	/**  list of user ids that are entitled to publish the entry (no server enforcement)
	  The difference between entitledUsersEdit and entitledUsersPublish is applicative
	  only  */
    private String entitledUsersPublish;
	/**  Comma seperated string of the capabilities of the entry. Any capability needed
	  can be added to this list.  */
    private String capabilities;
	/**  Template entry id  */
    private String templateEntryId;
	/**  should we display this entry in search  */
    private EntryDisplayInSearchType displayInSearch;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // creatorId:
    public String getCreatorId(){
        return this.creatorId;
    }
    public void setCreatorId(String creatorId){
        this.creatorId = creatorId;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // adminTags:
    public String getAdminTags(){
        return this.adminTags;
    }
    public void setAdminTags(String adminTags){
        this.adminTags = adminTags;
    }

    // categories:
    public String getCategories(){
        return this.categories;
    }
    public void setCategories(String categories){
        this.categories = categories;
    }

    // categoriesIds:
    public String getCategoriesIds(){
        return this.categoriesIds;
    }
    public void setCategoriesIds(String categoriesIds){
        this.categoriesIds = categoriesIds;
    }

    // status:
    public EntryStatus getStatus(){
        return this.status;
    }
    public void setStatus(EntryStatus status){
        this.status = status;
    }

    // moderationStatus:
    public EntryModerationStatus getModerationStatus(){
        return this.moderationStatus;
    }
    public void setModerationStatus(EntryModerationStatus moderationStatus){
        this.moderationStatus = moderationStatus;
    }

    // moderationCount:
    public Integer getModerationCount(){
        return this.moderationCount;
    }
    public void setModerationCount(Integer moderationCount){
        this.moderationCount = moderationCount;
    }

    // type:
    public EntryType getType(){
        return this.type;
    }
    public void setType(EntryType type){
        this.type = type;
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

    // rank:
    public Double getRank(){
        return this.rank;
    }
    public void setRank(Double rank){
        this.rank = rank;
    }

    // totalRank:
    public Integer getTotalRank(){
        return this.totalRank;
    }
    public void setTotalRank(Integer totalRank){
        this.totalRank = totalRank;
    }

    // votes:
    public Integer getVotes(){
        return this.votes;
    }
    public void setVotes(Integer votes){
        this.votes = votes;
    }

    // groupId:
    public Integer getGroupId(){
        return this.groupId;
    }
    public void setGroupId(Integer groupId){
        this.groupId = groupId;
    }

    // partnerData:
    public String getPartnerData(){
        return this.partnerData;
    }
    public void setPartnerData(String partnerData){
        this.partnerData = partnerData;
    }

    // downloadUrl:
    public String getDownloadUrl(){
        return this.downloadUrl;
    }
    public void setDownloadUrl(String downloadUrl){
        this.downloadUrl = downloadUrl;
    }

    // searchText:
    public String getSearchText(){
        return this.searchText;
    }
    public void setSearchText(String searchText){
        this.searchText = searchText;
    }

    // licenseType:
    public LicenseType getLicenseType(){
        return this.licenseType;
    }
    public void setLicenseType(LicenseType licenseType){
        this.licenseType = licenseType;
    }

    // version:
    public Integer getVersion(){
        return this.version;
    }
    public void setVersion(Integer version){
        this.version = version;
    }

    // thumbnailUrl:
    public String getThumbnailUrl(){
        return this.thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl){
        this.thumbnailUrl = thumbnailUrl;
    }

    // accessControlId:
    public Integer getAccessControlId(){
        return this.accessControlId;
    }
    public void setAccessControlId(Integer accessControlId){
        this.accessControlId = accessControlId;
    }

    // startDate:
    public Integer getStartDate(){
        return this.startDate;
    }
    public void setStartDate(Integer startDate){
        this.startDate = startDate;
    }

    // endDate:
    public Integer getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Integer endDate){
        this.endDate = endDate;
    }

    // referenceId:
    public String getReferenceId(){
        return this.referenceId;
    }
    public void setReferenceId(String referenceId){
        this.referenceId = referenceId;
    }

    // replacingEntryId:
    public String getReplacingEntryId(){
        return this.replacingEntryId;
    }
    public void setReplacingEntryId(String replacingEntryId){
        this.replacingEntryId = replacingEntryId;
    }

    // replacedEntryId:
    public String getReplacedEntryId(){
        return this.replacedEntryId;
    }
    public void setReplacedEntryId(String replacedEntryId){
        this.replacedEntryId = replacedEntryId;
    }

    // replacementStatus:
    public EntryReplacementStatus getReplacementStatus(){
        return this.replacementStatus;
    }
    public void setReplacementStatus(EntryReplacementStatus replacementStatus){
        this.replacementStatus = replacementStatus;
    }

    // partnerSortValue:
    public Integer getPartnerSortValue(){
        return this.partnerSortValue;
    }
    public void setPartnerSortValue(Integer partnerSortValue){
        this.partnerSortValue = partnerSortValue;
    }

    // conversionProfileId:
    public Integer getConversionProfileId(){
        return this.conversionProfileId;
    }
    public void setConversionProfileId(Integer conversionProfileId){
        this.conversionProfileId = conversionProfileId;
    }

    // redirectEntryId:
    public String getRedirectEntryId(){
        return this.redirectEntryId;
    }
    public void setRedirectEntryId(String redirectEntryId){
        this.redirectEntryId = redirectEntryId;
    }

    // rootEntryId:
    public String getRootEntryId(){
        return this.rootEntryId;
    }
    public void setRootEntryId(String rootEntryId){
        this.rootEntryId = rootEntryId;
    }

    // parentEntryId:
    public String getParentEntryId(){
        return this.parentEntryId;
    }
    public void setParentEntryId(String parentEntryId){
        this.parentEntryId = parentEntryId;
    }

    // operationAttributes:
    public List<OperationAttributes> getOperationAttributes(){
        return this.operationAttributes;
    }
    public void setOperationAttributes(List<OperationAttributes> operationAttributes){
        this.operationAttributes = operationAttributes;
    }

    // entitledUsersEdit:
    public String getEntitledUsersEdit(){
        return this.entitledUsersEdit;
    }
    public void setEntitledUsersEdit(String entitledUsersEdit){
        this.entitledUsersEdit = entitledUsersEdit;
    }

    // entitledUsersPublish:
    public String getEntitledUsersPublish(){
        return this.entitledUsersPublish;
    }
    public void setEntitledUsersPublish(String entitledUsersPublish){
        this.entitledUsersPublish = entitledUsersPublish;
    }

    // capabilities:
    public String getCapabilities(){
        return this.capabilities;
    }
    public void setCapabilities(String capabilities){
        this.capabilities = capabilities;
    }

    // templateEntryId:
    public String getTemplateEntryId(){
        return this.templateEntryId;
    }
    public void setTemplateEntryId(String templateEntryId){
        this.templateEntryId = templateEntryId;
    }

    // displayInSearch:
    public EntryDisplayInSearchType getDisplayInSearch(){
        return this.displayInSearch;
    }
    public void setDisplayInSearch(EntryDisplayInSearchType displayInSearch){
        this.displayInSearch = displayInSearch;
    }


    public BaseEntry() {
       super();
    }

    public BaseEntry(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        creatorId = GsonParser.parseString(jsonObject.get("creatorId"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        adminTags = GsonParser.parseString(jsonObject.get("adminTags"));
        categories = GsonParser.parseString(jsonObject.get("categories"));
        categoriesIds = GsonParser.parseString(jsonObject.get("categoriesIds"));
        status = EntryStatus.get(GsonParser.parseString(jsonObject.get("status")));
        moderationStatus = EntryModerationStatus.get(GsonParser.parseInt(jsonObject.get("moderationStatus")));
        moderationCount = GsonParser.parseInt(jsonObject.get("moderationCount"));
        type = EntryType.get(GsonParser.parseString(jsonObject.get("type")));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        rank = GsonParser.parseDouble(jsonObject.get("rank"));
        totalRank = GsonParser.parseInt(jsonObject.get("totalRank"));
        votes = GsonParser.parseInt(jsonObject.get("votes"));
        groupId = GsonParser.parseInt(jsonObject.get("groupId"));
        partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
        downloadUrl = GsonParser.parseString(jsonObject.get("downloadUrl"));
        searchText = GsonParser.parseString(jsonObject.get("searchText"));
        licenseType = LicenseType.get(GsonParser.parseInt(jsonObject.get("licenseType")));
        version = GsonParser.parseInt(jsonObject.get("version"));
        thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
        accessControlId = GsonParser.parseInt(jsonObject.get("accessControlId"));
        startDate = GsonParser.parseInt(jsonObject.get("startDate"));
        endDate = GsonParser.parseInt(jsonObject.get("endDate"));
        referenceId = GsonParser.parseString(jsonObject.get("referenceId"));
        replacingEntryId = GsonParser.parseString(jsonObject.get("replacingEntryId"));
        replacedEntryId = GsonParser.parseString(jsonObject.get("replacedEntryId"));
        replacementStatus = EntryReplacementStatus.get(GsonParser.parseString(jsonObject.get("replacementStatus")));
        partnerSortValue = GsonParser.parseInt(jsonObject.get("partnerSortValue"));
        conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
        redirectEntryId = GsonParser.parseString(jsonObject.get("redirectEntryId"));
        rootEntryId = GsonParser.parseString(jsonObject.get("rootEntryId"));
        parentEntryId = GsonParser.parseString(jsonObject.get("parentEntryId"));
        operationAttributes = GsonParser.parseArray(jsonObject.getAsJsonArray("operationAttributes"), OperationAttributes.class);
        entitledUsersEdit = GsonParser.parseString(jsonObject.get("entitledUsersEdit"));
        entitledUsersPublish = GsonParser.parseString(jsonObject.get("entitledUsersPublish"));
        capabilities = GsonParser.parseString(jsonObject.get("capabilities"));
        templateEntryId = GsonParser.parseString(jsonObject.get("templateEntryId"));
        displayInSearch = EntryDisplayInSearchType.get(GsonParser.parseInt(jsonObject.get("displayInSearch")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBaseEntry");
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("userId", this.userId);
        kparams.add("creatorId", this.creatorId);
        kparams.add("tags", this.tags);
        kparams.add("adminTags", this.adminTags);
        kparams.add("categories", this.categories);
        kparams.add("categoriesIds", this.categoriesIds);
        kparams.add("type", this.type);
        kparams.add("groupId", this.groupId);
        kparams.add("partnerData", this.partnerData);
        kparams.add("licenseType", this.licenseType);
        kparams.add("accessControlId", this.accessControlId);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        kparams.add("referenceId", this.referenceId);
        kparams.add("partnerSortValue", this.partnerSortValue);
        kparams.add("conversionProfileId", this.conversionProfileId);
        kparams.add("redirectEntryId", this.redirectEntryId);
        kparams.add("parentEntryId", this.parentEntryId);
        kparams.add("operationAttributes", this.operationAttributes);
        kparams.add("entitledUsersEdit", this.entitledUsersEdit);
        kparams.add("entitledUsersPublish", this.entitledUsersPublish);
        kparams.add("templateEntryId", this.templateEntryId);
        kparams.add("displayInSearch", this.displayInSearch);
        return kparams;
    }

}

