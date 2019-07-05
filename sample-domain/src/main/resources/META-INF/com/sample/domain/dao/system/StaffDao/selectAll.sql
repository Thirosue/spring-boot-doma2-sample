SELECT
  /*%expand*/*
FROM
  staffs
WHERE
  deleted_at IS NULL
/*%if criteria.id != null */
  AND staff_id = /* criteria.id */1
/*%end*/
/*%if criteria.firstName != null */
  AND first_name LIKE /* @infix(criteria.firstName) */'john' ESCAPE '$'
/*%end*/
/*%if criteria.lastName != null */
  AND last_name LIKE /* @infix(criteria.lastName) */'doe' ESCAPE '$'
/*%end*/
/*%if criteria.tel != null */
  AND tel LIKE /* @infix(criteria.tel) */'09012345678' ESCAPE '$'
/*%end*/
/*%if criteria.email != null */
  AND email LIKE /* @infix(criteria.email) */'aaaa@bbbb.com' ESCAPE '$'
/*%end*/
/*%if criteria.tel != null */
  AND tel LIKE /* @infix(criteria.tel) */'09012345678' ESCAPE '$'
/*%end*/
/*# orderBy */