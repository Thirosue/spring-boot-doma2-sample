SELECT
    c.code_id
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
WHERE
  c.deleted_at IS NULL
/*%if criteria.id != null */
  AND c.code_id = /* criteria.id */1
/*%end*/
/*%if criteria.codeKey != null */
  AND c.code_key = /* criteria.codeKey */'01'
/*%end*/
LIMIT
  1
