/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.cms.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.cms.core.entity.CategoryInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Mar 10 13:46:13 CST 2017")
public class CategoryInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<CategoryInfo,String> appId;
    public static volatile SingularAttribute<CategoryInfo,String> appName;
    public static volatile SingularAttribute<CategoryInfo,String> categoryAlias;
    public static volatile SingularAttribute<CategoryInfo,String> categoryIcon;
    public static volatile SingularAttribute<CategoryInfo,String> categoryMemo;
    public static volatile SingularAttribute<CategoryInfo,String> categoryName;
    public static volatile SingularAttribute<CategoryInfo,String> categorySeq;
    public static volatile SingularAttribute<CategoryInfo,Date> createTime;
    public static volatile SingularAttribute<CategoryInfo,String> creatorCompany;
    public static volatile SingularAttribute<CategoryInfo,String> creatorDepartment;
    public static volatile SingularAttribute<CategoryInfo,String> creatorIdentity;
    public static volatile SingularAttribute<CategoryInfo,String> creatorPerson;
    public static volatile SingularAttribute<CategoryInfo,String> defaultViewId;
    public static volatile SingularAttribute<CategoryInfo,String> defaultViewName;
    public static volatile SingularAttribute<CategoryInfo,String> description;
    public static volatile SingularAttribute<CategoryInfo,String> formId;
    public static volatile SingularAttribute<CategoryInfo,String> formName;
    public static volatile SingularAttribute<CategoryInfo,String> id;
    public static volatile SingularAttribute<CategoryInfo,String> parentId;
    public static volatile SingularAttribute<CategoryInfo,String> readFormId;
    public static volatile SingularAttribute<CategoryInfo,String> readFormName;
    public static volatile SingularAttribute<CategoryInfo,String> sequence;
    public static volatile SingularAttribute<CategoryInfo,Date> updateTime;
    public static volatile SingularAttribute<CategoryInfo,String> workflowAppName;
    public static volatile SingularAttribute<CategoryInfo,String> workflowFlag;
    public static volatile SingularAttribute<CategoryInfo,String> workflowType;
}