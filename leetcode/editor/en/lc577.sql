--
-- @lc app=leetcode id=577 lang=mysql
--
-- [577] Employee Bonus
--
-- @lc code=start
select
    e.`name`,
    b.`bonus`
from
    Employee e
    left join Bonus b on e.empId = b.empId
where
    b.`bonus` < 1000
    or b.`bonus` is null
    -- @lc code=end