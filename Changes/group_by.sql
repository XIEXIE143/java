SELECT user_id FROM user_items;

SELECT user_id 
FROM user_items
GROUP BY user_id;

SELECT 
user_id,
COUNT(user_Id) AS user_count
FROM user_items
GROUP BY user_id