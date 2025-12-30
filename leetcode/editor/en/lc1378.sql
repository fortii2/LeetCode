--
-- @lc app=leetcode id=1378 lang=mysql
--
-- [1378] Replace Employee ID With The Unique Identifier
--

-- @lc code=start
select unique_id, `name`
from Employees e 
left join EmployeeUNI euni
on e.id = euni.id

-- @lc code=end

