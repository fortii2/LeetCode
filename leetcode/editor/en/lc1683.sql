--
-- @lc app=leetcode id=1683 lang=mysql
--
-- [1683] Invalid Tweets
--
-- @lc code=start
select
    tweet_id
from
    Tweets
where
    char_length(content) > 15
    -- @lc code=end