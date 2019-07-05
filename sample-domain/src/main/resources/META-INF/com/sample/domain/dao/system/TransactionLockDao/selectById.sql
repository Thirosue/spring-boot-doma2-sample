SELECT
  /*%expand*/*
FROM
  transaction_lock
WHERE
  transaction_key = /* key */'key'
LIMIT 1