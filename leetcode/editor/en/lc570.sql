--
-- @lc app=leetcode id=570 lang=mysql
--
-- [570] Managers with at Least 5 Direct Reports
--
-- @lc code=start
select
    p.`name`
from
    Employee p
    left join Employee q on p.id = q.managerId
group by
    p.id,
    p.name
having
    count(*) >= 5
    -- @lc code=end