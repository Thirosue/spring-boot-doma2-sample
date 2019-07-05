SELECT
    c.code_id
    ,cc.category_key
    ,cc.category_name
    ,c.code_key
    ,c.code_value
    ,c.code_alias
    ,c.attribute1
    ,c.attribute2
    ,c.attribute3
    ,c.attribute4
    ,c.attribute5
    ,c.attribute6
    ,c.display_order
    ,c.is_invalid
    ,c.created_by
    ,c.created_at
    ,c.updated_by
    ,c.updated_at
    ,c.deleted_by
    ,c.deleted_at
    ,c.version
FROM
    code c
INNER JOIN code_category cc
ON c.code_category_id = cc.code_category_id
AND cc.deleted_at IS NULL
WHERE
    c.deleted_at IS NULL
/*%if criteria.id != null */
AND c.code_id = /* criteria.id */1
/*%end*/
/*%if criteria.codeKey != null */
AND c.code_key = /* criteria.codeKey */'01'
/*%end*/
/*%if criteria.codeValue != null */
AND c.code_value = /* criteria.codeValue */'男'
/*%end*/
/*%if criteria.codeAlias != null */
AND c.code_alias = /* criteria.codeAlias */'male'
/*%end*/
/*%if criteria.categoryKey != null */
AND cc.category_key = /* criteria.categoryKey */'GNR0001'
/*%end*/
/*%if criteria.isInvalid != null */
  /*%if criteria.isInvalid */
AND c.is_invalid = 1
  /*%else*/
AND c.is_invalid = 0
  /*%end*/
/*%end*/
/*# orderBy */
