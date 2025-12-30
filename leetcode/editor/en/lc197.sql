--
-- @lc app=leetcode id=197 lang=mysql
--
-- [197] Rising Temperature
--

-- @lc code=start
select p.id
from Weather p
join Weather q
on datediff(p.recordDate, q.recordDate) = 1
where p.temperature > q.temperature

-- @lc code=end

